package packageCirculo;

import java.util.Scanner;

class Cilindro extends Circulo {
    private double altura;

    public Cilindro() {
        super();
        this.altura = 0;
    }

    public void leerDatos() {
        leerRadio();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la altura del cilindro: ");
        this.altura = scanner.nextDouble();
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double area() {
        return 2 * Math.PI * getRadio() * altura + 2 *Math.PI * (getRadio()*getRadio());
    }

    public double volumen() {
        return Math.PI * Math.pow(getRadio(), 2) * getAltura();
    }
}
