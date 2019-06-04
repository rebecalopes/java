package exercicios.atleta;
public class Prova {

    private int dificuldade;
    private int energiaNecessaria;

    public Prova (int dificuldade, int energiaNecessaria){
        this.dificuldade = dificuldade;
        this.energiaNecessaria = energiaNecessaria;
    }

    public boolean podeRealizar(Atleta atleta){

        if (atleta.nivel <= dificuldade && atleta.energia <= this.energiaNecessaria ){
            System.out.println("O atleta não é capaz!");
            return false;
        } else {
            System.out.println("O atleta conseguiu!");
            return true;
        }

    }

}
