package com.example.springbootdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HelloController {

    @GetMapping("/")
    public String printWelcome(Model model) {
        List<String> messages = new ArrayList<>();
        messages.add("Hello!");
        messages.add("This is a CRUD project");
        messages.add("Transferred to Spring Boot");
        model.addAttribute("messages", messages);
        return "index";
    }
}
