package exercicios.jogadorFutebol;

public class Main {

    public static void main(String[] args) {

        JogadorDeFutebol Pele = new JogadorDeFutebol("Pele",25,20,0,1);


        SessaoDeTreinamento treino = new SessaoDeTreinamento(15);
        treino.treinarA(Pele);

    }
}