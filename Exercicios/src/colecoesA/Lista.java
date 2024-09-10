package src.colecoesA;

import java.util.ArrayList;
import java.util.List;

public class Lista {
//	É uma estrutura ordenada e indexada(Possui índice), aceita elementos repetidos
	
	public static void main(String[] args) {
		List<Usuario> lista = new ArrayList<>();//ArrayList e List utilizam o equals por padrão e não o HashCode.
		
		Usuario u1 = new Usuario("Ana");
		lista.add(u1);
		
		lista.add(new Usuario("Carlos"));
		lista.add(new Usuario("Lia"));
		lista.add(new Usuario("Bia"));
		lista.add(new Usuario("Manu"));
		//acessando pelo índice.
		System.out.println(lista.get(3));//ele chama de forma implicita o método toString
		
		//duas formas de remover
		System.out.println(lista.remove(1));//remove pelo índice e retorna o que foi removido
		System.out.println(lista.remove(new Usuario("Manu")));//remover eascrevendo o nome
		
		System.out.println("Tem? " + lista.contains(new Usuario("Lia")));//.contains, diz se tem ou não o elemento
		
		for(Usuario u: lista) {
			System.out.println(u.nome);//Listas mantém a ordem de inserção, != do conjunto Set
		}
	}
}
