package src.classe1.desafio;

public class Comida {
	
	String nome;
	double peso;
	
	Comida(String nome, double peso){
		this.nome = nome;
		this.peso = peso;
	}
	Comida(){
		this("Pastel de vento", 0.01);
	}

}
