package src.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class A06ConsultarPessoas1 {
    public static void main(String[] args) throws SQLException {

        Connection conexao = A03FabricaConexao.getConexao();
        String sql = "SELECT * FROM pessoas";

        Statement stmt = conexao.createStatement();
        ResultSet resultado = stmt.executeQuery(sql);


        List<Pessoa> pessoas = new ArrayList<>();

        while (resultado.next()) {
            int codigo  = resultado.getInt("codigo");
            String nome  = resultado.getString("nome");

            pessoas.add(new Pessoa(codigo, nome));
        }

        pessoas.forEach(System.out::println);

        stmt.close();
        conexao.close();
    }
}
