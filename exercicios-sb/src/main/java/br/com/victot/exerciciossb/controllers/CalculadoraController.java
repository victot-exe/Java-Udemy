package br.com.victot.exerciciossb.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/calculadora")
public class CalculadoraController {

    @GetMapping(path = "/somar/{a}/{b}")
    public double somar(@PathVariable double a, @PathVariable double b) {
        return a + b;
    }

    @GetMapping(path = "/subtrair")
    public double subtrair(@RequestParam(name="a") double a, @RequestParam(name="b") double b) {
        return a - b;
    }
}
