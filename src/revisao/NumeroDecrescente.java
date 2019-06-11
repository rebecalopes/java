package revisao;

import java.util.Scanner;

public class NumeroDecrescente {
    public static void main(String[] args) {

        int numero;

        Scanner dado = new Scanner(System.in);

        do {
            System.out.println("Digite um numero:");
            numero = dado.nextInt();
        }
        while (numero <= 0);

        for (int i = numero; i >=0 ; i--) {
            System.out.println(i);
        }
    }
}
