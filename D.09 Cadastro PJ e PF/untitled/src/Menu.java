
import java.util.ArrayList;
import java.util.Scanner;

    public class Menu {
        //Arrays list
        private static ArrayList<Pessoa> listaPF = new ArrayList();
        private static ArrayList<Pessoa> listaPj = new ArrayList();

        //Criando o Menu
        public static void menu() {
            listaMenu();
            while (true) {
                Scanner sc = new Scanner(System.in);
                String opcao = sc.nextLine();

                switch (opcao) {
                    case "1":
                        cadastrarPF();
                        break;

                    case "2":
                        consultarPF();
                        break;

                    case "3":
                        cadastrarPJ();
                        break;

                    case "4":
                        consultarPJ();
                        break;

                    case "0":
                        System.out.println("\nEncerrando Programa.");
                        System.exit(0);

                    default:
                        System.err.println("Opção Incorreta. Escolha um número de (0) e (4)");
                }
                listaMenu();
            }
        }
        public static void cadastrarPF(){
            listaPF.add(PessoaFisica.cadastraPF());
        }

        public static void cadastrarPJ(){ listaPJ.add(PessoaJuridica.cadastraPJ());}

        public static void consultarPF(){
            System.out.println("\n---------------------");
            System.out.println("Lista de Pessoas Físicas");
            for(Pessoa pf : listaPF){
                System.out.println(pf.dadosToString());
            }
            System.out.println("\n---------------------\n");
        }

        public static void consultarPJ(){
            System.out.println("\n---------------------");
            System.out.println("Lista de Pessoas Jurídicas");
            for(Pessoa pj : listaPJ){
                System.out.println(pj.dadosToString());
            }
            System.out.println("\n---------------------\n");
        }

        public static void listaMenu(){
            System.out.println("\n--------------- MENU ---------------");
            System.out.println("\n(1)Cadastrar Pessoa Física");
            System.out.println("(2)Consultar Pessoa Física");
            System.out.println("(3)Cadastrar Pessoa Jurídica");
            System.out.println("(4)Consultar Pessoa Jurídica");
            System.out.println("(0)Sair");
            System.out.print("\nEscolha uma opção: ");
        }
    }

