package cap07.atividade2;

public class SistemaNotificacoes {
    public static void main(String[] args) {
        NotificacaoEmail email = new NotificacaoEmail("carlos@empresa.com", "A reunião será hoje às 14h.", "Reunião de Alinhamento");

        email.enviar();
        email.anexarArquivo("pauta.pdf");

        NotificacaoSMS sms = new NotificacaoSMS("João", "Seu código de verificação é 849201", "+5511999998888");
        System.out.println("\n");
        sms.enviar();
        sms.mostrarValidacao();
    }
}
