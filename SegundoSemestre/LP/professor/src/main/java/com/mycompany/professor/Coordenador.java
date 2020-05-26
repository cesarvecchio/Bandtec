package com.mycompany.professor;

public class Coordenador extends Professor{
    private Integer qtdHorasCoord;
    private Double valorHoraCoord;
    private String curso;

    
    @Override
    public double calculaSalario() {
        return super.calculaSalario() + ((valorHoraCoord * qtdHorasCoord) * 4.5);
    }
    
    public Coordenador(String nome, Integer codigo, Integer horas, 
                       Double valorHora, Integer qtdHorasCoord, 
                       Double valorHoraCoord, String curso) {
        super(nome, codigo, horas, valorHora);
        this.qtdHorasCoord = qtdHorasCoord;
        this.valorHoraCoord = valorHoraCoord;
        this.curso = curso;
    }

    public Integer getQtdHorasCoord() {
        return qtdHorasCoord;
    }

    public void setQtdHorasCoord(Integer qtdHorasCoord) {
        this.qtdHorasCoord = qtdHorasCoord;
    }

    public Double getValorHoraCoord() {
        return valorHoraCoord;
    }

    public void setValorHoraCoord(Double valorHoraCoord) {
        this.valorHoraCoord = valorHoraCoord;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Coordenador{\n" 
                + "nome=" + getNome() + ", \n"
                + "codigo=" + getCodigo() + ", \n"
                + "horas=" + getHoras() + ", \n"
                + "valorHora=" + getValorHora() + ", \n"
                + "qtdHorasCoord=" + qtdHorasCoord + ",\n "
                + "valorHoraCoord=" + valorHoraCoord + ",\n "
                + "curso=" + curso + ",\n "
                + "salario=" + calculaSalario() + '}';
    }
    
    
}
