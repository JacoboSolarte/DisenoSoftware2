package packageCirculo;

import java.util.Scanner;

class Circulo {
    private double radio; 

    public Circulo() {
        this.radio = 0;
    }

    public void leerRadio() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite el radio del círculo: ");
        this.radio = scanner.nextDouble();
    }

    public double getRadio() {
        return radio; 
    }

    public void setRadio(double radio) {
        this.radio = radio; 
    }

    public double area() {
        return Math.PI * Math.pow(radio, 2);
    }

    public double circunferencia() {
        return 2 * Math.PI * radio;
    }
}
