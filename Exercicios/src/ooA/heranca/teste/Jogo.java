package src.ooA.heranca.teste;

import src.ooA.heranca.Direcao;
import src.ooA.heranca.Heroi;
import src.ooA.heranca.Jogador;
import src.ooA.heranca.Monstro;

public class Jogo {
	
	public static void main(String[] args) {
		
		Jogador monstro = new Monstro();
		monstro.x = 10;
		monstro.y = 10;
		
		Heroi heroi = new Heroi(10, 11);
//		heroi.x = 10;
//		heroi.y = 11;
		
//		j1.andar(Direcao.NORTE);
//		j1.andar(Direcao.LESTE);
//		j1.andar(Direcao.NORTE);
//		j1.andar(Direcao.LESTE);

		System.out.println("O monstro tem => " + monstro.vida);
		System.out.println("O heroi tem => " + heroi.vida);
		
		monstro.atacar(heroi);
		heroi.atacar(monstro);
		
		monstro.atacar(heroi);
		heroi.atacar(monstro);
		
		monstro.andar(Direcao.NORTE);
		monstro.atacar(heroi);
		heroi.atacar(monstro);
		
		System.out.println("O monstro tem => " + monstro.vida);
		System.out.println("O heroi tem => " + heroi.vida);
	}
}
