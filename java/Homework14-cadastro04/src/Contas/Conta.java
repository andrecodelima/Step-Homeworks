package Contas;

public abstract class Conta {

    private String agencia;
    private String conta;
    private double saldo;

    public Conta(){}

    public Conta(String agencia, String conta, double saldo) {
        this.agencia = agencia;
        this.conta = conta;
        this.saldo = saldo;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public double getSaldo() {
        return saldo;
    }

    protected void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public abstract void saque(double valor);


    public void deposito(double valor){
        if(valor <= 0){
            System.err.println("Impossível depositar valor negativo");
        }else{
            saldo += valor;
        }
    }

}
