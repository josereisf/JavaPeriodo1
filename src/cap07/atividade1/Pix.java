package cap07.atividade1;

public class Pix extends Pagamento implements Autenticavel {
    private String chavePix;

    public Pix(double valor, String data, String chavePix) {
        super(valor, data);
        this.chavePix = chavePix;
    }

    public String getChavePix() {
        return chavePix;
    }

    public void processarPagamento() {
        System.out.println("Pagamento de R$ " + getValor() + " realizado via Pix em " + getData() + ".");
    }

    public boolean autenticar() {
        return true;
    }

    public void gerarQRCode() {
        System.out.println("QR Code Pix gerado: 00020126360014BR.GOV.BCB.PIX...");
    }

    public void responderAutenticacao(){
        this.autenticar();
        System.out.println("Autenticando chave Pix " + getChavePix() + ": Autenticado com sucesso!");
    }
}
