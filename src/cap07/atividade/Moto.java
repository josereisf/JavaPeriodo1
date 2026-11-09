package cap07.atividade;

public class Moto extends Veiculo implements Manutencao{

    private int cilindradas;

    public Moto(String marca, String modelo, int cilindradas) {
        super(marca, modelo);
        this.cilindradas = cilindradas;
    }

    public int getCilindradas() {
        return cilindradas;
    }

    @Override
    public void ligar(){
        System.out.println("Ligado a Moto " + getMarca() + " " + getModelo() + " " + getCilindradas() +"... Motor bicilíndrico roncando.");
    }

    @Override
    public void realizarRevisao() {
        System.out.println("Realizando revisão da Moto (Ajuste da corrente e checagem de freios).");
    }

    public void empinar(){
        System.out.println("Manobra executada com a Moto!");
    }
}
