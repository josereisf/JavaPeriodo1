package cap04;

import javax.swing.*;

public class BuscaLetraNaFrase {
    public static void main(String[] args) {
        String frase = JOptionPane.showInputDialog("Digite uma frase: ");
        String palavra = JOptionPane.showInputDialog("Digite uma palavra: ");
        if(frase.indexOf(palavra) != -1){
            JOptionPane.showMessageDialog(null, "A palavra '" + palavra + "' foi encontrada na frase.");
        }
        else{
            JOptionPane.showMessageDialog(null, "A palavra '" + palavra + "' não foi encontrada na frase.");
        }
    }
}
