package dever;

import dever.Voluntario;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    public static void inicio(){
        ArrayList<Voluntario> voluntarios = new ArrayList<Voluntario>();
        Scanner read = new Scanner(System.in);

        System.out.print("Quantos voluntários serão cadastrados: ");

        for(int i = 0 ; i < read.nextInt(); i++){
            voluntarios.add(Voluntario.cadastra());
            System.out.println("---------------------------");

            System.out.println("Deseja continuar cadastrando?");
            System.out.print("Digite \"S\" para CONTINUAR: ");
            read.nextLine();

            if(!read.nextLine().toLowerCase().equals("s")){
                System.out.println("\n\nSaindo do cadastro...\n\n");
                break;
            }


        }

        System.out.println("\n\nVoluntários Cadastrados");
        for(Voluntario v : voluntarios){
            v.imprime();
            System.out.println("------------------------------------------");
        }

    }
}
