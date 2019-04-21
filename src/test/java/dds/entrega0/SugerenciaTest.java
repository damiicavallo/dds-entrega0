package dds.entrega0;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class SugerenciaTest {

    @Test
    public void testCantidadCombinacionesPrenda() throws SinPrendasDeTipoException{

        //prendas
            //remeras
        Prenda remeraAzul =  new Prenda("torso","remera azul","S");
        Prenda remeraRoja =  new Prenda("torso","remera roja y blanca rayada","m");
        Prenda remeraAmarilla =  new Prenda("torso","remera amarilla","S");
        Prenda remeraNegra =  new Prenda("torso","remera negra","l");

            //pantalones
        Prenda pantalonNegro =  new Prenda("piernas","pantalon negro","m");
        Prenda pantalonBeige =  new Prenda("piernas","pantalon beige","l");
        Prenda jean =  new Prenda("piernas","jean","l");

            //zapatillas
        Prenda zapatillasVestir =  new Prenda("pies","zapatillas marron de vestir","42");
        Prenda zapatillasNegras =  new Prenda("pies","zapatillas negras","42");

            //accesorios
        Prenda gorra =  new Prenda("accesorios-opcionales","gorra roja","");
        Prenda anteojos =  new Prenda("accesorios-opcionales","anteojos de sol","");
        Prenda reloj =  new Prenda("accesorios-opcionales","reloj","");

        //persona
        List<Prenda> prendasPersona = new ArrayList<>();
        Persona persona = new Persona(prendasPersona);

        persona.agregarPrenda(remeraAzul);
        persona.agregarPrenda(remeraRoja);
        persona.agregarPrenda(remeraAmarilla);
        persona.agregarPrenda(remeraNegra);
        persona.agregarPrenda(pantalonBeige);
        persona.agregarPrenda(pantalonNegro);
        persona.agregarPrenda(jean);
        persona.agregarPrenda(zapatillasNegras);
        persona.agregarPrenda(zapatillasVestir);
        persona.agregarPrenda(gorra);
        persona.agregarPrenda(reloj);
        persona.agregarPrenda(anteojos);

        //sugerencia
        Sugerencia sugerencia =  new Sugerencia(persona);
        sugerencia.armarSugerencia(persona);
        Assert.assertEquals(24,persona.getListaSugerencias().size());



    }

    @Test(expected = SinPrendasDeTipoException.class)
    public void testException() throws SinPrendasDeTipoException{

        //prendas
            //remeras
        Prenda remeraAzul =  new Prenda("torso","azul","S");
        Prenda remeraRoja =  new Prenda("torso","roja","m");
        Prenda remeraAmarilla =  new Prenda("torso","amarilla","S");
        Prenda remeraNegra =  new Prenda("torso","negra","l");

            //pantalones
        Prenda pantalonNegro =  new Prenda("piernas","negro","m");
        Prenda pantalonBeige =  new Prenda("piernas","beige","l");
        Prenda jean =  new Prenda("piernas","azul","l");

            //accesorios
        Prenda gorra =  new Prenda("accesorios-opcionales","roja","");
        Prenda anteojos =  new Prenda("accesorios-opcionales","","");
        Prenda reloj =  new Prenda("accesorios-opcionales","dorado","");

        //persona
        List<Prenda> prendasPersona = new ArrayList<>();
        Persona persona = new Persona(prendasPersona);

        persona.agregarPrenda(remeraAzul);
        persona.agregarPrenda(remeraRoja);
        persona.agregarPrenda(remeraAmarilla);
        persona.agregarPrenda(remeraNegra);
        persona.agregarPrenda(pantalonBeige);
        persona.agregarPrenda(pantalonNegro);
        persona.agregarPrenda(jean);
        persona.agregarPrenda(gorra);
        persona.agregarPrenda(reloj);
        persona.agregarPrenda(anteojos);

        //sugerencia
        Sugerencia sugerencia =  new Sugerencia(persona);
        sugerencia.armarSugerencia(persona);


    }



}
