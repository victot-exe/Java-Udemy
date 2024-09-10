package src.colecoesA;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {
//	estrutura de dados chave valor (dict)
	//chaves não podem ser iguais, o valor pode ter repetido
	
	public static void main(String[] args) {
		
		Map<Integer, String> usuarios = new HashMap<>();
		usuarios.put(1, "Roberto");//Map não possui .add, somente o .put
//		.put serve para inserir e alterar os valores por isso o nome do modo mudou
		usuarios.put(20, "Ricardo");
		usuarios.put(3, "Rafaela");
		usuarios.put(4, "Rebeca");
		
		System.out.println(usuarios.size());//mesmo tendo 3 .put só adcionou um nome pois a chave é a mesma
		System.out.println(usuarios.isEmpty());
		
		System.out.println(usuarios.keySet());//retorna um conjunto das chaves
		System.out.println(usuarios.values());//retorna um set apenas dos valores
		System.out.println(usuarios.entrySet());//retorna o Map
		
		System.out.println(usuarios.containsKey(20));//contains mas só de chave
		System.out.println(usuarios.containsValue("Rebeca"));
		
		System.out.println(usuarios.get(4));//retorna o valor da chave escrita
		System.out.println(usuarios.remove(1));//remove o valor que foi removido or false
		System.out.println(usuarios.remove(4, "Gui"));//tambem pode remover por chave e valor
		
		
//		PERCORRENDO O MAP
		for(int chave: usuarios.keySet()) {//apenas a chave
			System.out.println(chave);
		}
		
		for(String valor: usuarios.values()) {//apenas o valor
			System.out.println(valor);
		}
		
		for(Entry<Integer, String> registro: usuarios.entrySet()) {//forEach para Map
//			java.util.Map.Entry
			System.out.print(registro.getKey() + "==>");
			System.out.println(registro.getValue());
			
		}
	}
}
