import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello User!");
        System.out.print("Digite seus números: ");
        double number1, number2;
        Scanner entra = new Scanner(System.in);

        System.out.print("Número 1: ");
        number1 = entra.nextDouble();
        System.out.print("Número 2: ");
        number2 = entra.nextDouble();
        System.out.println("Soma: " + soma(number1, number2));
        System.out.println("Subtraçâo : " + subtrai(number1, number2));
        System.out.println("Multiplicação: " + multiplica(number1, number2));
        System.out.println("Divisão: " + divide(number1, number2));
    }
    public static double soma(double number1, double number2){
        //var soma = (number1 + number2);
        return number1 + number2;
    }
    public static double subtrai(double number1, double number2){
        return number1 - number2;
    }
    public static double multiplica(double number1, double number2){
        return number1 * number2;
    }
    public static double divide(double number1, double number2){
        return number1 / number2;
    }
}
