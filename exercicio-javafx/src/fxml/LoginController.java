package fxml;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class LoginController {
	
	@FXML
	private TextField campoEmail;
	
	@FXML
	private TextField campoSenha;
	
	public void entrar() {
		
		boolean emailValido = campoEmail.getText().equals("victot@victot.com");
		boolean senhaValida = campoSenha.getText().equals("1234567");
		
		if(emailValido & senhaValida) {
			System.out.println("Sucess");
		}else
			System.out.println("Errou!");
	}
	
	
}
