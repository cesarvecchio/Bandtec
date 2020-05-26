package com.mycompany.aluno;

public class ProgramaAlunoHeranca {
    public static void main(String[] args){
        Aluno aluno1 = new Aluno(0112, "Joao", 9.0, 10.0);
        System.out.println(String.format("O aluno %s tem média %.1f", 
                                         aluno1.getNome(), aluno1.calculaMedia()));
        System.out.println(aluno1.toString());
        
        
        Aluno aluno2 = new Aluno(0113, "Maria", 10.0, 8.0);
        System.out.println(String.format("O aluno %s tem média %.1f", 
                                         aluno2.getNome(), aluno2.calculaMedia()));
        System.out.println(aluno2.toString());
        
        
        AlunoPos alunoPos1 = new AlunoPos(0221, "Fabio", 9.0, 5.0, 10.0);
        System.out.println(String.format("O aluno %s tem média %.1f", 
                                         alunoPos1.getNome(), alunoPos1.calculaMedia()));
        System.out.println(alunoPos1.toString());
        
        
        
        Faculdade faculdade1 = new Faculdade("Bandtec", 2);
        faculdade1.matricularAluno(aluno1);
        faculdade1.matricularAluno(aluno2);
        faculdade1.matricularAluno(alunoPos1);
        faculdade1.exibirAlunosMatriculados();
        System.out.println(faculdade1.toString());
        
        
        Faculdade faculdade2 = new Faculdade("Fiap", 1);
        faculdade2.exibirAlunosMatriculados();
        System.out.println(faculdade2.toString());
    }
}
