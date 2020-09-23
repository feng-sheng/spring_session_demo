package com.offcn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FourThymeleafController {

    @GetMapping("/four")
    public String indexPage(Model model){
        model.addAttribute("userName", "百度");
        model.addAttribute("href", "http://www.baidu.com/");
        return "index4";
    }
}
