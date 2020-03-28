package singleton;

/**
 *
 * @author afernandezfontenla
 */
public class Persona {

    private String nombre;
    private String apellido;
    private int edad;
    private static Persona launica;

    private Persona() {
    }

    private Persona(String nom, String ape, int edad) {
        this.nombre = nom;
        this.apellido = ape;
        this.edad = edad;
    }

    public static Persona getInstance(){
        if (launica == null){
            launica = new Persona();
        }
        return launica;
    }

    public static Persona getInstancePar(String nom, String ape, int edad){
        if (launica == null){
            launica = new Persona(nom,ape,edad);
        }
        return launica;
    }
    public void setNom(String nom) {
        launica.nombre = nom;
    }

    public void setApe(String ape) {
        launica.apellido = ape;
    }

    public void setEdad(int edad) {
        launica.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona:" + "\nnombre = " + nombre + "\napellido = " +
                apellido + "\nedad = " + edad+"\n";
    }


}