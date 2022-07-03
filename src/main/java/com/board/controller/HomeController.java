package com.board.controller;

import com.board.domain.BoardDAO;
import com.board.domain.BoardDAOImpl;
import com.board.dto.BoardDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Controller
public class HomeController {


    @Autowired
    private BoardDAO bdao;

    private BoardDTO bdto;



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

    @RequestMapping ("/list.json")
    @ResponseBody
    public String board_list(Model model){
        List<BoardDTO> blist = bdao.list();
        model.addAttribute("list", blist);
        System.out.println("list.json running");
        return  "/list";
    }

    @GetMapping("/list_info")
    public String list_read(Model model, String boardId) {
        BoardDTO bdto = bdao.read(boardId);
        model.addAttribute("bdto", bdao.read(boardId));
        return "board_list_info";
    }

    @GetMapping("/jsp")
    public String jsp(){
        System.out.println("/jsp");
        return "index1.jsp";
    }
    @GetMapping("/time")
    public String getTime() {
        String time = bdao.getTime();
        System.out.println("time:" + time);
        return time;
    }
}
