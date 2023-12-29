package modelo;

import java.sql.*;

/**
 *
 * @author Brayan
 */



public class DaoCiudad extends Conexion{
    
    /**
     * En este metodo esta la logica para poder registrar ciudades 
     * en la base de datos
     * @param ciudad
     * @return 
     */
    
    public boolean registrar(DtoCiudad ciudad){
        PreparedStatement ops;
        Connection con = getConexion();
        String stm = "INSERT INTO ciudad (ciudad) VALUES(?)";
        try {
            ops = con.prepareStatement(stm);
            ops.setString(1, ciudad.getCiudad());
            ops.execute();
            return true;    
        } catch (SQLException e) {
            System.err.println("erorr uwu"+e);
            return false;
        }
    }
    
    /**
     * En este metodo esta la logica para modificar una ciudad
     * @param ciudad
     * @return 
     */
    
    public boolean modificar(DtoCiudad ciudad){
        PreparedStatement ops;
        Connection con = getConexion();
        String stm = "UPDATE ciudad SET ciudad = ? WHERE id = ?";
        try {
            ops = con.prepareStatement(stm);
            ops.setString(1, ciudad.getCiudad());
            ops.execute(); 
            return true;    
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        }
    }
    
    
    /**
     * Este metodo va a consultar las ciudades en la base de datos
     * @param ciudad
     * @return 
     */
    public boolean consultar(DtoCiudad ciudad){
        PreparedStatement ops;
        Connection con = getConexion();
        ResultSet rs;
        String stm = "SELECT * FROM ciudad WHERE id = ?";
        try {
            ops = con.prepareStatement(stm);
            ops.setInt(1, ciudad.getId());
            rs = ops.executeQuery();
            if(rs.next()){
                ciudad.setId(Integer.parseInt(rs.getString("id")));
                ciudad.setCiudad(rs.getString("ciudad"));
                return true;
            }
            return false;   
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        }
    }

    /**
     * Este metodo tiene la logica para eliminar una ciudad
     * @param ciudad
     * @return 
     */
    public boolean eliminar(DtoCiudad ciudad){
        PreparedStatement ops = null;
        Connection con = getConexion();
        String stm = "DELETE FROM ciudad WHERE id = ?";
        
        try {
            ops = con.prepareStatement(stm);
            ops.setInt(1, ciudad.getId());
            ops.execute();
            return true;    
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        }   
    } 
    
    /**
     * Este metodo tiene la logica para traer el listado de ciudades
     * @param filtro
     * @return 
     */
    
    public ResultSet getCiudades(String filtro) {
        ResultSet resultado = null;
        PreparedStatement preparedStatement = null;
        Connection connection = getConexion();
        
        // En caso de que se haga una busqueda
        if (filtro != "") filtro = "WHERE" + filtro; 
        
        String cadenaSQL = "SELECT * FROM ciudad"+ filtro;
        
        try {
            preparedStatement = connection.prepareStatement(cadenaSQL);
            resultado = preparedStatement.executeQuery();
        } catch (SQLException ex) {
            System.out.println("Error: Consulta de la lista de ciudades: "+ ex);
            System.out.println("CadenaSQL: "+ cadenaSQL);
        }
        return resultado;
    }
    
    /**
     * Este metodo tiene la logica para conseguir el id de una ciudad en especifico
     * @param nombre
     * @return 
     */    
    public int consultaid(String nombre){
        PreparedStatement preparedStatement = null;
        Connection con = getConexion();
        ResultSet resultado = null;
        int id = -1;
        String stm = "SELECT id FROM ciudad WHERE ciudad = ?";
        try {
            preparedStatement = con.prepareStatement(stm);
            preparedStatement.setString(1, nombre);
            resultado = preparedStatement.executeQuery();
            if (resultado.next()) {
                id = resultado.getInt("id");
            }
            //System.out.println(nombre);
            //System.out.println(id);
        } catch (SQLException ex) {
            System.out.println("Error: Consulta del id del usuario: " + ex);
            System.out.println("CadenaSQL: " + stm);
        }
        return id;
    };
    
}
