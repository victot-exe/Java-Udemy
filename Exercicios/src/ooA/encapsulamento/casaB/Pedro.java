package src.ooA.encapsulamento.casaB;

import src.ooA.encapsulamento.casaA.Ana;

public class Pedro extends Ana{
	
	
	void testeAcessos() {
		//segredo
		//facoDentroDeCasa
		//formaDeFalar
		//todosSabem
		
		//Ana mae = new Ana();

		//System.out.println(segredo);//private n�o acessa
		//System.out.println(facoDentroDeCasa);//default s� � transmitida quando est� dentro do mesmo pacote
		System.out.println(formaDeFalar);//protected � transmitido para fora do pacote por�m se tentar acessar por uma instancia de Ana n�o da certo fora do pacote
		System.out.println(todosSabem);//public
	}
}