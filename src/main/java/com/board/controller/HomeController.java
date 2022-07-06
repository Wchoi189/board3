package com.board.controller;

import com.board.dao.BoardDAO;
import com.board.dto.BoardDTO;
import com.board.entity.Board;
import com.board.service.BoardService;
import org.mybatis.logging.Logger;
import org.mybatis.logging.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
public class HomeController {
private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

@Autowired
private BoardService boardService;
    private BoardDAO bdao;
//    private BoardDTO bdto;


    @GetMapping("/")
    public String home(Model model) {
        List<Board> boardList = boardService.list();
        model.addAttribute("boardList", boardList);
        System.out.println("home controller working");
        return "board_index";
    }
    @PostMapping("/insert")
    public String insert(@ModelAttribute("board") Board board) {
        boardService.insert(board);
        return "redirect:/board_list";
    }

    @PostMapping("updateBoard")
    public String update() {
        return "board_list";
    }

    @GetMapping("/delete")
    public String deleteBoard(@RequestParam("boardId") String theboardId){
        boardService.delete(theboardId);
        return "redirect:/board_list";
    }

//    @RequestMapping("/list.json")
//    @ResponseBody
//    public String board_list(Model model){
//        List<BoardDTO> blist = bdao.list();
//        model.addAttribute("list", blist);
//
//
//        return  "/list";
//    }

//    @GetMapping("/list_info")
//    public String list_read(Model model, String boardId) {
//        BoardDTO bdto = bdao.read(boardId);
//        model.addAttribute("bdto", bdao.read(boardId));
//        return "board_list_info";
//    }
//
//    @GetMapping("/jsp")
//    public String jsp(){
//        System.out.println("/jsp");
//
//        return "index1.jsp";
//    }
//    @GetMapping("/time")
//    public void getTime() {
//
//        System.out.println("...time");
//
//
//    }
}
