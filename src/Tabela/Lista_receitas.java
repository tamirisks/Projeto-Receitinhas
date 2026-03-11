
package Tabela;

import Classes.Receitas;
import java.util.ArrayList;
import java.util.List;

public class Lista_receitas {
    
    private static List<Receitas> DadosReceitas = new ArrayList<>();
    
    //Método para acessarmos a lista e adicionarmos novos itens
    public static List<Receitas> Listar(){
        return DadosReceitas;
    }
    
    //Método para retornar valores
    public static void setDadosReceitas (Receitas receitas){
        DadosReceitas.add(receitas);
    }

    
}
