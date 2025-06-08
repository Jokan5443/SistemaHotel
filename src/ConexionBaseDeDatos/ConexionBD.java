package ConexionBaseDeDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {
    private static final String URL = "jdbc:mysql://bb8eb94l4tbafdhhua6p-mysql.services.clever-cloud.com:3306/bb8eb94l4tbafdhhua6p";
    private static final String USER = "u7bx0koexr09nu6w";
    private static final String PASSWORD = "KXufvIJGaeouglbc9GsG";
    
    public static Connection conectar() {
        Connection con = null;
        try {
            con = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("¡Conexión exitosa a la base de datos!");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error en la conexión.");
        }
        return con;
    }

    public static void main(String[] args) {
        Connection con = conectar();
        if (con != null) {
            System.out.println("¡Conexión a Clever Cloud exitosa!");
        } else {
            System.out.println("Falló la conexión.");
        }
    }
}
