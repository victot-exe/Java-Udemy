package src.ooA.heranca.desafio;

public class Ferrari extends Carro{
	
	
	public Ferrari(){
		this(350);
	}
	public Ferrari(int velocidadeMax){
		super(velocidadeMax);
	}
	
	public boolean acelerar() {
		
		boolean acelerar1 = super.acelerar();
		boolean acelerar2 = super.acelerar();
		boolean acelerar3 = super.acelerar();
		
		return acelerar1 || acelerar2 || acelerar3;
	}
	
}
