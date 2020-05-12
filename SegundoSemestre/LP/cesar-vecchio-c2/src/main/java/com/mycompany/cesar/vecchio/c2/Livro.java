package com.mycompany.cesar.vecchio.c2;

public class Livro {
    private String nome;
    private String autor;
    private Double preco;
    private Integer quantidade;

    public Livro(){
        
    }
    
    public Livro(String nome, String autor, Double preco, Integer quantidade) {
        this.nome = nome;
        this.autor = autor;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }
    
    
    public void exibeDados(){
        System.out.println(String.format(
                    "Nome do livro: %s \n"
                    + "Nome do autor: %s \n"
                    + "Preço unitario do livro: %.2f"
                    + "Quantidade de livros: %d",
                
                    nome, autor, preco, quantidade));
    }
    
    @Override
    public String toString(){
        
        return String.format("Nome do livro: %s \n"
                    + "Nome do autor: %s \n "
                    + "Preço unitario do livro: %.2f \n"
                    + "Quantidade de livros: %d \n",
                
                    nome, autor, preco, quantidade);
    }
}
