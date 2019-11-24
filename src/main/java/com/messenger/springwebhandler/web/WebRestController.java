package com.messenger.springwebhandler.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebRestController {

    @GetMapping("/hello")//Get으로 /hello로 들어올 때 ReponseBody, 즉 json으로 데이터를 반환함.
    public String hello() {
        return "HelloWorld";
    }
}
