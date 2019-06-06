package exercicios.bancoSantander;

public class Poupanca extends Conta{

    private double juros;

    public Poupanca(double saldo, Cliente cliente, double juros) {
        super(saldo, cliente);
        this.juros = juros;
    }

    @Override
    public double fazerSaque(double valor) {
        super.saldo -= valor; // this.saldo = this.saldo + valor;
        return valor;
    }

    public void recolherJuros(){
        this.juros = super.saldo * 0.10;
        super.saldo -= this.juros;
    }
}
