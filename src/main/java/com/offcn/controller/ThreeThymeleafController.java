package com.offcn.controller;

import com.offcn.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ThreeThymeleafController {

    @GetMapping("/three")
    public String indexPage(Model model){
        List<User> list = new ArrayList<>();
        list.add(new User(1, "老八", 18));
        list.add(new User(2, "老七", 20));
        list.add(new User(3, "老六", 28));
        model.addAttribute("list", list);
        return "index3";
    }
}
