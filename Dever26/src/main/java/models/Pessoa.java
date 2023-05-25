package models;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aluno
 */
public class Pessoa {
    private String nome,idade,genero;
    
    public Pessoa(){}
    public Pessoa(String nome, String idade, String genero){
        this.nome = nome;
        this.idade = idade;
        this.genero = genero;
    }

    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}

    public String getIdade() {return idade;}
    public void setIdade(String idade) {this.idade = idade;}

    public String getGenero() {return genero;}
    public void setGenero(String genero) {this.genero = genero;}
}
