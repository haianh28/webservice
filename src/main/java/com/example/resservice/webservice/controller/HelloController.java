package com.example.resservice.webservice.controller;

import com.example.resservice.webservice.entity.HelloWordBean;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200")
public class HelloController {

@GetMapping(path = "/helloWord")
    public String helloWord(){
        return "Hello Word";
    } 

    @GetMapping(path = "/hihi")
    public HelloWordBean helloWord2(){
        throw new RuntimeException("Đã có lỗi xảy ra !");
       // return new HelloWordBean("Xin chao");
    }
     @GetMapping(path = "hihi/{name}")
    public HelloWordBean hello3(@PathVariable("name") String name ){
    return new HelloWordBean("Xin chào "+name);
     }


}
