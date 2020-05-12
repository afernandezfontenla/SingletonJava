package singleton;

/**
 *
 * @author afernandezfontenla
 */

public class Singleton {

    public static void main(String[] args) {

        //Creando el objeto miPersona
        Persona miPersona;
        //Introduciendo los datos de la persona en el objeto miPersona
        miPersona = Persona.getInstancePar("Juan","Gutiérrez",36);

        //Sacando por pantalla los datos del objeto miPersona
        System.out.println(miPersona.toString());
        //Creación del objeto tuPersona
        Persona tuPersona = Persona.getInstance();

        //Sacando por pantalla los datos de tuPersona y miPersona
        System.out.println(tuPersona.toString());
        System.out.println(miPersona.toString());

    }

}
