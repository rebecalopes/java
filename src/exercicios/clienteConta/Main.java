package exercicios.clienteConta;

public class Main {

    public static void main(String[] args) {

    Cliente cleiton = new Cliente("Cleiton","Silva");
    Cliente monica = new Cliente("Monica", "de Souza");

    Conta contaCleiton = new Conta(0001,0.00,cleiton);
    contaCleiton.deposito(1200);
        System.out.println(contaCleiton.getSaldo());
        contaCleiton.saque(1203);
        System.out.println(contaCleiton.getSaldo());

        Conta contaMonica = new Conta(0002,20.0, monica);
        contaMonica.deposito(3000);
        System.out.println(contaMonica.getSaldo());
        contaMonica.saque(600);
        System.out.println(contaMonica.getSaldo());
    }
}