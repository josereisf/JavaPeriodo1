package cap05;

import javax.swing.*;

public class ArrayPesquisaCor {
    public static void main(String[] args) {
        String[] cores = {"Vermelho", "Azul", "Verde", "Amarelo", "Preto"};
        String cor = JOptionPane.showInputDialog("Forneça uma cor: ");
        String mensagem = "Cor não encontrada: " + cor;

        for (String elemento: cores) {
            if (elemento.equals(cor)) {
                mensagem = "Cor encontrada";
                break;
            }
        }
        JOptionPane.showMessageDialog(null, mensagem);
    }
}
