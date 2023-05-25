/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package step.com.aula25.model;

/**
 *
 * @author Admin
 */
public class Pessoa {
    private String nome, genero;
    private int idade;

    public Pessoa(String nome, String genero, int idade) {
        this.nome = nome;
        this.genero = genero;
        this.idade = idade;
    }

    public Pessoa() {}

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

    public int getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = Integer.parseInt(idade);
    }
    
    
    
}
