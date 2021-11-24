/* 
Para poder aplicar la herencia de una clase, se utiliza la palabra reservada
extends
Eso significa que la clase va a heredar de una clase padre

animal es la clase padre 
perro es la clase hija
*/
public class perro extends animal{
    String ladrido;
}
public perro(){
    //Constructor de la clase
}
//Sobrecarga para obtener y enviar el ladrido
public perro(String nombre, String raza, String tipo_alimento, int edad, boolean sexo, String ladrido){
    //para poder obtener los atributos por herencia se debe declarar super
    super(nombre, raza, tipo_alimento, edad, sexo);
    this.ladrido = ladrido;
}
public String getLadrido(String ladrido)){
            return ladrido;
        }
        
        public void setLadrido(){
            this.ladrido = ladrido;
        }
        //Metodo para mostrar la informacion del perro
        public void mostrarperro(){
            System.out.println("El nombre del perro es: " + getNombre() + "\n"
            + "Su raza es: " + getRaza() + "\n"
            + "Su alimento es: " + getTipoAlimento() "\n"
            + "Tiene la edad de: " + getEdad() "\n"
            + "Su sexo es: " + getSexo() "\n"
            + "Su ladrido es: " + ladrido + "\n"); 
        }
