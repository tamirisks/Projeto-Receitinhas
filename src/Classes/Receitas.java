
package Classes;

public class Receitas {
    
    int largura = 500;
    int altura = 350;
    
    public String nome;
    public String ingredientes; 
    public String descricao;
    public String rendimento;
    public String tempo_de_preparo;
    public String tipo_receita;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getRendimento() {
        return rendimento;
    }

    public void setRendimento(String rendimento) {
        this.rendimento = rendimento;
    }

    public String getTempo_de_preparo() {
        return tempo_de_preparo;
    }

    public void setTempo_de_preparo(String tempo_de_preparo) {
        this.tempo_de_preparo = tempo_de_preparo;
    }

    public String getTipo_receita() {
        return tipo_receita;
    }

    public void setTipo_receita(String tipo_receita) {
        this.tipo_receita = tipo_receita;
    }
    
    
}
 