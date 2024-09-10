package src.classeA;

public class ValorNulo {

	public static void main(String[] args) {

		String s1 = "";
		System.out.println(s1.concat("!!!!"));

		Data d1 = Math.random() > 0.5 ? new Data() : null; // Math.random cria um n aleatorio entre 0 e 1
//		null é diferente de vazio
//		Para evitar o erro nullPointerExcepition sempre que uma var for de valor null usar a condição abaixo para impedir a sua execuução
		if (d1 != null) {
			d1.mes = 3;
			System.out.println(d1.obterDataFormatada());
		}
		String s2 = Math.random() > 0.5 ? "Opa" : null;
		if (s2 != null) {
			System.out.println(s2.concat("???"));
		}
	}

}
