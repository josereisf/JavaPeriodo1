package Lista;

import javax.swing.*;

public class Exe4 {
    public static void main(String[] args) {
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro:"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro:"));
        int soma = 0;

        for(int i = num1; i <= num2; i++){
            soma += i;
        }
        JOptionPane.showMessageDialog(null, "A soma dos números entre " + num1 + " e " + num2 + " é: " + soma);
    }
}
