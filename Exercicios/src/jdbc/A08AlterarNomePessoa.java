package src.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class A08AlterarNomePessoa {
    public static void main(String[] args) throws SQLException {

        Scanner sc = new Scanner(System.in);

        System.out.print("Insita o código: ");
        int codigo = Integer.parseInt(sc.nextLine());

        System.out.print("Insira o novo nome: ");
        String novoNome = sc.nextLine();

        Connection conexao = A03FabricaConexao.getConexao();
        String sql = "UPDATE pessoas SET nome = ? WHERE codigo = ?";

        PreparedStatement stmt = conexao.prepareStatement(sql);

        stmt.setString(1, novoNome);
        stmt.setInt(2, codigo);

        int i = stmt.executeUpdate();
        System.out.println("O número de linhas alteradas foi " + i);

        stmt.close();
        conexao.close();
        sc.close();
    }
}
