package Classes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

class ValidadorCadastroTest {

    private final ValidadorCadastro validador = new ValidadorCadastro();

    @Test
    void deveAceitarCadastroComTodosOsCamposPreenchidosCorretamente() {
        assertTrue(validador.isCadastroValido("Tamiris", "tamiris@email.com", "senha123"));
    }

    @Test
    void deveRejeitarQuandoNomeEstaVazio() {
        assertFalse(validador.isCadastroValido("", "tamiris@email.com", "senha123"));
    }

    @Test
    void deveRejeitarQuandoEmailNaoTemArroba() {
        assertFalse(validador.isCadastroValido("Tamiris", "emailinvalido.com", "senha123"));
    }

    @Test
    void deveRejeitarQuandoSenhaEstaVazia() {
        assertFalse(validador.isCadastroValido("Tamiris", "tamiris@email.com", ""));
    }

    @Test
    void deveRejeitarQuandoTodosOsCamposEstaoVazios() {
        assertFalse(validador.isCadastroValido("", "", ""));
    }
}
