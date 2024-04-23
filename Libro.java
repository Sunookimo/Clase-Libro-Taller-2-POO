package claselibro;

public class Libro{
     private String titulo;
     private String autor;
     private int anioPublicacion;
     private boolean leido;
     private String genero;
     
     //Método 1: Presenta una complejidad constante de O(1), pues se le hacen asignaciones
     //a los atributos, y con ello, se realiza una cadena de tipo String, y devuelve esta misma.
     public String mostrarInformacion(String titulo, String autor, int anioPublicacion, String genero){
         this.titulo=titulo;
         this.autor=autor;
         this.anioPublicacion=anioPublicacion;
         this.genero=genero;
     /*System.out.println("Título: " + this.titulo);
     System.out.println("Autor: " + this.autor);
     System.out.println("Año de publicación: " + this.anioPublicacion);*/
     String datos = this.titulo + this.autor + this.anioPublicacion + this.genero;
     return datos;
     }
     //Método 2: El método marcarLeido tiene una complejidad constante de O(1) al ser una operación
     //booleana de asignacion al atributo "leido", y se devuelve este dato.
     public boolean marcarLeido(boolean leido){
         leido = true;
         return leido;
     }
     //Método 3: El método esAntiguo tiene una complejidad constante O(1), pues contiene la creación de
     //de una variable de tipo entera para realizar una resta, y se devuelve el valor true si el libro es
     //antiguo, y false, si no es antiguo.
     public boolean esAntiguo(int anioPublicacion){
     int antiguedad = 2024 - anioPublicacion;
         return antiguedad > 50;
     }

     //Lo métodos getter & setter tienen una complejidad de O(1).
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public boolean isLeido() {
        return leido;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    public void setLeido(boolean leido) {
        this.leido = leido;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
