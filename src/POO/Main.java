package POO;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bem-vindo ao curso de Programação Orientada a Objetos!");

        Funcionario objeto = new Gerente();

        objeto.nome = "João";
        objeto.salario = 10000;
        objeto.cpf = 12345;

        Gerente g = new Gerente();

        g.cpf = 25563;
        g.nome = "Maria";
        g.salario = 15000;
        g.senha = 1233;


    }
}
