package com.mycompany.lista.resolucao.entradaCinema;

public class EntradaDeCinema {
    private Integer hora = 0;
    private Integer sala = 0;
    private Double valor = 0.0;
    private String nome;
    
    private Double valorReal = 0.0;
    private Integer desconto = 0;
    private Integer descontoHora = 0;
    
    
    public EntradaDeCinema(){
        
    }
    
    public EntradaDeCinema(Integer hora, Integer sala, Double valor, String nome){
        this.hora = hora;
        this.sala = sala;
        this.valor = valor;
        this.nome = nome;
        
        this.valorReal = valor;
    }
    
    public void calculaDesconto(Integer idadeCliente, Boolean estudante){
        
        if(idadeCliente < 12){
            desconto = 50;
            valor -= (valor * 50) / 100;
            
        } else if(idadeCliente >= 12 && idadeCliente <= 15){
            desconto = 40;
            valor -= (valor * 40) / 100;
            
        } else if(idadeCliente >= 16 && idadeCliente <= 20){
            desconto = 30;
            valor -= (valor * 30) / 100;
            
        } else if(idadeCliente > 20 && estudante == true){
            desconto = 20;
            valor -= (valor * 20) / 100;
        
        } else{
            desconto = 0;
        }
    }
    
    public void calculaDescontoHorario(){
        
        if(hora < 16){
            descontoHora = 10;
            valor -= (valor * 10) / 100;
        }
    }
    
    public void gerarNota(){
        System.out.println("--------------------");
        System.out.println(String.format("Nome do filme: %s", nome));
        
        System.out.println(String.format("Numero da sala: %d", sala));
        
        System.out.println(String.format("Horario: H %d:00", hora));
        
        System.out.println(String.format("Desconto por idade/estudante: %d%%", desconto));
        System.out.println(String.format("Desconto pelo horario: %d%%", desconto));
        
        System.out.println(String.format("Valor total: R$%.2f", valorReal));
        System.out.println(String.format("Valor a pagar: R$%.2f", valor));
        System.out.println("--------------------");
    }
}
