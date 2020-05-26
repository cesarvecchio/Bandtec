package com.mycompany.aluno;

public class AlunoPos extends Aluno{
    private Double notaMonografia;

    @Override
    public Double calculaMedia() {
        return (super.getNotaContinuada() + 
                super.getNotaSemestral() +
                notaMonografia) / 3;
    }

    
    
    public AlunoPos(Integer ra, String nome, Double notaContinuada, Double notaSemestral, Double notaMonografia) {
        super(ra, nome, notaContinuada, notaSemestral);
        this.notaMonografia = notaMonografia;
    }

    public Double getNotaMonografia() {
        return notaMonografia;
    }

    public void setNotaMonografia(Double notaMonografia) {
        this.notaMonografia = notaMonografia;
    }

    @Override
    public String toString() {
        return "AlunoPos{" 
                + "\n ra=" + super.getRa() + ", "
                + "\n nome=" + super.getNome()
                + ",\n notaContinuada=" + super.getNotaContinuada()
                + ",\n notaSemestral=" + super.getNotaSemestral() 
                + ",\n notaMonografia=" + notaMonografia 
                + ",\n media =" + calculaMedia() + '}';
    }
    
    
}
