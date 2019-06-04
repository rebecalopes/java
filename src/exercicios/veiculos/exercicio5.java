package exercicios.veiculos;

public class exercicio5 {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Pablo", "Silva",827383827);
        Carro carro1 = new Carro("Honda","Sedan",2015, "preto",500);

        Concessionaria concessionaria = new Concessionaria();
        concessionaria.registrarVenda(carro1, cliente1, 20000.00);


    }
}
