package src.swing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Observador {

	public static void main(String[] args) {
//		JFrame é a janela do java
		JFrame janela = new JFrame("Observador");
//		setDefaultCloseOperation(escolher como vai fechar a janela)
		janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		janela.setSize(600,200);
//		definindo o Layout da janela
		janela.setLayout(new FlowLayout());
//		Centralizar janela
		janela.setLocationRelativeTo(null);//null, centraliza na tela do computador
		
		
		JButton botao = new JButton("Clicar");
		janela.add(botao);
//		adicionando uma função ao botao
		botao.addActionListener(new ActionListener() {//interfaces funcionais tem apenas um método
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Evento ocorreu!");
			}
		});
		
		janela.setVisible(true);
	}
}
