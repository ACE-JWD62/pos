package jwd.pos.features.admin.repository.impl;

import jwd.pos.features.admin.repository.ItemDao;
import jwd.pos.model.entity.MenuItem;
import jwd.pos.model.request.admin.ItemRequest;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class ItemDaoImpl implements ItemDao {

    @Autowired
    private SessionFactory sessionFactory;


    @Override
    public boolean saveItem(MenuItem obj) {
        sessionFactory.getCurrentSession().persist(obj);
        return true;
    }


    @Override
    public MenuItem getItemById(long id){
        return sessionFactory.getCurrentSession().get(MenuItem.class,id);
    }

    @Override
    public List<MenuItem> getAllItem(){
        String sql = "from MenuItem";
        Query<MenuItem> query = sessionFactory.getCurrentSession().createQuery(sql, MenuItem.class);
        return query.getResultList();
    }


    @Override
    public boolean deleteItem(long id){
        sessionFactory.getCurrentSession().remove(getItemById(id));
        return true;
    }

}
