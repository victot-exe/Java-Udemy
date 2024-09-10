package src.excecao;

public class Causa {

	public static void main(String[] args) {
		//alt+shift+z
		try {
			metodoA(null);
		} catch (IllegalArgumentException e) {
			if(e.getCause() != null) {
				System.out.println(e.getCause().getMessage());
			}
		}
		
		metodoA(null);
	}

	static void metodoA(Aluno aluno) {
		try {
			metodoB(aluno);
		} catch (Exception causa) {
			throw new IllegalArgumentException(causa);
		}
	}

	static void metodoB(Aluno aluno) {
		if (aluno == null) {
			throw new NullPointerException("Aluno está NULLLOOOOOO!");
		}
		
		System.out.println(aluno.nome);
	}
}