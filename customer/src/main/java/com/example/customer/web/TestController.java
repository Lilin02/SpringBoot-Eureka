package com.example.customer.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * 服务消费者<p>
 * 代码描述<p>
 * Company:个人 <p>
 *
 * @author lilin
 * @since 2019/11/14 16:09
 */
@RestController
@RequestMapping("/customer")
public class TestController {
    @Autowired
    RestTemplate restTempLate;

    @GetMapping("/get")
    public String customerTest(String name){
        return restTempLate.getForObject("http://eureka-demo-provider/provider/get?name="+name,String.class);
    }

}
