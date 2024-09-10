package src.jdbc;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;


public class A03FabricaConexao {
	
	public static Connection getConexao(){
		try {
			Properties prop = getProperties();
			final String url = prop.getProperty("banco.url");
			final String usuario = prop.getProperty("banco.usuario");
			final String senha = prop.getProperty("banco.senha");

//			Jeito antigo
//			final String url =
//					"jdbc:mysql://localhost:3306/curso_java?verifyServerCertificate=false";
//			final String usuario = "root";
//			final String senha = "1234";

			return DriverManager.getConnection(url, usuario, senha);

		} catch (SQLException | IOException e) {
			throw new RuntimeException(e);
		}
	}
	//Properties é a classe Java para ler e adiquirir as propriedades como as que estão no arquivo especificado no caminho.
	private static Properties getProperties() throws IOException {//acchar onde ta o erro dessa porra desse metodo

		Properties prop = new Properties();
		FileInputStream input = new FileInputStream("C://Projetos//Java-Udemy//Exercicios//src//conexao.properties");
		prop.load(input);


		return prop;
	}
}
