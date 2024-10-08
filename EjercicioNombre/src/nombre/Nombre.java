package nombre;

public class Nombre {
    private String nombre;
    private String primerApellido;
    private String segundoApellido;

    public Nombre(String nombre, String primerApellido, String segundoApellido) {
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
    }

    public void leerNombre(String nombre, String primerApellido, String segundoApellido) {
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
    }

    public void mostrarNombre() {
        System.out.println("Nombre completo: " + nombre + " " + primerApellido + " " + segundoApellido);
    }
}
