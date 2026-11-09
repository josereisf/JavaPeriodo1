package cap06;

public class MetodosComRetorno {
    public static void main(String[] args) {
        System.out.println(somar(10, 34));
        System.out.println(mostrarPares(10));
        System.out.println(mostrarDiaPorExtenso(3));
        System.out.println(contarLetrasA("Abacaxi"));
    }
    public static double somar(double a, double b){
        return a + b;
    }
    public static String mostrarPares(int valor){
        String retorno = "";
        for (int a = 0; a <= valor; a = a + 2){
            retorno += a + " ";
        }
        return retorno;
    }
    public static String mostrarDiaPorExtenso(int dia){
        String extenso = "";
        switch (dia){
            case 1:
                extenso = "Domingo";
                break;
            case 2:
                extenso = "Segunda-feira";
                break;
            case 3:
                extenso = "Terça-feira";
                break;
            case 4:
                extenso = "Quarta-feira";
                break;
            case 5:
                extenso = "Quinta-feira";
                break;
            case 6:
                extenso = "Sexta-feira";
                break;
            case 7:
                extenso = "Sábado";
                break;
        }
        return extenso;
    }
    public static int contarLetrasA(String palavra) {
        int quantidade = 0;
        palavra = palavra.toUpperCase();
        for (int i = 0; i < palavra.length(); i++) {
            if (palavra.charAt(i) == 'A') {
                quantidade++;
            }
        }
        return quantidade;
    }
}

