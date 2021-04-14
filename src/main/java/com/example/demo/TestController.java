package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@RestController
public class TestController {

    @Autowired
    private TestDao testDao;


    @GetMapping("/get")
    public String get(String uuid, String tranDateStr) {
        LocalDateTime tranDate = LocalDateTime.parse(tranDateStr, DateTimeFormatter.ofPattern("yyyyMMddHHmmss"));
        return String.valueOf(testDao.get(uuid, tranDate));
    }

}
