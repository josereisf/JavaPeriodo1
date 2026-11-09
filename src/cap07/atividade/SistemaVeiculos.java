package cap07.atividade;

public class SistemaVeiculos {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Toyota", "Corolla", 4);
        Moto moto1 = new Moto("Honda", "CB", 500);

        carro1.ligar();
        carro1.realizarRevisao();
        carro1.abrirPortaMalas();

        System.out.println("\n");

        moto1.ligar();
        moto1.realizarRevisao();
        moto1.empinar();
    }
}
