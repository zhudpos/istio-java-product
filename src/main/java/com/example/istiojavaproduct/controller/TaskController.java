package com.example.istiojavaproduct.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("task")
public class TaskController {
    @PostMapping("/commonSync")
    @ResponseBody
    public String commonSync(){
        return "success";
    }
}
