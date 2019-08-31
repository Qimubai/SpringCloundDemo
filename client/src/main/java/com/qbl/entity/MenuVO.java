package com.qbl.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Created by home-pc on 2019/8/9.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MenuVO {

        private int code;
        private String msg;
        private int count;
        private List<Menu> data;


}
