package exercicios.tripe;

public class exercicio4 {
    public static void main(String[] args) {

        Tripe tripe = new Tripe(true, 20,40,40);

        tripe.dobrar();
        tripe.prontoParaGuardar();
        tripe.usar();

        System.out.println(tripe);

    }
}
