package cap02;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {

        int quantLider, quantLanterna, diferenca, necessario;
        Scanner input;

        System.out.println("Digite a quantidade de pontos do líder: ");
        input = new Scanner(System.in);
        quantLider = input.nextInt();

        System.out.println("Digite a quantidade de pontos do lanterna: ");
        input = new Scanner(System.in);
        quantLanterna = input.nextInt();

        diferenca = quantLider - quantLanterna;
        necessario = diferenca / 3;
        System.out.println("Quantidade de vitórias necessárias para o lanterna ultrapassar o líder: " + necessario);

    }
}
