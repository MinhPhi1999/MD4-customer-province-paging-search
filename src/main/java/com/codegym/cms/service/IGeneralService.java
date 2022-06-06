package com.codegym.cms.service;

import java.util.List;

public interface IGeneralService<T> {
    List<T> findAll();
    void save(T t);
    void remove(Long id);
    T findById(Long id);
}
