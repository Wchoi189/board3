package com.board.dao;


import com.board.dto.BoardDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface BoardDAO {
    public List<BoardDTO> list();
    public void insert (BoardDTO dto);
    public BoardDTO read(String boardId);
    public void update(BoardDTO dto);

}
