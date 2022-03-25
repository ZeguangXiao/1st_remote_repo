package com.qfedu.consumer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author XZG
 * @creatTime 2022-03-25
 */
@RestController
public class ConsumerController {

    @Value("${environment}")
    String environment;

    @GetMapping("/environment")
    public String consume(){
        return environment;
    }
}
