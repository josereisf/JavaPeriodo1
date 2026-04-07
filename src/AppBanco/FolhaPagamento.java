package AppBanco;

import java.util.List;

public class FolhaPagamento {
    public static void processar(List<Funcionario> funcionarios) {
        double totalFolha = 0;
        for(Funcionario func: funcionarios){
            totalFolha += func.calcularSalario();
            System.out.println("Salário de " + func.nome + ": " + func.calcularSalario());
        }
        System.out.println("Total da Folha de Pagamento: " + totalFolha);

    }
}
