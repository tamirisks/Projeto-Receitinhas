
package Conexao;

import Classes.Usuario;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDAO {
    
    
    private conexao conexao;
    private Connection conn;
    PreparedStatement st;
    
    public UsuarioDAO() {
        this.conexao = new conexao();
        this.conn = this.conexao.Conectar();
    }
    
    public int salvar(Usuario usuario){
        
        int status;
        try{
            st = conn.prepareStatement(
                    "INSERT INTO usuario (nome, email, senha) "
                            + "VALUES(?,?,?)"
            );
                       
            st.setString(1, usuario.getNome());
            st.setString(2, usuario.getEmail());
            st.setString(3, usuario.getSenha());
            status = st.executeUpdate();
            //JOptionPane.showMessageDialog(null, "Usuário cadastrado com sucesso!");
            return status;
        } catch (SQLException ex) {
            System.out.println("Erro ao conectar: " + ex.getMessage());
            return ex.getErrorCode();
        }
    }
    
       public Usuario Confirmar(String loginDigitado, String senhaDigitada) {

    try {
        String sql = "SELECT nome, senha FROM usuario WHERE nome = ? AND senha = ?";
        st = conn.prepareStatement(sql);
        st.setString(1, loginDigitado);
        st.setString(2, senhaDigitada);


        ResultSet rs = st.executeQuery();

        if (rs.next()) {
            Usuario usuario = new Usuario();
            usuario.setNome(rs.getString("nome"));
            usuario.setSenha(rs.getString("senha"));
            return usuario;
        } else {
            return null;
        }

    } catch (SQLException ex) {
        System.out.println("Erro na digitação: " + ex.getMessage());
        return null;
    }

}   
    
}
