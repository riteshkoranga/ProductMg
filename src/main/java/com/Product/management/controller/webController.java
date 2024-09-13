package com.Product.management.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

public class webController {

    @GetMapping("/")
    public String index() {
        return "forward:/index.html";
    }

}
