package dds.entrega0;

public class Prenda {

    //atributos

    private String tipoPrenda;
    private String descripcion;
    private String talle;

    //getters and setters

    public String getTipoPrenda() {
        return tipoPrenda;
    }

    public void setTipoPrenda(String tipoPrenda) {
        this.tipoPrenda = tipoPrenda;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTalle() {
        return talle;
    }

    public void setTalle(String talle) {
        this.talle = talle;
    }

    //constructor

    public Prenda(String tipoPrenda, String descripcion, String talle) {
        super();
        this.tipoPrenda = tipoPrenda;
        this.descripcion = descripcion;
        this.talle = talle;
    }

    //metodos





}
