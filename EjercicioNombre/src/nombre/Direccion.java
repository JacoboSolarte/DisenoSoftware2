package nombre;

public class Direccion extends Nombre {
	
    private String calle;
    private String ciudad;
    private String provincia;
    private String codigoPostal;

   
    public Direccion(String nombre, String primerApellido, String segundoApellido, String calle, String ciudad, String provincia, String codigoPostal) {
        super(nombre, primerApellido, segundoApellido);  
        this.calle = calle;
        this.ciudad = ciudad;
        this.provincia = provincia;
        this.codigoPostal = codigoPostal;
    }

   
    public void nuevaDireccion(String calle, String ciudad, String provincia, String codigoPostal) {
        this.calle = calle;
        this.ciudad = ciudad;
        this.provincia = provincia;
        this.codigoPostal = codigoPostal;
    }

    
    public void nuevoNombre(String nombre, String primerApellido, String segundoApellido) {
        leerNombre(nombre, primerApellido, segundoApellido);
    }

    public void mostrar() {
        mostrarNombre(); 
        System.out.println("Dirección: ");
        System.out.println("Calle: " + calle);
        System.out.println("Ciudad: " + ciudad);
        System.out.println("Provincia: " + provincia);
        System.out.println("Código Postal: " + codigoPostal);
    }
}
