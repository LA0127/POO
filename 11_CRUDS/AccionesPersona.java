/*
esta clase es el controlador (son las acciones de la Persona
para manipular los datos)
*/

import java.util.ArrayList;
//Hacemos el CRUD de personas
//Altas, Bajas, Modificaciones Consultas de un objeto

public class AccionesPersona{

    /*
    Hacemos una instancia de Persona para manipular
    los datos y guardarlos dentro de un objeto
    que pueda soportar diferentes tipos de dato
    ArrayList
    */

    public ArrayList<Persona> listapersona = new ArrayList<Persona>();
    //tipo de acceso    clase   <obj> objeto de objetos

    //Metodo para agregar una Persona
    public void agregarPersona(Persona p){
        //mandar a llamar al objeto lista de personas e invoco el metodo agregar
        listapersona.add(p);
    }

    //buscar a una Persona por su id
    public Persona buscarPersona(int id){
        //instancia de Persona para buscarla
        Persona encontrada = new Persona();

        //recorrer el arreglo de personas hasta encontrar el id
        for(Persona p: listapersona){
            //Tenemos la condicion id == parametro
            if(id == p.getId()){
                //Se asignan los valores a mi objeto Persona(encontrada) los valores
                encontrada = p;
            }else{
                System.out.println("No existe ese registro");
            }
        }

        //cuando es un metodo que no es vacio se debe retornar un valor
        return encontrada;

    }

    public void actualizarPersona(Persona actualizada){
        //primero debo buscar una Persona, obtener sus datos y elegir cual voy a cambiar
        //crear instancia de Persona
        Persona actualizar = buscarPersona(actualizada.getId());

        //cambio los datos
        listapersona.remove(actualizar);

        //guardo
        listapersona.add(actualizar);
    }

    //eliminar una persona
    public void eliminarPersona(Persona eliminar){
        listapersona.remove(eliminar);
    }

    //mostrar a todas las personas
    public ArrayList<Persona> mostrarPersonas(){
        return listapersona;
    }
}