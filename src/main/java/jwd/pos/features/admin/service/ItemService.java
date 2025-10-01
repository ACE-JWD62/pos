package jwd.pos.features.admin.service;

import jwd.pos.features.admin.repository.ItemDao;
import jwd.pos.model.entity.Category;
import jwd.pos.model.entity.MenuItem;
import jwd.pos.model.request.admin.ItemRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {

    @Autowired
    private ItemDao itemDao;

    @Autowired
    private CategoryService categoryService;

    public boolean saveItem(ItemRequest obj) {
        /*
         * get category obj
         */
        Category categoryObj = categoryService.getCategoryById(Long.valueOf(obj.getCategoryId()));
        return itemDao.saveItem(
                MenuItem.builder()
                        .menuName(obj.getItemName())
                        .price(obj.getItemPrice())
                        .category(categoryObj)
                        .imageUrl("")
                        .description(obj.getItemDescription())
                        .created_by("Orion")
                        .build()
                );
    }

    public MenuItem getItemById(long id) {
        return itemDao.getItemById(id);
    }

    public List<MenuItem> getAllItem() {
        return itemDao.getAllItem();
    }

    public boolean deleteItem(long id) {
        return itemDao.deleteItem(id);
    }

}
