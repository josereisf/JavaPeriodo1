package Lista;

import javax.swing.*;

public class Exe1 {
    public static void main(String[] args) {
        int idade;

        idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade: "));

        if(idade < 16){
            JOptionPane.showMessageDialog(null, "Você é proibido de votar.");
        } else if(idade > 17 && idade < 66){
            JOptionPane.showMessageDialog(null, "Você é obrigado a votar.");
        }
        else{
            JOptionPane.showMessageDialog(null, "Seu voto é opcional.");
        }
    }
}
