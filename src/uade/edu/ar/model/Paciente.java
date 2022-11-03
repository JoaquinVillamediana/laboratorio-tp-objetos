package uade.edu.ar.model;

import uade.edu.ar.dao.PacienteDao;
import uade.edu.ar.dao.PeticionDao;

import java.io.File;
import java.util.List;

public class Paciente {

    private int id;
    private  int dni;
    private String nombre;
    private String domicilio;
    private String email;
    private int edad;

    public Paciente() {
    }

    public Paciente(int id, int dni, String nombre, String domicilio, String email, int edad) {
        this.id = id;
        this.dni = dni;
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.email = email;
        this.edad = edad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Boolean tienePeticionesFinalizadas()
    {
        //try {
        //    PeticionDao peticionDao = new PeticionDao(Peticion.class,getPathOutModel(Peticion.class.getSimpleName()));
        //    List<Peticion> peticionList = peticionDao.getAll(Peticion.class);
        //} catch (Exception e) {
        //    throw new RuntimeException(e);
        //}

        return false;
    }

    private static String getPathOutModel(String name){
        String dir = "D:/Escritorio/Facu/POO/TPO/data";
        return  new File(dir+name+".json").getPath();
    }

    @Override
    public String toString() {
        return "Model{" +
                "id='" + id + '\'' +
                ", dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", domicilio='" + domicilio + '\'' +
                ", email='" + email + '\'' +
                ", edad='" + edad + '\'' +
                '}';
    }


}
