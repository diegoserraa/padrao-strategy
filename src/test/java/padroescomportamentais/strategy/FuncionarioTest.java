package padroescomportamentais.strategy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioTest {

    @Test
    void deveSomarSalario() {
        Funcionario funcionario = new Funcionario();
        funcionario.somarSalario(1000.0f, 2000.0f);
        assertEquals(3000.0f, funcionario.getNota());
    }

    @Test
    void deveSubtrairSalarioFuncionario() {
        Funcionario funcionario = new Funcionario();
        funcionario.subtrairSalario(2000.0f, 1000.0f);
        assertEquals(1000.0f, funcionario.getNota());
    }

    @Test
    void deveMultiplicarSalarioFuncionario() {
        Funcionario funcionario = new Funcionario();
        funcionario.multiplicarSalario(1000.0f, 2f);
        assertEquals(2000.0f, funcionario.getNota());
    }

    @Test
    void deveDividirSalarioFuncionario() {
        Funcionario funcionario = new Funcionario();
        funcionario.dividirSalario(2000.0f, 2.0f);
        assertEquals(1000.0f, funcionario.getNota());
    }

    @Test
    void naoDeveDividirSalarioFuncionarioPorZero() {
        try {
            Funcionario funcionario = new Funcionario();
            funcionario.dividirSalario(100.0f, 0.0f);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Divisão por zero", e.getMessage());
        }
    }

    @Test
    void deveCalcularMediaSalarioFuncionario() {
        Funcionario funcionario = new Funcionario();
        funcionario.calcularMediaSalario(2000.0f, 1000.0f);
        assertEquals(1500.0f, funcionario.getNota());
    }

}