package com.example.provider.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 服务提供者<p>
 * 代码描述<p>
 * Company:个人 <p>
 *
 * @author lilin
 * @since 2019/11/14 15:43
 */
@RestController
@RequestMapping("/provider")
public class TestController {

    @GetMapping("/get")
    public String providerTest(String name){
        return name+"访问provider服务~~";
    }
}
