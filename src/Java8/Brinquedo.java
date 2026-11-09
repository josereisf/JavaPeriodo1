package Java8;

import java.util.Objects;

public class Brinquedo {
    private String nome;
    private String faixaEtaria;
    private float preco;

    public Brinquedo(){}

    public Brinquedo(String nome){
        setNome(nome);
    }

    public Brinquedo(String nome, float preco){
        setNome(nome);
        setPreco(preco);
    }

    public void mostrar(){
        System.out.println("Brinquedo: " + getNome() + " - Preço: " + getPreco() + " - Faixa Etária: " + getFaixaEtaria());
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFaixaEtaria() {
        return faixaEtaria;
    }

    public void setFaixaEtaria(String faixaEtaria) {
        if((Objects.equals(faixaEtaria, "0 a 2")) ||
                (Objects.equals(faixaEtaria, "3 a 5")) ||
                (Objects.equals(faixaEtaria, "6 a 10")) ||
                (Objects.equals(faixaEtaria, "acima de 10"))) {
            this.faixaEtaria = faixaEtaria;
        }
    }
}
