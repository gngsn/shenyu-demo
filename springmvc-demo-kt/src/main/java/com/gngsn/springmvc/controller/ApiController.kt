package com.gngsn.springmvc.controller

import com.gngsn.springmvc.ResDTO
import org.apache.shenyu.client.springmvc.annotation.ShenyuSpringMvcClient
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class ApiController {

    @RequestMapping("/kt/api")
    @ShenyuSpringMvcClient
    fun helloWorld(): ResDTO {
        return ResDTO("[SpringMvc Demo] hello world")
    }
}
