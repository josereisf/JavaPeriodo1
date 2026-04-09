package Lista;

import javax.swing.*;

public class Exe5 {
    public static void main(String[] args) {
        String nome = "sistema", senha = "123", testeNome = "", testeSenha = "";
        while(!nome.equals(testeNome) || !senha.equals(testeSenha)){
            testeNome = JOptionPane.showInputDialog("Digite o nome de usuário:");
            testeSenha = JOptionPane.showInputDialog("Digite a senha:");
            if (nome.equals(testeNome) && (senha.equals(testeSenha))){
                JOptionPane.showMessageDialog(null, "Login bem-sucedido!");
            } else {
                JOptionPane.showMessageDialog(null, "Nome de usuário ou senha incorretos. Tente novamente.");
            }
        }
    }
}
