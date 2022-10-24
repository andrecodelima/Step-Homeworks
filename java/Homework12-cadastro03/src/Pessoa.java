public class Pessoa {

    private String nome, genero, telefone, endereço;
    private int idade;

    public Pessoa(String nome, String genero, String telefone, String endereco, int idade) {
        this.nome = nome;
        this.genero = genero;
        this.telefone = telefone;
        this.endereço = endereco;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereço;
    }

    public void setEndereco(String endereco) {
        this.endereço = endereço;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
