package com.liuyd.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * <p>  </p>
 *
 * @author LiuYaDong
 * @since 2021-08-18 15:59
 **/
@SpringBootApplication
@EnableDiscoveryClient//1.4版本可忽略
public class OrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrderApplication.class);
    }

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        // 设置超时时间
        // builder.setReadTimeout();
        // builder.setConnectTimeout();
        RestTemplate restTemplate = builder.build();
        return restTemplate;
    }

}
