
import java.util.*;


public class manipularPrograma{

    public void menu(){
        Scanner entrada = new Scanner(System.in);

        //instancias de las clases de persona y de accionespersona
        AccionesPersona control = new AccionesPersona();
        System.out.println("Bienvenido al programa");
        System.out.println("Elige la opcion deseada");
        System.out.println("1.- Mostrar todas las personas");
        System.out.println("2.- Registrar");
        System.out.println("3.- Editar los datos");
        System.out.println("4.- Borrar persona");
        System.out.println("5.- Salir");
        int opcion = entrada.nextInt();
        switch(opcion){
            case 1:
                ArrayList<Persona> listapersona = control.mostrarPersonas();
                //imprimir lista
                //recorrer lista
                for(Persona objeto: listapersona){
                    System.out.println("El id es: " + objeto.getId()
                    + "\n" + "El nombre es: " + objeto.getNombre()
                    + "\n" + "Su edad es: " + objeto.getEdad());
                }
                menu();
                break;
            case 2:
                //agregar persona
                System.out.println("Ingrese el ID de la persona");
                 idpersona = entrada.nextInt();
                System.out.println("Ingrese el nombre de la persona");
                String nombrepersona = entrada.nextLine();
                System.out.println("Ingrese la edad");
                int edadpersona = entrada.nextInt();
                Persona personaNueva = new Persona(idpersona, nombrepersona, edadpersona);
                control.agregarPersona(personaNueva);
                menu();
                break;
            case 3:
                System.out.println("Digita el ID de la persona que buscas");
                idpersona = entrada.nextInt();
                
                Persona personaBuscar = control.buscarPersona(idpersona);

                System.out.println("La informacion de la persona es: \n"
                +"ID: " + personaBuscar.getId() + "\n"
                +"Nombre: " + personaBuscar.getNombre() + "\n"
                +"Edad: " + personaBuscar.getEdad()+ "\n");

                System.out.println("Ingresa nuevo nombre");
                String nuevonombre = entrada.nextLine();
                System.out.println("");
                int nuevaedad = entrada.nextInt();

                personaBuscar.setNombre(nuevonombre);
                personaBuscar.setEdad(nuevaedad);

                control.actualizarPersona(personaBuscar);
                menu();
                break;
            case 4:
                System.out.println("Digite el ID que desea eliminar");
                int idpersona = entrada.nextInt();
                //crear objeto de la persona a eliminar
                Persona personaEliminar = control.buscarPersona(idpersona);
                control.eliminarPersona(personaEliminar);
                System.out.println("El registro se ha borrado del sistema");
                menu();
                break;
            default:
                System.out.println("Opcion no valida");
                break;

        }
    }
}