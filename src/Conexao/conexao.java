
package Conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class conexao {
    
    Connection conn;
    PreparedStatement st;
    ResultSet rs;
    
    public Connection Conectar() {
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/receitinha", "root", "G@tinhos16");
            return conn; 
        } catch (ClassNotFoundException | SQLException ex){
            System.out.println("Erro ao conectar: " + ex.getMessage());
            return null;
        }
    
}
    
}
