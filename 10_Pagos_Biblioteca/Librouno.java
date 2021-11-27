public class Librouno extends Libros{
    int CostoLibroEscarlata;
    
    public Librouno(){
        //constructor de la clase
    }

    //sobrecarga para obtener y enviar el CostoLibroEscarlata
    public Librouno(String nombre, String autor, String isbn, String genero,
    int ejemplares, int CostoLibroEscarlata){
        //para poder obtener los atributos por herencia
        //se debe de colocar super
        super(nombre, autor, isbn, genero, ejemplares);
        this.CostoLibroEscarlata = CostoLibroEscarlata;

    }
    public int getCostoLibroEscarlata(){
        return CostoLibroEscarlata;
    }

    //enviar
    public void setCostoLibrouno(int CostoLibroEscarlata){
        this.CostoLibroEscarlata = CostoLibroEscarlata;
    }

    //metodo para mostrar la informacion del Librouno
    public void mostrarLibrouno(){
        System.out.println("El nombre del Libro es: " + getNombre() +"\n"
                            + "Su autor(a) es: " + getAutor() +"\n"
                            + "Su ISBN: " + getIsbn() +"\n"
                            + "Pertenece al (los) genero(s) de: " + getGenero() +"\n"
                            + "Numero de ejemplares actuales en biblioteca: " + getEjemplares() + "\n"
                            //+ "Su sexo es: " + getSexo() +"\n"
                            + "Su Costo es de: MXN" + CostoLibroEscarlata  +"\n");
    }
}