package us.trantor.helloworldrest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {
    @GetMapping("/hello")
    public String hello() {
        return "Hello World!";
    }
}