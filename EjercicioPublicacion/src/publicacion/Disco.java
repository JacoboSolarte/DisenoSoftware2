package publicacion;

public class Disco extends Publicacion {
 private float duracion;

 public Disco(String titulo, float precio, float duracion) {
     super(titulo, precio); 
     this.duracion = duracion;
 }

 public void mostrar() {
     super.mostrar();  
     System.out.println("Duración (minutos): " + String.format("%.2f", duracion));
 }
}

