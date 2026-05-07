package cap05;

import java.util.Arrays;

public class ArrayOrdena {
    public static void main(String[] args) {
        String[] nomes = {"Lucas", "Daniel", "Julia", "Tatiana", "Izabela", "Matheus"};
        char[] vogais = {'i', 'u', 'a', 'o', 'e'};
        int[] numeros = {9,2,6,7,5,3,4,8,1,0};
        float[] notas = {7.6f,8.5f,9.7f,5.4f,7.4f};
        Arrays.sort(nomes);
        System.out.println("\nNomes: ");
        for(String nome: nomes){
            System.out.print(nome+", ");
        }
        Arrays.sort(vogais);
        System.out.println("\nVogais: ");
        for(char vogal: vogais){
            System.out.print(vogal+", ");
        }
        Arrays.sort(numeros);
        System.out.println("\nNumeros: ");
        for(int numero: numeros){
            System.out.print(numero+", ");
        }
        Arrays.sort(notas);
        System.out.println("\nNotas: ");
        for(float nota: notas){
            System.out.print(nota+", ");
        }

    }
}
