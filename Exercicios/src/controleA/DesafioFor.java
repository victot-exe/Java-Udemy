package src.controleA;

public class DesafioFor {

	public static void main(String[] args) {

		String valor = "#";
		for (int i = 1; i <= 5; i++) {
			System.out.println(valor);
			valor += "#";
		}

		// N�o usar valor num�rico para controlar o la�o

		
		for (String v = "#"; !v.equals("######"); v += "#") {
			System.out.println(v);

		}
	}
}
