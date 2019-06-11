package revisao;

public class PessoaEx2 {

    String nome;
    Integer idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public void ehMaisVelho(PessoaEx2 a, PessoaEx2 b, PessoaEx2 c){
        if (a.idade > b.idade && a.idade > c.idade){
            System.out.println(a.nome + " é a pessoa mais velha.");
        } else if(b.idade > a.idade && b.idade > c.idade){
            System.out.println(b.nome + " é a pessoa mais velha.");
        } else {
            System.out.println(c.nome + " é a pessoa mais velha.");

        }

    }
}