package com.board.dao;

import com.board.entity.Board;
import org.apache.ibatis.session.SqlSessionFactory;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

@Repository
public class BoardDAOImpl implements BoardDAO{

    @Autowired
    private SqlSessionFactory sqlSession;

    @Override
    public List<Board> getBoardList() {
        Session session = sessionFactory.getCurrentSession();
        CriteriaBuilder cb = session.getCriteriaBuilder();
        CriteriaQuery<Board> cq = cb.createQuery(Board.class);
        Root<Board> root = cq.from(Board.class);
        cq.select(root);
        Query query = session.createQuery(cq);
        return query.getResultList();
    }

    @Override
    public void insertBoard(Board theBoard) {
        Session currentSession = sessionFactory.getCurrentSession();
        currentSession.saveOrUpdate(theBoard);
    }

    @Override
    public Board readBoardById(String board_Id) {
        Session currentSession = sessionFactory.getCurrentSession();
        Board theBoard = currentSession.get(Board.class, board_Id);
        return theBoard;
    }

    @Override
    public void updateBoardById(Board theBoard) {
        Session currentSession = sessionFactory.getCurrentSession();
        currentSession.saveOrUpdate(theBoard);
    }

    @Override
    public void deleteBoardById(String board_Id) {

    }
}
