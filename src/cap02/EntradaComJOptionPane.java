package cap02;

import javax.swing.*;

public class EntradaComJOptionPane {
    public static void main(String[] args) {
        float largura, comprimento, area, perimetro;

        comprimento = Float.parseFloat(JOptionPane.showInputDialog("Digite o comprimento: "));

        largura = Float.parseFloat(JOptionPane.showInputDialog("Digite a largura: "));

        area = comprimento * largura;
        perimetro = (comprimento + largura) * 2;

        JOptionPane.showMessageDialog(null, "Área: " + area + "\nPerímetro: " + perimetro);

    }
}
