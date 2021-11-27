public class ProveedoresDos{
    int CostoLibroDos;
    public ProveedoresDos(String nombre, String autor, String isbn, String genero, int ejemplares, int CostoLibroDos){
        //para poder obtener los atributos por herencia
        //se debe de colocar super
        super(nombre, autor, isbn, genero, ejemplares);
        this.CostoLibroDos = CostoLibroDos;

    }
    public int getCostoLibroDos(){
        return CostoLibroDos;
    }

    //enviar
    public void setCostoLibroDos(int CostoLibroDos){
        this.CostoLibroDos = CostoLibroDos;
    }
    public void mostrarProveedoresDos(){
        System.out.println("El nombre del Libro es: " + getNombre() +"\n"
                            + "Su autor(a) es: " + getAutor() +"\n"
                            + "Su ISBN: " + getIsbn() +"\n"
                            + "Pertenece al (los) genero(s) de: " + getGenero() +"\n"
                            + "Numero de ejemplares actuales en biblioteca: " + getEjemplares() + "\n"
                            //+ "Su sexo es: " + getSexo() +"\n"
                            + "Su Costo es de: MXN" + CostoLibroDos +"\n");
    }
}