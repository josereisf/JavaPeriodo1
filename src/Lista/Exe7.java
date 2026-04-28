package Lista;

import javax.swing.*;

public class Exe7 {
    public static void main(String[] args) {
        String r = "";
        for(int i = 0; i < 10; i++){
            int num = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + (i + 1) + "º número: "));
            r += "O número " + (num+1) + " é";
            if((num % 2) == 1){
                r += " par.\n";
            }
            else{
                r += " ímpar.\n";
            }
        }
        JOptionPane.showMessageDialog(null, r);
    }
}
