package com.codeneeti.todo.controller;

import com.codeneeti.todo.model.Todo;
import com.codeneeti.todo.services.TodoServices;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.Date;
import java.util.List;
import java.util.Random;

@RestController
@RequestMapping("/todo")
public class TodoController {
    Logger logger = LoggerFactory.getLogger(TodoController.class);
    @Autowired
    private TodoServices todoServices;
    Random random = new Random();
    String str=null;
    //create TODO

    @PostMapping("/add")
    public ResponseEntity<Todo> createTodo(@RequestBody Todo todo) {
//        System.out.println("String length :"+str.length());
        int id = random.nextInt(99545);
        todo.setId(id);
        Date currentDate=new Date();
        todo.setAddedDate(currentDate);
        System.out.println("task added");
        System.out.println(todo);
        Todo todo1 = todoServices.createTodo(todo);
        logger.info("log created :");
        return new ResponseEntity<>(todo1, HttpStatus.CREATED);
    }

    @GetMapping("/todos")
    public ResponseEntity<List<Todo>> getTodos() {
        List<Todo> allTodo = todoServices.getAllTodo();
//        return ResponseEntity.ok(allTodo); another way
        return  new ResponseEntity<>(allTodo,HttpStatus.ACCEPTED);
    }

    @GetMapping("/todo/{id}")
    public ResponseEntity<Todo> getTodo(@PathVariable int id ){
        Todo todo=todoServices.getTodo(id);
        return new ResponseEntity<>(todo,HttpStatus.ACCEPTED);
    }
    //update todo
    @PutMapping("/update/{id}")
    public ResponseEntity<Todo> updateTodo(@RequestBody Todo newtodo,@PathVariable int id){
        Todo todo=todoServices.updateTodo(id,newtodo);
        return ResponseEntity.ok(todo);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<String> deletTod(@PathVariable int id){
        String msg=todoServices.deldetodo(id);
        return ResponseEntity.ok(msg);
    }
//    public ResponseEntity<List<Todo>> getTodos(){
//        List<Todo> allTodo=todoServices.getAllTodo();
//        return ResponseEntity<>(allTodo,HttpStatus.ACCEPTED);
//    }
//    @ExceptionHandler(NullPointerException.class)
//    public ResponseEntity<String> nullPointerException(NullPointerException ex){
//        System.out.println(ex.getMessage());
//        System.out.println("Null Pointer exception");
//        return new ResponseEntity<>("null pointer exception "+ex.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
//    }

//    //we can add multiple exception
//    @ExceptionHandler(value={NullPointerException.class, ArithmeticException.class})
//    public ResponseEntity<String> nullPointerException(Exception ex){
//        System.out.println(ex.getMessage());
//        System.out.println("Null Pointer exception");
//        return new ResponseEntity<>("null pointer exception "+ex.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
//    }

}

//***********************************
//@PostMapping("/add")
//public ResponseEntity<Todo> createTodo(@RequestBody Todo todo) {
//    int id = random.nextInt(99545);
//    todo.setId(id);
//
//    System.out.println("Task added:");
//    System.out.println(todo);
//
//    Todo createdTodo = todoServices.createTodo(todo);
//    logger.info("Log created:");
//
//    // Use ResponseEntity.created() for improved readability
//    return ResponseEntity.created(createdTodo);
//}