package teste.consulta;

import infra.DAO;
import modelo.muitospramuitos.Filme;

import java.util.List;

public class ObterFilmes {

    public static void main(String[] args) {

        DAO<Filme> dao = new DAO<>(Filme.class);
        List<Filme> filmes = dao.consultar(
                "ObterFilmesComNotaMaiorQue", "nota", 8.5);

        filmes.forEach(filme -> {
                    System.out.println(filme.getNome() + " => " + filme.getNota());
                    filme.getAtores().forEach(ator -> System.out.println(ator.getNome()));
                }
        );
    }
}
