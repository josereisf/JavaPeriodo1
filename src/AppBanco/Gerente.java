package AppBanco;

public class Gerente  extends Funcionario{
    double bonus;

    public Gerente(String nome, double salario, double bonus) {
        super(nome, salario);
        this.bonus = bonus;
    }
    @Override
    public double calcularSalario () {
        return super.calcularSalario() + bonus;
    }
}
