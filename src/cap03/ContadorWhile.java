package cap03;

import javax.swing.*;
import java.sql.SQLOutput;

public class ContadorWhile {
    public static void main(String[] args) {
        int limite = Integer.parseInt(JOptionPane.showInputDialog("Digite o limite do contador:"));
        int contador = limite;
        while(contador >= 0){
            System.out.println(contador);
            contador--;
        }
        System.out.println("Contagem regressiva finalizada!\n");
        contador = 0;
        do {
            System.out.println(contador);
            contador++;
        } while (contador <= limite);
            System.out.println("Contagem progressiva finalizada!");
    }
}
