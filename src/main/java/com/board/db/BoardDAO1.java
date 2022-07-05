package com.board.db;

import com.board.dto.BoardDTO;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import java.util.List;


public class BoardDAO1 {


    SqlSession sqlSession;

//    String namespace= "classpath:mappers/mapper.xml" ;
    String namespace="mappers.mapper";


    public void setSqlSession(SqlSession sqlSession) {
        this.sqlSession = sqlSession;
    }

    public List<BoardDTO> list() {
        List<BoardDTO> result = sqlSession.selectList("Board.list");
        return result;
    }

    public int insert(BoardDTO dto) {
        int result = sqlSession.insert("Board.insert", dto);
        return result;
    }
}

