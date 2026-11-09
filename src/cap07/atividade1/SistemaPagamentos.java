package cap07.atividade1;

public class SistemaPagamentos {
    public static void main(String[] args) {
        CartaoCredito cartao = new CartaoCredito(250, "19/10/2026", "123");

        cartao.responderAutenticacao();
        cartao.processarPagamento();
        cartao.parcelar(3);

        Pix pix = new Pix(100.0, "19/10/2026", "cliente@email.com");

        pix.responderAutenticacao();
        pix.processarPagamento();
        pix.gerarQRCode();
    }
}
