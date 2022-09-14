package com.scarit.zk.controller;

import com.scarit.zk.domain.Goods;
import com.scarit.zk.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/goods")
public class GoodsController {

    @Autowired
    GoodsService goodsService;

    @GetMapping("/findById/{id}")
    public Goods findById(@PathVariable("id") Integer id){
        Goods goods = goodsService.findById(id);
        return goods;
    }

}
