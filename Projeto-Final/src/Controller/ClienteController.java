package Controller;
import Model.Cliente;
import Servicos.BD;
import java.sql.*;
import java.util.ArrayList;

public class ClienteController {

    public static void insert(Cliente e){
        Connection conn = BD.conectar();

        try{
            String sql = "INSERT INTO clientes (nome, nascimento, cpf)" +
                         "VALUES (?,?,?)";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1,e.getNome());
            statement.setString(2,e.getNascimento());
            statement.setString(3, e.getCpf());

            //colocar modal com cliente cadastrado
            if (statement.executeUpdate() > 0)
                System.out.println("\n\nCADASTRADO!\n");
           //Colocar modal com erro
        } catch (SQLException b) {
            System.err.println(b);
        }
        BD.fechar(conn);
    }

    public static ArrayList<Cliente> getAll(){
        Connection conn = BD.conectar();
        ArrayList<Cliente> lista = new ArrayList<Cliente>();
        try{
            String sql = "SELECT * FROM clientes";
            Statement statement = conn.createStatement();

            ResultSet resultado = statement.executeQuery(sql);

            while(resultado.next()){
                lista.add(new Cliente(
                       resultado.getInt("id"),
                        resultado.getString("nome"),
                        resultado.getString("nascimento"),
                        resultado.getString("cpf")
                ));
            }
        } catch (SQLException e) {
            System.err.println(e);
        }

        BD.fechar(conn);
        return lista;
    }
}
