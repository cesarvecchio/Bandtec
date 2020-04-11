package com.mycompany.clube;

public class Clube {
    private Integer vitoria = 0;
    private Integer empate = 0;
    private Integer derrota = 0;
    private Integer pontuacao = 0;
    
    public Integer getVitoria(){
        return vitoria;
    }
    
    public Integer getEmpate(){
        return empate;
    }
    
    public Integer getDerrota(){
        return derrota;
    }
    
    public Integer getPontuacao(){
        return pontuacao;
    }
    
    public void registrarVitoria(){
        vitoria += 1;
        pontuacao += 3;
    }
    
    public void registrarEmpate(){
        empate += 1;
        pontuacao += 1;
    }
    
    public void registrarDerrota(){
        derrota += 1;
    }
}
