package teste.muitospramuitos;

import infra.DAO;
import modelo.muitospramuitos.Ator;
import modelo.muitospramuitos.Filme;

public class NovoFilmeAtor {
    public static void main(String[] args) {

        Filme filmeA = new Filme("Star Wars Ep 4", 8.9);
        Filme filmeB = new Filme("O fugitivo", 8.1);

        Ator atorA = new Ator("Harrison Ford");
        Ator atorB = new Ator("Carrie Fisher");

        filmeA.addAtor(atorA);
        filmeA.addAtor(atorB);

        filmeB.addAtor(atorA);

        DAO<Filme> filmeDAO = new DAO<Filme>();
        filmeDAO.incluirAtomico(filmeA);//por ter cascata ele já vai adicionar os atores e os filmes, mesmo tendo incluido apenas o filme A


    }
}
