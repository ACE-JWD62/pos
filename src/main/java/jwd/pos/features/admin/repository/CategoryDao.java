package jwd.pos.features.admin.repository;

import jwd.pos.model.entity.Category;

import java.util.List;

public interface CategoryDao {
    boolean saveCategory(Category obj);

    Category getCategoryById(Long id);

    List<Category> getAllCategory();

    boolean deleteCategory(long id);

    int countRowsIndDB();
}
