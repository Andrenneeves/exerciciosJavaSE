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
            System.out.println("(3) DELETAR");
            System.out.println("(4) Atualizar");
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
                case 3:
                    deletar();
                    break;
                case 4:
                    atualizar();
                default:
                    System.out.println("Só tem 1, 2, 3 ou 4!");
                    break;
            }
        }
    }

    private static void consultarAlunos(){
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

    private static void consultarProfessores(){
        ArrayList<Professor> lista = ProfessorController.getAll();
        System.out.println("\n\nProfessores Cadastrados");
        System.out.println("------------------");

        if(lista.isEmpty()){
            System.out.println("\nNÃO HÁ PROFESSORES CADASTRADOS\n");
        } else {
            for(Professor a : lista){
                ProfessorController.imprime(a);
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
                consultarProfessores();
                break;
            default:
                System.out.println("\n\nOPÇÃO INVÁLIDA!\n");
                break;
        }
    }
    private static void cadastrar(){

        System.out.println("\n\n---------CADASTROS--------");
        System.out.println("==========================");
        System.out.println("(1) Alunos");
        System.out.println("(2) Professores");
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

    private static void deletar(){
        System.out.println("\n\n---------DELETAR--------");
        System.out.println("==========================");
        System.out.println("(1) Alunos");
        System.out.println("(2) Professores");
        System.out.print("Informe a opção desejada: ");

        switch (Receber.numeroInteiro()) {
            case 1://Alunos
                deletarAlunos();
                break;
            case 2://professores
                deletarProfessores();
                break;
            default:
                System.out.println("\n\nOPÇÃO INVÁLIDA!\n");
                break;
        }
    }

    private static void atualizar(){
        System.out.println("\n\n---------ATUALIZAR--------");
        System.out.println("==========================");
        System.out.println("(1) Alunos");
        System.out.println("(2) Professores");
        System.out.print("Informe a opção desejada: ");

        switch (Receber.numeroInteiro()) {
            case 1://Alunos
                updtAlunos();
                break;
            case 2://professores
                updtProfessor();
                break;
            default:
                System.out.println("\n\nOPÇÃO INVÁLIDA!\n");
                break;
        }
    }

    private static void deletarAlunos(){
        consultarAlunos();
        System.out.print("Informe o ID à ser deletado:");
        AlunoController.delete(Receber.numeroInteiro());
    }

    private static void updtAlunos(){
        consultarAlunos();
        System.out.print("Informe o ID à ser atualizado: ");
        int id = Receber.numeroInteiro();

        ArrayList<Aluno> lista = AlunoController.getAll();
        int i;

        for(i = 0 ; i < lista.size() ;i++)
            if(lista.get(i).getId() == id)
                break;

        System.out.println("\n\n(1) Idade");
        System.out.println("(2) Gênero");
        System.out.print("O que deseja trocar: ");

        switch(Receber.numeroInteiro()){
            case 1:
                System.out.print("informe a nova idade: ");
                lista.get(i).setIdade(Receber.numeroInteiro());
                break;
            case 2:
                System.out.print("informe o novo genero: ");
                lista.get(i).setGenero(Receber.texto());
                break;
            default:
                System.out.println("\n\nSó tinha duas opções e você errou!");
                break;
        }
        AlunoController.update(lista.get(i));
    }

    private static void deletarProfessores(){
        consultarProfessores();
        System.out.print("Informe o ID à ser deletado:");
        ProfessorController.delete(Receber.numeroInteiro());
    }


    private static void updtProfessor(){
        consultarProfessores();
        System.out.print("Informe o ID à ser atualizado: ");
        int id = Receber.numeroInteiro();

        ArrayList<Professor> lista = ProfessorController.getAll();
        int i;

        for(i = 0 ; i < lista.size() ;i++)
            if(lista.get(i).getId() == id)
                break;

        System.out.println("\n\n(1) Nome");
        System.out.println("(2) Telefone");
        System.out.print("O que deseja trocar: ");

        switch(Receber.numeroInteiro()){
            case 1:
                System.out.print("informe o novo nome: ");
                lista.get(i).setNome(Receber.texto());
                break;
            case 2:
                System.out.print("informe o novo telefone: ");
                lista.get(i).setTelefone(Receber.texto());
                break;
            default:
                System.out.println("\n\nSó tinha duas opções.");
                break;
        }
        ProfessorController.update(lista.get(i));
    }
}
