package cenarios.segundo;

public class Coordenador extends Professor{
    private Integer qtdHoraCoordSem;
    private Double valorHoraCoord;

    public Coordenador(String nome, Integer qtdAulaSem,
                       Double valorHoraAula, Integer qtdHoraCoordSem,
                       Double valorHoraCoord) {
        super(nome, qtdAulaSem, valorHoraAula);
        this.qtdHoraCoordSem = qtdHoraCoordSem;
        this.valorHoraCoord = valorHoraCoord;
    }

    public Integer getQtdHoraCoordSem() {
        return qtdHoraCoordSem;
    }

    public void setQtdHoraCoordSem(Integer qtdHoraCoordSem) {
        this.qtdHoraCoordSem = qtdHoraCoordSem;
    }

    public Double getValorHoraCoord() {
        return valorHoraCoord;
    }

    public void setValorHoraCoord(Double valorHoraCoord) {
        this.valorHoraCoord = valorHoraCoord;
    }

    @Override
    public Double getValorBonus() {
        return super.getValorBonus() +
                (qtdHoraCoordSem * valorHoraCoord * 4.5 * 0.2);
    }

    @Override
    public String toString() {
        return "Coordenador{" +
                "qtdHoraCoordSem=" + qtdHoraCoordSem +
                ", valorHoraCoord=" + valorHoraCoord +
                ", valorBonus=" + getValorBonus() +
                "} " + super.toString();
    }
}
