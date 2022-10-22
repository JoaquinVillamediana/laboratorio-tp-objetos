package uade.edu.ar.model;

import java.util.List;

public class Sucursal {

    private String id;
    private  String direccion;
    private List<Usuario> usuarios;
    private List<Peticion> peticiones;

    public Sucursal() {
    }

    public Sucursal(String id, String direccion) {
        this.id = id;
        this.direccion = direccion;
    }

    public String getId() {
        return id;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Model{" +
                "id='" + id + '\'' +
                ", direccion='" + direccion + '\'' +
                '}';
    }


}
