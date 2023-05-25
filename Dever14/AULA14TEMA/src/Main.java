import java.time.LocalDate;
import java.time.Period;

public class Main {
    public static void main(String[] args) {
        LocalDate hoje = LocalDate.now();
        System.out.println(hoje);

        System.out.println("Dia da semana: " + hoje.getDayOfWeek());
        System.out.println("Dia da semana: "  + hoje.getDayOfWeek().ordinal());
        System.out.println("Dia: " + hoje.getDayOfMonth());
        System.out.println("Dia do ano: " + hoje.getDayOfYear());
        System.out.println("Mês: " + hoje.getMonth().ordinal());
        System.out.println("Mês: " + hoje.getMonth());
        System.out.println("Ano: " + hoje.getYear());
        System.out.println("Era: " + hoje.getEra());
        System.out.println("Cronologia: " + hoje.getChronology());

        LocalDate data = LocalDate.of(1985,5,7);

        System.out.println(hoje.isAfter(data));
        System.out.println(hoje.isEqual(data));
        System.out.println(hoje.isBefore(data));

        Period periodo =  Period.between(data,hoje);
        System.out.println(periodo.getYears() + " anos entre as duas datas");
        System.out.println(periodo.getMonths() + " meses entre as duas datas");
        System.out.println(periodo.getDays() + " Dias");
        System.out.println(periodo.toTotalMonths() + " meses");
    }
}