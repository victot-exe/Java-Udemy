package src.controleA;

public class BreakRotulado {

	public static void main(String[] args) {
		
//		deu um nome para o r�tulo nome: for(...){...}
		externo: for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {

				if (i == 1) {
					break externo; //usando o r�tulo para fazer sair do la�o for que n�o � o atual, por isso chama pelo nome
					// n�o � indicado usar pois altera muito o fluxo do c�digo
				}
				System.out.printf("[%d %d]", i, j);
			}
			System.out.println();
		}
		System.out.println("---FIM!---");
	}
}
