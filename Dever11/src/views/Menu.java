package views;

import controllers.AlunoController;
import controllers.ProfessorController;
import models.Aluno;
import models.Professor;
import services.Receber;

import java.util.ArrayList;

public class Menu {
    public static void inicio(){
        while(0==0){
            System.out.println("======================");
            System.out.println("---------CURSO--------");
            System.out.println("======================");
            System.out.println("(0) #SAIR#");
            System.out.println("(1) Cadastrar");
            System.out.println("(2) Consultar");
            System.out.print("Escolha uma opção: ");

            switch(Receber.numeroInteiro()){
                case 0:
                    System.out.println("SAIR......");
                    System.exit(0);
                case 1: //cadastrar
                    cadastrar();
                    break;
                case 2://consutlar
                    consultar();
                    break;
                default:
                    System.out.println("Só tem 1 ou 2!");
                    break;
            }
        }
    }

    public static void consultarAlunos(){
        ArrayList<Aluno> lista = AlunoController.getAll();
        System.out.println("\n\nAlunos Cadastrados");
        System.out.println("------------------");

        if(lista.isEmpty()){
            System.out.println("\nNÃO HÁ ALUNOS CADASTRADOS\n");
        } else {
            for(Aluno a : lista){
                AlunoController.imprime(a);
                System.out.println("----------------");
            }
        }
    }

    private static void consultarProfessor(){
        ArrayList<Professor> lista = ProfessorController.getAll();
        System.out.println("\n\nProfessores Cadastrados");

        if (lista.isEmpty()){
            System.out.print("\nNÃO HÁ PROFESSORES CADASTRADOS\n");
        } else {
            for (Professor p : lista){
                ProfessorController.imprime(p);
                System.out.println("----------------");
            }
        }
    }

    private static void consultar(){
        System.out.println("\n\n---------CONSULTAS--------");
        System.out.println("==========================");
        System.out.println("(1) Alunos");
        System.out.println("(2) Professores");
        System.out.print("Informe a opção desejada: ");

        switch (Receber.numeroInteiro()) {
            case 1://Alunos
                consultarAlunos();
                break;
            case 2://professores
                consultarProfessor();
                break;
            default:
                System.out.println("\n\nOPÇÃO INVÁLIDA!\n");
                break;
        }
    }

    public static void cadastrar(){
        System.out.println("\n\n---------CADASTROS--------");
        System.out.println("==========================");
        System.out.println("(1) Alunos");
        System.out.println("(2) Professore");
        System.out.print("Informe a opção desejada: ");

        switch (Receber.numeroInteiro()){
            case 1:
                AlunoController.insert(AlunoController.cadastrar());
                break;
            case 2:
                ProfessorController.insert(ProfessorController.cadastrar());
                break;
            default:
                System.out.println("\n\nOPÇÃO INVÁLIDA!\n");
                break;
        }
    }
}


