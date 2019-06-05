package exercicios.atleta;

public class exercicio3 {

    public static void main(String[] args) {

      Atleta Pablo = new Atleta("Pablo",10,8);
      Atleta Marta = new Atleta("Marta",11,9);

      Prova prova1 = new Prova(12, 15);
      Prova prova2 = new Prova(3, 6);
      Prova prova3 = new Prova(9, 5);

      prova1.podeRealizar(Pablo);
      prova2.podeRealizar(Marta);
      prova2.podeRealizar(Pablo);

    }
}
