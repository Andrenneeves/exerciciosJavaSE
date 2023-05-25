import java.util.Scanner;

public class Veiculo {

    //criando a classe veiculo
    private String modelo;
    private String cor;
    private int ano;

    //Constructors
    public Veiculo() {}
    public Veiculo(String modelo, String cor, int ano) {
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
    }

    public static Veiculo cadastra(){
        Scanner leia = new Scanner(System.in);
        Veiculo v = new Veiculo();

        System.out.print("Modelo do Veículo: ");
        v.setModelo(leia.nextLine());

        System.out.print("Cor: ");
        v.setCor(leia.nextLine());

        System.out.print("Ano: ");
        v.setAno(leia.nextInt());

        while(0==0){
            Scanner read = new Scanner(System.in);
            System.out.println("Deseja continuar Cadastrando?");
            System.out.println("SIM\t NÃO");
            System.out.print("Opção: ");

            if(read.nextInt() == 2) break;


    }
        return v;
    }

    public void imprime(){
        for (Veiculo v : veiculosList) {
            System.out.println("\n\nCadastrados\n\n");
            System.out.println("-------------");
            System.out.println("Nome: " + v.getModelo());
            System.out.println("Cor: " + v.getCor());
            System.out.println("Ano: " + v.getAno());
        }
    }

    //Getter e Setter
    public String getModelo() {return modelo;}

    public void setModelo(String modelo) {this.modelo = modelo;}

    public String getCor() {return cor;}

    public void setCor(String cor) {this.cor = cor;}

    public int getAno() {return ano;}

    public void setAno(int ano) {this.ano = ano;}


}

