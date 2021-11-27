/*
Obtener los pagos correspondientes de los trabajadores.

ingresar el nombre del trabajador
sueldo 
tipo de trabajador
 
*/

import java.swing.*;
import java.util.*;

public class sueldoempleado(){
    private int ID_empleado, num_horas;
    private String nombre, appat, appatmat;
    private Double sueldo;

    public void menuEmpleado(){
        String text;
        text = JOptionePane.showInputDialog("Selecciona la opcion deseada: "
                                            + "\n 1.-Agregar nuevo empleado"
                                            + "\n 2.-Consultar empleado por ID"
                                            + "\n 3.-Consultar todos los empleados"
                                            + "\n 4.-Pagar al empleado por ID");

    /* 
    Tener class empleado 
    
    5 empleados
    Si elijo 1 se debe ingresar el id, num_horas, nombre, appat, appatmat, sueldoxhora
    si elijo 2 se debe tener un metodo en el cual se va a buscar por el id del empleado

    public int buscaridempleado(int id)

    si elijo la 3 si hago una consulta a todos los empleados debo imprimir la info de todos los empleados
    si elijo la 4 
    dos opciones
    1.-Pago quincenal
        sueldo y num de hrs * 15 y aparezca la informacion del empleado + el pago

    2.-Pago mensual
        sueldo y num de hrs * 15 y aparezca la informacion del empleado + el pago


    */
    }
    }
}