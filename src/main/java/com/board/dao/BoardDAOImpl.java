package com.board.dao;

import com.board.dto.BoardDTO;
import com.board.entity.Board;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Root;

@Repository
public class BoardDAOImpl extends SqlSessionDaoSupport implements BoardDAO {
    @Autowired
    private SessionFactory sessionFactory;
    @Override
    public List<Board> list() {
        Session session = sessionFactory.getCurrentSession();
        CriteriaBuilder cb = session.getCriteriaBuilder();
        CriteriaQuery<Board> cq = cb.createQuery(Board.class);
        javax.persistence.criteria.Root<Board> root = cq.from(Board.class);
        cq.select(root);
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


//    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
//        super.setSqlSessionFactory(sqlSessionFactory);
//    }
//
//    SqlSession sqlSession = getSqlSession();
//    private String namespace="mappers.mapper";

//     //개시판 목록 출력
//    @Override
//    public List<BoardDTO> list() {
//        System.out.println("mapper statement->");
//        return sqlSession.selectList(namespace+ ".list");
//    }
//
//     //개시 입력
//    @Override
//    public void insert(BoardDTO dto) {
//        sqlSession.insert(namespace + ".insert", dto);
//    }
//    // 개시판 선택 글 출력(Read boardId)
//    @Override
//    public BoardDTO read(String boardId) {
//        return sqlSession.selectOne(namespace + ".select", boardId);
//    }
//    // 개시판 목록 출력
//    @Override
//    public void update(BoardDTO dto) {
//        sqlSession.update(namespace + ".update", dto);
//    }


}
