package tema;


import java.sql.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/javaloja";
        String user = "root";
        String pass = "";

        try{
            Connection conn = DriverManager.getConnection(url,user,pass);

            System.out.println("CONECTADO AO BANCO!");

            String sql = "INSERT INTO produto (nome,fabricante,preco) values (?,?,?)";
            PreparedStatement statement = conn.prepareStatement(sql);

            Produto p = new Produto();
            Scanner leia = new Scanner(System.in);

            System.out.print("Nome: ");
            p.setNome(leia.nextLine());

            System.out.print("Fabricante: ");
            p.setFabricante(leia.nextLine());

            System.out.print("Preço: R$ ");
            p.setPreco(leia.nextDouble());

            statement.setString(1,p.getNome());
            statement.setString(2,p.getFabricante());
            statement.setDouble(3,p.getPreco());

            int linhas = statement.executeUpdate();

            if(linhas > 0){
                System.out.println("Produto Cadastrado Com Sucesso!");
            } else {
                System.out.println("FALHA AO CADASTRAR O PRODUTO!");
            }
            conn.close();
            statement.close();
        } catch (SQLException e) {
            System.err.println(e);
        }

        try{
            Connection conn = DriverManager.getConnection(url,user,pass);

            System.out.println("CONECTADO AO BANCO!");

            Statement statement = conn.createStatement();
            String sql = "SELECT * FROM produto";

            ResultSet resultado = statement.executeQuery(sql);

            while(resultado.next()){
                System.out.println("ID: " + resultado.getInt("id"));
                System.out.println("Nome: " + resultado.getString("nome"));
                System.out.println("Fabricante: " + resultado.getString("fabricante"));
                System.out.println("Preço: " + resultado.getDouble("preco"));
                System.out.println("-------------------------------------");
            }

            statement.close();
            conn.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}
