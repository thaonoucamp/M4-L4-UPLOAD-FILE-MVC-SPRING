package com.codegym.service;

import java.util.List;

public interface GeneralCRUD<T> {
    List<T> findAll();

    void save(T t);

    T findById(int id);

    List<T> findByName(String name);

    void update(int id, T product);

    void remove(int id);

}
