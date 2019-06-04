package exercicios.veiculos;

public class Concessionaria {

    public void registrarVenda (Carro carro, Cliente cliente, Double valor){

        Vendas venda1 = new Vendas(cliente, valor, carro);

        System.out.println("O " + cliente.getNome() + " comprou o carro " + carro.getModelo());

    }
}
