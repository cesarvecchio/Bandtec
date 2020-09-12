public class Perfume extends Produto {
    private String fragrancia;

    public Perfume(Integer codigo, String descricao,
                   Double preco, String fragrancia) {
        super(codigo, descricao, preco);
        this.fragrancia = fragrancia;
    }

    @Override
    public Double getValorTributo(){
        return getPreco() * 0.24;
    }

    @Override
    public String toString() {
        return String.format(
                "%s\n" +
                "Fragrância: %s\n" +
                "Imposto: %.2f",
                super.toString(),
                fragrancia,
                getValorTributo());
    }
}
