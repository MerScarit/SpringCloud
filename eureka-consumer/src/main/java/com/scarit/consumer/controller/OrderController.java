package com.scarit.consumer.controller;


import com.scarit.consumer.config.RestTemplateConfig;
import com.scarit.consumer.domain.Goods;
import org.checkerframework.checker.units.qual.A;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("/add/{id}")
    public Goods add(@PathVariable("id") Integer id){
//        //业务逻辑
//
//        String url ="http://localhost:8000/goods/findById/" + id;
//
//        Goods goods = restTemplate.getForObject(url, Goods.class);

        //服务发现
        List<ServiceInstance> instances = discoveryClient.getInstances("EUREKA-PROVIDER");
        if(instances ==null || instances.size() <= 0){
            return null;
        }
        //通过某个策略拿到一个实例
        ServiceInstance serviceInstance = instances.get(0);
        String host = serviceInstance.getHost();
        int port = serviceInstance.getPort();
        System.out.println(host);
        System.out.println(port);

        String url ="http://" + host + ":" + port+ "/goods/findById/" + id;
        Goods goods = restTemplate.getForObject(url, Goods.class);


        return goods;
    }
}
