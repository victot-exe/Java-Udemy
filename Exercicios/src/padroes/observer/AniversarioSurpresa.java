package src.padroes.observer;

public class AniversarioSurpresa {

	public static void main(String[] args) {
		
		Namorada namorada = new Namorada();
		Porteiro porteiro = new Porteiro();
		//m�todo que registra o observer que vai ser monitorado no evento
		porteiro.registrarObservador(namorada);
		//usando lambda para registrar um observador
		porteiro.registrarObservador(e -> {//para mostrar que n�o � necessario criar uma classe pra cada oberver
			System.out.println("Surpresa via lambda!");
			System.out.println("Ocorreu em:" + e.getMomento());
		});	
		//processo que come�a a monitorar o algoritmo
		porteiro.monitorar();
	}
}
