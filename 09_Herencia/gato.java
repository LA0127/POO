public class gato extends animal{
    String num_vidas;
}
public gato(){
    //Constructor de la clase
}
//Sobrecarga para obtener y enviar el num_vidas
public gato(String nombre, String raza, String tipo_alimento, int edad, boolean sexo, int num_vidas){
    //para poder obtener los atributos por herencia se debe declarar super
    super(nombre, raza, tipo_alimento, edad, sexo);
    this.num_vidas = num_vidas;
}
public int getnum_vidas(int num_vidas){
            return num_vidas;
        }
        
        public void setnum_vidas(){
            this.num_vidas = num_vidas;
        }
        //Metodo para mostrar la informacion del gato
        public void mostrargato(){
            System.out.println("El nombre del gato es: " + getNombre() + "\n"
            + "Su raza es: " + getRaza() + "\n"
            + "Su alimento es: " + getTipoAlimento() "\n"
            + "Tiene la edad de: " + getEdad() "\n"
            + "Su sexo es: " + getSexo() "\n"
            + "Su numero de vidas es: " + num_vidas + "\n"); 
        }
