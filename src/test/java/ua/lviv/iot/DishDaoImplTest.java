package ua.lviv.iot;

import org.junit.jupiter.api.Test;
import ua.lviv.iot.model.Dish;
import ua.lviv.iot.persistence.dao.DishDaoImpl;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

class DishDaoImplTest {

    @Test
    public void testManager() {

        EntityManager em2 = Persistence.
                createEntityManagerFactory("test_manager").
                createEntityManager();
        DishDaoImpl daoImpl = new DishDaoImpl();
        daoImpl.setEntityManager(em2);
        
        // magic starts here
        daoImpl.persist(new Dish(21.2, "Meat",50,"Govnishe"));
        daoImpl.findById(1);
        daoImpl.findById(2);
        daoImpl.findById(3);
    }

}
