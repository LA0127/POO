
package BD;

/**
 *
 * @author Alex
 */
import java.sql.*;

public class Conexion {
    public static Connection getConexion()throws ClassNotFoundException{
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306//funkos";
            System.out.println("si");
            String user="root";
            String password = "1626LUISCONTRERAS";
            System.out.println("no");
            
            return DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            System.out.println("Error al conectar");
            System.out.println(e/*ed*/.getMessage());
        }catch(Exception ex){
            System.out.println("Error logico");
            System.out.println(ex.getMessage());
        }
        return null;
    }
}
