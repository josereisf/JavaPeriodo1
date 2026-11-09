package Java8;

public class UsaBrinquedo {
    public static void main(String[] args) {
        Brinquedo brinquedo1 = new Brinquedo("Boneca", 29.90f);
        brinquedo1.setFaixaEtaria("3 a 5");
        brinquedo1.mostrar();

        Brinquedo brinquedo2 = new Brinquedo("Carrinho", 19.90f);
        brinquedo2.setFaixaEtaria("6 a 10");
        brinquedo2.mostrar();

        brinquedo2.setFaixaEtaria("Macaco");
        brinquedo2.mostrar();
    }
}
