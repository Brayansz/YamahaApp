package modelo;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DaoVendedor extends Conexion{
    public boolean agregar(DtoVendedor vendedor){
        PreparedStatement ops;
        Connection con = getConexion();
        String stm = "INSERT INTO vendedor (identificacion, nombre, apellido, edad, id_sucursal) VALUES(?,?,?,?,?)";
        
        try {
            ops = con.prepareStatement(stm);
            ops.setString(1, vendedor.getIdentificacion());
            ops.setString(2, vendedor.getNombre());
            ops.setString(3, vendedor.getApellido());
            ops.setInt(4, vendedor.getEdad());
            ops.setInt(5, vendedor.getIdSucursal());
            ops.execute();
            
            return true;    
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        }
    }
    
    public boolean modificar(DtoVendedor vendedor){
        PreparedStatement ops;
        Connection con = getConexion();
        String stm = "UPDATE vendedor SET nombre = ?, apellido = ?, edad = ?, id_sucursal = ? WHERE identificacion = ?";
        
        try {
            ops = con.prepareStatement(stm);
            ops.setString(1, vendedor.getNombre());
            ops.setString(2, vendedor.getApellido());
            ops.setInt(3, vendedor.getEdad());
            ops.setInt(4, vendedor.getIdSucursal());
            ops.setString(5, vendedor.getIdentificacion());
            ops.execute();
            
            return true;    
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        }
    }
    
    public boolean consultar(DtoVendedor vendedor){
        PreparedStatement ops;
        Connection con = getConexion();
        ResultSet rs;
        String stm = "SELECT * FROM vendedor WHERE identificacion = ?";
        
        try {
            ops = con.prepareStatement(stm);
            ops.setString(1, vendedor.getIdentificacion());
            rs = ops.executeQuery();
            if(rs.next()){
                vendedor.setIdentificacion(rs.getString("identificacion"));
                vendedor.setNombre(rs.getString("nombre"));
                vendedor.setApellido(rs.getString("apellido"));
                vendedor.setEdad(Integer.parseInt(rs.getString("edad")));
                vendedor.setIdSucursal(Integer.parseInt(rs.getString("id_sucursal")));
                return true;
            }
            return false;   
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        }
    }
    
    public int consultaid(String nombre){
        PreparedStatement preparedStatement = null;
        Connection con = getConexion();
        ResultSet resultado = null;
        int id = -1;
        String stm = "SELECT identificacion FROM vendedor WHERE nombre = ?";
        try {
            
            preparedStatement = con.prepareStatement(stm);
            preparedStatement.setString(1, nombre);
            resultado = preparedStatement.executeQuery();
            if (resultado.next()) {
                id = resultado.getInt("identificacion");
            }
            System.out.println(nombre);
            System.out.println(id);
        } catch (SQLException ex) {
            System.out.println("Error: Consulta del id del usuario: " + ex);
            System.out.println("CadenaSQL: " + stm);
        }
        return id;
    };
    
        public ResultSet getVendedor(String filtro) {
        ResultSet resultado = null;
        PreparedStatement preparedStatement = null;
        Connection connection = getConexion();
        
        // En caso de que se haga una busqueda
        if (filtro != "") filtro = "WHERE " + filtro;
        
        String cadenaSQL = "SELECT * FROM vendedor " + filtro;
        
        try {
            preparedStatement = connection.prepareStatement(cadenaSQL);
            resultado = preparedStatement.executeQuery();
        } catch (SQLException ex) {
            System.out.println("Error: Consulta de la lista de clientes fallida: " + ex);
            System.out.println("CadenaSQL: " + cadenaSQL);
        }
        return resultado;
    }          

    public boolean eliminar(String filtro){
        PreparedStatement ops = null;
        Connection con = getConexion();
        String stm = "DELETE FROM vendedor WHERE identificacion = ?";
        
        try {
            ops = con.prepareStatement(stm);
            ops.setString(1, filtro);
            ops.execute();
            
            return true;    
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        }   
    }    
    
    
}

