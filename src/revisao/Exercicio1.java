package revisao;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {

        int numero;
        int antecessor;
        int sucessor;

        Scanner dado = new Scanner(System.in);
        System.out.println("Digite um numero");

        numero = dado.nextInt();

        antecessor = numero - 1;
        sucessor = numero + 1;

        System.out.println("antecessor: " + antecessor + " número: " + numero + " sucessor: " + sucessor );


    }
}
