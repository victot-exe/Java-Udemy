package src.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class A09ExcluirPessoa {
    public static void main(String[] args) throws SQLException {

        Scanner sc = new Scanner(System.in);
        System.out.print("Informe o código: ");
        int codigo = Integer.parseInt(sc.nextLine());

        Connection conexao = A03FabricaConexao.getConexao();
        String sql = "DELETE FROM pessoa WHERE id = ?";

        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setInt(1, codigo);

        if (stmt.executeUpdate() > 0) {
            System.out.println("Pessoa excluida com sucesso!");
        }else
            System.out.println("Nada feito!");

        stmt.close();
        conexao.close();
        sc.close();
    }
}
