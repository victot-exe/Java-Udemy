package src.ooA.abstrato;

public abstract class Mamifero extends Animal{//quando a classe gera outra classe abstrata não é obrigatório implementar os métodos
	
	public abstract String mamar();
	
	@Override
		public String mover() {
			return "Saindo do lugar";
		}
}
