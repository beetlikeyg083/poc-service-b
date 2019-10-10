package com.poc.dummyserviceb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

@SpringBootApplication
@RestController
public class DummyServiceBApplication {

    public static void main(String[] args) {
        SpringApplication.run(DummyServiceBApplication.class, args);
    }

    @GetMapping("/hello")
    public String hello(@RequestParam(defaultValue = "0", required = false) Integer delay) throws InterruptedException{
        TimeUnit.MILLISECONDS.sleep(delay);
        return "Bonjour!";
    }

    @GetMapping("/hello2")
    public String hello2(@RequestParam(defaultValue = "0", required = false) Integer delay) throws InterruptedException{
        TimeUnit.MILLISECONDS.sleep(delay);
        return "Bonjour2!";
    }

    @GetMapping("/hello3")
    public String hello3(@RequestParam(defaultValue = "0", required = false) Integer delay) throws InterruptedException{
        TimeUnit.MILLISECONDS.sleep(delay);
        return "Bonjour3!";
    }

    @GetMapping("/hello4")
    public String hello4(@RequestParam(defaultValue = "0", required = false) Integer delay) throws InterruptedException{
        TimeUnit.MILLISECONDS.sleep(delay);
        return "Bonjour4!";
    }

    @GetMapping("/hello5")
    public String hello5(@RequestParam(defaultValue = "0", required = false) Integer delay) throws InterruptedException{
        TimeUnit.MILLISECONDS.sleep(delay);
        return "Bonjour5!";
    }

}
