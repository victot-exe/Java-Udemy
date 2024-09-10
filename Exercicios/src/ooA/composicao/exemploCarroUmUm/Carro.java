package src.ooA.composicao.exemploCarroUmUm;

public class Carro {
	
	final Motor motor;//deixar como constante para manter o mesmo carro e o mesmo motor para sempre
	
	Carro(){
		this.motor = new Motor(this);
	}
	
	void acelerar() {
		if(motor.fatorInjecao < 2.5) {
			motor.fatorInjecao += 0.4;
		}
	}
	void frear() {
		if(motor.fatorInjecao > 0.5) {
			motor.fatorInjecao -= 0.4;
		}
	}
	
	void ligar() {
		motor.ligado = true;
		}
	
	void desligar() {
		motor.ligado = false;
	}
	
	boolean estaLigado() {
		return motor.ligado;
	}
	
}
