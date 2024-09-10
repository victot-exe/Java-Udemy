package src.excecao;

public class Basico {
	
	public static void main(String[] args) {
		
		Aluno a1 = null;
		
		try {
		imprimirAluno(a1);
		} catch(Exception execao) {
			System.out.println("Ocorreu no momento"
					+ "de imprimir o nome do usuário");
		}
		//alt+shift+z
		try {
			System.out.println(7 / 0);
		} catch (ArithmeticException e) {
//			e.printStackTrace();//imprime a pilha de execução
			System.out.println("Ocorreu o erro: " + e.getMessage());
		}
		
		System.out.println("Fim :)");
	}
	
	public static void imprimirAluno(Aluno aluno) {
		System.out.println(aluno.nome);
	}
}
