package cap06;

import java.util.Arrays;

public class MetodosComArray {
    public static double buscarMaior(double[] numeros){
        double maior = numeros[0];
        for (double numero : numeros) {
            if (numero > maior) {
                maior = numero;
            }
        }
        return maior;
    }
    public static String[] ordenarPalavras(String[] palavras){
        Arrays.sort(palavras);
        return palavras;
    }
}
