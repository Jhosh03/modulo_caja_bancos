
package MODELO;

import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class SQL_USUARIOS extends CONEXION {
    
 public boolean login(USUARIOS usr, PERSONA per,ROL_USR rol_USR) {

        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();

        String sql = "select us.nombre_usr, per.PASSWORD, rl.DESCRIPCION from usuarios us inner join persona per "
                + "on us.PERSONA_ID_PERSONA=per.ID_PERSONA inner join rol_usuario rl on "
                + "us.ROL_USUARIO_ID_ROL_USUARIO= rl.ID_ROL_USUARIO where us.nombre_usr= ?";
               
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, usr.getNombre_usr());
            rs = ps.executeQuery();
            if (rs.next()) {
                if (per.getPassword().equals(rs.getString(2))) {                 
                rol_USR.setNombre_rol(rs.getString(3));
                    return true;
                } else {
                    return false;
                }
            }
            return false;
        } catch (SQLException ex) {
            Logger.getLogger(SQL_USUARIOS.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
      public boolean registrar_per ( PERSONA per){
    
        PreparedStatement ps= null;
        Connection con=getConexion();
    
        String sql = "INSERT INTO persona (ID_PERSONA,NOMBRE,APELLIDO,CORREO,PASSWORD) VALUES(?,?,?,?,?)";
        try {
            ps=con.prepareStatement(sql);
            ps.setString(1,per.getId());
            ps.setString(2,per.getNombre());
            ps.setString(3,per.getApellido());
            ps.setString(4,per.getCorreo());
            ps.setString(5,per.getPassword());
            ps.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(SQL_USUARIOS.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } 
    }
    
   public boolean registrar_usr (USUARIOS usr){
    
        PreparedStatement ps= null;
        Connection con=getConexion();
    
        String d_usr = "INSERT INTO usuarios (ID_USUARIOS,ROL_USUARIO_ID_ROL_USUARIO,PERSONA_ID_PERSONA,nombre_usr) VALUES(?,?,?,?)";
        try {
            ps=con.prepareStatement(d_usr);
            ps.setString(1,usr.getId());
            ps.setInt(2,usr.getRol_usr());
            ps.setString(3,usr.getId_persona());
            ps.setString(4,usr.getNombre_usr());
            ps.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(SQL_USUARIOS.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }   
    }
   
}
