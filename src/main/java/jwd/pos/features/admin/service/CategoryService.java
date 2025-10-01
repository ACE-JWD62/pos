package jwd.pos.features.admin.service;

import jwd.pos.features.admin.repository.CategoryDao;
import jwd.pos.model.entity.Category;
import jwd.pos.model.response.admin.CategoryResponse;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class CategoryService {
    
    @Autowired
    private CategoryDao categoryDao;

    public boolean saveCategory(Category obj){
        categoryDao.saveCategory(obj);
        return true;
    }

    public int countRowsIndDB(){
       return categoryDao.countRowsIndDB();
    }

    public Category getCategoryById(Long id){
        return categoryDao.getCategoryById(id);
    }


    public List<CategoryResponse> getAllCategory(){
        return categoryDao.getAllCategory()
                .stream()
                .map(c -> CategoryResponse.builder().id(c.getId()).categoryName(c.getCategoryName()).build())
                .collect(Collectors.toList());
    }


    public boolean deleteCategory(long id){
        categoryDao.deleteCategory(id);
        return true;
    }
}
