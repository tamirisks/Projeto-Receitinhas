
package Conexao;


import Classes.Receitas;
import Classes.Usuario;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class ReceitaDAO {
    
    private conexao conexao;
    private Connection conn;
    PreparedStatement st;

    public ReceitaDAO() {
        this.conexao = new conexao();
        this.conn = this.conexao.Conectar();
    }
    
    public int salvar(Receitas receita){
        
        int status;
        try{
            st = conn.prepareStatement(
                    "INSERT INTO receita (nome, ingredientes, descricao, rendimento, tempo_de_preparo, tipo_receita) "
                            + "VALUES(?,?,?,?,?,?)"
            );
                       
            st.setString(1, receita.getNome());
            st.setString(2, receita.getIngredientes());
            st.setString(3, receita.getDescricao());
            st.setString (4, receita.getRendimento( ));
            st.setString(5, receita.getTempo_de_preparo()); 
            st.setString(6, receita.getTipo_receita());
            status = st.executeUpdate();
            JOptionPane.showMessageDialog(null, "Receita cadastrado com sucesso!");
            return status;
        } catch (SQLException ex) {
            System.out.println("Erro ao conectar: " + ex.getMessage());
            return ex.getErrorCode();
        }
    }
    
    public List<Receitas> Pesquisa (String tipo){
    String sql = "SELECT * FROM receita WHERE tipo_receita LIKE ?";

    try {                 
        PreparedStatement stmt = this.conn.prepareStatement(sql);
        stmt.setString(1,"%" + tipo + "%");
        ResultSet rs = stmt.executeQuery();
        
        List<Receitas> Listagem_receitas = new ArrayList<>();

        while (rs.next()) { 
        Receitas receitas = new Receitas();
        receitas.setNome(rs.getString("nome"));
        receitas.setIngredientes(rs.getString("ingredientes"));
        receitas.setDescricao(rs.getString("descricao"));
        receitas.setRendimento(rs.getString("rendimento"));
        receitas.setTempo_de_preparo(rs.getString("tempo_de_preparo"));
        receitas.setTipo_receita(rs.getString("tipo_receita"));       
        
        Listagem_receitas.add(receitas);       
        }
        
        return Listagem_receitas;
        
    //tratando o erro, caso ele ocorra     
    } catch (Exception e) {
        System.out.println("erro: " + e.getMessage());
        return null;
      }      
    
}
    
    
    
    
}
