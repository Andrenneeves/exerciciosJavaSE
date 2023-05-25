package services;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Receber {

    public static  String texto(){
        Scanner leia = new Scanner(System.in);
        String dados = leia.nextLine();

        return dados;
    }

    public static int numeroInteiro() {

        int dados = 0;
        int cont = 0;
        while (0 == 0){
            Scanner leia = new Scanner(System.in);
            try {
                dados = leia.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("Apenas números inteiros!");
                System.out.println("Não pode ser por extenso!");
                System.out.println("Use números!!!");
                if(cont>=3)
                    System.out.println("Chama alguém com cerébro, por favor!");

                System.out.print("Informe o número novamente: ");
                cont++;
            }
        }
        return dados;
    }

    public static double numeroDouble() {

        double dados = 0;
        int cont = 0;

        while (0 == 0){
            Scanner leia = new Scanner(System.in);
            try {
                dados = leia.nextDouble();
                break;
            } catch (Exception e) {
                System.out.println("Apenas números!");
                System.out.println("Não pode ser por extenso!");
                System.out.println("Use números!!!");
                if(cont>=3)
                    System.out.println("Chama alguém com cerébro, por favor!");

                System.out.print("Informe o número novamente: ");
                cont++;
            }
        }
        return dados;
    }
}
