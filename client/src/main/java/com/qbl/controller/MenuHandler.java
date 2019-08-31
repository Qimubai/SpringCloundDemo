package com.qbl.controller;

import com.qbl.entity.Menu;
import com.qbl.entity.MenuVO;
import com.qbl.entity.Type;
import com.qbl.feign.MenuFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.lang.management.MemoryUsage;
import java.util.List;

/**
 * Created by home-pc on 2019/8/8.
 */
@Controller
@RequestMapping("/menu")
public class MenuHandler {

    @Autowired
    private MenuFeign menuFeign;

    @GetMapping("/findAll")
    @ResponseBody
    public MenuVO findAll(@RequestParam("page") int page, @RequestParam("limit") Integer limit){
        int index= (page-1)*limit;
        return menuFeign.findAll( index,limit);

    }

    @GetMapping("/redirect/{location}")
    public  String redirect(@PathVariable("location") String location) {
        return location;
    }
    @GetMapping("/deleteById/{id}")
    public String deleteById(@PathVariable("id") long id){
        menuFeign.deleteById(id);
        return "redirect:/menu/redirect/index";}

        @GetMapping("/findTypes")
    public ModelAndView findTypes(){
     List<Type> list =menuFeign.findTypes();
        ModelAndView mv=new ModelAndView();
        mv.addObject( "list",list);
        mv.setViewName("menu_add");
        return mv;
    }

    @PostMapping("/save")
    public String save( Menu menu){
        menuFeign.save(menu);
        return "redirect:/menu/redirect/index";
    }

    @GetMapping("/findById/{id}")
    public ModelAndView findById(@PathVariable("id") long id){
        ModelAndView mv=new ModelAndView();
        mv.addObject( "menu",menuFeign.findById(id));
        mv.addObject( "list",menuFeign.findTypes());
        mv.setViewName("menu_update");
        return mv;
    }

    @PostMapping("/update")
    public String update(Menu menu){

        menuFeign.update(menu);
        return  "redirect:/menu/redirect/index";
    }

}
