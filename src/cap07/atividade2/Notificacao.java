package cap07.atividade2;

public class Notificacao {
    private String destinatario;
    private String mensagem;

    public Notificacao(String destinatario, String mensagem) {
        this.destinatario = destinatario;
        this.mensagem = mensagem;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public String getMensagem() {
        return mensagem;
    }

    public String formatarMensagem(){
        return "Destinatário: " + destinatario + "\nMensagem: " + mensagem;
    }
}
