

import java.util.Scanner;

public class Paciente {
    //Criando a classe paciente para cadastrar
    private String nome;
    private double peso;
    private double altura;


    public Paciente() {}

    public Paciente(String nome, int peso, double altura) {
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
    }


    public static Paciente cadastra(){
        Paciente p = new Paciente();
        Scanner read = new Scanner(System.in);

        System.out.print("Nome Completo: ");
        p.setNome(read.nextLine());

        System.out.println("Altura - (m): ");
        p.setAltura(read.nextDouble());

        System.out.print("Peso - (Kg): ");
        p.setPeso(read.nextDouble());

        if(p.getAltura() >= 100) p.setAltura(p.getAltura()/100);

        return p;
    }

    public double getImc(){
        return this.getPeso()/(Math.pow(this.getAltura(),2));
    }

    public void imprime(){
        System.out.println("Nome: "         + this.getNome());
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