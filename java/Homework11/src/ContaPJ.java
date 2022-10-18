public class ContaPJ extends Conta{
    public ContaPJ(String numero, String agencia, double saldo) {
        super(numero, agencia, saldo);
    }

    private String razaoSocial, cnpj;

    public ContaPJ(String numero, String agencia, double saldo, String razaoSocial, String cnpj) {
        super(numero, agencia, saldo);
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}
