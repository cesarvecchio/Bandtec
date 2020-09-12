import javax.swing.*;

public class TestaCarrinho {
    public static void main(String[] args) {
        Carrinho carrinho = new Carrinho();
        Integer opcao;
        Boolean continuar = true;

        while(continuar) {
            System.out.println("Escolha uma das opções");

            opcao =  Integer.parseInt(JOptionPane.showInputDialog(
                    "Escolha uma das opções. \n" +
                    "1. Adicionar livro. \n" +
                    "2. Adicionar DVD. \n" +
                    "3. Adicionar Serviço. \n" +
                    "4. Exibir itens do carrinho. \n" +
                    "5. Exibir total de venda. \n" +
                    "6. Fim."));


            switch (opcao) {
                case 1:
                    Integer codigo;
                    Double precoCusto;
                    String nome, autor, isbn;

                    codigo = Integer.parseInt(JOptionPane.showInputDialog(
                            "Insira o codigo do livro"));
                    precoCusto = Double.parseDouble(JOptionPane.showInputDialog(
                            "Insira o preço do livro"));
                    nome = JOptionPane.showInputDialog(
                            "Insira o nome do livro");
                    autor = JOptionPane.showInputDialog(
                            "Insira o autor do livro");
                    isbn = JOptionPane.showInputDialog(
                            "Insira o isbn do livro");

                    carrinho.adicionaVendavel(new Livro(codigo, precoCusto,
                            nome, autor, isbn));
                    break;

                case 2:
                    Integer codigoDvd;
                    Double precoCustoDvd;
                    String nomeDvd, gravadora;

                    codigoDvd = Integer.parseInt(JOptionPane.showInputDialog(
                            "Insira o codigo do dvd"));
                    precoCustoDvd = Double.parseDouble(JOptionPane.showInputDialog(
                            "Insira o preço do dvd"));
                    nomeDvd = JOptionPane.showInputDialog(
                            "Insira o nome do dvd");
                    gravadora = JOptionPane.showInputDialog(
                            "Insira o gravadora do dvd");

                    carrinho.adicionaVendavel(new DVD(codigoDvd, precoCustoDvd,
                            nomeDvd, gravadora));

                    break;

                case 3:
                    //serviço
                    String descricao;
                    Integer codigoServico, quantHoras;
                    Double valorHora;

                    descricao = JOptionPane.showInputDialog(
                            "Insira descrição do serviço");
                    codigoServico = Integer.parseInt(JOptionPane.showInputDialog(
                            "Insira o código do serviço"));
                    quantHoras = Integer.parseInt(JOptionPane.showInputDialog(
                            "Insira a quantida de horas do serviço"));
                    valorHora = Double.parseDouble(JOptionPane.showInputDialog(
                            "Insira o valor da hora de serviço"));

                    carrinho.adicionaVendavel(new Servico(descricao, codigoServico,
                            quantHoras, valorHora));
                    break;

                case 4:
                    carrinho.exibeItensCarrinho();
                    break;

                case 5:
                    JOptionPane.showMessageDialog(null,
                            String.format("Preço total R$%.2f", carrinho.calculaTotalVenda()),
                            "Preço total", JOptionPane.INFORMATION_MESSAGE);
                    break;

                case 6:
                    System.out.println("Programa finalizado!");
                    continuar = false;
                    break;

                default:
                    System.out.println("Opção invalida");
                    break;
            }
        }
    }
}
