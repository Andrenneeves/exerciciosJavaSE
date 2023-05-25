package controllers;

import models.Aluno;
import models.Professor;
import services.BD;
import services.Receber;

import java.sql.*;
import java.util.ArrayList;

public class ProfessorController {

    public static void insert(Professor a){
        Connection conn = BD.conectar();

        try{
            String sql = "INSERT INTO professor (nome,telefone)" +
                         "VALUES (?,?)";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1,a.getNome());
            statement.setString(2,a.getTelefone());

            if (statement.executeUpdate() > 0)
                System.out.println("\n\nPROFESSOR CADASTRADO!\n");

        } catch (SQLException e) {
            System.err.println(e);
        }
        BD.fechar(conn);
    }

    public static void delete(int id){
        Connection conn = BD.conectar();

        try{
            String sql = "DELETE FROM professor WHERE id = " + id;
            PreparedStatement statement = conn.prepareStatement(sql);

            if (statement.executeUpdate() > 0)
                System.out.println("\n\nPROFESSOR DELETADO!\n");

        } catch (SQLException e) {
            System.err.println(e);
        }
        BD.fechar(conn);
    }
    public static void update(Professor p){
        Connection conn = BD.conectar();

        try{
            String sql = "UPDATE professor" +
                            "SET nome =  ? , "+
                            "telefone = ? " +
                        "WHERE id = ?";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1,p.getNome());
            statement.setString(2,p.getTelefone());
            statement.setInt(3,p.getId());

            if (statement.executeUpdate() > 0)
                System.out.println("\n\nPROFESSOR ATUALIZADO!\n");

        } catch (SQLException e) {
            System.err.println(e);
        }
        BD.fechar(conn);
    }
    public static Professor cadastrar(){
        Professor a = new Professor();

        System.out.print("Nome: ");
        a.setNome(Receber.texto());

        System.out.print("Telefone: ");
        a.setTelefone(Receber.texto());
        return a;
    }

    public static void imprime(Professor a){
        System.out.println("ID: "+ a.getId());
        System.out.println("Nome: " + a.getNome());
        System.out.println("Telefone: " + a.getTelefone());
    }

    public static ArrayList<Professor> getAll(){
        Connection conn = BD.conectar();
        ArrayList<Professor> lista = new ArrayList<Professor>();
        try{
            String sql = "SELECT * FROM professor";
            Statement statement = conn.createStatement();

            ResultSet resultado = statement.executeQuery(sql);

            while(resultado.next()){
                lista.add(new Professor(
                        resultado.getInt("id"),
                        resultado.getString("nome"),
                        resultado.getString("telefone")
                ));
            }
        } catch (SQLException e) {
            System.err.println(e);
        }

        BD.fechar(conn);
        return lista;
    }
}
