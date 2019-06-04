package exercicios.tripe;

public class exercicio4 {
    public static void main(String[] args) {

        Tripe tripe = new Tripe(true);

        tripe.dobrar();
        tripe.guardar();
        tripe.usar();
        tripe.desdobrar();
        tripe.usar();
        System.out.println(tripe);

    }
}
