package com.qfedu.sentinel.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author XZG
 * @creatTime 2022-03-28
 */
@RestController
public class HelloController {

    private static final Logger logger = LoggerFactory.getLogger(HelloController.class);
//    @Autowired
//    RestTemplate restTemplate;

    @GetMapping("/hello")
    public String hello() {
        return "hello sentinel";
    }

    @GetMapping("/hello2")
    public void hello2() {
        RestTemplate restTemplate = new RestTemplate();

        for (int i = 0; i < 10; i++) {
            String forObject = restTemplate.getForObject("http://localhost:8081/hello", String.class);
            logger.info("sentinel.hello2---");
            System.out.println("forObject = " + forObject);
        }
    }
}
