package revisao.empresaExercicio4;

import java.util.ArrayList;

public class Departamento {

    private String nomeDoDepartamento;
    private ArrayList<Funcionario> funcionarioDoDepartamento = new ArrayList<>();

    public Departamento(String nomeDoDepartamento) {
        this.nomeDoDepartamento = nomeDoDepartamento;
    }

    public void contrata(Funcionario funcionario){
        System.out.println("*********"+funcionario.getNome());
        this.funcionarioDoDepartamento.add(funcionario);

    }

    public void aumentaSalario(Departamento departamento, double aumento){
        for (Funcionario funcionario: funcionarioDoDepartamento)
            funcionario.setSalario(Funcionario.salario * aumento = Funcionario.salario);
    }

    @Override
    public String toString() {
        return "Departamento{" +
                "nomeDoDepartamento='" + nomeDoDepartamento + '\'' +
                ", funcionarioDoDepartamento=" + funcionarioDoDepartamento.get(0) +
                '}';
    }
}
