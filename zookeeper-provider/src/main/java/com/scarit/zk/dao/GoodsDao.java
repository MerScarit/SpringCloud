package com.scarit.zk.dao;

import com.scarit.zk.domain.Goods;
import org.springframework.stereotype.Repository;

@Repository
public class GoodsDao {

    public Goods findById(Integer id){
        //模拟从数据库中查询
        Goods goods = new Goods();
        goods.setGoodId(id);
        goods.setTittle("手机");
        goods.setPrice(9999.99D);
        goods.setStock(100);

        return goods;
    }
}
