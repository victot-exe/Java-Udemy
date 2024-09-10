package src.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class A02CriarBanco {
	
	public static void main(String[] args) throws SQLException {
		
		final String url =
				"jdbc:mysql://localhost:3306?verifyServerCertificate=false";
		final String usuario = "root";
		final String senha = "1234";

		Connection conexao = DriverManager
				.getConnection(url, usuario, senha);
		//Substituindo o código antigo pela fábrica de conexão
//		Connection conexao = A03FabricaConexao.getConexao();
		
		Statement stmt = conexao.createStatement();
		stmt.execute("CREATE DATABASE IF NOT EXISTS curso_java");
		
		System.out.println("Banco criado com sucesso!");
		conexao.close();
	}
	
}
