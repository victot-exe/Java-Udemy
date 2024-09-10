package src.controleA;

public class Break {

	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {
			
			if(i == 2) {
				break; //interrompe o laço e pula para a linha após o mesmo.
			}
			System.out.println(i);
			
		}
		System.out.println("--FIM!--");
	}
}
