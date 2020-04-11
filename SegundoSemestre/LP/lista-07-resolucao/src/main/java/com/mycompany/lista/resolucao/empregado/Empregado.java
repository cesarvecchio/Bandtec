package com.mycompany.lista.resolucao.empregado;

public class Empregado {
    private String nome;
    private String cargo;
    private Double salario;
    
    
    public Empregado(){
        
    }
    
    public Empregado(String nome, String cargo, Double salario){
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getCargo(){
        return cargo;
    }
    
    public void setCargo(String cargo){
        this.cargo = cargo;
    }
    
    public Double getSalario(){
        return salario;
    }
    
    public void setSalario(Double salario){
        this.salario = salario;
    }
    
    public void reajustarSalario(Integer porcentagem){
        
        salario = salario + ((salario * porcentagem) / 100);
    }
    
    public void apresentarEmpregado(){
        System.out.println(String.format("Nome: %s,", nome));
        System.out.println(String.format("Cargo: %s,", cargo));
        System.out.println(String.format("Salario: R$%.2f.", salario));
        System.out.println("--------------------");
    }
}
