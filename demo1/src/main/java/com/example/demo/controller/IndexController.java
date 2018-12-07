package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
    @RequestMapping("/one")
    public String one(Model model) {
        System.out.println("=========执行==========");
        // 往model中放数据
        model.addAttribute("score",18);

        return "one";
    }
    @RequestMapping("/two.html")
    public String two(Model model) {
    	model.addAttribute("score",45);
    	return "one";
    }
}
