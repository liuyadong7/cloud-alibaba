package com.liuyd.order.config;

import feign.Contract;
import feign.Logger;
import feign.Request;
import org.springframework.context.annotation.Bean;


/**
 * <p> Feign配置 </p>
 * <li>全局：增加 @Configuration</li>
 * <li>局部：取消 @Configuration</li>
 *
 * @author LiuYaDong
 * @since 2021-08-31 16:34
 **/
// @Configuration
public class FeignConfig {

    @Bean
    public Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }

    /**
     * 契约配置
     */
    @Bean
    public Contract feignContract() {
        return new Contract.Default();
    }

    /**
     * 设置超时时间
     */
    @Bean
    public Request.Options options() {
        return new Request.Options(5000, 10000);
    }


}