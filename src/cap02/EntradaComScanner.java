package cap02;

import java.util.Scanner;

public class EntradaComScanner {
    public static void main(String[] args) {
        float largura, comprimento, area, perimetro;
        Scanner input;

        System.out.print("Digite o comprimento: ");
        input = new Scanner(System.in);
        comprimento = input.nextFloat();

        System.out.print("Digite a largura: ");
        input = new Scanner(System.in);
        largura = input.nextFloat();

        area = comprimento * largura;
        perimetro = comprimento * 2 + largura * 2;

        System.out.println("Área: " + area);
        System.out.println("Perímetro: " + perimetro);


    }
}
