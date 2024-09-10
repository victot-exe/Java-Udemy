package src.ooA.heranca;

public class Heroi extends Jogador {//extends � para estender a classe
	
	//Heroi(){//por padr�o o metodo construtor da classe que extends chama o construtor padr�o da classe pai
		//super();//o erro est� dando pois jogador n�o possui um construtor compat�vel
	//}
	
	public Heroi(int x, int y){//outra forma de resolver (pede ao usu�rio na hora que criar)
		super(x, y);
	}
	@Override
	public boolean atacar(Jogador oponente) {
		boolean ataque1 = super.atacar(oponente);//super � a palavra reservada para herdar os atributos e m�todos do "pai"
		boolean ataque2 = super.atacar(oponente);
		boolean ataque3 = super.atacar(oponente);
		return ataque1 || ataque2 || ataque3;
	}
}
