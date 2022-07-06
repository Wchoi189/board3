package com.board.service;

import com.board.dto.BoardDTO;
import com.board.entity.Board;

import java.util.List;


public interface BoardService {
    public List<Board> list();
    public void insert (Board board);
    public Board read(String boardId);
    public void update(Board board);

    public void delete(String boardId);


}
