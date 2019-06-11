package exemplos.excecao;

public class Main {
    public static void main(String[] args) {

       try{

           Pessoa pessoa = new Pessoa();
           pessoa.setIdade(20);

           if (pessoa.getIdade() >= 18) {
               System.out.println("Você é maior de idade!");
           }

           Integer i = 0;

           if (18/i == 18){
               System.out.println("nunca vai entrar aqui");

           }
       } catch (NullPointerException e){
           e.printStackTrace();
           System.out.println("Caiu no catch, na exceção");
        }
        catch (ArithmeticException e) {
            System.out.println("caiu  no segundo catch");
        }
        finally {
           System.out.println("Sempre será executado!!");
       }

        System.out.println("continuando a excução do programa");
    }
}
