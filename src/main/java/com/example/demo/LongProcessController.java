package com.example.demo;

import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.servlet.server.ConfigurableServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LongProcessController {

    @RequestMapping("/")
    public String pause() throws InterruptedException {
        for (int i = 0; i < 60; i++) {
            Thread.sleep(1000);
            System.out.println(i);
        }
        //Thread.sleep(10000);
        return "Process finished";
    }

}
