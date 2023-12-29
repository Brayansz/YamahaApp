package modelo;

import java.sql.*;
import java.util.Properties;

/**
 *
 * @author Brayan
 */
public class Conexion {

    private final String BD = "base_de_datos";
    private final String HOST = "localhost";
    private final String USUARIO = "root";
    private final String CLAVE = "";
    private final String URL = "jdbc:mysql://" + HOST + ":3306/" + BD +"?useSSL=false";
    private final String DRIVER = "com.mysql.jdbc.Driver";
    

    private Connection conn = null;

    /**
     *
     * @return
     */
    public Connection getConexion() {
        try {
            Class.forName(DRIVER);
            conn = (Connection) DriverManager.getConnection(URL, USUARIO, CLAVE);
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println("Error: No se conecto a la base de datos." + e);
        }
        return conn;
    }
}
