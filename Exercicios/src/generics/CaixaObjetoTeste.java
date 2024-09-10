package src.generics;

public class CaixaObjetoTeste {
	
	public static void main(String[] args) {
		CaixaObjeto caixaA = new CaixaObjeto();
		caixaA.guardar(2.3); // double -> Double processo automatico
		
//		Integer coisa = (Integer)caixaA.abrir();//da erro
		Double coisa = (Double)caixaA.abrir();//cast correto
		System.out.println(coisa);
		
		CaixaObjeto caixaB = new CaixaObjeto();
		caixaB.guardar("Olá");
		
		String coisaB = (String) caixaB.abrir();
		System.out.println(coisaB);
	}
}
