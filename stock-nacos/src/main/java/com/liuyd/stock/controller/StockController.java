package com.liuyd.stock.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>  </p>
 *
 * @author LiuYaDong
 * @since 2021-08-18 15:48
 **/
@RestController
@RequestMapping("/stock")
public class StockController {

    @Value("${server.port}")
    String port;

    @RequestMapping("/reduct")
    public String reduct() {
        System.out.println("扣减库存----------" + port);
        return "扣减库存" + port;
    }
}
