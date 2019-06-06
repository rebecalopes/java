package exercicios.bancoSantander;

public class Main {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente(01,"Santos","8972917","82782738723");


        System.out.println("Você fez um depósito no valor de " + deposito +", seu novo saldo é de: " + saldo);

        System.out.println("Você fez um saque no valor de " + saque +", seu novo saldo é de: " + saldo);

        System.out.println("O seu saldo atual é de: " + saldo);

        System.out.println("Você fez um depósito no valor de " + this.deposito +", seu novo saldo é de: " + this.saldo);

        System.out.println("Você fez um depósito de cheque no valor de " + cheque.getValor() +", seu novo saldo é de: " + this.saldo);

        System.out.println("Você fez um saque no valor de " + this.saque +", seu novo saldo é de: " + this.saldo);

        System.out.println("O seu novo saldo é de: " + this.saldo);


    }
}
