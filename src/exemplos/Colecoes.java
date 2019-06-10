package exemplos;

import java.util.*;

public class Colecoes {
    public static void main(String[] args) {

//   ------    Conjuntos - Set / HashSet ------

       Set<String> nomes = new HashSet<>();

        nomes.add("Joao");
        nomes.add("Maria");
        nomes.add("Vitoria");
        nomes.add("Rebeca");

        nomes.remove("Rebeca");

        for (String nome: nomes){
            System.out.println(nome);
        }

//   ------   Mapas - Map - HashMap  ------

        Map<String, Integer> mapaNomeIdade = new HashMap<>();

        mapaNomeIdade.put("Rebeca", 21);
        mapaNomeIdade.put("Ana", 23);
        mapaNomeIdade.put("Vitor", 30);

       System.out.println(mapaNomeIdade);

        for(String chave: mapaNomeIdade.keySet()){
            System.out.println(mapaNomeIdade.get(chave));
        }

        System.out.println(mapaNomeIdade.get("Rebeca"));

//       ------  Lista - ArrayList  ------

        List<String> frutas = new ArrayList<>();

        frutas.add("abacate");
        frutas.add(1, "banana");
        frutas.add("cupuaçu");
        frutas.add("abacaxi");

       System.out.println(frutas);

        for(int i = 0; i < frutas.size(); i++){
            System.out.println(frutas.get(i));
        }

        for (String fruta : frutas){
            System.out.println(fruta);
        }
    }
}
