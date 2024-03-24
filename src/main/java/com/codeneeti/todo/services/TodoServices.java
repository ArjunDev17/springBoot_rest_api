package com.codeneeti.todo.services;

import com.codeneeti.todo.exception.ResourceNotFoundException;
import com.codeneeti.todo.model.Todo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class TodoServices {
    Logger logger= LoggerFactory.getLogger(TodoServices.class);

    List<Todo> todos=new ArrayList<>();

    public Todo createTodo(Todo todo){
        logger.info("all data {}",todo);
        todos.add(todo);
        return todo;
    }
    public List<Todo> getAllTodo() {
        return todos;
    }
//    public Todo getTodo(int id){
//        Todo todo = todos.stream()
//                .filter(t -> id == t.getId())
//                .findAny().get();
//        return  todo;
//    }
public Todo getTodo(int id){
    Todo todo = todos.stream()
            .filter(t -> id == t.getId())
            .findAny().orElseThrow(()-> new ResourceNotFoundException("todo not found"," f",HttpStatus.NOT_FOUND));
    return  todo;
}

    public Todo updateTodo(int id,Todo newTodo){
        List<Todo> todoList = todos.stream().map(t -> {
            if (t.getId() == id) {
                t.setContent(newTodo.getContent());
                t.setStatus(newTodo.getStatus());
                t.setTitle(newTodo.getTitle());
            return t;
            } else {
                return t;
            }
        }).collect(Collectors.toList());
        todos=todoList;
        newTodo.setId(id);
        return newTodo;
    }

    public String deldetodo(int id){
        List<Todo> todoList = todos.stream().filter(t -> t.getId() != id).collect(Collectors.toList());
        todos=todoList;
        return "deleted";
    }
}
