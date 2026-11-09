package cap07;

public class Televisor {
    private int volume;
    private int canal;

    public Televisor(){
    }
    public Televisor(int volume){
        this.volume = volume;
    }
    public Televisor(int volume, int canal){
        this.volume = volume;
        this.canal = canal;
    }

    public void aumentarVolume(){
        this.volume++;
    }
    public void reduzirVolume(){
        this.volume--;
    }
    public void trocarCanal(int novoCanal){
        canal = novoCanal;
    }
    public String mostrar(){
        return "Volume: " + getVolume() + "\nCanal: " + getCanal();
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if(canal >= 1 && canal <= 1000){
            this.volume = volume;
        }
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        if(volume >= 0 && volume <= 100){
            this.canal = canal;
        }
    }
}
