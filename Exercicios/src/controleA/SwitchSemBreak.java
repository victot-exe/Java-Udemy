package src.controleA;

public class SwitchSemBreak {
	
	public static void main(String[] args) {
		
		String faixa = "vermelha";
		
//		o switch sem o break ele entra em um case e executa todos os abaixo tamb�m
		
		switch (faixa.toLowerCase()) { //Ele recebe um valor e vai testando o valor nos casos 
		case "preta":
			System.out.println("Sei o Bassai-Dai...");
		case "marrom":
			System.out.println("Sei o Tekki Shodan...");
		case "roxa":
			System.out.println("Sei o Heian Godan...");
		case "verde":
			System.out.println("Sei o Heian Yodan...");
		case "laranja":
			System.out.println("Sei o Heian Sandan...");
		case "vermelha":
			System.out.println("Sei o Heian Nidan...");
		case "amarela":
			System.out.println("Sei o Heian Shodan...");
			break; //faz sair do switch 
//		default: //sempre � executado
//				System.out.println("N�o sei de nada");
			
		}
		
		System.out.println("---FIM!---");
		
	}

}
