package cap04;

import javax.swing.*;

public class Arredondar {
    public static void main(String[] args) {
        final float LOTACAO_ONIBUS = 50;
        int numeroPassageiros = Integer.parseInt(JOptionPane.showInputDialog("Número de passageiros: "));
        float qtdeOnibus = numeroPassageiros / LOTACAO_ONIBUS;
        JOptionPane.showMessageDialog(null, "Precisa de " + Math.ceil(qtdeOnibus) + " ônibus.");
    }
}
