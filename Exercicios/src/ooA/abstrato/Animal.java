package src.ooA.abstrato;

public abstract class Animal {//classe abstrata, que não pode ser instanceada mas que pode ser um tipo, ela pode conter métodos abstratos 
	
	public String respirar() {
		return "Usando Oxigênio";
	}
	
	public abstract String mover();//método abstrado (não tem corpo e precisa ser implementado quando for para uma classe normal)
}
