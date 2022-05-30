package Conexiones;

import java.sql.*;
import javax.swing.JOptionPane;

public class Conexion1 {

  public static void main(String[] args) {
    String conectorJDBC = "com.mysql.cj.jdbc.Driver";
    String baseDatos = "instituto";
    String servidor = "localhost";
    String puerto = "3306";
    String url = "jdbc:mysql://" + servidor + ":" + puerto + "/" + baseDatos + "?useSSLfalse";
    String usuario = "root";
    String password = "";

    try {
      Class.forName(conectorJDBC);
      Connection miConexion = DriverManager.getConnection(url, usuario, password);

      String sms = "Conexion conseguida!!";
      JOptionPane.showMessageDialog(null, sms);
      System.out.println(sms);
    } catch(SQLException | ClassNotFoundException e) {
      JOptionPane.showMessageDialog(null, e);
      System.out.println("Fallo de conexion!!");
    }
  }
}
