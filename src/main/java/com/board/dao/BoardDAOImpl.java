package com.board.dao;

import com.board.dto.BoardDTO;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BoardDAOImpl extends SqlSessionDaoSupport implements BoardDAO {

    @Autowired
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        super.setSqlSessionFactory(sqlSessionFactory);
    }

    SqlSession sqlSession = getSqlSession();
    private String namespace="mappers.mapper";

     //개시판 목록 출력
    @Override
    public List<BoardDTO> list() {
        System.out.println("mapper statement->");
        return sqlSession.selectList(namespace+ ".list");
    }

     //개시 입력
    @Override
    public void insert(BoardDTO dto) {
        sqlSession.insert(namespace + ".insert", dto);
    }
    // 개시판 선택 글 출력(Read boardId)
    @Override
    public BoardDTO read(String boardId) {
        return sqlSession.selectOne(namespace + ".select", boardId);
    }
    // 개시판 목록 출력
    @Override
    public void update(BoardDTO dto) {
        sqlSession.update(namespace + ".update", dto);
    }


}
