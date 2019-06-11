package exercicios.excecao2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        try {

        List<String> lista = null;

        lista.add("Pato"); //0
        lista.add("Cachorro"); //1
        lista.add("Gato"); //2

        System.out.println(lista.get(2));}

        catch (NullPointerException e){
            e.printStackTrace();

            List<String> lista = new ArrayList<>();

            lista.add("Pato"); //0
            lista.add("Cachorro"); //1
            lista.add("Gato"); //2

            System.out.println(lista.get(5));
        } catch (IndexOutOfBoundsException ex){
            System.out.println("caiu na exceção Index");
        }
        System.out.println("qualquer coisa");
    }
}
