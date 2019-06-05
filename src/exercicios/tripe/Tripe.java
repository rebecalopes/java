package exercicios.tripe;

public class Tripe {
    private boolean dobrado;
    private int alturaMinima;
    private int alturaMaxima;
    private int alturaAtual;

    public boolean isDobrado() {
        return dobrado;
    }

    public void setDobrado(boolean dobrado) {
        this.dobrado = dobrado;
    }

    public int getAlturaMinima() {
        return alturaMinima;
    }

    public void setAlturaMinima(int alturaMinima) {
        this.alturaMinima = alturaMinima;
    }

    public int getAlturaMaxima() {
        return alturaMaxima;
    }

    public void setAlturaMaxima(int alturaMaxima) {
        this.alturaMaxima = alturaMaxima;
    }

    public int getAlturaAtual() {
        return alturaAtual;
    }



    public void setAlturaAtual(int alturaAtual) {
        this.alturaAtual = alturaAtual;
    }

    public Tripe(boolean dobrado, int alturaMinima, int alturaMaxima, int alturaAtual) {
        this.dobrado = dobrado;
        this.alturaMinima = alturaMinima;
        this.alturaMaxima = alturaMaxima;
        this.alturaAtual = alturaAtual;
    }


    public void definirAltura(Integer novaAltura) {
        this.alturaAtual = novaAltura;
    }

    public void dobrar() {
        this.dobrado = true;
        System.out.println("O tripé já está dobrado");
    }

    public void desdobrar() {
        this.dobrado = false;
        System.out.println("Desdobrado");
    }

    public boolean guardar() {
        this.dobrado = true;
        this.alturaAtual = alturaMinima;
        System.out.println("Guardado");

        return true;
    }

    public void prontoParaGuardar() {
        if (guardar()) {
            System.out.println("Pronto para guardar");
        } else {
            System.out.println("Dobre para guardar");
        }
    }

    public boolean usar() {
        if (!this.dobrado && this.alturaAtual > this.alturaMaxima / 2)
            System.out.println("Usando");
        return true;
    }

    public void prontoParaUsar() {
        if (usar()) {
            System.out.println("Pronto para usar");
        } else {
            System.out.println("Desdobre para usar");
        }
    }
}

