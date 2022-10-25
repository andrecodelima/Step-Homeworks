public class Pessoa {

   private String nome, genero, telefone;
   private int idade;

    public Pessoa(String nome, String genero, String telefone, int idade) {
        this.nome = nome;
        this.genero = genero;
        this.telefone = telefone;
        this.idade = idade;
    }

    public Pessoa(){

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

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

}
