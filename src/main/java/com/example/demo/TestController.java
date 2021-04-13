package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private TestDao testDao;


    @GetMapping("/get")
    public String get(String uuid) {
        return testDao.get(uuid).toString();
    }

}
