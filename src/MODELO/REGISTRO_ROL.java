
package MODELO;

import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Josh Bor
 */
public class REGISTRO_ROL extends CONEXION {
    
     public boolean registrar (ROL_USR ROL){
    
        PreparedStatement ps= null;
        Connection con=getConexion();
   
        String sql = "INSERT INTO ROL_USUARIO (ID_ROL_USUARIO,DESCRIPCION) VALUES(?,?)";
        try {
            ps=con.prepareStatement(sql);
            ps.setString(1,ROL.getId());
            ps.setString(2,ROL.getNombre_rol());
            ps.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(SQL_USUARIOS.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }   
    }   
}
