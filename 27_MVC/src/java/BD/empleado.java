
package BD;
import com.mysql.cj.xdevapi.PreparableStatement;
import com.sun.org.apache.bcel.internal.generic.RETURN;
import java.sql.*;
import java.util.Vector;
public class Empleado {
    private int num_empleado;
    private String nombre;
    private String user;
    private String pass;
    private int id_rol;
    private String nombre_rol;
    
    public int getNum_empleado() {
        return num_empleado;
    }

    public void setNum_empleado(int num_empleado) {
        this.num_empleado = num_empleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public int getId_rol() {
        return id_rol;
    }

    public void setId_rol(int id_rol) {
        this.id_rol = id_rol;
    }

    public String getNombre_rol() {
        return nombre_rol;
    }

    public void setNombre_rol(String nombre_rol) {
        this.nombre_rol = nombre_rol;
    }

    public Empleado(){
    
    }
    //req funcionales son lo que hace el usuario con el sistema

    //cuales son las funciones del usuario:
    
    //Registra
    
    //Modifica sus datos
    
    //Consulta sus datos
    
    //Consulta todos los empleados
     /*Se diferencia de arraylist por la capacidad de datos
        que puede soportar, se queda con el tamaño definido y 
        arraylist puede agrandarse lo que se necesite*/
    public Vector<Empleado> listarEmpleados() throws SQLException, ClassNotFoundException{
        
        Vector<Empleado> listarEmpleados = new Vector<Empleado>();
        Connection con = null;
        PreparedStatement pre =null;
        ResultSet rs = null;
        
        try {
            con = Conexion.getConexion();
            String q = "select * from empleado";
            pre = con.prepareStatement(q);
            rs = pre.executeQuery();
            while (rs.next()){
            Empleado emp = new Empleado();
            emp.setNum_empleado(rs.getInt("num_empleado"));
            emp.setNombre(rs.getString("nombre"));
            emp.setUser(rs.getString("user"));
            emp.setPass(rs.getString("pass"));
            emp.setId_rol(rs.getInt("id_rol"));
            emp.setNombre_rol(rs.getString("nombre_rol"));
            listarEmpleados.add(emp);
            }
        } catch (SQLException ed) {
            System.out.println("Error al conectar a la tabla consulta");
            System.out.println(ed.getMessage());
            listarEmpleados = null; //para que no se quede con los datos y no queremos los datos
            
        }finally{
            try {
                //cerrrar todas las conexiones por seguridad
                rs.close();
                pre.close();
                con.close();
            } catch (Exception e) {
                System.out.println("Error de logica de datos");
                System.out.println(e.getMessage());
                
                //controlador obtienen informacion y la pasan
            }
            
        }
        return listarEmpleados();
    }
    
    
    
    //Verificar el tipo de usuario
    public Empleado verificacionUsuario(String usuario, String password) throws ClassNotFoundException{
        Empleado emp = null;
        Connection con = null;
        PreparedStatement pre = null;
        ResultSet rs = null;
        
        try {
            /*
            COmparar nombre de usuario y password respecto de la bd
            si coincide accede sino manda un erroe rn las credenciales
            */
            //Conectarme a la bd
            con = Conexion.getConexion();
            String q = "select * from empleado "
                    + "where user = ?"
                    + "and pass = ?";
            
            pre = con.prepareStatement(q);
            pre.setString(1, usuario);//datos qure vamos a comparar 
            pre.setString(2, password);
            
            rs = pre.executeQuery();
            
            while (rs.next()) {//se utilia while para que compare cada uno de los registros que hay
                emp  = new Empleado();
                emp.setNum_empleado(rs.getInt("num_empleado"));
                emp.setNombre(rs.getString("nombre"));
                emp.setUser(rs.getString("user"));
                emp.setPass(rs.getString("pass"));
                emp.setId_rol(rs.getInt("id_rol"));
                emp.setNombre_rol(rs.getString("nombre_rol"));
                break;
            }
            System.out.println("Usuario encontrado");
            
        } catch (SQLException ed) {
            System.out.println("Error al conectar a la tabla empleado");
            System.out.println(ed.getMessage());
            emp = null; //para que no se quede con los datos y no queremos los datos
            
        }finally{
            try {
                //cerrrar todas las conexiones por seguridad
                rs.close();
                pre.close();
            } catch (Exception e) {
                System.out.println("Error de logica de datos");
                System.out.println(e.getMessage());
                
                //controlador obtienen informacion y la pasan
            }
        }
        return emp;
    }

    
    
    

    
    
    
    
    
}
