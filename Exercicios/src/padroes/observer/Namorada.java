package src.padroes.observer;
//Quem est� interessado no evento, que vai implementar a interface e detalhar os m�todos para ver as a��es
public class Namorada implements ObservadorChegadaAniversariante {
	
	public void chegou(EventoChegadaAniversariante evento) {
		System.out.println("Avisar os convidados...");
		System.out.println("Apagar as luzes");
		System.out.println("Esperar um pouco...");
		System.out.println("e... SURPRESA!!!");
	}
}
