package com.liuyd.order.controller;

import com.liuyd.order.feign.ProductFeignService;
import com.liuyd.order.feign.StockFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <p>  </p>
 *
 * @author LiuYaDong
 * @since 2021-08-18 15:45
 **/
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    StockFeignService stockFeignService;
    @Resource
    ProductFeignService productFeignService;


    @RequestMapping("/add")
    public String add() {
        System.out.println("下单成功。。。");
        String message = stockFeignService.reduct();
        String id = productFeignService.get(12);

        return "Hello Feign" + message + "product:" + id;
    }


}
