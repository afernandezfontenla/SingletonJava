package singleton;

/**
 *
 * @author afernandezfontenla
 */
public class Persona {

    //Declaración de las variables
    private String nombre;
    private String apellido;
    private int edad;
    private static Persona launica;

    //Creación de un constructor vacío, sin parámetros
    private Persona() {
    }

    //Creación de un constructor con parámetros
    private Persona(String nom, String ape, int edad) {
        this.nombre = nom;
        this.apellido = ape;
        this.edad = edad;
    }

    //Creación del método getInstance
    public static Persona getInstance(){
        if (launica == null){
            launica = new Persona();
        }
        return launica;
    }

    //Creación del método getInstancePar
    public static Persona getInstancePar(String nom, String ape, int edad){
        if (launica == null){
            launica = new Persona(nom,ape,edad);
        }
        return launica;
    }

    //Creación del método setNom
    public void setNom(String nom) {
        launica.nombre = nom;
    }

    //Creación del método setApe
    public void setApe(String ape) {
        launica.apellido = ape;
    }

    //Creación del método setEdad
    public void setEdad(int edad) {
        launica.edad = edad;
    }

    //Generación del toString
    @Override
    public String toString() {
        return "Persona:" + "\nnombre = " + nombre + "\napellido = " +
                apellido + "\nedad = " + edad+"\n";
    }

}