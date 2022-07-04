package com.board.dao;


import com.board.dto.BoardDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.List;


public interface BoardDAO {
    public List<BoardDTO> list();
    public void insert (BoardDTO dto);
    public BoardDTO read(String boardId);
    public void update(BoardDTO dto);
}
