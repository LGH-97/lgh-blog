package com.lgh.blog.controller;

import com.lgh.blog.entity.Test;
import com.lgh.blog.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    private TestService testService;

    @GetMapping("{id}")
    public Test getTestById(@PathVariable("id") Integer id){
        return testService.getTestById(id);
    }

}
