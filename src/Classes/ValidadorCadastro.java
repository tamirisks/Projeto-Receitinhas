package Classes;

public class ValidadorCadastro {

     public boolean isCadastroValido(String nome, String email, String senha) {
        if (nome == null || nome.trim().isEmpty()) {
            return false;
        }
        if (email == null || email.trim().isEmpty() || !email.contains("@")) {
            return false;
        }
        if (senha == null || senha.trim().isEmpty()) {
            return false;
        }
        return true;
     }
}
