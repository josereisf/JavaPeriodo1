package Atividade;

public class Professor extends Pessoa{
    private String disciplina;
    private double salario;

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Professor(String nome, String email, String disciplina, double salario) {
        super(nome, email);
        this.disciplina = disciplina;
        this.salario = salario;
    }
}
