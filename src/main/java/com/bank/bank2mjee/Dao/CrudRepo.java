package com.bank.bank2mjee.Dao;

import java.util.List;
import java.util.Optional;

public interface CrudRepo<M, T> {
    Optional<M> save(M m);

    Optional<M> update(M m);

    int delete(T t);

    M findOne(T t);

    List<M> findAll();
}
