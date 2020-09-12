public class Servico implements Tributavel{
    private String descricao;
    private Double preco;

    public Servico(String descricao, Double preco) {
        this.descricao = descricao;
        this.preco = preco;
    }

    @Override
    public Double getValorTributo(){
        return preco * 0.12;
    }

    @Override
    public String toString() {
        return String.format(
                "Descrição: %s\n" +
                "Preço: %.2f\n" +
                "Imposto: %.2f",
                descricao,
                preco,
                getValorTributo());
    }
}
