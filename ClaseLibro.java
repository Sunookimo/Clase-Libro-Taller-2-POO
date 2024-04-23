package claselibro;
import java.util.Scanner;

public class ClaseLibro {
    
    //El método main tiene una complejidad constante O(1) al contener operaciones básicas.
    public static void main(String[] args) {
        Scanner pc = new Scanner(System.in);
       
        System.out.println("Ingrese el título");
        String titulo = pc.nextLine();
        System.out.println("Ingrese el autor");
        String autor = pc.nextLine();
        System.out.println("Ingrese el año de publicación");
        int anioPublicacion = pc.nextInt();
        System.out.println("Ingrese el género");
        String genero = pc.nextLine();
       
        Libro libro = new Libro();
       
        boolean leido = false;
       
        libro.setAutor(autor);
        libro.setTitulo(titulo);
        libro.setAnioPublicacion(anioPublicacion);
        libro.setGenero(genero);
       
        System.out.println("Los datos del libro son: " + libro.getTitulo() + ", " + libro.getAutor() + "," + libro.getAnioPublicacion() + ", " + libro.getGenero() +".");
        
        System.out.println("Es " + libro.marcarLeido(leido) + " que el libro ya fue leido.");
       
        System.out.println("Es " +  libro.esAntiguo(anioPublicacion) + " que el libro es antiguo");
    }
   
}