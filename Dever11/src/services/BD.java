package services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BD {
    public static Connection conectar(){
        String host = "jdbc:mysql://localhost:3306/cadimia";
        String user = "root";
        String pass = "";

        try{
            Connection conn = DriverManager.getConnection(host,user,pass);
            return conn;
        } catch (SQLException e) {
            System.err.println(e);
        }
        return null;
    }

    public static void fechar(Connection c){
        try{
            c.close();
        } catch (SQLException e) {
            System.err.println("Erro de comunicação: "+  e);
        }catch (Exception e){
            System.err.println("Erro desconhecido: " + e);
        }
    }
}
