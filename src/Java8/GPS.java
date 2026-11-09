package Java8;

public class GPS {
    public String idioma;
    public String rota;

    public GPS(){}

    public GPS(String rota){
        this.idioma = "Português";
        this.rota = rota;
    }
    public void definirIdioma(String idioma){
        this.idioma = idioma;
    }
    public void definirRota(String rota){
        this.rota = rota;
    }
    public void mostrar(){
        System.out.println("Idioma: " + idioma + " - Rota: " + rota);
    }
}
