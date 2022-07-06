package com.board.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name ="Board")
public class Board {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "board_id")
    private int board_id;

    @Column(name = "file_name")
    private String fileName;

    @Column(name = "save_name")
    private String saveName;

    @Column(name = "reg_date")
    private Date date;

    public int getBoard_id() {
        return board_id;
    }

    public void setBoard_id(int board_id) {
        this.board_id = board_id;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getSaveName() {
        return saveName;
    }

    public void setSaveName(String saveName) {
        this.saveName = saveName;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Board{" +
                "board_id=" + board_id +
                ", fileName='" + fileName + '\'' +
                ", saveName='" + saveName + '\'' +
                ", date=" + date +
                '}';
    }
}
