package src.ooA.heranca;

public class Monstro extends Jogador{
	
	public Monstro(){//setando os valores padrão na super()
		this(0, 0);
	}
	
	protected Monstro(int x, int y){
		super(x, y);
	}
}
