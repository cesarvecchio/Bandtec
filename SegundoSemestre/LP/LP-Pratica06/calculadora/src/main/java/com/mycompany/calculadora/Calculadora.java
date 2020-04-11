package com.mycompany.calculadora;

public class Calculadora {
    private Double resultado = 0.0;
    
    public Double getResultado(){
        return resultado;
    }
    
    public void adicao(Double valor1, Double valor2){
        resultado = valor1 + valor2;
    }
    
    public void subtracao(Double valor1, Double valor2){
        resultado = valor1 - valor2;
    }
    
    public void mutiplicacao(Double valor1, Double valor2){
        resultado = valor1 * valor2;
    }
    
    public void divisao(Double valor1, Double valor2){
        resultado = valor1 / valor2;
    }
}
