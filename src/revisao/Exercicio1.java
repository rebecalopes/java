package revisao;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {

        int numero;

        Scanner dado = new Scanner(System.in);
        System.out.println("Digite um numero");

        numero = dado.nextInt();

        System.out.println("antecessor: " + (numero - 1) + " número: " + numero + " sucessor: " + (numero + 1) );


    }
}
