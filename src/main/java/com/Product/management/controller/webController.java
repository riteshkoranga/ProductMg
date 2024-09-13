package com.Product.management.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class webController {

    @GetMapping(value = "/{path:[^\\.]*}")
    public String forwardReactRoutes() {
        return "forward:/index.html";
    }

}
