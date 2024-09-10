package src.ooA.heranca;

public class Heroi extends Jogador {//extends é para estender a classe
	
	//Heroi(){//por padrão o metodo construtor da classe que extends chama o construtor padrão da classe pai
		//super();//o erro está dando pois jogador não possui um construtor compatível
	//}
	
	public Heroi(int x, int y){//outra forma de resolver (pede ao usuário na hora que criar)
		super(x, y);
	}
	@Override
	public boolean atacar(Jogador oponente) {
		boolean ataque1 = super.atacar(oponente);//super é a palavra reservada para herdar os atributos e métodos do "pai"
		boolean ataque2 = super.atacar(oponente);
		boolean ataque3 = super.atacar(oponente);
		return ataque1 || ataque2 || ataque3;
	}
}
