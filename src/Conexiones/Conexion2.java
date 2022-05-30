package Conexiones;

import java.sql.*;

public class Conexion2 {

  public static void main(String[] args) {
    String conectorJDBC = "com.mysql.cj.jdbc.Driver";
    String jdbcUrl = "jdbc:mysql://localhost:3306/instituto?useSSL=false";
    String user = "root";
    String password = "";

    try(Connection miConexion = DriverManager.getConnection(jdbcUrl, user, password)){
      System.out.println("Conectado a la base de datos");
    } catch(Exception e) {
      e.printStackTrace();
      System.out.println("Conexion fallida");
    }
  }
}
