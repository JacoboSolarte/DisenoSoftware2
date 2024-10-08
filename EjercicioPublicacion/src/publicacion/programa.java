package publicacion;
import java.util.Scanner;

public class programa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Por favor, ingrese la información del libro:");
        System.out.print("Título del libro: ");
        String tituloLibro = scanner.nextLine();
        System.out.print("Precio del libro (en formato decimal, ejemplo. 19,99): ");
        float precioLibro = scanner.nextFloat();
        System.out.print("Número de páginas del libro: ");
        int numPaginas = scanner.nextInt();
        System.out.print("Año de publicación del libro: ");
        int anioPublicacion = scanner.nextInt();
        scanner.nextLine();  

        
        Libro libro = new Libro(tituloLibro, precioLibro, numPaginas, anioPublicacion);

       
        System.out.println("\nIngrese la información del disco:");
        System.out.print("Título del disco: ");
        String tituloDisco = scanner.nextLine();
        System.out.print("Precio del disco (en formato decimal, ejemplo. 1,11): ");
        float precioDisco = scanner.nextFloat();
        System.out.print("Duración del disco (en minutos, ejemplo. 80,5): ");
        float duracion = scanner.nextFloat();

       
        Disco disco = new Disco(tituloDisco, precioDisco, duracion);

        
        System.out.println("\nDatos ingresados:");
        System.out.println("\nDetalles del libro:");
        libro.mostrar();

        System.out.println("\nDetalles del disco:");
        disco.mostrar();

        scanner.close();
    }
}
