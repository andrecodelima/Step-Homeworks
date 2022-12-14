package models;

import java.time.LocalDate;

public class Boleto {

    private int id;
    private LocalDate vencimento;
    private double valor;

    public Boleto(){}

    public Boleto(LocalDate vencimento, double valor) {
        this.vencimento = vencimento;
        this.valor = valor;
    }

    public Boleto(int id, LocalDate vencimento, double valor) {
        this.id = id;
        this.vencimento = vencimento;
        this.valor = valor;
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

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
