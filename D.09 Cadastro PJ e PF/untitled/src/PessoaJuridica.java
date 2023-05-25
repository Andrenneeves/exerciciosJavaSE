import java.util.Scanner;

    public class PessoaJuridica extends Pessoa {
        private String cnpj;
        private String razaoSocial;


        public PessoaJuridica(){}

        public PessoaJuridica(String cnpj, String razaoSocial) {
            this.cnpj = cnpj;
            this.razaoSocial = razaoSocial;
        }


        public String getCnpj() {return cnpj;}
        public void setCnpj(String cnpj) {this.cnpj = cnpj;}

        public String getRazaoSocial() {return razaoSocial;}

        public void setRazaoSocial(String razaoSocial) {this.razaoSocial = razaoSocial;}

        @Override
        public String dadosToString(){
            String dados;

            dados = super.dadosToString() +
                    "\nCNPJ: " + this.cnpj +
                    "\nRazão Social: " + this.razaoSocial;

            return dados;
        }



        public static PessoaJuridica cadastraPJ(){
            PessoaJuridica pj = new PessoaJuridica();
            Scanner sc = new Scanner(System.in);
            System.out.println("\n---------------------");
            System.out.println("Cadastro de Pessoa Jurídica.");
            System.out.println("---------------------");

            System.out.print("\nNome: ");
            pj.setNome(sc.nextLine());

            System.out.print("Endereço: ");
            pj.setEndereco(sc.nextLine());

            System.out.print("Telefone: ");
            pj.setTelefone(sc.nextLine());

            System.out.println("CNPJ: ");
            pj.setCnpj(sc.nextLine());

            System.out.println("Razão Social: ");
            pj.setRazaoSocial(sc.nextLine());

            System.out.println("\nCadastro realizado com Sucesso!!");

            return pj;
        }

        @Override
        public void imprime(){
            super.imprime();
            System.out.println("\nCNPJ: " + cnpj);
            System.out.println("Razão Social: " + razaoSocial);
        }
    }

