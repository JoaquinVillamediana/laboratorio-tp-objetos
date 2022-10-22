package uade.edu.ar.model;

import java.util.Date;

public class Usuario {

    private String id;
    private String nombreUsuario;
    private String email;
    private String password;
    private String nombre;
    private String domicilio;
    private int dni;
    private Date fechaNacimiento;
    private RolesUsuarios tipo;

    public Usuario() {
    }

    public Usuario(String id, String nombreUsuario, String email, String password, String nombre, String domicilio, int dni, Date fechaNacimiento, RolesUsuarios tipo) {
        this.id = id;
        this.nombreUsuario = nombreUsuario;
        this.email = email;
        this.password = password;
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.dni = dni;
        this.fechaNacimiento = fechaNacimiento;
        this.tipo = tipo;
    }

    public String getId() {
        return id;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public int getDni() {
        return dni;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public RolesUsuarios getTipo() {
        return tipo;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setTipo(RolesUsuarios tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Model{" +
                "id='" + id + '\'' +
                ", nombreUsuario='" + nombreUsuario + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", nombre='" + nombre + '\'' +
                ", domicilio='" + domicilio + '\'' +
                ", dni='" + dni + '\'' +
                ", fechaNacimiento='" + fechaNacimiento + '\'' +
                '}';
    }


}
