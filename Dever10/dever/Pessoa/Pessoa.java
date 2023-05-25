package dever.Pessoa;

public abstract class Pessoa {
    private String nome, endereco, telefone;

    public Pessoa() {}

    public Pessoa(String nome, String endereco, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public void imprime(){
        String dados = "Nome: " + this.nome +
                       "\nEndereço: " + this.endereco +
                       "\nTelefone: "  + this.telefone;
        System.out.println(dados);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
