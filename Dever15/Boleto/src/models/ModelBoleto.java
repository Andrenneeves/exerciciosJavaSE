package models;
import java.time.LocalDate;

public class ModelBoleto {


    // Fazendo as classes
    private int id;
    // Atribuindo o local date
    private LocalDate venc;
    private LocalDate pgto;
    private double valor;
    private double valorPg;

    public ModelBoleto() {}

    public ModelBoleto(int id, LocalDate venc, LocalDate pgto, double valor, double valorPg) {
        this.id = id;
        this.venc = venc;
        this.pgto = pgto;
        this.valor = valor;
        this.valorPg = valorPg;
    }

    public int getId() {return id;}

    public void setId(int id) {this.id = id;}

    public LocalDate getVenc() {return venc;}

    public void setVenc(LocalDate venc) {this.venc = venc;}

    public LocalDate getPgto() {return pgto;}

    public void setPgto(LocalDate pgto) {this.pgto = pgto;}

    public double getValor() {return valor;}

    public void setValor(double valor) {this.valor = valor;}

    public double getValorPg() {return valorPg;}

    public void setValorPg(double valorPg) {this.valorPg = valorPg;}
}
