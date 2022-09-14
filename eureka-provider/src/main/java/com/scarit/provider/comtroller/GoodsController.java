package com.scarit.provider.comtroller;

import com.scarit.provider.domain.Goods;
import com.scarit.provider.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
