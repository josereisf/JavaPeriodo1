package AppBanco;

public class ContaBancaria {
    private double saldo;
    private String titular;
    private boolean ativo;

    public ContaBancaria(double saldo, String titular){
        this.saldo = saldo;
        this.titular = titular;
    }
    /*metódo para realizar o deposíto
      só vai depositar se o valor for maior que 0*/
    public void depositar(double valor){
        if (valor > 0){
            this.saldo += valor;
        }
    }
    //método para realizar o saque, só vai sacar se o valor for maior que 0 e menor ou igual ao saldo
    public boolean sacar(double valor) {
        if (valor > 0 && valor <= this.saldo) {
            this.saldo -= valor;
            return true;
        }
        return false;
    }
    //metodo para pegar o saldo
    public double getSaldo(){
        return saldo;
    }
}
