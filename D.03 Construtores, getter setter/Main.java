import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner leia = new Scanner(System.in);
                //Declarando as variáveis
        String nome;
        String fabricante;
        int codBarra;
        double preco;

        System.out.print("Entre com nome do produto 1: ");
        nome = leia.nextLine();

        System.out.print("Entre com fabricante: ");
        fabricante = leia.nextLine();

        System.out.print("Entre com código de Barras: ");
        codBarra = leia.nextInt();

        System.out.print("Entre com preço: ");
        preco = leia.nextDouble();

        Produto prod1 = new Produto(nome, fabricante, codBarra, preco);

        System.out.println("===============================");
        leia.nextLine();

        System.out.print("Entre com nome do produto 2: ");
        nome = leia.nextLine();

        System.out.print("Entre com fabricante: ");
        fabricante = leia.nextLine();

        System.out.print("Entre com código de Barras: ");
        codBarra = leia.nextInt();

        System.out.print("Entre com preço: ");
        preco = leia.nextDouble();

        Produto prod2 = new Produto(nome, fabricante, codBarra, preco);


        System.out.println("===============================");
        leia.nextLine();

        System.out.print("Entre com nome do produto 3: ");
        nome = leia.nextLine();

        System.out.print("Entre com fabricante: ");
        fabricante = leia.nextLine();

        System.out.print("Entre com código de Barras: ");
        codBarra = leia.nextInt();

        System.out.print("Entre com preço: ");
        preco = leia.nextDouble();

        Produto prod3 = new Produto(nome, fabricante, codBarra, preco);

        System.out.println("=========================");

        System.out.println("Produtos Cadastrados");

        prod1.impressao();
        System.out.println("----------------");

        prod2.impressao();
        System.out.println("----------------");

        prod3.impressao();
        System.out.println("----------------");
    }




    }
