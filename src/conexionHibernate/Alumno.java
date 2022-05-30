package conexionHibernate;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="alumno")
public class Alumno {
  @Id
  @Column(name="id_alumno")
  private int idAlumno;
  @Column(name="nombre")
  private String nombre;
  @Column(name="apellido1")
  private String apellido1;
  @Column(name="apellido2")
  private String apellido2;
  @Column(name="fecha_nacimiento")
  private Date fechaNacimiento;
  @Column(name="es_repetidor")
  private Boolean esRepetidor;
  @Column(name="telefono")
  private String telefono;

  public Alumno(String nombre, String apellido1, String apellido2, Date fechaNacimiento, Boolean esRepetidor, String telefono) {
    super();
    this.nombre = nombre;
    this.apellido1 = apellido1;
    this.apellido2 = apellido2;
    this.fechaNacimiento = fechaNacimiento;
    this.esRepetidor = esRepetidor;
    this.telefono = telefono;
  }
  public Alumno() {
    super();
  }

  public int getAlumno_id() {
    return idAlumno;
  }
  public void setAlumno_id(int idAlumno) {
    this.idAlumno = idAlumno;
  }

  public String getNombre() {
    return nombre;
  }
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getApellido1() {
    return apellido1;
  }
  public void setApellido1(String apellido1) {
    this.apellido1 = apellido1;
  }

  public String getApellido2() {
    return apellido2;
  }
  public void setApellido2(String apellido2) {
    this.apellido2 = apellido2;
  }

  public Boolean getEsRepetidor() {
    return esRepetidor;
  }
  public void setEsRepetidor(Boolean esRepetidor) {
    this.esRepetidor = esRepetidor;
  }

  public String getTelefono() {
    return telefono;
  }
  public void setTelefono(String telefono) {
    this.telefono = telefono;
  }

  @Override
  public String toString() {
    return "Alumno [idAlumno=" + idAlumno + ", nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2="
        + apellido2 + ", esRepetidor=" + esRepetidor + ", telefono=" + telefono + "]";
  }
}

