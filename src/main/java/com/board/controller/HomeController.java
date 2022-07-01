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
        return "board_index";
    }
    @GetMapping("/insert")
    public String insert() {
        return "board_insert";
    }
    @GetMapping("/list")
    public String list() {
        return "board_list";
    }
    @GetMapping("/list_info")
    public String list_read() {
        return "board_list_info";
    }

    @GetMapping("/jsp")
    public String jsp(){
        System.out.println("/jsp");
        return "index1.jsp";
    }
}
