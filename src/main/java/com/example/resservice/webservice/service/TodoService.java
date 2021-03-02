package com.example.resservice.webservice.service;

import com.example.resservice.webservice.entity.Todo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class TodoService {
    private  static List<Todo> todos = new ArrayList<>();
    private static  int idCounter = 0;

    static {
        todos.add(new Todo(++idCounter,"Tran Trung Hai","learn to Dance2",new Date(),false));
        todos.add(new Todo(++idCounter,"haicntt28","learn to Dance",new Date(),false));
        todos.add(new Todo(++idCounter,"haicntt28","learn to Dance",new Date(),false));
    }
    public List<Todo> findAll(){
        return todos;
    }
}
