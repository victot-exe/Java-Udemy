package src.fundamentosA.operadores;

public class Ternario {

	public static void main(String[] args) {
		
		double media = 5.6;
		String resultadoFinal = media >= 7 ? "aprovado" : "em recuperação"; //(Operador ternário) o ? e o : são como o if e o else
		
		System.out.println("O aluno estÃ¡: " + resultadoFinal);
		
		
		boolean bomComportamento = true;
		boolean passouPorMedia = media >= 7;
		boolean temDesconto = bomComportamento && passouPorMedia;
		String resultado = temDesconto ? "Sim." : "NÃ£o.";
		
		System.out.printf("Tem desconto? %s", resultado);
	}
}
