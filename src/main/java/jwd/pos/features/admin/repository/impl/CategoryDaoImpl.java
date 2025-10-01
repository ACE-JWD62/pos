package jwd.pos.features.admin.repository.impl;

import jwd.pos.features.admin.repository.CategoryDao;
import jwd.pos.model.entity.Category;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CategoryDaoImpl implements CategoryDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public boolean saveCategory(Category obj){
        sessionFactory.getCurrentSession().persist(obj);
        return true;
    }

    @Override
    public Category getCategoryById(Long id){
        return sessionFactory.getCurrentSession().get(Category.class, id);
    }

    @Override
    public List<Category> getAllCategory(){
        String sql = "from Category";
        Query<Category> query = sessionFactory.getCurrentSession().createQuery(sql, Category.class);
        return query.getResultList();
    }

    @Override
    public boolean deleteCategory(long id){
        sessionFactory.getCurrentSession().remove(getCategoryById(id));
        return true;
    }

    @Override
    public int countRowsIndDB() {
        String sql = "SELECT COUNT(*) FROM Category;";
        Query<Integer> query = sessionFactory.getCurrentSession().createQuery(sql,Integer.class);
        return query.uniqueResult();
    }

}
