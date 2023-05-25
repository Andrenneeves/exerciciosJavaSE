package controllers;

import models.Aluno;
import models.Professor;
import services.BD;
import services.Receber;

import java.sql.*;
import java.util.ArrayList;

public class ProfessorController {

    public static void insert(Professor p){
        Connection conn = BD.conectar();

        try{
            String sql = "INSERT INTO professores (nome, telefone)" +
                         "VALUES (?,?)";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1,p.getNome());
            statement.setString(2, p.getTelefone());

            if (statement.executeUpdate() > 0)
                System.out.println("\n\nProfessor CADASTRADO!\n");

        } catch (SQLException e) {
            System.err.println(e);
        }
        BD.fechar(conn);
    }

    public static Professor cadastrar(){
        Professor p = new Professor();

        System.out.print("Nome: ");
        p.setNome(Receber.texto());

        System.out.print("Telefone: ");
        p.setTelefone(Receber.texto());
        return p;
    }

    public static void imprime(Professor a){
        System.out.println("Nome: " + a.getNome());
        System.out.println("Telefone: " + a.getTelefone());
    }

    public static ArrayList<Professor> getAll(){
        Connection conn = BD.conectar();
        ArrayList<Professor> lista = new ArrayList<Professor>();
        try{
            String sql = "SELECT * FROM professores";
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
