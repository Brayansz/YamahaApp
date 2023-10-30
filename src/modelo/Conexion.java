package modelo;

import java.sql.*;
import java.util.Properties;

public class Conexion {

    private final String BD = "multinivel";
    private final String HOST = "localhost";
    private final String USUARIO = "root";
    private final String CLAVE = "";
    private final String URL = "jdbc:mysql://" + HOST + ":3306/" + BD +"?useSSL=false";
    private final String DRIVER = "com.mysql.jdbc.Driver";
    

    private Connection conn = null;

    public Connection getConexion() {
        try {
            Class.forName(DRIVER);
            Properties properties = new Properties();
            properties.setProperty("useSSL", "true");
            properties.setProperty("requireSSL", "true");
            properties.setProperty("verifyServerCertificate", "true");
            conn = (Connection) DriverManager.getConnection(this.URL, this.USUARIO, this.CLAVE);
            conn = DriverManager.getConnection(URL, properties);
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println("Error: No se conecto a la base de datos." + e);
        }
        return conn;
    }
}
