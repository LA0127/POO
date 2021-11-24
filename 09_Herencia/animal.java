public class animal{
        //Encapsulamiento
        //Agrupar para que no puedan ser modificados desde otro lugar
    private String nombre, raza, tipo_alimento;
    private int edad;
    private boolean sexo=false;
    /*El constructor nos sirve para declarar la existencia de una clase
    para tener inicializar las variables de la clase*/

    public animal(){ //Esto es un constructor.
    /*Podemos inicializar las variables, podemos aplicar una contrasenia por sobrecarga */
    }
    public animal(String nombre, String raza, String tipo_alimento, int edad, boolean sexo){
            /*
            Podemos realizar operaciones con cada uno de los parametros
            Se obtiene el paso de parametros de cada una de las variables para conocer su valor
            */

        this.nombre = nombre;
        this.raza = raza;
        this.tipo_alimento = tipo_alimento;
        this.edad = edad;
        this.sexo = sexo;
    }
        /* Cuando los atributos son de tipo private
        debemos acceder a los datos a traves del uso de los metodos
        get obtener ----> recibir
        set asignar ----> enviar}*/
        //Recibir
        public String getNombre(){
            return nombre;
        }
        //Enviar
        public void setNombre(String nombre){
            this.nombre = nombre;
        }

        public String getRaza(){
            return raza;
        }
        
        public void setRaza(String raza){
            this.raza = raza;
        }

        public String getTipoAlimento(){
            return tipo_alimento;
        }
        
        public void setTipoAlimento(String tipo_alimento){
            this.tipo_alimento = tipo_alimento;
        }
        
        public int getEdad(){
            return edad;
        }
        
        public void setEdad(int edad){
            this.edad = edad;
        }
        
        public boolean getSexo(){
            return sexo;
        }
        
        public void setSexo(boolean sexo){
            this.sexo = sexo;
        }
}