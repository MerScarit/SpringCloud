package com.scarit.zk.domain;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Goods implements Serializable {

    //商品id
    private Integer goodId;

    //商品名称
    private String tittle;

    //价格
    private double price;

    //库存
    private Integer stock;



}
