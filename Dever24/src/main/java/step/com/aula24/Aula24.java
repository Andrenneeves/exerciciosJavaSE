package step.com.aula24;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Aula24 {

    public static void main(String[] args) throws IOException {
        String continuar = "s";
        ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
        
        while(!continuar.toLowerCase().equals("n")){
            Scanner leia =  new Scanner(System.in);
            
            System.out.print("Nome: ");
            String nome = leia.nextLine();
            
            System.out.print("Gênero: ");
            String genero = leia.nextLine();
            
            System.out.print("Idade: ");
            int idade = leia.nextInt();
            
            pessoas.add(new Pessoa(nome, genero, idade));
            
            leia.nextLine();//limpando buffer de teclado
            
            System.out.println("Deseja continuar? (S)sim (N)Não");
            continuar = leia.nextLine();
        }
        
        FileWriter arquivo =  new FileWriter("c:\\java\\saidas\\cadastro.txt");
        PrintWriter writer = new PrintWriter(arquivo);
        
        for(Pessoa p : pessoas){
            writer.println(p.nome + "#;#" + p.genero + "#;#" +  p.idade);
        }
        arquivo.close();
        
        ////LENDO O ARQUIVO NO CONSOLE
        
        FileReader arq = new FileReader("c:\\java\\saidas\\cadastro.txt");
        BufferedReader leitor = new BufferedReader(arq);
        
        String linha = leitor.readLine();
        
        while(linha != null){
            System.out.println("Nome: "     + linha.split("#;#")[0]);
            System.out.println("Gênero: "   + linha.split("#;#")[1]);
            System.out.println("Idade: "    + linha.split("#;#")[2]);
            System.out.println("======================================");
            
            linha = leitor.readLine();
        }
        arq.close();
    }
}

class Pessoa{
    String nome, genero;
    int idade;

    public Pessoa(String nome, String genero, int idade) {
        this.nome = nome;
        this.genero = genero;
        this.idade = idade;
    }
    
}

//Fazer esse cadastro com interface gráfica