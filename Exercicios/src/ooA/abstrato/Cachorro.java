package src.ooA.abstrato;

public class Cachorro extends Mamifero {// quando se extende uma classe normal de uma abstrata � obrigat�rio implementar
										// todos os m�todos
//	@Override
//	public String mover() {
//		return "Usando as patas";
//	}
	
	@Override
		public String mamar() {//metodos concretos podem ser sobrescritos
			return "Usando leite";
		}
}
