package cap04;

import javax.swing.*;

public class UsaRandom {
    public static void main(String[] args) {
        String senha = "";
        for (int i = 1; i <= 10; i++) {
            int num = (int) (Math.random() * 10);
            senha += num;
        }
        JOptionPane.showMessageDialog(null, "Senha gerada " + senha);
        for (int cartao = 1; cartao <= 4; cartao++){
            String numerosCartao = "";
            for (int i = 1; i <= 6; i++){
                int num = (int) (Math.random() * 60 + 1);
                numerosCartao += num + " ";
            }
            JOptionPane.showMessageDialog(null, "Cartão "+ cartao + "\nNúmeros: " + numerosCartao);
        }
    }
}
