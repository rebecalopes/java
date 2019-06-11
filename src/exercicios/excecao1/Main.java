package exercicios.excecao1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        try {
    List<String> lista = new ArrayList<>();

    lista.add("Pato"); //0
    lista.add("Cachorro"); //1
    lista.add("Gato"); //2

        System.out.println(lista.get(3)); }

        catch (IndexOutOfBoundsException e){
            e.printStackTrace();
            System.out.println("caiu na exceção");
        }
    }
}
