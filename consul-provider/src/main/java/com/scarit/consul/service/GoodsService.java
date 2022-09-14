package com.scarit.consul.service;

import com.scarit.consul.dao.GoodsDao;
import com.scarit.consul.domain.Goods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GoodsService {

    @Autowired
    GoodsDao goodsDao;

    public Goods findById(Integer id){
        Goods goods = goodsDao.findById(id);
        return goods;
    }

}
