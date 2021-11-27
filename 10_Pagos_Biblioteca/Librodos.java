public class Librodos extends Libros{
    int CostoLibroPasos;
    
    public Librodos(){
        //constructor de la clase
    }

    //sobrecarga para obtener y enviar el CostoLibroPasos
    public Librodos(String nombre, String autor, String isbn, String genero,
    int ejemplares, int CostoLibroPasos){
        //para poder obtener los atributos por herencia
        //se debe de colocar super
        super(nombre, autor, isbn, genero, ejemplares);
        this.CostoLibroPasos = CostoLibroPasos;

    }
    public int getCostoLibroEscarlata(){
        return CostoLibroPasos;
    }

    //enviar
    public void setCostoLibrodos(int CostoLibroPasos){
        this.CostoLibroPasos = CostoLibroPasos;
    }

    //metodo para mostrar la informacion del Librodos
    public void mostrarLibrodos(){
        System.out.println("El nombre del Libro es: " + getNombre() +"\n"
                            + "Su autor(a) es: " + getAutor() +"\n"
                            + "Su ISBN: " + getIsbn() +"\n"
                            + "Pertenece al (los) genero(s) de: " + getGenero() +"\n"
                            + "Numero de ejemplares actuales en biblioteca: " + getEjemplares() + "\n"
                            //+ "Su sexo es: " + getSexo() +"\n"
                            + "Su Costo es de: MXN" + CostoLibroPasos  +"\n");
    }
}