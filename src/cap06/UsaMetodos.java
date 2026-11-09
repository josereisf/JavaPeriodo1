package cap06;

public class UsaMetodos {
    public static void main(String[] args) {
        MetodoSemRetorno.imprimirTexto("Olá, mundo!");
        MetodoSemRetorno.somar(20, 30);
        MetodoSemRetorno.mostrarMaior(20, 30, 40);
        System.out.println("Resultado da soma: " + MetodosComRetorno.somar(20, 30));
    }
}
