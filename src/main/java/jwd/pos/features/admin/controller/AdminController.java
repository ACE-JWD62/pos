package jwd.pos.features.admin.controller;

import jakarta.servlet.http.HttpServletRequest;
import jwd.pos.model.entity.Category;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/admin")
public class AdminController {

    private List<Category> categories;

    @GetMapping("/dashboard")
    public String getAdminDashboardPage(Model model) {
        model.addAttribute("pageTitle","Admin Dashboard");
        model.addAttribute("pageContent","/WEB-INF/views/pages/admin/admin_dashboard.jsp");
        model.addAttribute("currentPage","dashboard");
        return "pages/admin/admin_layout";
    }

    @GetMapping("/menus")
    public String getAdminMenuPage(Model model) {
        model.addAttribute("pageTitle","Menu Management");
        model.addAttribute("pageContent","/WEB-INF/views/pages/admin/admin_menu.jsp");
        model.addAttribute("currentPage","menus");

        return "pages/admin/admin_layout";
    }

    @GetMapping("/inventory")
    public String getAdminInventoryPage(Model model) {
        model.addAttribute("pageTitle","Inventory Management");
        model.addAttribute("pageContent","/WEB-INF/views/pages/admin/admin_inventory.jsp");
        model.addAttribute("currentPage","inventory");
        return "pages/admin/admin_layout";
    }


    @GetMapping("/users")
    public String getAdminUserManagementPage(Model model){
        model.addAttribute("pageTitle","User Management");
        model.addAttribute("pageContent","/WEB-INF/views/pages/admin/admin_users_management.jsp");
        model.addAttribute("currentPage","users");
        return "pages/admin/admin_layout";
    }

    @GetMapping("/reports")
    public String getAdminReportPage(Model model) {
        model.addAttribute("pageTitle","Reports");
        model.addAttribute("pageContent","/WEB-INF/views/pages/admin/admin_report.jsp");
        model.addAttribute("currentPage","reports");
        return "pages/admin/admin_layout";
    }

}

