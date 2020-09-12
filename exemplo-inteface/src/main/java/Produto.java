public abstract class Produto implements Tributavel{
    private Integer codigo;
    private String descricao;
    private Double preco;

    public Produto(Integer codigo, String descricao, Double preco) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.preco = preco;
    }

    public Double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return String.format(
                "Codigo: %s\n" +
                "Descrição: %s\n" +
                "Preço: %.2f\n",
                codigo,
                descricao,
                preco);
    }
}
