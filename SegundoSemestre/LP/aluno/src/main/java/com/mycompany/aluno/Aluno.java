package com.mycompany.aluno;

public class Aluno {
    private Integer ra;
    private String nome;
    private Double notaContinuada;
    private Double notaSemestral;

    public Aluno(Integer ra, String nome, Double notaContinuada, Double notaSemestral) {
        this.ra = ra;
        this.nome = nome;
        this.notaContinuada = notaContinuada;
        this.notaSemestral = notaSemestral;
    }

    
    public Double calculaMedia(){
        return (notaContinuada * 0.4) + (notaSemestral * 0.6);
    }
    
    
    public Integer getRa() {
        return ra;
    }

    public void setRa(Integer ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getNotaContinuada() {
        return notaContinuada;
    }

    public void setNotaContinuada(Double notaContinuada) {
        this.notaContinuada = notaContinuada;
    }

    public Double getNotaSemestral() {
        return notaSemestral;
    }

    public void setNotaSemestral(Double notaSemestral) {
        this.notaSemestral = notaSemestral;
    }

    @Override
    public String toString() {
        return "\n Aluno{" 
                + "\n ra=" + ra 
                + ",\n nome=" + nome 
                + ",\n notaContinuada=" + notaContinuada 
                + ",\n notaSemestral=" + notaSemestral 
                + ",\n media=" + calculaMedia() + '}';
    }
    
    
}
