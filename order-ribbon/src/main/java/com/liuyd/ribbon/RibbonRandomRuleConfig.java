package com.liuyd.ribbon;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;

// 随机的配置类
@Configurable
public class RibbonRandomRuleConfig {

    // 方法名固定为iRule
    @Bean
    public IRule iRule() {
        return new RandomRule();
    }

}
