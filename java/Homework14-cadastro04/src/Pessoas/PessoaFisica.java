package Pessoas;

public class PessoaFisica {
    private String nome;
    private String cpf;
    private String genero;

    PessoaFisica(){}

    public PessoaFisica(String nome, String cpf, String genero) {
        this.nome = nome;
        this.cpf = cpf;
        this.genero = genero;
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

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
