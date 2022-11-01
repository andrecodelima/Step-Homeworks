package Contas;

public abstract class Conta { // Classe que não pode ser instanciada.
    //Seu papel é servir de base para as outras.



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
    //Por causa da regra de negocio que estabelece que por medidas de segurança não
    // se deve alterar o saldo diretamente, sem ser por saque ou depósito,
    // alteramos o modificador de public para protected.



    public abstract void saque(double valor);
    //Como o método é abstrato não há corpo dele, por isso o " ; ".
    //Método abstrato é declarado sem corpo ( "{}" ),
    //Sendo obrigatório implementar o corpo do método nas subclasses.

    public void deposito(double valor){
        if(valor <= 0){
            System.err.println("Impossível depositar valor negativo");
        }else{
            saldo += valor;
        }
    }

}
