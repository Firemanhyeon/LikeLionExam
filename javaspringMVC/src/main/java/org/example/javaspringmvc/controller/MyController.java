package org.example.javaspringmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class MyController {
    @GetMapping("/home")
    public String home(){
        return "home";
    }
    @GetMapping("/content")
    public String content(){
        return "content";
    }
}
