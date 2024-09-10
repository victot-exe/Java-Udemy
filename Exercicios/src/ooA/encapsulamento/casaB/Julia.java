package src.ooA.encapsulamento.casaB;

import src.ooA.encapsulamento.casaA.Ana;

public class Julia {
	
	void testeAcessos() {
		//segredo
		//facoDentroDeCasa
		//formaDeFalar
		//todosSabem
		
		Ana sogra = new Ana();
		
		//System.out.println(sogra.segredo);//private não acessa
		//System.out.println(sogra.facoDentroDeCasa);
		//System.out.println(sogra.formaDeFalar);
		System.out.println(sogra.todosSabem);
	}
}
