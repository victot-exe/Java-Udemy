package br.com.victot.exerciciossb.controllers;

import br.com.victot.exerciciossb.model.entitys.Produto;
import br.com.victot.exerciciossb.model.repositories.ProdutoRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoRepository produtoRepository;

    @RequestMapping(method = {RequestMethod.PUT, RequestMethod.POST})
    public @ResponseBody Produto novoProduto(@Valid Produto produto) {
        produtoRepository.save(produto);
        return produto;
    }

    @GetMapping
    public Iterable<Produto> obterProdutos() {
        return produtoRepository.findAll();
    }

    @GetMapping(path = "/pagina/{numeroPagina}/{qtdePagina}")
    public Iterable<Produto> obterProdutosPorPagina(@PathVariable int numeroPagina, @PathVariable int qtdePagina) {
        if(qtdePagina >= 5) qtdePagina = 5;
        Pageable page = PageRequest.of(numeroPagina, qtdePagina);
        return produtoRepository.findAll(page);
    }

    @GetMapping(path = "/{id}")
    public Optional<Produto> obterProdutoPorId(@PathVariable int id) {
        return produtoRepository.findById(id);
    }

    @DeleteMapping(path = "/{id}")
    public void deletarProdutoPorId(@PathVariable int id) {
        produtoRepository.deleteById(id);
    }

    @GetMapping(path = "/nome/{nome}")
    public Iterable<Produto> obterProdutosPorNome(@PathVariable String nome) {
        return produtoRepository.findByNomeContaining(nome);
    }

//    @PostMapping
//    public @ResponseBody Produto novoProduto(@Valid Produto produto) {
//        produtoRepository.save(produto);
//        return produto;
//    }

//    @PutMapping
//    public Produto alterarProduto(@Valid Produto produto) {
//        return produtoRepository.save(produto);
//    }

}
