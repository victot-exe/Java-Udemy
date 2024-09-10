package src.ooA.encapsulamento.casaB;

import src.ooA.encapsulamento.casaA.Ana;

public class Pedro extends Ana{
	
	
	void testeAcessos() {
		//segredo
		//facoDentroDeCasa
		//formaDeFalar
		//todosSabem
		
		//Ana mae = new Ana();

		//System.out.println(segredo);//private não acessa
		//System.out.println(facoDentroDeCasa);//default só é transmitida quando está dentro do mesmo pacote
		System.out.println(formaDeFalar);//protected é transmitido para fora do pacote porém se tentar acessar por uma instancia de Ana não da certo fora do pacote
		System.out.println(todosSabem);//public
	}
}