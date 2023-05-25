package dever.Pessoa;

public class PessoaFisica extends Pessoa {
    private String rg;
    private String cpf;
    private String nascimento;

    public PessoaFisica() {}

    public PessoaFisica(String nome, String endereco, String telefone, String rg, String cpf, String nascimento) {
        super(nome, endereco, telefone);
        this.rg = rg;
        this.cpf = cpf;
        this.nascimento = nascimento;
    }

    @Override
    public void imprime() {
        super.imprime();
        System.out.println("RG: " + this.rg);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Nascimento: " + this.nascimento);
    }
}
