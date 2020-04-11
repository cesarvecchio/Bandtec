package com.mycompany.lista.resolucao.entradaCinema;

public class TesteEntradaDeCinema {
    public static void main(String[] args){
        
        EntradaDeCinema entradaDeCinema1 = new EntradaDeCinema(12, 2, 20.00, "Transformers");
        entradaDeCinema1.calculaDesconto(11, false);
        entradaDeCinema1.calculaDescontoHorario();
        entradaDeCinema1.gerarNota();
        
        EntradaDeCinema entradaDeCinema2 = new EntradaDeCinema(16, 3, 20.00, "Transformers");
        entradaDeCinema2.calculaDesconto(14, false);
        entradaDeCinema2.calculaDescontoHorario();
        entradaDeCinema2.gerarNota();
        
        EntradaDeCinema entradaDeCinema3 = new EntradaDeCinema(17, 4, 20.00, "Transformers");
        entradaDeCinema3.calculaDesconto(19, false);
        entradaDeCinema3.calculaDescontoHorario();
        entradaDeCinema3.gerarNota();
        
        EntradaDeCinema entradaDeCinema4 = new EntradaDeCinema(18, 1, 20.00, "Transformers");
        entradaDeCinema4.calculaDesconto(25, true);
        entradaDeCinema4.calculaDescontoHorario();
        entradaDeCinema4.gerarNota();
        
        EntradaDeCinema entradaDeCinema5 = new EntradaDeCinema(18, 1, 20.00, "Transformers");
        entradaDeCinema5.calculaDesconto(25, false);
        entradaDeCinema5.calculaDescontoHorario();
        entradaDeCinema5.gerarNota();
    }
}
