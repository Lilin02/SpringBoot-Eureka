package com.example.eurekaservice.tool;

import org.springframework.cloud.netflix.eureka.server.event.EurekaInstanceCanceledEvent;
import org.springframework.cloud.netflix.eureka.server.event.EurekaInstanceRegisteredEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * 服务监听<p>
 * 代码描述<p>
 * Company:个人 <p>
 *
 * @author lilin
 * @since 2019/11/15 9:01
 */
@Component
public class EurekaStateChangeListener {

    @EventListener
    public void listen(EurekaInstanceRegisteredEvent event){
        System.out.println(event.getInstanceInfo().getAppName()+"服务注册了");
    }

    @EventListener
    public void listen(EurekaInstanceCanceledEvent event){
        System.out.println(event.getAppName()+"服务下线了");
    }
}
