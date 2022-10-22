package uade.edu.ar.model;

import java.util.ArrayList;
import java.util.List;

public class Practica {

    private String id;
    private  String nombre;
    private int duracion;
    private String grupo;
    private Boolean habilitada;
    private List<ItemPractica> itemsPracticaList = null;
    private List<ResultadoPractica> resultadosPracticaList = null;

    public Practica() {
    }

    public Practica(String id, String nombre, int duracion, String grupo, Boolean habilitada) {
        this.id = id;
        this.nombre = nombre;
        this.duracion = duracion;
        this.grupo = grupo;
        this.habilitada = habilitada;
        this.itemsPracticaList = new ArrayList<>(); //Metodo composicion
        this.resultadosPracticaList = new ArrayList<>(); //Metodo composicion
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public Boolean getHabilitada() {
        return habilitada;
    }

    public void setHabilitada(Boolean habilitada) {
        this.habilitada = habilitada;
    }

    @Override
    public String toString() {
        return "Model{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", duracion='" + duracion + '\'' +
                ", grupo='" + grupo + '\'' +
                ", habilitada='" + habilitada + '\'' +
                '}';
    }


}
