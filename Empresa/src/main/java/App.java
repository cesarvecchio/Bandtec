public class App {
    public static void main(String[] args){
        Engenheiro eng1 = new Engenheiro("111111111111", "Jonas", 2000.00);
        Engenheiro eng2 = new Engenheiro("222222222222", "Pedro", 2000.00);
        Vendedor vend1 = new Vendedor("33333333333", "Roberta", 2.0, 10.0);
        Vendedor vend2 = new Vendedor("44444444444", "Samantha", 2.0, 10.0);
        Horista hor1 = new Horista("555555555555", "Barry", 2, 1000.0);
        Horista hor2 = new Horista("666666666666", "Amanda", 2, 1000.0);

        Empresa stefanini = new Empresa();
        stefanini.adicionarFunc(eng1);
        stefanini.adicionarFunc(eng2);
        stefanini.adicionarFunc(vend1);
        stefanini.adicionarFunc(vend2);
        stefanini.adicionarFunc(hor1);
        stefanini.adicionarFunc(hor2);

        stefanini.exibeTodos();

        System.out.println("___________");

        stefanini.exibiTotalSalario();

        System.out.println("___________");

        stefanini.exibeHoristas();

    }
}
