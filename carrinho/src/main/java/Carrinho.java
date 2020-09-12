import java.util.List;

import java.util.ArrayList;

public class Carrinho {
    private List<Vendavel> cart;

    public Carrinho(){
        cart = new ArrayList();
    }

    public void adicionaVendavel(Vendavel t){
        cart.add(t);
    }

    public Double calculaTotalVenda() {
        Double total = 0.0;
        for(Vendavel v : cart) {
            total += v.getValorVenda();
        }

        return total;
    }

    public void exibeItensCarrinho() {
        for(Vendavel v : cart) {
            System.out.println(v);
        }
    }
}
