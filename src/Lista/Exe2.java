package Lista;

import javax.swing.*;

public class Exe2 {
    public static void main(String[] args) {

        float valor;

        valor = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do produto: "));

        if(valor > 400){
            valor = valor - (valor * 0.15f);
        }
        JOptionPane.showMessageDialog(null, "O valor do produto é: " + valor);
    }
}