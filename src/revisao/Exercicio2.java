package revisao;

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {

        //Comprar a idade de 3 pessoas

        PessoaEx2 pessoa1 = new PessoaEx2();
        PessoaEx2 pessoa2 = new PessoaEx2();
        PessoaEx2 pessoa3 = new PessoaEx2();

        //Pegar dado do usuario

        Scanner dado = new Scanner(System.in);
        System.out.println("Digite o nome da 1º pessoa");

        pessoa1.setNome(dado.next());

        System.out.println("Digite a idade de " + pessoa1.getNome());
        pessoa1.setIdade(dado.nextInt());

        System.out.println("Digite o nome da 2º pessoa");

        pessoa2.setNome(dado.next());

        System.out.println("Digite a idade de " + pessoa2.getNome());
        pessoa2.setIdade(dado.nextInt());

        System.out.println("Digite o nome da 3º pessoa");

        pessoa3.setNome(dado.next());

        System.out.println("Digite a idade de " + pessoa3.getNome());
        pessoa3.setIdade(dado.nextInt());

        pessoa3.ehMaisVelho(pessoa1,pessoa2,pessoa3);

        pessoa3.ehMaisNovo(pessoa1, pessoa2, pessoa3);
    }
}
