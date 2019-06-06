package exercicios.bancoSantander;

public abstract class Conta{

    protected double saldo;
    protected Cliente cliente;


    public Conta(double saldo, Cliente cliente) {
        this.saldo = saldo;
        this.cliente = cliente;
    }

    public void fazerDeposito(double valor){
        this.saldo += valor; // this.saldo = this.saldo + valor;
    }

    public abstract double fazerSaque(double valor);

    public double consultarSaldo(){
        return this.saldo;
    }

}
