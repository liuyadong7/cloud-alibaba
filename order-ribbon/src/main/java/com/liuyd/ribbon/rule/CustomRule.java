package com.liuyd.ribbon.rule;

import com.alibaba.nacos.client.naming.utils.ThreadLocalRandom;
import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.AbstractLoadBalancerRule;
import com.netflix.loadbalancer.ILoadBalancer;
import com.netflix.loadbalancer.Server;

import java.util.List;

/**
 * <p> 自定义负载均衡策略 </p>
 *
 * @author LiuYaDong
 * @since 2021-08-31 14:15
 **/
public class CustomRule extends AbstractLoadBalancerRule {
    public Server choose(Object key) {
        ILoadBalancer loadBalancer = this.getLoadBalancer();
        // 获得当前请求的服务的实例
        List<Server> reachableServers = loadBalancer.getReachableServers();
        int random = ThreadLocalRandom.current().nextInt(reachableServers.size());
        Server server = reachableServers.get(random);
        // 元数据
        Server.MetaInfo metaInfo = server.getMetaInfo();
        // if (server.isAlive()) {
        //     return null;
        // }
        return server;
    }


    public void initWithNiwsConfig(IClientConfig clientConfig) {

    }
}
