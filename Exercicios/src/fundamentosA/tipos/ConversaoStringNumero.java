package src.fundamentosA.tipos;

import javax.swing.JOptionPane;

public class ConversaoStringNumero {
	
	public static void main(String[] args) {
		
		String valor1 = JOptionPane.showInputDialog(
				"Digite o primeiro número:");//Gera uma caixa de dialogo para o input texto
		String valor2 = JOptionPane.showInputDialog(
				"Digite o segundo número:");
		
		System.out.printf("Valor 1 = %s %nValor 2 = %s%n", valor1, valor2);
		
		double numero1 = Double.parseDouble(valor1);
		double numero2 = Double.parseDouble(valor2);
		
		double soma = numero1 + numero2;
		System.out.printf("Soma é: %.2f %n", soma);
		System.out.println("Média é: " + soma / 2);
		
//		para resultados 100% precisos em java usamos a BigDecimal.
		
		
		
		
	}

}
