package src.ooA.abstrato;

public class Cachorro extends Mamifero {// quando se extende uma classe normal de uma abstrata é obrigatório implementar
										// todos os métodos
//	@Override
//	public String mover() {
//		return "Usando as patas";
//	}
	
	@Override
		public String mamar() {//metodos concretos podem ser sobrescritos
			return "Usando leite";
		}
}
