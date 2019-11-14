package com.example.customer.tool;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * RestTemplate 提供了多种便捷访问远程Http服务的方法，能够大大提高客户端的编写效率<p>
 * 代码描述<p>
 * Company:个人 <p>
 *
 * @author lilin
 * @since 2019/11/14 16:07
 */
@Configuration
public class RestTempLateTool {

    @Bean
    @LoadBalanced
    public RestTemplate getRestTempLate(){
        return new RestTemplate();
    }
}
