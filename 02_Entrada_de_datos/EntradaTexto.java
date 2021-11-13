class EntradaTexto{
    public static void main(String[] args){
      //Tipo de dato, nombre de la variable
        String nombre;
      //ln es para dar un salto de linea  
        System.out.println("Introduce tu nombre: ");
        nombre= System.console().readLine();
        System.out.println("Hola, " + nombre + " Vous êtes les bienvenus au programme");
    }
}