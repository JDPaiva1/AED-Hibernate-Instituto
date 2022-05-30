package conexionHibernate;

import java.sql.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class InsertarAlumno {

  public static void main(String[] args) {
    SessionFactory myFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Alumno.class).buildSessionFactory();
    Session mySession = myFactory.openSession();

    try {
      Date date = new Date(System.currentTimeMillis());
      Alumno alumno1 = new Alumno("Jose", "Lopez", "Gonzales", date, false, "123123123");
      mySession.beginTransaction();
      mySession.save(alumno1);
      mySession.getTransaction().commit();
      System.out.println("Registro insertado... ");
      mySession.close();
    } finally {
      myFactory.close();
    }
  }
}
