package com.mycompany.lista.resolucao.empregado;

public class TesteEmpregado {
    public static void main(String[] args){
        
        Empregado empregado1 =  new Empregado("João", "Analista de Sistemas", 5400.00);
        empregado1.reajustarSalario(15);
        empregado1.apresentarEmpregado();
     
        Empregado empregado2 = new Empregado("Godofredo", "Desenvolvedor", 5000.00);
        empregado2.reajustarSalario(20);
        empregado2.apresentarEmpregado();
    }
}
