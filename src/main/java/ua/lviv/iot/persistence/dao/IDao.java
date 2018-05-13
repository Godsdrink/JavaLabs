package ua.lviv.iot.persistence.dao;

import ua.lviv.iot.model.Dish;

import javax.transaction.Transactional;

public interface IDao<T> {

     Dish findById(Integer id);

     T persist(T object);

     void delete(Integer id);

     T update(T object);


}