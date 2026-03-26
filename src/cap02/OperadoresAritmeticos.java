package cap02;

public class OperadoresAritmeticos {
    public static void main(String[] args) {
        int x = 10;
        int y = 3;

        System.out.println("X = " + x);
        System.out.println("Y = " + y);
        System.out.println("-X = " + (-x));
        System.out.println("X/Y = " + (x/y));
        System.out.println("Resto = " + (x%y));
        System.out.println("Inteiro = " + (int) (x/y));
        System.out.println("X + 1 = " + (++x));
    }
}
