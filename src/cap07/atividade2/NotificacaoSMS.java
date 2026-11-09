package cap07.atividade2;

public class NotificacaoSMS extends Notificacao implements Enviavel {
    private String numeroTelefone;

    public NotificacaoSMS(String destinatario, String mensagem, String numeroTelefone) {
        super(destinatario, mensagem);
        this.numeroTelefone = numeroTelefone;
    }

    public String getNumeroTelefone() {
        return numeroTelefone;
    }

    public void enviar() {
        System.out.println("Enviando SMS para: " + getNumeroTelefone()+".");
        System.out.println("Mensagem: " + getMensagem()+".");
    }

    public boolean validarNumeroTelefone() {
        return true;
    }

    public void mostrarValidacao(){
        validarNumeroTelefone();
        System.out.println("Validação do número de telefone realizada com sucesso.");
    }
}
