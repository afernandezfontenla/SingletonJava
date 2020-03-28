package singleton;

/**
 *
 * @author afernandezfontenla
 */

public class Singleton {

    public static void main(String[] args) {

        Persona miPersona;
        miPersona = Persona.getInstancePar("Juan","Gutiérrez",36);

        System.out.println(miPersona.toString());
        Persona tuPersona = Persona.getInstance();

        System.out.println(tuPersona.toString());
        System.out.println(miPersona.toString());

    }

}
