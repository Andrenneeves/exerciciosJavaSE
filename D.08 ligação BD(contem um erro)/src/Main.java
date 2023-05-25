import java.sql.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        //Conectando o java ao servidor

        String url = "jdbc:mysql://localhost:3306/cadimia";
        String user = "root";
        String pass = "";

        // INICIO DO CODIGO DE CADASTRO DE ALUNOS
        // Usando o try para fazer a tentativa de comunicação do banco de dados
         try {

             //Fazendo a conexão

             Connection cnx = DriverManager.getConnection(url,user,pass);

             //Mensagem informando que o banco de dados foi conectado

             System.out.println("Conectado com sucesso");

             //Não lembro o que é, mas creio que seja para conectar a tabela e inserir o cadastro
             // Os pontos de interrogações são para deixar "aberto" os valores a serem inseridos
             String sql = "INSERT INTO cadimia alunos (nome,idade,genero) values (?,?,?)";
             PreparedStatement statement = cnx.prepareStatement(sql);

             //Criando o Aluno

             Aluno a = new Aluno();
             Scanner leia = new Scanner(System.in);


             // Entrando as informações dos alunos

             System.out.print("Nome: ");
             a.setNome(leia.nextLine());

             System.out.print("Idade: ");
             a.setIdade(leia.nextInt());

             System.out.print("Gênero: R$ ");
             a.setGenero(leia.nextLine());


             statement.setString(1,a.getNome());
             statement.setInt(2,a.getIdade());
             statement.setString(3,a.getGenero());

             //É necessário um método caso o aluno não seja cadastrado
             //Atribuindo o update do statement que verifica novas linhas, a uma variavel
             int linhas = statement.executeUpdate();

             if (linhas > 0) {
                 //mensagem que foi cadastrado com sucesso
                 System.out.println("Aluno cadastrado com sucesso.");
             } else {
                 //Mensagem de erro no cadastro
                 System.out.println("Erro ao cadastrar alunos");
             }
             //ATENÇÃO!!!! SEMPRE É NECESSARIO FECHAR A CONEXÃO, CASO CONTRÁRIO PODE HAVER INVASÕES E BUGS
             cnx.close();
             statement.close();
         } catch (SQLException e){
             System.err.println(e);
         }
        // FIM DO CÓDIGO DE CADASTRO DE ALUNOS

        //INICIO DO CODIGO PARA EXIBIR OS ALUNOS

        try{
            //Conectando no banco
            Connection cnx = DriverManager.getConnection(url,user,pass);
            System.out.println("Conectado ao banco de dados");

            //Não lembro disso, lembrar de perguntar ao professor
            Statement statement = cnx.createStatement();

            //Comando do banco de dados
            String sql = "SELECT * FROM aluno";
            ResultSet resultado = statement.executeQuery(sql);

            // Colocando os resultados na tela
            while (resultado.next()){
                System.out.println("Id: " + resultado.getInt("id"));
                System.out.println("Nome: " + resultado.getString("nome"));
                System.out.println("idade: " + resultado.getInt("idade"));
                System.out.println("Gênero: " + resultado.getString("Genero"));
                System.out.println("*****************************************************");
            }

            //NUNCA ESQUECER DE FECHAR AS LIGAÇÕES COM O BD
            statement.close();
            cnx.close();
        } catch (SQLException e){
            System.out.println(e);
        }
    }
}