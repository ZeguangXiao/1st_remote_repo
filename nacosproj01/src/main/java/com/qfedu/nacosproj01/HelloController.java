package com.qfedu.nacosproj01;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author XZG
 * @creatTime 2022-03-27
 */
@RestController
@RefreshScope
public class HelloController {

    @Value("${name}")
    String name;

    @GetMapping("/hello")
    public String hello(){
        return name;
    }
}
