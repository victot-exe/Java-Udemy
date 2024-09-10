package src.excecao.personalizadaA;

import src.excecao.Aluno;

public class TesteValidacoes {
	
	public static void main(String[] args) {
		
		try {
			Aluno aluno = new Aluno("Ana", 7);
			Validar.aluno(aluno);
			
			Validar.aluno(null);
		} catch (StringVaziaException e) {//blocos para tratar erros com tratamento diferente
			System.out.println(e.getMessage());
		} catch (NumeroForaDoIntervaloException
				| IllegalArgumentException e) {//jeito para tratar mais de uma exceção com o mesmo tratamento
			System.out.println(e.getMessage());
		}
		
		System.out.println("Fim :)");
	}
}
