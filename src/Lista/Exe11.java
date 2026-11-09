package Lista;

import javax.swing.*;

public class Exe11 {
    public static void main(String[] args) {
        String[] nomes = new String[5];
        double[] notas = new double[5];
        double soma = 0;
        String r = "";

        for(int i = 0; i < 5; i++){
            nomes[i] = JOptionPane.showInputDialog("Digite o nome do " + (i + 1) + "º aluno: ");
            notas[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota do " + (i + 1) + "º aluno: "));
            soma += notas[i];
        }
        double media = soma / 5;
        for(int i = 0; i < 5; i++){
            if(notas[i] > media){
                r += nomes[i] + " tem nota acima da média.\n";
            }
        }
        JOptionPane.showMessageDialog(null, "A média das notas é: " + media + "\n" + r);

    }
}
