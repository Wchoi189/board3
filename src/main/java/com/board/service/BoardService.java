package com.board.service;

import com.board.dto.BoardDTO;

import java.util.List;


public interface BoardService {
    public List<BoardDTO> list();
    public void insert (BoardDTO dto);
    public BoardDTO read(String boardId);
    public void update(BoardDTO dto);




}
