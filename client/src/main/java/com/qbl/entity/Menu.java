package com.qbl.entity;

import lombok.Data;

/**
 * Created by home-pc on 2019/8/8.
 */

@Data
public class Menu {

    private long id;
    private String name;
    private double price;
    private String flavor;
    private Type type;
}
