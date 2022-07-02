package com.board.domain;


import com.board.dto.BoardDTO;

import java.util.ArrayList;

public interface BoardDAO {
    public ArrayList<BoardDTO> board_list();
    public void insert (BoardDTO dto);
    public BoardDTO read(String boardId);
    public void update(BoardDTO dto);
}
