package uade.edu.ar.model;

import java.util.Date;
import java.util.List;

public class Peticion {

    private String id;
    private Date fechaCarga;
    private Date fechaEntrega;
    private String obraSocial;
    private EstadoPeticion estado;
    private Sucursal sucursal;
    private List<Practica> practicas;
    private ResultadoPractica resultado;
    private Paciente paciente;

    public Peticion() {
    }

    public Peticion(String id, Date fechaCarga, Date fechaEntrega, String obraSocial, Sucursal sucursal) {
        this.id = id;
        this.fechaCarga = fechaCarga;
        this.fechaEntrega = fechaEntrega;
        this.obraSocial = obraSocial;
        this.estado = EstadoPeticion.PROCESO;
        this.sucursal = sucursal;
    }

    @Override
    public String toString() {
        return "Model{" +
                "id='" + id + '\'' +
                ", fechaCarga='" + fechaCarga + '\'' +
                ", fechaEntrega='" + fechaEntrega + '\'' +
                ", obraSocial='" + obraSocial + '\'' +
                ", estado='" + estado + '\'' +
                ", sucursal_id='" + sucursal.getId() + '\'' +

                '}';
    }


}
