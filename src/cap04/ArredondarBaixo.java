package cap04;

import javax.swing.*;

public class ArredondarBaixo {
    public static void main(String[] args) {
        float nota = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota: "));
        JOptionPane.showMessageDialog(null, "Sua nota é " + (int) Math.floor(nota));
    }
}
