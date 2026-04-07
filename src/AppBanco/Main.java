package AppBanco;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta1 =
                new ContaBancaria(200, "João");

        ContaBancaria conta2 =
                new ContaBancaria(500, "Maria");
        System.out.println("Saldo Atual: " + conta1.getSaldo());
        conta1.depositar(100);
        System.out.println("Saldo + Depósito: " + conta1.getSaldo());
        conta1.sacar(50);
        System.out.println("Saldo - Saque: " + conta1.getSaldo());

        if(!conta1.sacar(500)){
            System.out.println("Saldo insuficiente para realizar o saque.");
        }

        Funcionario maria = new Funcionario("Maria", 3000);
        Gerente joao = new Gerente("João", 5000, 1000);

        System.out.println("Salário de Maria: " + maria.calcularSalario());
        System.out.println("Salário de João: " + joao.calcularSalario());

        List<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(new Funcionario("Pedro", 2500));
        FolhaPagamento.processar(funcionarios);
    }
}
