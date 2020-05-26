package com.mycompany.professor;

public class Professor {
    private String nome;
    private Integer codigo;
    private Integer horas;
    private Double valorHora;

    
    public double calculaSalario(){
        Double salario = (valorHora * horas) * 4.5;
        return salario;
    }
    
    
    public Professor(String nome, Integer codigo, Integer horas, Double valorHora) {
        this.nome = nome;
        this.codigo = codigo;
        this.horas = horas;
        this.valorHora = valorHora;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Integer getHoras() {
        return horas;
    }

    public void setHoras(Integer horas) {
        this.horas = horas;
    }

    public Double getValorHora() {
        return valorHora;
    }

    public void setValorHora(Double valorHora) {
        this.valorHora = valorHora;
    }

    @Override
    public String toString() {
        return "Professor{" + "\n"
                + "nome=" + nome + ", \n"
                + "codigo=" + codigo + ", \n"
                + "horas=" + horas + ", \n"
                + "valorHora=" + valorHora + ", \n"
                + "salario= " + calculaSalario() + '}';
    }
    
    
}
