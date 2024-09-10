package src.controleA;

public class BreakRotulado {

	public static void main(String[] args) {
		
//		deu um nome para o rótulo nome: for(...){...}
		externo: for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {

				if (i == 1) {
					break externo; //usando o rótulo para fazer sair do laço for que não é o atual, por isso chama pelo nome
					// não é indicado usar pois altera muito o fluxo do código
				}
				System.out.printf("[%d %d]", i, j);
			}
			System.out.println();
		}
		System.out.println("---FIM!---");
	}
}
