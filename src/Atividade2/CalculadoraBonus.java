package Atividade2;

public class CalculadoraBonus {
    private static final double LIMITE_BONUS = 3000;
    private static final double BONUS_ACIMA_LIMITE = 0.15;
    private static final double BONUS_ATE_LIMITE = 0.2;

    public double calcular(double salario){
        if(salario > LIMITE_BONUS){
            return salario + (salario * BONUS_ACIMA_LIMITE);
        }
        else{
            return salario + (salario * BONUS_ATE_LIMITE);
        }
    }
}
