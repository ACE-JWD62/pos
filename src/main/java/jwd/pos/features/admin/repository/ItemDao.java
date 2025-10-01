package jwd.pos.features.admin.repository;

import jwd.pos.model.entity.MenuItem;
import jwd.pos.model.request.admin.ItemRequest;

import java.util.List;

public interface ItemDao {
    boolean saveItem(MenuItem obj);

    MenuItem getItemById(long id);

    List<MenuItem> getAllItem();

    boolean deleteItem(long id);
}
