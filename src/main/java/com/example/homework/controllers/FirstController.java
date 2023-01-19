package com.example.homework.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController // @RestController - поддерживает все правила и договоренности Resta
// @Controller - для того чтобы Java класс стал контроллером, пишем @Controller. @Controller - просто работает с http запросами

public class FirstController {
    @GetMapping
    public String helloWorld (){
        return "Hello, web";
    } // для того чтобы наш метод был эндпоинтом, нам надо написать аннотацию @GetMapping
    /*
    @GetMapping("/path/to/page")
    public String Page (){
        return "Page #1";
    }
    */
    @GetMapping("/info")
    public String name (){
        return "Имя ученика"+" Название вашего проекта " + "Дата создания проекта " + "Описание проекта в свободной форме";
    }
   /* @GetMapping("/dateofproject")
    public String dateofproject(){
        return "Дата создания проекта";
    }
    @GetMapping
    public String projectdescription(){
        return "описание проекта в свободной форме";
    }*/


}
