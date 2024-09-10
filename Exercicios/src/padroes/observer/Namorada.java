package src.padroes.observer;
//Quem está interessado no evento, que vai implementar a interface e detalhar os métodos para ver as ações
public class Namorada implements ObservadorChegadaAniversariante {
	
	public void chegou(EventoChegadaAniversariante evento) {
		System.out.println("Avisar os convidados...");
		System.out.println("Apagar as luzes");
		System.out.println("Esperar um pouco...");
		System.out.println("e... SURPRESA!!!");
	}
}
