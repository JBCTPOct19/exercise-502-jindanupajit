package com.jindanupajit.javabootcamp.exercise5021;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {



    @RequestMapping("/")
    public String index() {
        return "index";
    }
}
