package exercicios.jogadorFutebol;

public class SessaoDeTreinamento {
    private int treinoExperiencia;

    public int getExperiencia() {
        return treinoExperiencia;
    }

    public void setExperiencia(int experiencia) {
        this.treinoExperiencia = experiencia;
    }

    public SessaoDeTreinamento(int experiencia){
        this.treinoExperiencia = experiencia;
    }

    public void treinarA (JogadorDeFutebol jogador){
        System.out.println("Experiencia Inicial: " + jogador.getExperiencia());

        jogador.correr();
        jogador.fazerGol();
        jogador.correr();

        jogador.setExperiencia(jogador.getExperiencia()+this.treinoExperiencia);

        System.out.println("Experiencia Final: " + jogador.getExperiencia());

    }

}
