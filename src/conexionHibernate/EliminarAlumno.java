package conexionHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class EliminarAlumno {

  public static void main(String[] args) {
    SessionFactory myFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Alumno.class).buildSessionFactory();
    Session mySession = myFactory.openSession();

    try {
      mySession.beginTransaction();

      mySession.createQuery("delete from Alumno where idAlumno = 11").executeUpdate();

      mySession.getTransaction().commit();
      mySession.close();
    } finally {
      myFactory.close();
    }
  }

}
