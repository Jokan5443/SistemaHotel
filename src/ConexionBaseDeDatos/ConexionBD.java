package ConexionBaseDeDatos;

import java.sql.Connection;  // Importa la clase Connection para manejar la conexión a la BD
import java.sql.DriverManager;  // Importa DriverManager para obtener conexiones a la BD
import java.sql.SQLException;// Importa SQLException para manejar errores SQL

public class ConexionBD {
    // Constante con la URL de conexión a la base de datos en Clever Cloud

   // private static final String URL = "jdbc:mysql://bb8eb94l4tbafdhhua6p-mysql.services.clever-cloud.com:3306/bb8eb94l4tbafdhhua6p";
    // Usuario de la base de datos proporcionado por Clever Cloud
  //  private static final String USER = "u7bx0koexr09nu6w";
    // Contraseña correspondiente al usuario 
   // private static final String PASSWORD = "KXufvIJGaeouglbc9GsG";

 private static final String URL = "jdbc:mysql://turntable.proxy.rlwy.net:53729/railway";
private static final String USER = "root";
private static final String PASSWORD = "zirQsUPTyHwVsaBrzRWZZYYHbjplHGud";
    
   /* private static final String URL = "jdbc:mysql://localhost:3306/reserva_hotel";
private static final String USER = "Renzo";
private static final String PASSWORD = "71944110";*/
    
    
    
    // Método estático para establecer y retornar una conexión a la base de datos
    public static Connection conectar() {
        Connection con = null;// Inicializa la variable de conexión como nula
        try {
            // Intenta establecer la conexión usando DriverManager con los datos proporcionados
            con = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("¡Conexión exitosa a la base de datos!");// Mensaje de confirmación de conexión
        } catch (SQLException e) {
            // Si ocurre un error,, nos mostrara el mensaje 
            e.printStackTrace();
            System.out.println("Error en la conexión.");// el mensaje de error que le puedes colocar a tu gusto 
        }
        return con;
    }
    // Método principal para probar la conexión
    public static void main(String[] args) {
        Connection con = conectar(); // Llama al método para conectar
        if (con != null) {
            // Si la conexión no es nula, imprime éxito
            System.out.println("¡Conexión a PhpMyAdmin exitosa!");
        } else {
            // Si es nula, algo falló
            System.out.println("Falló la conexión.");
        }
    }

   
}
