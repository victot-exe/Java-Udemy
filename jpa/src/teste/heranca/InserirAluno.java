package teste.heranca;

import infra.DAO;
import modelo.heranca.Aluno;
import modelo.heranca.AlunoBolsista;

public class InserirAluno {
    public static void main(String[] args) {
        DAO<Aluno> alunoDao = new DAO();

        Aluno aluno = new Aluno(123L, "João");
        AlunoBolsista aluno2 = new AlunoBolsista(345L, "João", 1000d);

        alunoDao.incluirAtomico(aluno);
        alunoDao.incluirAtomico(aluno2);

        alunoDao.fechar();
    }
}
