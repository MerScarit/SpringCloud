package com.scarit.provider.service;

import com.scarit.provider.dao.GoodsDao;
import com.scarit.provider.domain.Goods;
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
