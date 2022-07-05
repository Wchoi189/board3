package com.board.service;

import com.board.dao.BoardDAO;
import com.board.entity.Board;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class BoardServiceImpl implements BoardService {

    @Autowired
    private BoardDAO boardDAO;

    @Override
    @Transactional
    public List<Board> getBoardList() {
        return boardDAO.getBoardList();
    }

    @Override
    @Transactional
    public void insertBoard(Board theBoard) {
        boardDAO.insertBoard(theBoard);
    }

    @Override
    @Transactional
    public Board readBoardById(String boardId) {
        return boardDAO.readBoardById(boardId);
    }

    @Override
    @Transactional
    public void updateBoard(Board theBoard) {
        boardDAO.updateBoardById(theBoard);
    }

    @Override
    @Transactional
    public void deleteBoardById(String board_Id) {
        boardDAO.deleteBoardById(board_Id);
    }
}
