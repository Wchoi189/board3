package com.board.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "board")
public class Board {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "board_id")
    private String id;

    @Column(name = "title")
    private String title;

    @Column(name = "file_name")
    private String file_name;

    @Column(name = "save_path")
    private String save_path;

    @Column(name = "reg_date")
    private Date date;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFile_name() {
        return file_name;
    }

    public void setFile_name(String file_name) {
        this.file_name = file_name;
    }

    public String getSave_path() {
        return save_path;
    }

    public void setSave_path(String save_path) {
        this.save_path = save_path;
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
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", file_name='" + file_name + '\'' +
                ", save_path='" + save_path + '\'' +
                ", date=" + date +
                '}';
    }
}
