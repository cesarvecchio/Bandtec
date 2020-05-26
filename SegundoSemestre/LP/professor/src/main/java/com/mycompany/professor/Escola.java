package com.mycompany.professor;

import java.util.ArrayList;
import java.util.List;

public class Escola {
    private String nome;
    private Integer vagas;
    private List<Professor> professores;

    
    public void contratarProfessor(Professor professor){
        if(vagas > 0){
            professores.add(professor);
            vagas --;
        }else{
            System.out.println("Sem vagas disponiveis");
        }
    }
    
    public void exibirProfessor(){
        if(professores.size() > 0){
            for(Professor professor : professores){
                System.out.println(professor);
                System.out.println("");
            }
        } else {
            System.out.println("Sem professores registrado nessa escola");
        }
    }
    
    
    public Escola(String nome, Integer vagas) {
        this.nome = nome;
        this.vagas = vagas;
        this.professores = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getVagas() {
        return vagas;
    }

    public void setVagas(Integer vagas) {
        this.vagas = vagas;
    }

    public List<Professor> getProfessores() {
        return professores;
    }

    public void setProfessores(List<Professor> professores) {
        this.professores = professores;
    }

    @Override
    public String toString() {
        return "Escola{" + "\n"
                + "nome=" + nome + ", \n"
                + "vagas=" + vagas + ", \n"
                + "professores=" + professores + '}';
    }
    
    
    
    
}
