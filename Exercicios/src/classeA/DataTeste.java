package src.classeA;

public class DataTeste {
	public static void main(String[] args) {

		Data d1 = new Data(23, 5, 1999);
		//d1.dia = 23;
		//d1.mes = 5;
		//d1.ano = 1999;
		//System.out.printf("%d/%d/%d\n", d1.dia, d1.mes, d1.ano);
		
		var d2 = new Data(15, 2, 2002);
		//d2.dia = 15;
		//d2.mes = 2;
		//d2.ano = 2002;
		
		var d3 = new Data();
		
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());
		System.out.println(d3.obterDataFormatada());
		
		d1.imprimirDataFormatada();
		d2.imprimirDataFormatada();
		d3.imprimirDataFormatada();

		//System.out.printf("%d/%d/%d%n", d2.dia, d2.mes, d2.ano, " ---------------- \n");//se usa , e "" depois de fechar o primeiro "" ele ignora
		//System.out.print("askljdlkjs");
	}

}
