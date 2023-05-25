package dever;

import java.util.Scanner;

public class Voluntario {
    private String nome;
    private int idade;
    private double peso;
    private double altura;

    public Voluntario() {}

    public Voluntario(String nome, int idade, double peso, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }

    public static Voluntario cadastra(){
        Voluntario v = new Voluntario();
        Scanner read = new Scanner(System.in);

        System.out.print("Nome Completo: ");
        v.setNome(read.nextLine());

        System.out.print("Idade: ");
        v.setIdade(read.nextInt());

        System.out.println("Altura (m): ");
        v.setAltura(read.nextDouble());

        System.out.print("Peso (Kg): ");
        v.setPeso(read.nextDouble());

        if(v.getAltura() >= 100) v.setAltura(v.getAltura()/100);

        return v;
    }

    public double getImc(){
        return this.getPeso()/(Math.pow(this.getAltura(),2));
    }

    public void imprime(){
        System.out.println("Nome: "         + this.getNome());
        System.out.println("Idade: "        + this.getIdade());
        System.out.println("Peso (kg): "    + this.getPeso());
        System.out.println("Altura (m): "   + this.getAltura());
        System.out.println("IMC: "          + this.getImc());
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

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
