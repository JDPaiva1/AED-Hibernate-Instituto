package conexionHibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ConsultarAlumno {

  public static void main(String[] args) {
    SessionFactory myFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Alumno.class).buildSessionFactory();
    Session mySession = myFactory.openSession();

    try {
      mySession.beginTransaction();

      List<Alumno> Alumnos = mySession.createQuery("from Alumno").getResultList();
      for(Alumno unAlumno: Alumnos) {
        System.out.println(unAlumno);
      }
      // Consulta con criterios
      Alumnos = mySession.createQuery("from Alumno where idAlumno = 3").getResultList();
      for(Alumno unAlumno: Alumnos) {
        System.out.println(unAlumno);
      }

      mySession.getTransaction().commit();
      mySession.close();
    } finally {
      myFactory.close();
    }

  }

}
