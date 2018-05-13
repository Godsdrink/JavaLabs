package ua.lviv.iot.persistence.dao;

import ua.lviv.iot.model.Dish;


import javax.annotation.PostConstruct;
import javax.enterprise.context.Dependent;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.io.Serializable;

@Named
@Dependent
public class DishDaoImpl extends AbstractDao<Dish> implements DishDao, Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    protected Class<Dish> getEntityClass() {
        return Dish.class;
    }




}
