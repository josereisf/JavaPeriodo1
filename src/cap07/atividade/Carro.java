package cap07.atividade;

public class Carro extends Veiculo implements Manutencao{
    private int quantidadePortas;

    public Carro(String marca, String modelo, int quantidadePortas) {
        super(marca, modelo);
        this.quantidadePortas = quantidadePortas;
    }

    public int getQuantidadePortas() {
        return quantidadePortas;
    }

    @Override
    public void ligar(){
        System.out.println("Ligado o Carro " + getMarca() + " " + getModelo() + "... Motor VVT-i acionado.");
    }

    @Override
    public void realizarRevisao() {
        System.out.println("Realizando revisão completa do Carro (Troca de óleo e alinhamento).");
    }

    public void abrirPortaMalas(){
        System.out.println("Porta-malas do Carro aberto com sucesso.");
    }
}
