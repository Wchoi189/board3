package com.board.dao;


import com.board.dto.BoardDTO;
import com.board.entity.Board;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.context.annotation.Bean;

import java.util.List;



public interface BoardDAO {
    public List<Board> list();
    public void insert (Board board);
    public Board read(String boardId);
    public void update(Board board);

}
