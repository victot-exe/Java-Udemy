package src.ooA.heranca.desafio.resposta;

public interface Luxo {
	
	void ligarAr();
	void desligarAr();
	default int velocidadeDoAr() {//usa a palavra default para implementar um método concreto dentro de uma interface
		return 1;
	}
}