package com.board.service;

import com.board.dao.BoardDAO;
import com.board.entity.Board;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardServiceImpl implements BoardService{
@Autowired
    private BoardDAO boardDao;

    @Override
    public List<Board> list() {
        return null;
    }

    @Override
    public void insert(Board board) {

    }

    @Override
    public Board read(String boardId) {
        return null;
    }

    @Override
    public void update(Board board) {

    }

    @Override
    public void delete(String boardId) {

    }
}
