package com.mycompany.lista.resolucao.termometro;

public class Termometro {
    private Double temperaturaAtual = 0.0;
    private Double temperaturaMaxima = 0.0;
    private Double temperaturaMinima = 0.0;
    
    
    public Termometro(){
    
    }
    
    public Termometro(Double temperaturaAtual){
        this.temperaturaAtual = temperaturaAtual;
        this.temperaturaMaxima = temperaturaAtual;
        this.temperaturaMinima = temperaturaAtual;
    }
    
    
    // Metodo que aumentara a temperatura
    public void aumentaTemperatura(){
        
        this.temperaturaAtual++;
        
        if(temperaturaMaxima < temperaturaAtual){
            temperaturaMaxima = temperaturaAtual;
        }
    }
    
    // Metodo que diminuira a temperatura
    public void diminuirTemperatura(){
        
        this.temperaturaAtual--;
        
        if(temperaturaMinima > temperaturaAtual){
            temperaturaMinima = temperaturaAtual;
        }
    }
    
    // Metodo que exibira a temperatura atual em Fahreinheit
    public void exibeFahreinheit(){
        Double fahreinheit = (temperaturaAtual * 9 / 5) + 32;
        
        System.out.println("-------------------");
        
        System.out.println(String.format(
                "Temperatura atual em Fahreinheit: %.2f°F",
                temperaturaAtual));
        
        System.out.println("-------------------");
    }
    
    // Metodo que exibira todas as temperaturas em Celsius
    public void exibeTemperaturasCelsius(){
        
        System.out.println("--------------------");
        
        System.out.println(String.format(
                "Temperatura maxima em Celcius: %.2f°C",
                temperaturaMaxima));
        
        System.out.println(String.format(
                "Temperatura atual em Celcius: %.2f°C",
                temperaturaAtual));
        
        System.out.println(String.format(
                "Temperatura minima em Celcius: %.2f°C",
                temperaturaMinima));
        
        System.out.println("--------------------");
    }
}