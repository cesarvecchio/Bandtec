package com.mycompany.aluno;

import java.util.ArrayList;
import java.util.List;

public class Faculdade {
    private String nome;
    private Integer vagas;
    private List<Aluno> listaAlunos;
    
    
    public void matricularAluno(Aluno aluno){
        if(vagas > 0){
             listaAlunos.add(aluno);
             vagas --;
        } else {
            System.out.println("Vagas insuficientes.");
        }
    }
    
    public void exibirAlunosMatriculados(){
        if(listaAlunos.size() > 0){
            for(Aluno aluno : listaAlunos){
                System.out.println(aluno.toString());
            }
            
        }else{
            System.out.println(String.format("A faculdade %s não possui alunos cadastrados", nome));
        }
    }

    public Faculdade(String nome, Integer vagas) {
        this.nome = nome;
        this.vagas = vagas;
        this.listaAlunos = new ArrayList<>();
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

    public List<Aluno> getListaAlunos() {
        return listaAlunos;
    }

    public void setListaAlunos(List<Aluno> listaAlunos) {
        this.listaAlunos = listaAlunos;
    }

    @Override
    public String toString() {
        return "Faculdade{" + "nome=" + nome + ", vagas=" + vagas + ", listaAlunos=" + listaAlunos + '}';
    }
    
    
}
