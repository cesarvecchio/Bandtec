import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private List<Funcionario> funcionarios;

    public Empresa(){
        funcionarios = new ArrayList<Funcionario>();
    }

    public void adicionarFunc(Funcionario f) {
        funcionarios.add(f);
    }

    public void exibeTodos() {
        System.out.println(funcionarios.toString());
    }

    public void exibiTotalSalario() {
        Double totalSalario = 0.0;

        for(Funcionario funcionario: funcionarios) {
            totalSalario += funcionario.calcSalario();
        }

        System.out.println(
                String.format(
                        "O valor total dos salarios é de: R$%.2f",
                        totalSalario)
                );
    }

    public void exibeHoristas() {
        List<Funcionario> horistas = new ArrayList<Funcionario>();

        for (Funcionario funcionario: funcionarios) {
            if(funcionario instanceof Horista) {
                horistas.add(funcionario);
            }
        }
        System.out.println(horistas);
    }
}
