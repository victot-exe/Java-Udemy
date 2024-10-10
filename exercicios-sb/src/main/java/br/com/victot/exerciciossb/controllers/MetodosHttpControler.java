package br.com.victot.exerciciossb.controllers;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/metodos")
public class MetodosHttpControler {

    @GetMapping
    public String get(){
        return "Hello World";
    }

    @PostMapping
    public String post(){
        return  "Post";
    }

    @PutMapping
    public String put(){
        return  "Put";
    }

    @PatchMapping
    public String patch(){
        return  "Patch";
    }

    @DeleteMapping
    public String delete(){
        return  "Delete";
    }
}
