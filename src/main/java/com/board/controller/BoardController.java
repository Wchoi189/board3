package com.board.controller;

import com.board.entity.Board;
import com.board.service.BoardService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/board")
public class BoardController {
    private BoardService boardService;

    @GetMapping("/listBoard")
    public String boardList(Model theModel) {
        List<Board> theBoard = boardService.getBoardList();
        theModel.addAttribute("boardList", theBoard);
        return "board_list";
    }

    @PostMapping("/insertBoard")
    public String boardSave(@ModelAttribute("board") Board board,
                            Model theModel) {
        boardService.insertBoard(board);
        return "redirect: board_list";
    }

    @GetMapping("/updateBoard")
    public String updateBoard(@RequestParam("board_Id") String board_Id, Model theModel) {
        Board theBoard = boardService.readBoardById(board_Id);
        boardService.updateBoard(theBoard);
        return "redirect: board_list";
    }

    @GetMapping("/delete")
    public String deleteBoard(@RequestParam("board_id") String board_Id, Model theModel) {
        boardService.deleteBoardById(board_Id);
        return "redirect: board_list";

    }
}
