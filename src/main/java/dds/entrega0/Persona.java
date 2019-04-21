package dds.entrega0;


import java.util.List;
import java.util.stream.Collectors;

public class Persona {

    //atributos

    private List<Prenda> listaPrendas;
    private List<List<Prenda>> listaSugerencias;




    public Persona(List<Prenda> prendas){
        this.listaPrendas = prendas;
    }

    //getters and setters

    public List<Prenda> getListaPrendas() {
        return listaPrendas;
    }

    public void setListaPrendas(List<Prenda> listaPrendas) {
        this.listaPrendas = listaPrendas;
    }

    public List<List<Prenda>> getListaSugerencias() {
        return listaSugerencias;
    }

    public void setListaSugerencias(List<List<Prenda>> listaSugerencias) {
        this.listaSugerencias = listaSugerencias;
    }

    //metodos



    public void agregarPrenda (Prenda prenda){
        this.listaPrendas.add(prenda);
    }


    public List<Prenda> elegirSugerencia(int numero) {

        List<Prenda> sugerencia = listaSugerencias.get(numero);
        return sugerencia;

    }


}
