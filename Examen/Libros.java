public class Libros{
    private String nombre, autor, isbn, genero;
    private int ejemplares;

    public Libros(){//constructor

    }
    public Libros(String nombre, String autor, String isbn, String genero, int ejemplares){
        this.nombre = nombre;
        this.autor = autor;
        this.isbn = isbn;
        this.genero = genero;
        this.ejemplares = ejemplares;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getAutor(){
        return autor;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }
    public String getIsbn(){
        return isbn;
    }
    public void setIsbn(String isbn){
        this.isbn = isbn;
    }    
    public String getGenero(){
        return genero;
    }
    public void setGenero(String genero){
        this.genero = genero;
    }
    public int getEjemplares(){
        return ejemplares;
    }
    public void setEjemplares(int ejemplares){
        this.ejemplares = ejemplares;
    }
}