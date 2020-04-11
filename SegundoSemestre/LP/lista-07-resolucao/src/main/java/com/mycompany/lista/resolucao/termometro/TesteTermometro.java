package com.mycompany.lista.resolucao.termometro;

public class TesteTermometro {
    public static void main(String[] args){
        
        Termometro termometro = new Termometro(24.00);
        
        termometro.exibeFahreinheit();
        
        // For que chamara o metodo para aumetar a temperatura 4 graus
        for(Integer i = 0; i < 4; i++){
            termometro.aumentaTemperatura();
        }
        termometro.exibeFahreinheit();
        
        // For que chamara o metodo para diminuir a temperatura em 6 graus
        for(Integer i = 0; i < 6; i++){
            termometro.diminuirTemperatura();
        }
        termometro.exibeFahreinheit();
        
        termometro.exibeTemperaturasCelsius();
        
        
    }
}
