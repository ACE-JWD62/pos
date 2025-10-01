package jwd.pos.features.admin.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;
import jwd.pos.features.admin.service.ItemService;
import jwd.pos.model.entity.Category;
import jwd.pos.model.request.admin.ItemRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.HashSet;

@Controller
@RequestMapping("/admin/menu")
public class ItemController {


    @Autowired
    private ItemService itemService;

    @PostMapping
    public String saveMenu(@Valid @ModelAttribute ItemRequest obj,
                           BindingResult bindingResult,
                           @RequestParam(name = "file", required = false) MultipartFile file,
                           RedirectAttributes redirectAttributes,
                           HttpServletRequest request,
                           Model model) {
        System.out.println("Item Name: " + obj.getItemName());
        System.out.println("Price: " + obj.getItemPrice());
        System.out.println("Category: " + obj.getCategoryId());
        System.out.println("Description: " + obj.getItemDescription());
        System.out.println("Attach file checkbox: " + obj.getIsAttachFile());
        System.out.println("File: " + file.getOriginalFilename());

        if (bindingResult.hasErrors()) {
            System.out.println("there is error");
            model.addAttribute("pageTitle", "Menu Management");
            model.addAttribute("pageContent", "/WEB-INF/views/pages/admin/admin_menu.jsp");
            model.addAttribute("currentPage", "menus");
//            model.addAttribute("showAddModal", true);
            /*for item registration error pop up value and message*/
            redirectAttributes.addFlashAttribute("flashStatus", bindingResult.getFieldErrors().get(0).getDefaultMessage());
            redirectAttributes.addFlashAttribute("flashGif", request.getContextPath() + "/resources/image/error.png");
            return "redirect:/admin/menus";
        }
        if (obj.getIsAttachFile() == "true") {
            if (file != null && !file.isEmpty()) {
                System.out.println("File uploaded: " + file.getOriginalFilename());
            } else {

            }
        } else {

           /*save item*/
            boolean result = itemService.saveItem(obj);

            /*for item registration
             success popup
             value and
             message*/
            if (result) {
                redirectAttributes.addFlashAttribute("flashStatus", "Successfully created");
                redirectAttributes.addFlashAttribute("flashGif", request.getContextPath() + "/resources/image/success.gif");
            }else {
                redirectAttributes.addFlashAttribute("flashStatus", "Internal Server Error");
                redirectAttributes.addFlashAttribute("flashGif", request.getContextPath() + "/resources/image/error.png");
            }

        }



        /*redirect to menu page*/
        redirectAttributes.addAttribute("pageTitle", "Menu Management");
        redirectAttributes.addAttribute("pageContent", "/WEB-INF/views/pages/admin/admin_menu.jsp");
        redirectAttributes.addAttribute("currentPage", "menus");


        return "redirect:/admin/menus";
    }

}
