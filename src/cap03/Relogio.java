package cap03;

public class Relogio {
    public static void main(String[] args) throws InterruptedException {
        int horas, minutos, segundos;
        for (horas = 0; horas < 24; horas++) {
            for (minutos = 0; minutos < 60; minutos++) {
                for (segundos = 0; segundos < 60; segundos++) {
                    System.out.printf("%02d:%02d:%02d\n", horas, minutos, segundos);
                    Thread.sleep(1000); // Pausa de 1 segundo
                    if(segundos == 10){
                        System.exit(0);
                    }
                }
            }
        }
    }
}