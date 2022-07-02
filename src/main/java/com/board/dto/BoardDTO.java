package com.board.dto;

import java.util.Date;

public class BoardDTO {
    private int boardId;
    private String title;
    private String file_name;
    private String file_path;
    private Date date;

    public int getBoardId() {
        return boardId;
    }

    public void setBoardId(int boardId) {
        this.boardId = boardId;
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

    public String getFile_path() {
        return file_path;
    }

    public void setFile_path(String file_path) {
        this.file_path = file_path;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "BoardDTO{" +
                "boardId=" + boardId +
                ", title='" + title + '\'' +
                ", file_name='" + file_name + '\'' +
                ", file_path='" + file_path + '\'' +
                ", date=" + date +
                '}';
    }
}
