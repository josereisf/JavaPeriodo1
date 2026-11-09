package Java8;

public class Bomba {
    public boolean status;

    public void desligar(){
        this.status = false;
    }
    public void ligar(int segundos) throws InterruptedException {
        this.status = true;
        for(int i = segundos; i > 0; i--) {
            System.out.println(i);
            Thread.sleep(1000);
        }
        desligar();
    }


}
