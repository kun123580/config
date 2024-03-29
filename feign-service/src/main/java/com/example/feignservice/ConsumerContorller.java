package com.example.feignservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerContorller {
    @Autowired

    private HelloService helloService;
    @RequestMapping("/feign-consumer")
    public String helloConsumer() {
        return helloService.hello();
    }
}