package dds.entrega0;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Sugerencia {

    //atributos

    private Persona persona;

    //getters and setters

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Sugerencia(Persona persona){
        this.persona = persona;

    }


    //metodos


    public List<Prenda> prendasPorTipo (List<Prenda> prendas, String tipoPrenda){

        return prendas.stream().filter(p->p.getTipoPrenda()== tipoPrenda).collect(Collectors.toList());

    }

    public boolean existePrendasCualquierTipo(List<Prenda> prendas) {

        return !prendas.isEmpty();

    }

    public boolean sugerenciaValida(List<Prenda> sugerencia){
        return (prendasPorTipo(sugerencia,"torso").size()>0 && prendasPorTipo(sugerencia,"piernas").size()>0 &&
                prendasPorTipo(sugerencia,"pies").size()>0);

    }

    public void armarSugerencia (Persona persona) throws SinPrendasDeTipoException{

        List<List<Prenda>> sugerencias = new ArrayList<>();
        List<Prenda> listaPrendasPersona = persona.getListaPrendas();
        List<Prenda> prendasTorso = prendasPorTipo(persona.getListaPrendas(),"torso");
        List<Prenda> prendasPiernas = prendasPorTipo(listaPrendasPersona,"piernas");
        List<Prenda> prendasPies = prendasPorTipo(listaPrendasPersona,"pies");

        if (existePrendasCualquierTipo(prendasTorso) && existePrendasCualquierTipo(prendasPiernas)
                && existePrendasCualquierTipo(prendasPies)){
        for (Prenda prendaTorso:prendasTorso) {
            for (Prenda prendaPiernas:prendasPiernas) {
                for (Prenda prendaPies:prendasPies) {
                    List<Prenda> sugerencia = new ArrayList<>();
                    sugerencia.add(prendaTorso);
                    sugerencia.add(prendaPiernas);
                    sugerencia.add(prendaPies);
                    sugerencias.add(sugerencia);
                }
            }
            
        }
            persona.setListaSugerencias(sugerencias);

        }
        else {

            throw new SinPrendasDeTipoException();
        }


    }


}

