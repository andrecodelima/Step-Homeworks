public class ContaPF extends Conta{

    public ContaPF(String numero, String agencia, double saldo) {
        super(numero, agencia, saldo);
    }

    private String nome, cpf;

    public ContaPF(String numero, String agencia, double saldo, String nome, String cpf) {
        super(numero, agencia, saldo);
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
