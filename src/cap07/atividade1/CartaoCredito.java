package cap07.atividade1;

public class CartaoCredito extends Pagamento implements Autenticavel {
    private String numeroCartao;

    public CartaoCredito(double valor, String data, String num) {
        super(valor, data);
        this.numeroCartao = num;
    }

    public String getNumeroCartao() {
        return numeroCartao;
    }

    public void processarPagamento() {
        System.out.println("Pagamento de R$ " + getValor() + " realizado via Cartão de Crédito em " + getData()+ ".");
    }

    public boolean autenticar() {
        return true;
    }

    public void parcelar(int qtd){
        System.out.println("Pagamento parcelado em " + qtd + " de R$ " + String.format("%.2f", (getValor() / qtd)));
    }
    public void responderAutenticacao(){
        this.autenticar();
        System.out.println("Autenticando Cartão de Crédito final " + getNumeroCartao() + ": Autenticado com sucesso!");
    }
}
