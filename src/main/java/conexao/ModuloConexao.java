/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Daniel
 */
public class ModuloConexao {

    public static void main(String[] args) {
        Connection conexao = null;
        try {
            // Defina as informações de conexão
            String url = "jdbc:mysql://localhost:3300/oficina";
            String usuario = "root";
            String senha = "";

            // Estabeleça uma conexão com o banco de dados
            conexao = DriverManager.getConnection(url, usuario, senha);
            System.out.println("Conexão bem-sucedida!");

        } catch (SQLException e) {
            System.out.println("Falha na conexão com o banco de dados.");
            e.printStackTrace();
        } finally {
            try {
                if (conexao != null) {
                    conexao.close();
                }
            } catch (SQLException e) {
                System.out.println("Falha ao fechar a conexão com o banco de dados.");
                e.printStackTrace();
            }
        }
    }
}


