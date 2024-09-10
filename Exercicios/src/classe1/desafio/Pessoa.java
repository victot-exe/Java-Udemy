package src.classe1.desafio;

public class Pessoa {

	String nome;
	double peso;

	Pessoa(String nome, double peso) {
		this.nome = nome;
		this.peso = peso;
	}

	String apresentar() {
		return "Olá eu sou " + this.nome + " e tenho " + this.peso + "kg.";
	}
	
	void comer(Comida c1) {
		if (c1 != null) {
			System.out.println(this.apresentar());
			this.peso += c1.peso;
			System.out.println("Comi um " + c1.nome + " e fiquei com " + this.peso + "kg.");
		}
	}


}
