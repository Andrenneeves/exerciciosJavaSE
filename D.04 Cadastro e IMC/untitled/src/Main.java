import Paciente.Paciente;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        //Declarando array de paciente e um inteiro comprimento que vai definir o tamanho do array
        Paciente[] paciente;
       // int comprimento;


        //Perguntando números de pacientes atendidos
        System.out.print("Quantos pacientes serão atendidos hoje?");
        paciente = new Paciente [leia.nextInt()];

        // for para cadastrar os pacientes dentro do array
        for(int i = 0 ; i < paciente.length ; i++){
            paciente[i] = Paciente.cadastra();
            System.out.println("________________");
           //fazendo a saída
            System.out.println("Deseja continuar marcando?");
            System.out.print("Digite \"S\" para Continuar: ");
            leia.nextLine();
            //verificando a letra respondida
            if(!leia.nextLine().toLowerCase().equals("s")){
                System.out.println("\nSaindo da marcação.\n");
                break;
            }
            // Caso não cadastrem ninguém
            System.out.println("\nPacientes Cadastrados");
            for(Paciente p : paciente){
                if(p == null)
                    break;

                p.imprime();
                System.out.println("------------------------------------------");
            }
        }
    }
}