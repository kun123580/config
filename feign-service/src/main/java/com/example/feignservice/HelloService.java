package com.example.feignservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
@FeignClient("hello-service")
public interface HelloService {
    @RequestMapping("/")
    String hello();
}
