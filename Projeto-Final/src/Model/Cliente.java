package Model;

public class Cliente {
    private String nome;
    private String nascimento;
    private String cpf;

    public Cliente() {}

    public Cliente(String nome, String telefone, String nascimento, String cpf) {
        this.nome = nome;
        this.nascimento = nascimento;
        this.cpf = cpf;
    }

    public Cliente(String s, String s1, String s2) {

    }

    public Cliente(int id, String nome, String nascimento, String cpf) {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
