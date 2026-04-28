package cap04;

import javax.swing.*;

public class Transfomacao {
    public static void main(String[] args) {
        String frase = JOptionPane.showInputDialog("Digite uma frase: ");
        JOptionPane.showMessageDialog(null, "Frase original: " + frase +
                "\nFrase em maiúsculas: " + frase.toUpperCase() +
                "\nFrase em minúsculas: " + frase.toLowerCase());
    }
}
