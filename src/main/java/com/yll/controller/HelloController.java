package com.yll.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @className: HelloController
 * @description: //TODO
 * @author: akira
 * @date: Created in 2018/12/27 22:48
 * @modify by: akira
 * @version: V1.0
 */
@RestController
public class HelloController {

    @GetMapping(path = "/hello")
    public String hello() {
        return "Hello Jenkins";
    }

}
