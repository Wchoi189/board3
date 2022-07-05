package com.board.dao;


import com.board.entity.Board;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface BoardDAO {
    public List<Board> getBoardList();
    public void insertBoard (Board theBoard);
    public Board readBoardById(String board_Id);
    public void updateBoardById(Board theBoard);
    public void deleteBoardById(String board_Id);

}
