package Java8;

public class UsaGPS {
    public static void main(String[] args) {
        GPS gps1 = new GPS();
        GPS gps2 = new GPS("Roma");
        gps1.definirIdioma("English or Español?");
        gps1.definirRota("Inferno");
        gps1.mostrar();
        gps2.mostrar();

    }
}
