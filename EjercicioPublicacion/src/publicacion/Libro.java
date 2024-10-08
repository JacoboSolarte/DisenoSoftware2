package publicacion;

public class Libro extends Publicacion {
 private int numeroPag;
 private int anioPublicacion;

 public Libro(String titulo, float precio, int numPaginas, int anioPublicacion) {
     super(titulo, precio); 
     this.numeroPag = numPaginas;
     this.anioPublicacion = anioPublicacion;
 }

 public void mostrar() {
     super.mostrar(); 
     System.out.println("Número de páginas: " + numeroPag);
     System.out.println("Año de publicación: " + anioPublicacion);
 }
}
