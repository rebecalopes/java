package exercicios.bancoSantander;

public class ContaCorrente extends Conta {

    private double chequeEspecial;

    public ContaCorrente(double saldo, Cliente cliente, double chequeEspecial) {
        super(saldo, cliente);
        this.chequeEspecial = chequeEspecial;
    }

    public void depositarCheque(Cheque cheque, double valor) {
        valor = valor + cheque.getValor();

    }

    @Override
    public double fazerSaque(double valor) {
        return 0;
    }

    public double usarChequeEspecial(double valor) {

        if (super.saldo >= valor) {
            super.saldo -= valor;
        } else if (valor > super.saldo) {
            super.saldo -= valor;
            this.chequeEspecial += this.saldo;
        }
        return 0;
    }
}
