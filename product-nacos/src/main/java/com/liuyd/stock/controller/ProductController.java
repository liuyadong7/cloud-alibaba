package com.liuyd.stock.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>  </p>
 *
 * @author LiuYaDong
 * @since 2021-08-18 15:48
 **/
@RestController
@RequestMapping("/product")
public class ProductController {

    @Value("${server.port}")
    String port;

    @RequestMapping("/{id}")
    public String reduct(@PathVariable Integer id) {
        System.out.println("查询商品ID----------" + id);
        return "查询商品ID{" + id + "}.端口:" + port;
    }
}
