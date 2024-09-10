package src.ooA.composicao.exemploCursoN4N;

import java.util.ArrayList;
import java.util.List;

public class Curso {
	
	final String nome;
	final List<Aluno> alunos = new ArrayList<>();
	
//	Metodo para adicionar aluno
	void adicionarAluno(String nome) {
		this.adicionarAluno(new Aluno(nome));
	}
	
	void adicionarAluno(Aluno aluno) {
		this.alunos.add(aluno);
		aluno.cursos.add(this);
	}
	
	Curso(String nome){
		this.nome = nome;
	}
}
