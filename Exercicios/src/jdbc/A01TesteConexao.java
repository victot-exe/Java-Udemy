package src.jdbc;//Java DataBase Conectivit

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class A01TesteConexao {

	public static void main(String[] args) throws SQLException{
		
		final String url = "jdbc:mysql://localhost:3307?verifyServerCertificate=false&useSSL=true";//string que representa o local que vai acessar o DB
		final String usuario = "root";
		final String senha = "";
		
		Connection conexao = DriverManager
				.getConnection(url, usuario, senha);//lança uma exeção checada
		
		System.out.println("Conexão efetuada com sucesso!");
		conexao.close();
	}
	
}
