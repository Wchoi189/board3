package com.board.mapper;

import com.board.dto.BoardDTO;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

@Mapper
public interface BoardMapper {

    @Select("select * from Board")
    public List<BoardDTO> list();

    @Select("select * from Board WHERE board_id = #{board_id}")
    public BoardDTO readById(String boardId);

    @Insert("insert into Board(title, file_name, save_path, reg_date) +" +
            " VALUES (#{id}, #{firstName}, #{lastName}, #{emailId})")
    public int insert(BoardDTO boardDTO);

}
