package exercicios.clienteConta;

public class Conta {

    private int numeroConta;
    private double saldo;
    private Cliente titular;

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public Conta (int numeroConta, double saldo, Cliente titular){
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.titular = titular;
    }

    public void deposito(double deposito){
        this.saldo = this.saldo + deposito;
        System.out.println("Foi feito um depósito");

    }

    public void saque (double saque){
        this.saldo = this.saldo - saque;
        System.out.println("Foi feito um saque");

        if (this.saldo < saque){
            System.out.println("Saldo insuficiente, você entrou no cheque especial");
        }
        else {
            System.out.println("Transação realizada com sucesso");
        }


    }

}
