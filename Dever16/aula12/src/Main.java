import model.Boleto;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Boleto boleto = new Boleto();
        Scanner ler = new Scanner(System.in);

        System.out.print("Data de vencimento do boleto: ");
        String recebe = ler.nextLine();

        System.out.print("Valor: R$ ");
        boleto.setValor(ler.nextDouble());

        boleto.setVencimento(LocalDate.of(
                                Integer.parseInt(recebe.split("/")[2]),
                                Integer.parseInt(recebe.split("/")[1]),
                                Integer.parseInt(recebe.split("/")[0])
                            ));

        boleto.setPagamento(LocalDate.now());

        long dias = 0;
        if(boleto.getVencimento().isBefore(boleto.getPagamento())){
           dias = boleto.getVencimento().until(boleto.getPagamento(), ChronoUnit.DAYS);
        }
        double multa = 0;
        if(dias > 0){
            multa = boleto.getValor() * 2/100;
            multa += (dias * 1.1);
        }

        boleto.setValorPago(boleto.getValor() + multa);
        System.out.println("Valor Pago: R$ "+ boleto.getValorPago());
    }

}
//SISTEMA DE ESTACIONAMENTO
/*
dar entrada do veículo com a placa e informa o código de entrada
(Como se fosse o código de barras).
A saída deve informar o código de entrada e calcular o valor a ser pago
de estacionamento sabendo que a hora custa R$ 8,00

dontpad.com/voucopiar
 */
import java.util.Scanner;
        import java.text.DecimalFormat;
        import java.time.LocalDateTime;
        import java.time.Duration;

class Estacionamento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        // Pedir ao usuário para inserir a placa do carro
        System.out.print("Insira a placa do carro: ");
        String placa = sc.nextLine();

        // Gerar código de entrada do veículo e salvar a data e hora de entrada
        LocalDateTime entrada = LocalDateTime.now();
        String codigoEntrada = "E-" + entrada.getYear() + entrada.getMonthValue() + entrada.getDayOfMonth() + entrada.getHour() + entrada.getMinute() + entrada.getSecond();
        System.out.println("Código de entrada: " + codigoEntrada);

        // Pedir ao usuário para inserir o código de entrada ao sair
        System.out.print("Insira o código de entrada para sair: ");
        String codigoSaida = sc.nextLine();

        // Verificar se o código de saída corresponde ao código de entrada
        if (!codigoSaida.equals(codigoEntrada)) {
            System.out.println("Código de saída inválido!");
            return;
        }

        // Calcular o tempo de estacionamento e o preço a pagar
        LocalDateTime saida = LocalDateTime.now();
        Duration duracao = Duration.between(entrada, saida);
        long minutos = duracao.toMinutes();
        double preco = minutos * (8.0/60);

        // Exibir o preço a pagar
        System.out.println("Placa: " + placa);
        System.out.println("Preço a pagar: R$" + df.format(preco));
    }
}