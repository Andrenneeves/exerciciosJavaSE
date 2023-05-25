package controllers;

import models.Aluno;
import services.BD;
import services.Receber;

import java.sql.*;
import java.util.ArrayList;

public class AlunoController {

    public static void insert(Aluno a){
        Connection conn = BD.conectar();

        try{
            String sql = "INSERT INTO aluno (nome,idade, genero)" +
                         "VALUES (?,?,?)";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1,a.getNome());
            statement.setInt(2,a.getIdade());
            statement.setString(3, a.getGenero());

            if (statement.executeUpdate() > 0)
                System.out.println("\n\nALUNO CADASTRADO!\n");

        } catch (SQLException e) {
            System.err.println(e);
        }
        BD.fechar(conn);
    }

    public static Aluno cadastrar(){
        Aluno a = new Aluno();

        System.out.print("Nome: ");
        a.setNome(Receber.texto());

        System.out.print("Idade: ");
        a.setIdade(Receber.numeroInteiro());

        System.out.print("Gênero: ");
        a.setGenero(Receber.texto());
        return a;
    }

    public static void imprime(Aluno a){
        System.out.println("Nome: " + a.getNome());
        System.out.println("Idade: " + a.getIdade());
        System.out.println("Gênero: " + a.getGenero());
    }

    public static ArrayList<Aluno> getAll(){
        Connection conn = BD.conectar();
        ArrayList<Aluno> lista = new ArrayList<Aluno>();
        try{
            String sql = "SELECT * FROM aluno";
            Statement statement = conn.createStatement();

            ResultSet resultado = statement.executeQuery(sql);

            while(resultado.next()){
                lista.add(new Aluno(
                        resultado.getInt("id"),
                        resultado.getString("nome"),
                        resultado.getInt("idade"),
                        resultado.getString("genero")
                ));
            }
        } catch (SQLException e) {
            System.err.println(e);
        }

        BD.fechar(conn);
        return lista;
    }
}
