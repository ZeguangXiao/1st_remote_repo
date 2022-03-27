package com.qfedu.nacosproj02.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author XZG
 * @creatTime 2022-03-27
 */
@FeignClient("nacosproj01")
public interface HelloService {
    @GetMapping("/hello")
    String hello();
}
