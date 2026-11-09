package cap06;

import javax.swing.*;
import java.util.Objects;

public class AreaComSobrecarga {
    public static void main(String[] args) {
        String saida = "";
        String entrada;
        do {
             entrada = JOptionPane.showInputDialog("Digite \"q\" para calcular área do quadrado\n" +
                    "Digite \"r\" para calcular área do retângulo\n" +
                    "Digite \"p\" para calcular volume do paralelepípedo\n" +
                    "Digite \"s\" para sair do programa:");
            if (Objects.equals(entrada, "q")) {
                saida += "\nÁrea do quadrado: " + calcularArea(digitarLargura());
            } else if (Objects.equals(entrada, "r")) {
                saida += "\nÁrea do retângulo: " + calcularArea(digitarLargura(), digitarAltura());
            } else if (Objects.equals(entrada, "p")) {
                saida += "\nVolume do paralelepípedo: " + calcularArea(digitarLargura(), digitarAltura(), digitarComprimento());
            }
        } while (!Objects.equals(entrada, "s"));
        JOptionPane.showMessageDialog(null, saida);
    }
    public static double digitarLargura(){
        return Double.parseDouble(JOptionPane.showInputDialog("Digite a largura:"));
    }
    public static double digitarAltura(){
        return Double.parseDouble(JOptionPane.showInputDialog("Digite a altura:"));
    }
    public static double digitarComprimento(){
        return Double.parseDouble(JOptionPane.showInputDialog("Digite o comprimento:"));
    }
    public static double calcularArea(double x) {
        return x * x;
    }
    public static double calcularArea(double x, double y) {
        return x * y;
    }
    public static double calcularArea(double x, double y, double z) {
        return x * y * z;
    }
}

