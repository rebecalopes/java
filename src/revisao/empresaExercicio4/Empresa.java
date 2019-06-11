package revisao.empresaExercicio4;

import java.util.ArrayList;
import java.util.List;

public class Empresa {

    private String nomeDaEmpresa;
    private String cnpj;
    private ArrayList<Departamento> listaDeDepartamentos =new ArrayList<>();

    public void novoDepartamento(Departamento departamento){
        System.out.println("*&**&*&*&*&"+departamento);
        try{

           listaDeDepartamentos.add(departamento);

        } catch (Exception e){
            System.out.println("dpt não add");
        }

    }

    public ArrayList<Departamento> getListaDeDepartamentos() {
        return listaDeDepartamentos;
    }
}
