/*public class Proveedores extends Libros{

    int CostoLibroUno;
    
    public proveedores(){
        //Constructor de la clase
        }
        //Sobrecarga para obtener y enviar el CostoLibroUno
    public proveedores(String nombre, String autor, String isbn, String genero, int ejemplares, int CostoLibroUno){
        //para poder obtener los atributos por herencia se debe declarar super
        super(nombre, autor, isbn, genero, ejemplares);
        this.CostoLibroUno = CostoLibroUno;
        }
    public String getCostoLibroUno(){
            return CostoLibroUno;
        }
        
    public void setCostoLibroUno(int CostoLibroUno){
            this.CostoLibroUno = CostoLibroUno;
        }
        //Metodo para mostrar la informacion del Proveedores
    public void mostrarCosto(){
        System.out.println("Tu libro: " + getNombre() + "\n"
        + "Escrito por: " + getAutor() + "\n" 
        + "Su isbn es: " + getIsbn() + "\n"
        + "Del genero: " + getGenero() + "\n"
        + "Tiene " + getEjemplares() + " ejemplares" + "\n"
        + "Con un costo de: " + CostoLibroUno + "\n");    
        }
    }
*/



public class Proveedores extends Libros{
    int CostoLibroUno;
    
    public Proveedores(){
        //constructor de la clase
    }

    //sobrecarga para obtener y enviar el CostoLibroUno
    public Proveedores(String nombre, String autor, String isbn, String genero,
    int ejemplares, int CostoLibroUno){
        //para poder obtener los atributos por herencia
        //se debe de colocar super
        super(nombre, autor, isbn, genero, ejemplares);
        this.CostoLibroUno = CostoLibroUno;

    }
    public int getCostoLibroUno(){
        return CostoLibroUno;
    }

    //enviar
    public void setCostoLibroUno(int CostoLibroUno){
        this.CostoLibroUno = CostoLibroUno;
    }

    //metodo para mostrar la informacion del Proveedores
    public void mostrarProveedores(){
        System.out.println("El nombre del Libro es: " + getNombre() +"\n"
                            + "Su autor(a) es: " + getAutor() +"\n"
                            + "Su ISBN: " + getIsbn() +"\n"
                            + "Pertenece al (los) genero(s) de: " + getGenero() +"\n"
                            + "Numero de ejemplares actuales en biblioteca: " + getEjemplares() + "\n"
                            //+ "Su sexo es: " + getSexo() +"\n"
                            + "Su Costo es de: MXN" + CostoLibroUno  +"\n");
    }
}