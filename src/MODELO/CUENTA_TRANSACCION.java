/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODELO;
import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Josh Bor
 */
public class CUENTA_TRANSACCION extends CONEXION {
       
    private int id;
    private String transaccion;
    private String cuenta;
     
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getTran() {
        return transaccion;
    }

    public void setTran(String tr) {
        this.transaccion = tr;
    }
    public String getCuenta() {
        return cuenta;
    }
     public void setCuenta( String cu){
     this.cuenta=cu;
     }
    
       public boolean cuenta_transaccion (CUENTA_TRANSACCION tr){
        PreparedStatement ps= null;
        Connection con=getConexion();
    
        String R_TR = "insert into cuenta_transaccion (ID_CUENTA_TRANSACCION, TRANSACCION_ID_TRANSACCION,CUENTA_ID_CUENTA) VALUES(?,?,?)";
        try {
            ps=con.prepareStatement(R_TR);
            ps.setInt(1,tr.getId());
            ps.setString(2,tr.getTran());
            ps.setString(3,tr.getCuenta());
            ps.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(SQL_USUARIOS.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }   
    } 
}
