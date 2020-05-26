package com.mycompany.professor;

public class App {
    public static void main(String[] args){
        Professor professor = new Professor("Fabio", 1231, 6, 10.00);
        System.out.println(professor.calculaSalario());
        System.out.println(professor.toString());
        
        System.out.println("");
        
        Coordenador coordenador = new Coordenador("Cleiton", 1232, 6, 10.00, 6, 15.00, "ADS");
        System.out.println(coordenador.calculaSalario());
        System.out.println(coordenador.toString());
        
        System.out.println("");
        
        Escola escola = new Escola("Etec", 5);
        escola.contratarProfessor(professor);
        escola.contratarProfessor(coordenador);
        escola.exibirProfessor();
        System.out.println(escola.toString());
    }
}
