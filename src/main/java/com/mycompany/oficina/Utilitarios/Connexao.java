package com.mycompany.oficina.Utilitarios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class Connexao {
    
 
    public Connection conectaDB(){
        Connection conn = null;
        
            try {
                String url = "jdbc:mysql://localhost:3300/oficina?user=root&password=";
                conn = DriverManager.getConnection(url);
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
            return conn;
    }
 
}
