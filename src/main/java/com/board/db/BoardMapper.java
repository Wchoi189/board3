package com.board.db;

import com.board.dto.BoardDTO;

import java.util.List;

public interface BoardMapper {
    public List<BoardDTO> list();
}
