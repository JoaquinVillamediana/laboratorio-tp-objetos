package uade.edu.ar.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ResultadoPractica {

    private Date fechaResultado;
    private List<ItemResultado> itemsResultadoList = null;

    public ResultadoPractica() {
        this.fechaResultado = new Date();
        this.itemsResultadoList = new ArrayList<>(); //Metodo composicion
    }



    @Override
    public String toString() {
        return "Model{" +
                "fechaResultado='" + fechaResultado + '\'' +
                '}';
    }


}
