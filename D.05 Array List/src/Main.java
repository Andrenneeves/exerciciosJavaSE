import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        //Declarando array de paciente
        ArrayList<Paciente> paciente = new ArrayList<Paciente>();

        //Perguntando números de pacientes atendidos
        System.out.print("Quantos pacientes serão atendidos hoje?");

        // for para cadastrar os pacientes dentro do array
        for (int i = 0; i < leia.nextInt(); i++) {
            paciente.add(Paciente.cadastra());
            System.out.println("________________");
            //fazendo a saída
            System.out.println("Deseja continuar marcando?");
            System.out.print("Digite \"S\" para Continuar: ");
            leia.nextLine();
            //verificando a letra respondida
            if (!leia.nextLine().toLowerCase().equals("s")) {
                System.out.println("\nSaindo da marcação.\n");
                break;
            }
            // Caso não cadastrem ninguém
            System.out.println("\nPacientes Cadastrados");
            for (Paciente p : paciente) {
                if (p == null)
                    break;

                p.imprime();
                System.out.println("________________3");
            }
        }
    }
}