package src.controleA;

import javax.swing.JOptionPane;

public class IfElse {

	public static void main(String[] args) {

		String valor = JOptionPane.showInputDialog("Informe o valor:");
		int numero = Integer.parseInt(valor);

		if (numero % 2 == 0) {
			JOptionPane.showMessageDialog(null, "O numero e par");// mostra uma caixa de diálogo com a mensagem
																	// semelhante a syso
		} else {
			JOptionPane.showMessageDialog(null, "O numero e impar");
		}

	}

}
