package Lista;

import javax.swing.*;

public class Exe6 {
    public static void main(String[] args) {
        String r = "";
        for(int i = 5; i <= 100; i += 5){
            r += i + " ";
        }
        JOptionPane.showMessageDialog(null, "Os números múltiplos de 5 são: " + r);
    }
}
