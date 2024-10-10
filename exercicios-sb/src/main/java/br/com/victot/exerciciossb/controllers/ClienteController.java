package br.com.victot.exerciciossb.controllers;

import br.com.victot.exerciciossb.model.entitys.Cliente;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="/clientes")
public class ClienteController {

    @GetMapping(path="/qualquer")
    public Cliente obterCliente() {
        return new Cliente(28, "Victor", "123.456.789.00");
    }

    @GetMapping("/{id}")
    public Cliente obterClientePorId(@PathVariable int id){
        return new Cliente(id, "Nicole", "123.456.789.00");
    }

    @GetMapping
    public Cliente obterClientePorId2(@RequestParam(name = "id")int id){
        return new Cliente(id, "Icaro", "123.456.789.00");
    }
}
