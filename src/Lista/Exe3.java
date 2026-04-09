package Lista;

import javax.swing.*;

public class Exe3 {
    public static void main(String[] args) {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro:"));
        System.out.println("teste");
        for(int i = 1; i < 11; i++) {
            JOptionPane.showMessageDialog(null, num + " x " + i + " = " + (num * i));
        }
    }
}