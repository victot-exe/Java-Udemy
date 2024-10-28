package br.com.victot.exerciciossb.model.repositories;

import br.com.victot.exerciciossb.model.entitys.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Integer>{

    Iterable<Produto> findByNomeContaining(String nome);
}
