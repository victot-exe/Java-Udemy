package src.controleA;

import java.util.Scanner;

//import javax.swing.JOptionPane;

public class DesafioDiaSemana {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite o dia da semana: ");
		String dia = entrada.nextLine(); // o .next() não considera o que vc escreve depois do espaço
		dia = dia.toLowerCase();
		System.out.println(dia);

		if (dia.equals("domingo")) {
			System.out.println("1"); // .equalsIgnoreCase ignora se é letra maiuscula ou minuscula é melhor usar ela
										// que a .toUpper ou.toLower
		} else if (dia.equalsIgnoreCase("segunda") || dia.equals("segunda-feira")) {
			System.out.println("2");
		} else if (dia.equals("terça") || dia.equals("terça-feira")) {
			System.out.println("3");
		} else if (dia.equals("quarta") || dia.equals("quarta-feira")) {
			System.out.println("4");
		} else if (dia.equals("quinta") || dia.equals("quinta-feira")) {
			System.out.println("5");
		} else if (dia.equals("sexta") || dia.equals("sexta-feira")) {
			System.out.println("6");
		} else if (dia.equals("sabado")) {
			System.out.println("7");
		} else {
			System.out.println("Dia inválido");
		}
		System.out.println("---- FIM!!! ----");

		entrada.close();

//		String day = JOptionPane.showInputDialog("Digite o dia da semana:");
//		day = day.toLowerCase();
//		
//		if (day.equals("domingo")) {
//			JOptionPane.showMessageDialog(null, "Domingo é o primeiro dia da semana");
//		}else if(day.equals("segunda")) {
//		JOptionPane.showMessageDialog(null, "Segunda-feira é o segundo dia da semana");
//		}else if(day.equals("terça")) {
//			JOptionPane.showMessageDialog(null, "Terça-feira é o terceiro dia da semana");
//		}else if(day.equals("quarta")) {
//			JOptionPane.showMessageDialog(null, "Quarta-feira é o quarto dia da semana");
//		}else if(day.equals("quinta")) {
//			JOptionPane.showMessageDialog(null, "Quinta-feira é o quinto dia da semana");
//		}else if(day.equals("sexta")) {
//			JOptionPane.showMessageDialog(null, "Sexta-feira é o sexto dia da semana");
//		}else if(day.equals("sábado")) {
//			JOptionPane.showMessageDialog(null, "Sabado é o sétimo dia da semana");
//			}

	}

}
