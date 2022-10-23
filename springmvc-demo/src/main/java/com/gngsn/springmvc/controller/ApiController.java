package com.gngsn.springmvc.controller;

import com.gngsn.springmvc.dto.ResDTO;
import org.apache.shenyu.client.springmvc.annotation.ShenyuSpringMvcClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    @RequestMapping("/api")
    @ShenyuSpringMvcClient
    public ResDTO helloWorld() {
        return new ResDTO("[SpringMvc Demo] hello world");
    }

}
