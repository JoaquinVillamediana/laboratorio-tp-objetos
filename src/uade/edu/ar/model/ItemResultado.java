package uade.edu.ar.model;

public class ItemResultado {

    private String resultado;
    private TipoValores tipo;

    public ItemResultado() {
    }

    public ItemResultado(String resultado, TipoValores tipo) {
        this.resultado = resultado;
        this.tipo = tipo;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public TipoValores getTipo() {
        return tipo;
    }

    public void setTipo(TipoValores tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Model{" +
                "resultado='" + resultado + '\'' +
                ", tipo='" + tipo + '\'' +
                '}';
    }


}
