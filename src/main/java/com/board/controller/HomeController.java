package com.board.controller;

import com.board.dao.BoardDAO;
import com.board.dto.BoardDTO;
import org.mybatis.logging.Logger;
import org.mybatis.logging.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


@Controller
public class HomeController {
private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

//@Inject
//




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

    @RequestMapping("/list.json")
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
    public void getTime() {

        System.out.println("...time");


    }
}
