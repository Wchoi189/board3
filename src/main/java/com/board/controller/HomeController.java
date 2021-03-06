package com.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("message", "Hello Spring MVC5");
        model.addAttribute("message2", "Thymeleaf!");
        model.addAttribute("user_name", "Bryan");
        model.addAttribute("email", "wchoi189@gmail.com");
        System.out.println("home controller working");
        return "index";
    }

    @GetMapping("/list")

    public String list() {
        System.out.println("list url working");
        return "list.jsp";
    }

    @GetMapping("/jsp")
    public String jsp(){
        System.out.println("/jsp");
        return "index1.jsp";
    }
}
