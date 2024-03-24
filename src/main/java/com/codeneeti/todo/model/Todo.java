package com.codeneeti.todo.model;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
//import javax.xml.crypto.Data;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class Todo {
    private String title;
    private String content;
    private String Status;
    private Date addedDate;
    private int id;

    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonFormat(pattern = "dd/MM/yyyy")
    private Date todoDate;
//    @JsonFormat(pattern = "dd/MM/yyyy")
//    private LocalDate todoDate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public Date getAddedDate() {
        return addedDate;
    }

    public void setAddedDate(Date addedDate) {
        this.addedDate = addedDate;
    }

    public Date getTodoDate() {
        return todoDate;
    }

    public void setTodoDate(Date todoDate) {
        this.todoDate = todoDate;
    }

    public Todo(int id, String title, String content, String status, Date addedDate, Date todoDate) {
        this.id = id;
        this.title = title;
        this.content = content;
        Status = status;
        this.addedDate = addedDate;
        this.todoDate = todoDate;
    }
}
