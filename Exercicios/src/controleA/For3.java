package src.controleA;

public class For3 {
	public static void main(String[] args) {
		
//		int i = 0;
//		for(; i < 10; i ++) { //assim para usar uma var global para o laço for
//			System.out.println(i);
//		}
		
//		for(int j = 10; j > 0; j--){ //assim nao da para usar o j fora do laço
//			System.out.println(j);
			
//		}
//		System.out.println(j); nao vai executar falando que j nao existe
//		int j = 0;
//		System.out.println(j);//ela existe agora

		
		//		------ um laço dentro de outro ------
		
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 10; j++) {
				System.out.printf("[%d %d]", i, j);
			}
			System.out.println();
			
		}
		
	}

}
