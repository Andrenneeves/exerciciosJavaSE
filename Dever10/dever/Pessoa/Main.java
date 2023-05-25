package dever.Pessoa;

import dever.Pessoa.PessoaFisica;
import dever.Pessoa.PessoaJuridica;

public class Main {
    public static void main(String[] args) {
        PessoaFisica pf = new PessoaFisica("Juca Bala","Rua dos Bobos,0",
                                           "21 98171-9651","987654",
                                        "123456789-12","18/10/2008");

        PessoaJuridica pj = new PessoaJuridica("Dois Irmãos Materiais de Construção",
                                                "Rua das Flores",
                                                "21 2569-6969",
                                                "123.45678/0001-15",
                                                "MP Mat LTDA");

    }
}
