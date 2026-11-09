package cap07;

public class UsaCelular {
    public static void main(String[] args) {
        Celular celular1 = new Celular();
        Celular celular2 = new Celular();
        Celular celular3 = new Celular();
        celular1.numero = "11 5431-2342";
        celular2.numero = "11 9123-5678";
        celular3.numero = "11 5765-3097";
        celular1.empresa = "Vivo";
        celular1.mostrar();
        celular2.mostrar();
        Celular.empresa = "Empresa Genérica do Brasil";
        Celular celular4 = new Celular();
        celular4.numero = "11 9876-5432";
        Celular celular5 = new Celular();
        celular1.mostrar();
        celular2.mostrar();
        celular3.mostrar();
        celular4.mostrar();
        celular5.mostrar();
    }
}
