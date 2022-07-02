package com.board.domain;

import com.board.dto.BoardDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class BoardDTOImpl implements BoardDAO {
    @Autowired
    BoardDTO dto;
    String namespace = "dh.test.mapper.BoardMapper";

    @Override
    public ArrayList<BoardDTO> board_list() {
        return null;
    }

    @Override
    public void insert(BoardDTO dto) {

    }

    @Override
    public BoardDTO read(String boardid) {
        return null;
    }

    @Override
    public void update(BoardDTO dto) {

    }
}
