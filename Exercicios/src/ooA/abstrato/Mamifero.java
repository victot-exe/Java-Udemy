package src.ooA.abstrato;

public abstract class Mamifero extends Animal{//quando a classe gera outra classe abstrata n�o � obrigat�rio implementar os m�todos
	
	public abstract String mamar();
	
	@Override
		public String mover() {
			return "Saindo do lugar";
		}
}
