package src.jdbc;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class A07ConsultarPessoas2 {
    public static void main(String[] args) throws SQLException {

        Scanner sc = new Scanner(System.in);
        System.out.print("Insita o nome ou parte do nome: ");
        String nome = sc.nextLine();

        Connection conexao = A03FabricaConexao.getConexao();
        String sql = "SELECT * FROM pessoas WHERE nome like ?";
        PreparedStatement stmt = conexao.prepareStatement(sql);

        stmt.setString(1, "%" + nome + "%");
        ResultSet resultado = stmt.executeQuery();


        List<Pessoa> pessoas = new ArrayList<>();

        while (resultado.next()) {
            int codigo  = resultado.getInt("codigo");
            String nomeSaida  = resultado.getString("nome");

            pessoas.add(new Pessoa(codigo, nomeSaida));
        }

        pessoas.forEach(System.out::println);

        stmt.close();
        conexao.close();
        sc.close();
    }
}
