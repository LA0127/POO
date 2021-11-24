public class hamster extends animal{
    String chillido;
}
public hamster(){
    //Constructor de la clase
}
//Sobrecarga para obtener y enviar el chillido
public hamster(String nombre, String raza, String tipo_alimento, int edad, boolean sexo, String chillido){
    //para poder obtener los atributos por herencia se debe declarar super
    super(nombre, raza, tipo_alimento, edad, sexo);
    this.chillido = chillido;
}
public int getchillido(){
            return chillido;
        }
        
        public void setchillido(){
            this.chillido = chillido;
        }
        //Metodo para mostrar la informacion del hamster
        public void mostrarhamster(){
            System.out.println("El nombre del hamster es: " + getNombre() + "\n"
            + "Su raza es: " + getRaza() + "\n"
            + "Su alimento es: " + getTipoAlimento() "\n"
            + "Tiene la edad de: " + getEdad() "\n"
            + "Su sexo es: " + getSexo() "\n"
            + "Su chillido es: " + chillido + "\n"); 
        }
