package br.com.victot.exerciciossb.model.repositories;

import br.com.victot.exerciciossb.model.entitys.Produto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ProdutoRepository extends CrudRepository<Produto, Integer>, PagingAndSortingRepository<Produto, Integer> {

    Iterable<Produto> findByNomeContaining(String nome);
}
