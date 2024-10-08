package packageCirculo;

import java.util.Scanner;

class CilindroHueco extends Cilindro {
    private double radioInterno;

    public CilindroHueco() {
        super();
        this.radioInterno = 0;
    }

    public void leerDatos() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Radio externo del cilindro hueco: ");
        setRadio(scanner.nextDouble());
        System.out.print("Radio interno del cilindro hueco: ");
        this.radioInterno = scanner.nextDouble();
        System.out.print("Altura del cilindro hueco: ");
        setAltura(scanner.nextDouble());
    }

    public double area() {
        return 2 * Math.PI * (getRadio() * getAltura() + Math.pow(getRadio(), 2) - Math.pow(radioInterno, 2));
    }

    public double volumen() {
        return Math.PI * getAltura() * (Math.pow(getRadio(), 2) - Math.pow(radioInterno, 2));
    }
}
