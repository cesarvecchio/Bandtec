import java.util.ArrayList;
import java.util.List;

public class Tributo {
    private List<Tributavel> lista;

    public Tributo() {
        lista = new ArrayList<Tributavel>();
    }

    public void adicionaTributavel(Tributavel t) {
        lista.add(t);
    }

    public void exibeTodos() {
        System.out.println("Lista dos tributaveis");

        for(Tributavel t : lista){
            System.out.println(t);
        }
    }

    public Double calculaTotalTributo() {
        Double totalTributo = 0d;

        for(Tributavel t : lista){
            totalTributo += t.getValorTributo();
        }

        return totalTributo;
    }
}
