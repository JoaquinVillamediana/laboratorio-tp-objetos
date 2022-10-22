package uade.edu.ar.model;

public class ItemPractica {

    private String nombre;

    public ItemPractica() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Model{" +
                "nombre='" + nombre + '\'' +
                '}';
    }


}
