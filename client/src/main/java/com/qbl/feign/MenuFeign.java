package com.qbl.feign;

import com.qbl.entity.Menu;
import com.qbl.entity.MenuVO;
import com.qbl.entity.Type;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * Created by home-pc on 2019/8/8.
 */
@FeignClient(value = "menu")
public interface MenuFeign {

    @GetMapping("/menu/findAll/{index}/{lim}")
   public MenuVO findAll(@PathVariable("index") Integer index, @PathVariable("lim") Integer lim);

    @DeleteMapping("/menu/deleteById/{id}")
    public  void deleteById(@PathVariable("id") long id);

    @GetMapping("/menu/findTypes")
   public List<Type> findTypes();

    @PostMapping("/menu/save")
    public void save(Menu menu);

    @GetMapping("/menu/findById/{id}")
    public Menu findById(@PathVariable("id") long id);

    @PutMapping("/menu/update")
    public void update(@RequestBody Menu menu);
}
