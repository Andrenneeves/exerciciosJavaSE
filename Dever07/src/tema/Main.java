package tema;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Pessoa> pessoasList = new ArrayList<Pessoa>();

        pessoasList.add(Pessoa.cadastra());
        pessoasList.set(0,Pessoa.cadastra());

        ArrayList<String> frutas = new ArrayList<String>();
        frutas.add("Banana");
        frutas.add("Uva");
        System.out.println(frutas);

        frutas.set(0,"Melância");
        System.out.println(frutas);

        String [] frutas2 = new String[2];
        frutas2[0] = "Banana";
        frutas2[1] = "Uva";

        frutas2[0] = "Melância";

        pessoasList.get(0).imprime();

        while(0==0){
            Scanner leia = new Scanner(System.in);
            System.out.println("Deseja Cadastrar?");
            System.out.println("(1) SIM\t(2) NÃO");
            System.out.print("Opção: ");

            if(leia.nextInt() == 2) break;

            pessoasList.add(Pessoa.cadastra());
        }

        System.out.println("\n\nCadastrados\n\n");
        for(Pessoa p : pessoasList){
            p.imprime();
            System.out.println("----------------------------");

            System.out.println("Nome: " + p.getNome());
        }

    }
}

class Pessoa{
    private String nome;
    private int idade;

    public Pessoa() {}

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void imprime(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }

    public static Pessoa cadastra(){
        Scanner read = new Scanner(System.in);
        Pessoa p = new Pessoa();

        System.out.print("Nome: ");
        p.nome = read.nextLine();

        System.out.print("Idade: ");
        p.idade = read.nextInt();

        return p;
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
}