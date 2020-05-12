package com.mycompany.cesar.vecchio.c2;

import java.util.ArrayList;
import java.util.List;

public class Livraria {
    private String nome;
    private Double caixa;
    private List<Livro> listaDeLivros;
    
    public Livraria(){
    }

    public Livraria(String nome, Double caixa) {
        this.nome = nome;
        this.caixa = caixa;
        listaDeLivros = new ArrayList<>();
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getCaixa() {
        return caixa;
    }

    public void setCaixa(Double caixa) {
        this.caixa = caixa;
    }

    public List<Livro> getListaDeLivros() {
        return listaDeLivros;
    }

    public void setListaDeLivros(List<Livro> listaDeLivros) {
        this.listaDeLivros = listaDeLivros;
    }
    
    
    
    
    public void comprarRemessa(Livro livro){
        
        Double valorTotal = livro.getPreco() * livro.getQuantidade();
        
        if(valorTotal < caixa){
            listaDeLivros.add(livro);
            caixa -= livro.getPreco();
            
            System.out.println(String.format(
                    "%s: A compra da remessa do livro %s efetuada com sucesso!",
                    nome, livro.getNome()));
            
        } else {
            System.out.println(String.format(
                    "Fundos insuficientes para adquirir remessa do livro: %s",
                    livro.getNome()));
        }
    }
    
    public void exibeEstoque(){
        
        if(!listaDeLivros.isEmpty()){
            System.out.println("________ Livros em estoque ________");
            
            for(Livro livros : listaDeLivros){
                System.out.println(String.format(
                        "Nome do livro: %s \n"
                      + "Autor do livro: %s \n"
                      + "Preço do por livro: %.2f \n "
                      + "Quantidade de livros: %d",
                        
                        livros.getNome(),
                        livros.getAutor(),
                        livros.getPreco(),
                        livros.getQuantidade()));
            }
            
            System.out.println("___________________________________");
          
        } else {
            
            System.out.println("Você não possuí livros em seu estoque.");
        }
    }
    
    public void exibeCaixa(){
        System.out.println(String.format("O caixa atual é de: %.2f", caixa));
    }
    
    @Override
    public String toString(){
        String livros = listaDeLivros.toString();
        
        return String.format(
                "Livraria: %s \n"
              + "Caixa: %.2f \n"
              + "Livros em estoque %s ",
                nome, caixa, livros);
    }
}
