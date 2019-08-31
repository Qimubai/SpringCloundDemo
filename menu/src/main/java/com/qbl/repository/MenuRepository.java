package com.qbl.repository;

import com.qbl.entity.Menu;

import java.util.List;

/**
 * Created by home-pc on 2019/8/8.
 */
public interface MenuRepository {


    public List<Menu> findAll(int index,int lim);
    public int count();
    public Menu findById(long id);
    public void save(Menu menu);
    public void update(Menu menu);
    public void deleteById(long id);
}
