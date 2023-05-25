
import java.util.Scanner;

    public abstract class Pessoa {
        private String nome, endereco, telefone;

        public Pessoa() {}

        public Pessoa(String nome, String endereco, String telefone) {
            this.nome = nome;
            this.endereco = endereco;
            this.telefone = telefone;
        }

        public String getNome() {return nome;}
        public void setNome(String nome) {this.nome = nome;}

        public String getEndereco() {return endereco;}
        public void setEndereco(String endereco) {this.endereco = endereco;}

        public String getTelefone() {return telefone;}
        public void setTelefone(String telefone) {this.telefone = telefone;}

        public String dadosToString(){
            String dados;

            dados = "\nNome: " + this.nome +
                    "\nEndereço: " + this.endereco +
                    "\nTelefone: " + this.telefone;

            return dados;
        }

        public void imprime(){
            System.out.println("\nNome: " + nome);
            System.out.println("Endereço: " + endereco);
            System.out.println("Tel: " + telefone);
        }
    }

