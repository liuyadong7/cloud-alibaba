package com.liuyd.order.feign;

import com.liuyd.order.config.FeignConfig;
import feign.RequestLine;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * <p>  </p>
 *
 * @author LiuYaDong
 * @since 2021-08-31 16:16
 **/
// name 指定调用接口的服务名， path指定调用接口的@RequestMapping
@FeignClient(name = "stock-service", path = "/stock", configuration = FeignConfig.class)
public interface StockFeignService {
    // @RequestMapping(value = "/reduct")
    @RequestLine(value = "GET /reduct")
    String reduct();
}
