package revisao.empresaExercicio4;

public class Exercicio4 {
    public static void main(String[] args) {
        Funcionario fun1 = new Funcionario("Rebeca",1234.56,"12/03/2019");
        Funcionario fun2 = new Funcionario("Pablo",1210.56,"13/05/2016");

        Departamento rh = new Departamento("rh");
       Departamento financeiro = new Departamento("financeiro");
       Empresa rebecasa = new Empresa();

       financeiro.contrata(fun1);
       rh.contrata(fun2);


       rebecasa.novoDepartamento(rh);
       rebecasa.novoDepartamento(financeiro);
       try {
           System.out.println("adicionando dpts");
           rebecasa.getListaDeDepartamentos();
       } catch (NullPointerException e){
           System.out.println("lista de deps");
       }

        rebecasa.getListaDeDepartamentos();
    }
}
