package cap07.atividade2;

public class NotificacaoEmail extends Notificacao implements Enviavel {
    private String assunto;

    public NotificacaoEmail(String destinatario, String mensagem, String assunto) {
        super(destinatario, mensagem);
        this.assunto = assunto;
    }

    public String getAssunto() {
        return assunto;
    }

    public void enviar() {
        System.out.println("Enviando e-mail para: " + getDestinatario()+".");
        System.out.println("Assunto: " + getAssunto()+".");
        System.out.println("Mensagem: " + getMensagem()+".");
    }

    public void anexarArquivo(String arq){
        System.out.println("Arquivo '" + arq + "' anexado com sucesso");
    }
}
