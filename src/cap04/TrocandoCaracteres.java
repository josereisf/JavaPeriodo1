package cap04;

import javax.swing.*;

public class TrocandoCaracteres {
    public static void main(String[] args) {
        String frase = JOptionPane.showInputDialog("Digite uma frase: ");

        JOptionPane.showMessageDialog(null, "Frase original: " + frase +
                "\nFrase sem espaço: " + frase.replace(" ", "") +
                "\nSubstituindo a por u: " + frase.replace("a", "u"));
    }
}
