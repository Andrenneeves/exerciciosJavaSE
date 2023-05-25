package models;

public class Aluno {

    private int id;
    private String nome;
    private int idade;
    private String genero;

    public Aluno() {}

    public Aluno(int id, String nome, int idade, String genero) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.genero = genero;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
