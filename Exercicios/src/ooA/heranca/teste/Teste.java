package src.ooA.heranca.teste;

import src.ooA.heranca.desafio.Civic;
import src.ooA.heranca.desafio.Ferrari;

public class Teste {
	
	public static void main(String[] args) {
		
		Civic civic = new Civic();
		Ferrari ferrari = new Ferrari();
		
		civic.acelerar();
		System.out.println("Velocidade atual do Civic é => " + civic.velocidadeAtual);
		civic.acelerar();
		System.out.println("Velocidade atual do Civic é => " + civic.velocidadeAtual);
		
		
		ferrari.acelerar();
		ferrari.acelerar();
		
		civic.frear();
		System.out.println("Velocidade atual do Civic é => " + civic.velocidadeAtual);
		civic.frear();
		System.out.println("Velocidade atual do Civic é => " + civic.velocidadeAtual);
		
		System.out.println(civic.velocidadeAtual);
		
		civic.frear();
		civic.frear();
		
		System.out.println("Velocidade atual da Ferrari => " + ferrari.velocidadeAtual + " km/h");
		System.out.println("Velocidade atual do Civic => " + civic.velocidadeAtual + " km/h");
	}
}
