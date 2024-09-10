package src.ooA.abstrato;

public abstract class Animal {//classe abstrata, que n�o pode ser instanceada mas que pode ser um tipo, ela pode conter m�todos abstratos 
	
	public String respirar() {
		return "Usando Oxig�nio";
	}
	
	public abstract String mover();//m�todo abstrado (n�o tem corpo e precisa ser implementado quando for para uma classe normal)
}
