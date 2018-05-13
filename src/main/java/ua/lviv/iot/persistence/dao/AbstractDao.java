package ua.lviv.iot.persistence.dao;

import ua.lviv.iot.model.Dish;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

public abstract class AbstractDao<T extends Dish> implements IDao<T> {

    @PersistenceContext
    private EntityManager entityManager;

    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    protected abstract Class<T> getEntityClass();

    @Transactional(value = Transactional.TxType.REQUIRED)
    @Override
    public T findById(Integer id) {
        T result = (T) entityManager.find(getEntityClass(), id);
        return result;
    }

    @Transactional(value = Transactional.TxType.REQUIRED)
    @Override
    public T persist(T object) {
        entityManager.persist(object);
        return object;
    }

    @Transactional(value = Transactional.TxType.REQUIRED)
    @Override
    public void delete(Integer id) {

        T result = (T) entityManager.find(getEntityClass(), id);
        entityManager.remove(result);
    }

    @Transactional(value = Transactional.TxType.REQUIRED)
    @Override
    public T update(T object) {
        return entityManager.merge(object);
    }

}
