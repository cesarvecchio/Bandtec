package com.mycompany.eleicao;

public class UrnaEletronica {
    private Integer votosCandidato1 = 0;
    private Integer votosCandidato2 = 0;
    private Integer totalVotos = 0;
    private String vencedor = "";
    
    
    public Integer getVotosCandidato1(){
        return votosCandidato1;
    }
    
    public Integer getVotosCandidato2(){
        return votosCandidato2;
    }
    
    public Integer getTotalVotos(){
        return totalVotos;
    }
    
    private void setTotalVotos(){
        totalVotos ++;
    }
    
    public void votarCandidato1(){
        votosCandidato1 ++;
        setTotalVotos();
    }
    
    public void votarCandidato2(){
        votosCandidato2 ++;
        setTotalVotos();
    }
    
    public String getVencedor(){
        if(votosCandidato1 > votosCandidato2){
            vencedor = "Candidato 1 venceu";
            return vencedor;
            
        } else if(votosCandidato1 == votosCandidato2){
            vencedor = "Empatou";
            return vencedor;
            
        } else{
            vencedor = "Candidato 2 venceu";
            return vencedor;
        }
    }
    
}
