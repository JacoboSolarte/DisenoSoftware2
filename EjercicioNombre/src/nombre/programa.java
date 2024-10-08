package nombre;

import java.util.Scanner;

public class programa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese los datos personales:");
        System.out.print("Escriba su nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Escriba su primer apellido: ");
        String primerApellido = scanner.nextLine();
        System.out.print("Escriba su segundo apellido: ");
        String segundoApellido = scanner.nextLine();

        System.out.println("Ingrese los datos de su dirección:");
        System.out.print("Ingrese el nombre de la calle: ");
        String calle = scanner.nextLine();
        System.out.print("Ingrese la ciudad donde vive: ");
        String ciudad = scanner.nextLine();
        System.out.print("Ingrese la provincia o estado: ");
        String provincia = scanner.nextLine();
        System.out.print("Ingrese su código postal: ");
        String codigoPostal = scanner.nextLine();

        Direccion direccion = new Direccion(nombre, primerApellido, segundoApellido, calle, ciudad, provincia, codigoPostal);

        System.out.println("\nDatos registrados:");
        direccion.mostrar();

        scanner.close();
    }
}
