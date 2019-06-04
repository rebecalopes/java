package exercicios.veiculos;

public class Vendas {
    private double valorVenda;
    private Carro veiculoVendido;
    private Cliente cliente;


    Vendas(Cliente cliente, double valorVenda, Carro veiculoVendido){
        this.cliente = cliente;
        this.veiculoVendido = veiculoVendido;
        this.valorVenda = valorVenda;
    }
}
