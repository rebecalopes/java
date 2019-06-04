//Tarefa de repetição aula 12


//exercicio1

    /* public static void main(String[] args) {

       // declarei variaveis
        double salario = 1000;
        double porcetagem = 0.015;

       // fiz um for para que enquanto o ano fosse menor que 1997 o loop não parasse de contar
        for (int ano = 1997; ano <= 2019; ano++){

        //multipliquei a porcentagem por 2
            porcetagem = porcetagem * 2;

       //fiz um calculo de juros compostos
            salario = salario * (1 + porcetagem);

            }
       //printei na tela
        System.out.println(salario);
        }
    } */

// exercicio 4

    /*  public static void main(String[] args){

       // criei um for para que mostrasse todos os numeros pares menores que 101
        for ( int i = 0; i < 101; i += 2) {
            System.out.println( i );
        }
    }
} */

//    exercicio 9
   /* public static void main(String[] args) {

   // criei uma variavel soma
        int soma = 0;

   // criei um for para pegar todos os numeros pares menores que 101
        for (int i = 0; i < 101; i += 2) {

    //
            soma = soma + i;
        }
        System.out.println( soma );
    }
} */

//   Tarefas array
//exercicio 1

/* import java.util.Scanner;

public class Main {
       public static void main(String[] args) {
           Scanner dado = new Scanner(System.in);

           int [] numeros = new int[10];
           boolean primo = true;

           for (int i = 0; i < numeros.length; i++) {
               System.out.println("Digite um numero: "+i);
               numeros[i] = dado.nextInt();
               }

            for (int i = 2; i < numeros.length; i++){
               if (numeros.length % i == 0){
                   primo = false;
                   break;
               }
           }
           if (primo) {
               System.out.println("é primo");
           }
           else {
               System.out.println("não é");
           }
       }
   } */