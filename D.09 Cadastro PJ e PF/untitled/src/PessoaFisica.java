

import java.util.Scanner;

public class PessoaFisica extends Pessoa{
    private String rg;
    private String cpf;
    private String nascimento;

    // Construtores -----------------------------

    public PessoaFisica() {}

    public PessoaFisica(String nome, String endereco, String telefone, String rg, String cpf, String nascimento) {
        super(nome, endereco, telefone);
        this.rg = rg;
        this.cpf = cpf;
        this.nascimento = nascimento;
    }

    // Getters e Setters ------------------------

    public String getRg() {return rg;}
    public void setRg(String rg) {this.rg = rg;}

    public String getCpf() {return cpf;}
    public void setCpf(String cpf) {this.cpf = cpf;}

    public String getNascimento() {return nascimento;}
    public void setNascimento(String nascimento) {this.nascimento = nascimento;}

    @Override
    public String dadosToString(){
        String dados;

        dados = super.dadosToString() +
                "\nRG: " + this.rg +
                "\nCPF: " + this.cpf +
                "\nNascimento: " + this.nascimento;

        return dados;
    }

    public static PessoaFisica cadastraPF(){
        PessoaFisica pf = new PessoaFisica();
        Scanner sc = new Scanner(System.in);

        System.out.println("\n---------------------");
        System.out.println("Cadastro de Pessoa Física.");
        System.out.println("---------------------");

        System.out.print("\nNome: ");
        pf.setNome(sc.nextLine());

        System.out.print("Endereço: ");
        pf.setEndereco(sc.nextLine());

        System.out.print("Telefone: ");
        pf.setTelefone(sc.nextLine());

        System.out.println("RG: ");
        pf.setRg(sc.nextLine());

        System.out.println("CPF: ");
        pf.setCpf(sc.nextLine());

        System.out.println("Nascimento: ");
        pf.setNascimento(sc.nextLine());

        System.out.println("\nCadastro realizado com Sucesso!!");

        return pf;
    }

    @Override
    public void imprime() {
        super.imprime();
        System.out.println("\nRG: " + this.rg);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Nascimento: " + this.nascimento);
    }
}
