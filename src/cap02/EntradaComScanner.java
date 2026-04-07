package cap02;

// Importa a classe Scanner para ler entrada do usuário
import java.util.Scanner;

// Classe principal do programa
public class EntradaComScanner {
    // Método principal onde a execução começa
    public static void main(String[] args) {
        // Declara variáveis para armazenar as dimensões e cálculos
        float largura, comprimento, area, perimetro;
        
        // Cria um objeto Scanner para ler entrada do console
        Scanner input = new Scanner(System.in);

        // Solicita ao usuário que digite o comprimento
        System.out.print("Digite o comprimento: ");
        // Lê o valor float do comprimento
        comprimento = input.nextFloat();

        // Solicita ao usuário que digite a largura
        System.out.print("Digite a largura: ");
        // Lê o valor float da largura
        largura = input.nextFloat();

        area = comprimento * largura;
        perimetro = (comprimento + largura) * 2;


        System.out.println("Área: " + area);
        System.out.println("Perímetro: " + perimetro);


    }
}
