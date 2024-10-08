package packageCirculo;

import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Datos del Círculo:");
        Circulo circulo = new Circulo();
        circulo.leerRadio();
        System.out.println("Área del círculo: " + circulo.area());
        System.out.println("Circunferencia del círculo: " + circulo.circunferencia());

        System.out.println("\nDatos del Cilindro:");
        Cilindro cilindro = new Cilindro();
        cilindro.leerDatos();
        System.out.println("Área del cilindro: " + cilindro.area());
        System.out.println("Volumen del cilindro: " + cilindro.volumen());

        System.out.println("\nDatos del Cilindro Hueco:");
        CilindroHueco cilindroHueco = new CilindroHueco();
        cilindroHueco.leerDatos();
        System.out.println("Área del cilindro hueco: " + cilindroHueco.area());
        System.out.println("Volumen del cilindro hueco: " + cilindroHueco.volumen());
    }
}
