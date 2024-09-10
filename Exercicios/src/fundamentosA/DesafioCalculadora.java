package src.fundamentosA;

import javax.swing.JOptionPane;

public class DesafioCalculadora {

	public static void main(String[] args) {
		//Ler num1
		//Ler num2
		//+ - * / % 
//		JOptionPane.showInputDialog("Digite o primeiro número:");//Gera uma caixa de dialogo para o input texto
		
		String num1 = JOptionPane.showInputDialog(
				"Insira o primeiro numero: ").replace(',', '.').replaceAll(" ", "");
		
		String num2 = JOptionPane.showInputDialog(
				"Insira o segundo numero: ").replace(',', '.').replaceAll(" ", "");
		
		
		String operador = JOptionPane.showInputDialog(
				"Insira a operação desejada com os numeros (+, -, *, /, %: ");
		
		
		String monta = num1 + " " + operador + " " + num2 + " " + "=" + " ";
		System.out.println(monta);
		
		
		
		double num1d = Double.valueOf(num1);
		double num2d = Double.valueOf(num2);
		
		double mais = operador.equals("+") ? num1d + num2d : 0;
		double menos = operador.equals("-") ? num1d - num2d : mais;
		double vezes = operador.equals("*") ? num1d * num2d : menos;
		double divide = operador.equals("/") ? num1d / num2d : vezes;
		double modulo = operador.equals("%") ? num1d % num2d : divide;
		
		System.out.println(monta + modulo);
		
		
		
//		double conta = Double.valueOf(num1) + Double.valueOf(operador) + Double.valueOf(num2);
		
		
//		double conta = Double.parseDouble("");
//		System.out.println(conta);
	}
}
