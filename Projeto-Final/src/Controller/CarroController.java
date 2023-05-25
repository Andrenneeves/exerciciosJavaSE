package Controller;
import Model.Carro;
import Servicos.BD;

import java.sql.*;
import java.util.ArrayList;

public class CarroController {

    public static void insert(Carro c){
        Connection conn = BD.conectar();

        try{
            String sql = "INSERT INTO carro (marca, modelo, placa)" +
                         "VALUES (?,?,?)";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, c.getMarca());
            statement.setString(2, c.getModelo());
            statement.setString(3, c.getPlaca());
            //criar modal com mensagem
            if (statement.executeUpdate() > 0)
                System.out.println("\n\nCADASTRADO!\n");
           //Criar Modal com mensagem de erro
        } catch (SQLException e) {
            System.err.println(e);
        }
        BD.fechar(conn);
    }



    public static ArrayList<Carro> getAll(){
        Connection conn = BD.conectar();
        ArrayList<Carro> lista = new ArrayList<Carro>();
        try{
            String sql = "SELECT * FROM carro";
            Statement statement = conn.createStatement();

            ResultSet resultado = statement.executeQuery(sql);

            while(resultado.next()){
                lista.add(new Carro(
                        resultado.getInt("id"),
                        resultado.getString("marca"),
                        resultado.getString("modelo"),
                        resultado.getString("placa")
                ));
            }

        } catch (SQLException e) {
            System.err.println(e);
        }

        BD.fechar(conn);
        return lista;
    }
}
