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

    public Tripe (boolean dobrado){
        this.dobrado= dobrado;
    }

    public void Altura(Integer novaAltura){

        alturaAtual = alturaAtual + novaAltura;

    }

    public void dobrar(){
        if (dobrado) {
            System.out.println("O tripé já está dobrado");
        }

    }
    public void desdobrar(){
        if (!dobrado) {
            System.out.println("Desdobrado");
            }
    }

    public void guardar(){
        if(prontoParaGuardar()){
            System.out.println("Guardado");
        }
    }


    public boolean prontoParaGuardar(){
        if(dobrado){
            System.out.println("Pronto para guardar");
            return true;
            } else {
            System.out.println("Dobre para guardar");
            return false;
        }
    }

    public void usar(){
        if(prontoParaUsar()) {
            System.out.println("Pode usar");
        }
    }
    public boolean prontoParaUsar(){
        if (!dobrado){
            System.out.println("Pronto para usar");
            return true;
        } else {
            System.out.println("Desdobre primeiro para poder usar");
            return false;
        }

    }
}
