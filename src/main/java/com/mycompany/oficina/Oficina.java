package com.mycompany.oficina;

import java.sql.Connection;

public class Oficina {

    public static void main(String[] args) {

        Connexao conexao = new Connexao();

        // Chama o método de conexão nesse objeto
        Connection conn = conexao.conectaDB();

        // Verifica se a conexão foi estabelecida
        if (conn != null) {
            System.out.println("Conexão estabelecida com sucesso!");
        } else {
            System.out.println("Falha ao conectar ao banco de dados.");
        }

    }
}
