package jwd.pos.features.admin.controller;

import jwd.pos.features.admin.service.CategoryService;
import jwd.pos.model.entity.Category;
import jwd.pos.model.response.admin.CategoryResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/admin/category")
public class CategoryController {


    @Autowired
    private CategoryService categoryService;

//    @PostMapping
//    public String saveCategory(@RequestParam("categoryName") String categoryName){
//        Category  obj = new Category();
//        obj.setCategoryName(categoryName);
//        categoryService.saveCategory(obj);
//        return "enter_view_file_name";
//    }

    @GetMapping
    @ResponseBody
    public List<CategoryResponse> getAllCategories(){
       return categoryService.getAllCategory();
    }

}
