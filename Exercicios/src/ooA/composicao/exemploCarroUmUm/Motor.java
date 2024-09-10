package src.ooA.composicao.exemploCarroUmUm;

public class Motor {
	
	final Carro carro;
	boolean ligado = false;
	double fatorInjecao = 1;
	
	Motor(Carro carro){
		this.carro =  carro;
	}
	
	int giros() {
		if(!ligado) {
			return 0;
		}else {
		return (int)Math.round(fatorInjecao * 3000);//Math.round arredenda o valor inteiro mais próximo da conta
		}
	}
}
