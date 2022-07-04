package com.board.dao;

import com.board.dto.BoardDTO;
import org.apache.ibatis.session.SqlSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public class BoardDAOImpl implements BoardDAO {

    @Autowired //DI(의존성 주입): spring container로부터 객체를 주입
    private SqlSession session;



//    @Resource
//    SqlSession template;
    String namespace = "com.board.mapper.mapper";

    // 개시판 목록 출력
    @Override
    public List<BoardDTO> list() {
        System.out.println("mapper statement->");
        return session.selectList(namespace+ ".list");
    }

    // 개시 입력
    @Override
    public void insert(BoardDTO dto) {
        session.insert(namespace + ".insert", dto);
    }
    // 개시판 선택 글 출력(Read boardId)
    @Override
    public BoardDTO read(String boardId) {
        return session.selectOne(namespace + ".select", boardId);
    }
    // 개시판 목록 출력
    @Override
    public void update(BoardDTO dto) {
        session.update(namespace + ".update", dto);
    }

}
