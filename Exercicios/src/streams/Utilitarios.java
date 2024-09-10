package src.streams;

import java.util.function.UnaryOperator;

public class Utilitarios {//para evitar que a classe seja instanciada colocamos o método construtor como private ou transformamos em interface
	
	private Utilitarios(){
	}
	
	public static final UnaryOperator<String> maiuscula = n -> n.toUpperCase();
	
	public static final UnaryOperator<String> primeiraLetra = n -> n.charAt(0) + "";//charAt retorna um char, que somado com uma str vira uma str
	
	public static final String grito(String n){//agora ele respeita o UnaryOperator e ainda pode ser usado em outros locais do sistema
		return n + "!!! ";
	}
}
