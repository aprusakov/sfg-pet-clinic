package com.spring.sfgpetclinic.services;

import java.util.Set;

public interface BaseService<T>
{
    T findById(Long id);

    T save(T owner);

    Set<T> findAll();
}
