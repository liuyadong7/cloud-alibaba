package com.liuyd.order.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <p>  </p>
 *
 * @author LiuYaDong
 * @since 2021-08-31 16:16
 **/
// name 指定调用接口的服务名， path指定调用接口的@RequestMapping
@FeignClient(name = "stock-service", path = "/stock")
public interface StockFeignService {
    @RequestMapping(value = "/reduct")
    String reduct();
}
