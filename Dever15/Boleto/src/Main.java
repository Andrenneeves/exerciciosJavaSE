import controllers.Boleto;
import models.ModelBoleto;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Teacher!");

        //Instanciando as paradas
       ModelBoleto boleto = new ModelBoleto();
        Scanner leia = new Scanner(System.in);
        System.out.println("Dia de vencimento do documento");
        String recebe = leia.nextLine();
        System.out.println("Valor a ser pago R$");
        //Precisa calcular certinho a data
        boleto.setVenc(LocalDate.of(
                Integer.parseInt(recebe.split("/")[2]),
                Integer.parseInt(recebe.split("/")[1]),
                Integer.parseInt(recebe.split("/")[0]));
        boleto.setPgto(LocalDate.now());

        long dias = 0;
        if(boleto.getVenc().isBefore(boleto.getPgto())){
            dias = boleto.getVenc().until(boleto.getPgto(), ChronoUnit.DAYS);
        }
        double multa = 0;
        if(dias > 0){
            multa = boleto.getValor() * 2/100;
            multa += (dias * 1.1);
        }

        boleto.setValorPg(boleto.getValor() + multa);
        System.out.println("Valor Pago: R$ "+ boleto.getValorPg());


    }
}