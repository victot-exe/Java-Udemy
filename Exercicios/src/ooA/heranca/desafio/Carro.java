package src.ooA.heranca.desafio;

public class Carro {
	
	final double VELOCIDADE_MAXIMA;
	public double velocidadeAtual;
	protected int delta = 5;
	
	
	protected Carro(int velocidadeMaxima){
		this.VELOCIDADE_MAXIMA = velocidadeMaxima;
	}
	protected Carro(){
		this(250);
	}
	
	public boolean acelerar() {
		
		if(velocidadeAtual + delta > VELOCIDADE_MAXIMA) {
			this.velocidadeAtual = VELOCIDADE_MAXIMA;
			return false;
		}else {
			this.velocidadeAtual += delta;
			return true;
		}
	}
	
	public boolean frear() {
		if(0 < this.velocidadeAtual) {
			this.velocidadeAtual = this.velocidadeAtual - 5;
			return true;
		}else {
			this.velocidadeAtual = 0;
			System.out.println("Velocidade atual é 0.0 km/h");
			return false;
		}
	}

}
