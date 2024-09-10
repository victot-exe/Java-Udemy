package src.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class A05NovaPessoa {

	public static void main(String[] args) throws SQLException {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o nome: ");
		String nome = entrada.nextLine();
		
		Connection conexao = A03FabricaConexao.getConexao();
		
		String sql = "INSERT INTO pessoas (nome) VALUES(?)";
		PreparedStatement stmt = conexao.prepareStatement(sql);//Classe usada no lugar do Statement para prevenir de sql injection
		stmt.setString(1, nome);
		
		stmt.execute();
		
		System.out.println("Pessoa incluida com sucesso!");
		entrada.close();
	}
}
