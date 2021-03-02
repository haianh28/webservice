package com.example.resservice.webservice.controller;

import com.example.resservice.webservice.entity.Todo;
import com.example.resservice.webservice.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TodoController {

    @Autowired
    public TodoService todoService;

@GetMapping("/todos")
public List<Todo> findAll(){
    return todoService.findAll();
}

}
