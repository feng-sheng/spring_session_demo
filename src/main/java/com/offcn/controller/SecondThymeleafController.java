package com.offcn.controller;

import com.offcn.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.HashMap;
import java.util.Map;

@Controller
public class SecondThymeleafController {

    @GetMapping("/second")
    public String indexPage(Model model){
        String msg = "HHHHHHAAAAA";
        model.addAttribute("msg", msg);
        User user = new User();
        user.setId(1);
        user.setAge(18);
        user.setName("张三");
        model.addAttribute("user", user);
        Map<String, Object> map = new HashMap<>();
        map.put("src1", "1.jpg");
        map.put("src2", "2.jpg");
        model.addAttribute("map", map);
        return "index2";
    }
}
