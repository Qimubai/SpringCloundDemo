package com.qbl.repository;

import com.qbl.entity.Type;

import java.util.List;

/**
 * Created by home-pc on 2019/8/12.
 */
public interface TypeRepository {
    int findById(long id);
    List<Type> findTypes();
}
