import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        // Colocando o Scanner para receber os dados no console
        Scanner leia = new Scanner(System.in);
        //Declarando os tipos de variáveis
        String modelo = "";
        String fabricante;
        String cor;
        int ano;
        double preco;

        //Mensagem que vai ser mostrada no console para entrar as informações
        System.out.print("Modelo: ");
        //Entrar a informação
        fabricante = leia.nextLine();
        System.out.print("Fabricante: ");
        //Entrar a informação
        fabricante = leia.nextLine();
       System.out.print("Cor: ");
       cor = leia.nextLine();
       System.out.print("Ano:");
       //Ano coloca-se nextInt por causa do numero inteiro
       ano = leia.nextInt();
       System.out.print("Preço: ");
       //No preço coloca nextdouble pq o tipo do preço é Double
       preco = leia.nextDouble();

       // preciso declarar os veiculos. Criar a classe de veiculo antes

        Veiculos vei1 = new Veiculos(modelo, fabricante, cor, ano, preco);

        leia.nextLine();//limpar o buffer do teclado

        System.out.print("Modelo: ");
        modelo = leia.nextLine();
        System.out.print("Fabricante: ");
        fabricante = leia.nextLine();
        System.out.print("Cor: ");
        cor = leia.nextLine();
        System.out.print("Preço: ");
        preco = leia.nextDouble();
        System.out.print("Ano: ");
        ano = leia.nextInt();

        Veiculos vei2 = new Veiculos(modelo,fabricante,cor,ano,preco);

        leia.nextLine();
        System.out.print("Modelo: ");
        modelo = leia.nextLine();
        System.out.print("Fabricante: ");
        fabricante = leia.nextLine();
        System.out.print("Cor: ");
        cor = leia.nextLine();
        System.out.print("Preço: ");
        preco = leia.nextDouble();
        System.out.print("Ano: ");
        ano = leia.nextInt();

        Veiculos vei3 = new Veiculos(modelo,fabricante,cor,ano,preco);

        System.out.println("Nossos veículos");
        vei1.imprime();
        System.out.println("                    ");
        vei2.imprime();
        System.out.println("                    ");
        vei3.imprime();
    }

}