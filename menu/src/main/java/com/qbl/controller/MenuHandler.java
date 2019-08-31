package com.qbl.controller;


import com.qbl.entity.Menu;
import com.qbl.entity.MenuVO;
import com.qbl.entity.Type;
import com.qbl.repository.MenuRepository;
import com.qbl.repository.TypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by home-pc on 2019/8/8.
 */

@Controller
@ResponseBody
@RequestMapping("/menu")
public class MenuHandler {

    @Value( "${server.port}" )
        private String port;

    @Autowired
    private MenuRepository menuRepository;

    @Autowired
    private TypeRepository typeRepository;

    @GetMapping("/menuIndex")
    public String index2(){
        return "Menu的端口号为："+this.port;
    }


    @GetMapping("/findAll/{index}/{lim}")
    public MenuVO findAll(@PathVariable("index") Integer index,@PathVariable("lim") Integer lim){
        return new MenuVO(0,"",menuRepository.count(),menuRepository.findAll( index,lim));
    }

    @DeleteMapping("/deleteById/{id}")
    public  void deleteById(@PathVariable("id") long id){
        menuRepository.deleteById(id);
    }

    @GetMapping("/findTypes")
    public List<Type> findTypes(){
       return typeRepository.findTypes();
    }

    @PostMapping("/save")
    public void save(@RequestBody  Menu menu){
        menuRepository.save(menu);
    }

    @GetMapping("/findById/{id}")
    public  Menu findById(@PathVariable("id") long id){
        return  menuRepository.findById(id);
    }

    @PutMapping("/update")
  public void update(@RequestBody Menu menu){
        menuRepository.update(menu);
  }
}
