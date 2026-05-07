package Atividade2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculadoraBonusTest {
    @Test
    public void deveAplicarBonusDeQuinzePorcentoParaSalarioAcimaDeTresMil() {

        CalculadoraBonus calculadora = new CalculadoraBonus();
        double salarioDev = 3500.00;

        double valorTotal = calculadora.calcular(salarioDev);

        assertEquals(4025.00, valorTotal, 0.01);
    }
}
