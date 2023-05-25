package src;
import java.time.LocalDate;
import java.time.Period;

public class Main {
    public static void main(String[] args) {

        LocalDate dataminha = LocalDate.of(1985, 10, 29);
        LocalDate dataafilhada = LocalDate.of(2021, 11, 6);


        Period periodo =  Period.between(dataminha,dataafilhada);
        System.out.println(periodo.getYears() + " anos entre eu e ela");
        System.out.println(periodo.getMonths() + " meses entre eu e ela");
        System.out.println(periodo.getDays() + " Dias");
        System.out.println(periodo.toTotalMonths() + " meses");
    }
}
