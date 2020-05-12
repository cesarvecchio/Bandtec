package com.mycompany.cesar.vecchio.c2;

public class ProgramaLivraria {
    public static void main(String[] args){
        
        Livraria livrariaBlooks = new Livraria("Blooks", 500.00);
        Livraria livrariaCultura = new Livraria("Cultura", 1000.00);
        
        Livro livro1 = new Livro(
                "Harry Potter e a Pedra Filosofal",
                "J.K. Rowling", 26.99, 20);
        
        Livro livro2 = new Livro(
                "O Espadachim de Carvão",
                "Affonso Solano", 26.61, 15);
        
        Livro livro3 = new Livro(
                "Extraordinário",
                "R. J. Palacio", 23.90, 11);
        
        Livro livro4 = new Livro(
                "O Hobbit",
                "J.R.R. Tolkien", 89.90, 5);
        
        
        
        
        livrariaBlooks.comprarRemessa(livro4);
        livrariaBlooks.exibeCaixa();
        livrariaBlooks.comprarRemessa(livro3);
        livrariaBlooks.exibeCaixa();
        livrariaBlooks.exibeEstoque();
        System.out.println(livrariaBlooks);
        
        
        livrariaCultura.comprarRemessa(livro1);
        livrariaCultura.exibeCaixa();
        livrariaCultura.comprarRemessa(livro2);
        livrariaCultura.exibeCaixa();
        livrariaCultura.exibeEstoque();
        System.out.println(livrariaCultura);
    }
    
}
