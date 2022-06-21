package clases;

/**
 *
 * @author Adrian
 */
public class PruebaPersona {

    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.nombre = "Luis";
        persona1.apellido = "Cabrera";
        persona1.desplegarInformacion();

        Persona p = new Persona();
        p.nombre = "Gabriel";
        p.apellido = "León";
        p.desplegarInformacion();
        System.out.println(persona1);
        System.out.println(p);
    }
}
