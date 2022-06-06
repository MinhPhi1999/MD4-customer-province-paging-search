package com.codegym.cms.service;

import java.util.List;
import java.util.Optional;

public interface IGeneralService<T> {
    Iterable<T> findAll();
    void save(T t);
    void remove(Long id);
    Optional<T> findById(Long id);
}
