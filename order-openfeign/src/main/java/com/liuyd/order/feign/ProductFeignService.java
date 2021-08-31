package com.liuyd.order.feign;

import feign.Param;
import feign.RequestLine;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <p>  </p>
 *
 * @author LiuYaDong
 * @since 2021-08-31 16:38
 **/
@FeignClient(name = "product-service", path = "/product")
public interface ProductFeignService {

    @RequestLine(value = "GET /{id}")
    String get(@Param(value = "id") Integer id);


    // @RequestMapping(path = "/{id}")
    // String get(@PathVariable(name = "id") Integer id);

}
