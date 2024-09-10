package src.ooA.composicao.exemploCursoN4N;

import java.util.ArrayList;
import java.util.List;
 
public class Aluno {
	
	final String nome;
	final List<Curso> cursos = new ArrayList<>();//lista constante
	
	void adicionarCurso(String nome) {
		this.adicionarCurso(new Curso(nome));
	}
	
	void adicionarCurso(Curso curso) {
		this.cursos.add(curso);
		curso.alunos.add(this);
	}
	
	Aluno(String nome){
		this.nome = nome;
	}
	
	Curso obterCursoPorNome(String nome) {
		for(Curso curso: this.cursos) {
			if(curso.nome.equalsIgnoreCase(nome)) {
				return curso;
			}
		}
		return null;
	}
	
	public String toString() {//usa sempre que quer fazer algo retornar uma String
		return nome;
	}
}
