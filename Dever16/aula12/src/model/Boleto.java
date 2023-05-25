package model;

import java.time.LocalDate;

public class Boleto {
    private int id;
    private LocalDate vencimento;
    private LocalDate pagamento;
    private double valor;
    private double valorPago;

    public Boleto() {}

    public Boleto(int id, LocalDate vencimento, LocalDate pagamento, double valor, double valorPago) {
        this.id = id;
        this.vencimento = vencimento;
        this.pagamento = pagamento;
        this.valor = valor;
        this.valorPago = valorPago;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getVencimento() {
        return vencimento;
    }

    public void setVencimento(LocalDate vencimento) {
        this.vencimento = vencimento;
    }

    public LocalDate getPagamento() {
        return pagamento;
    }

    public void setPagamento(LocalDate pagamento) {
        this.pagamento = pagamento;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getValorPago() {
        return valorPago;
    }

    public void setValorPago(double valorPago) {
        this.valorPago = valorPago;
    }
}
