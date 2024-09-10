package src.ooA.heranca.desafio.resposta;

public class Carro {
	
	final int VELOCIDADE_FINAL;
	int velocidadeAtual;
	private int delta = 5;
	
	Carro(int velocidadeMaxima){
		VELOCIDADE_FINAL = velocidadeMaxima;
	}
	
	public int getDelta() {
		return delta;
	}

	public void setDelta(int delta) {
		this.delta = delta;
	}

	void acelerar() {
		if(velocidadeAtual + getDelta() > VELOCIDADE_FINAL) {
			velocidadeAtual = VELOCIDADE_FINAL;
		}else {
			velocidadeAtual += getDelta();
		}
	}
	
	void frear () {
		if(velocidadeAtual >= 5){
			velocidadeAtual -= 5;
		}else {
			velocidadeAtual = 0;
		}
	}
	
	public String toString() {//toString precisa obrigatoriamente ser public
		return "Velocidade atual é => " + velocidadeAtual + " km/h";
	}
}
