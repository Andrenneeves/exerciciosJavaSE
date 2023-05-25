import java.text.DecimalFormat;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Park {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //Declarando Scanner e formato da data
        Scanner sc = new Scanner(System.in);
        DecimalFormat dcfmt = new DecimalFormat("0.00");

        //Entrada de placa do carro
        System.out.println( "Insira a identificação do veículo para entrar: ");
        String idveiculo = sc.nextLine();
        LocalDateTime chegada = LocalDateTime.now();
        String idChegada = "C" + chegada.getYear() + chegada.getMonthValue() + chegada.getDayOfMonth() + chegada.getHour() + chegada.getMinute() + chegada.getSecond();
        System.out.println("Identificação da Chegada: " + idChegada);
        //Pegando a saída
        System.out.println( "Insira a identificação do veículo para sair : " );
        String idSaida = sc.nextLine();
        //Comparando Id e calculando valor
        if (!idSaida.equals(idChegada)) {
            System.out.println(" Identificação de saída incorreto");
            return;
        }
        LocalDateTime saida = LocalDateTime.now();
        Duration tempoTotal = Duration.between(chegada, saida);
        long minutos = tempoTotal.toMinutes();
        double valor = minutos * (8/60);
        // Valor
        System.out.println("Identificação do veiculo: " + idveiculo);
        System.out.println("Valor devido R$: " + dcfmt.format(valor) );







    }
}