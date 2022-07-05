package com.board.service;

import com.board.entity.Board;

import java.util.List;


public interface BoardService {
    public List<Board> getBoardList();
    public void insertBoard (Board board);
    public Board readBoardById(String boardId);
    public void updateBoard(Board board);
    public void deleteBoardById(String boardId);




}
