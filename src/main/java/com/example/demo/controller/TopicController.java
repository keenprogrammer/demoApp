package com.example.controller;

import com.example.process.ProcessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {

    @Autowired
    ProcessService processService;


    @RequestMapping("/topics")
    public String getAllTopics() {

        return "Static String";
    }

    @RequestMapping("/Database")
    public String getFromDB() {
        return processService.readData().toString();
    }
}
