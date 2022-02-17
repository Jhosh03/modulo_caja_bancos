/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODELO;

import com.mysql.jdbc.Connection;
import java.awt.HeadlessException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**
 *
 * @author Josh Bor
 */
public class TRANSACCION extends CONEXION{
    private int id;
    private String mov;
    private String monto;
    private String fecha;
    private String desc;
     
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getMov() {
        return mov;
    }

    public void setMov(String mv) {
        this.mov = mv;
    }
    public String getMonto() {
        return monto;
    }

    public void setMonto(String mont) {
        this.monto = mont;
    }
    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fech) {
        this.fecha = fech;
    }
    public String getDesc() {
        return desc;
    }

    public void setDesc(String des) {
        this.desc = des;
    }
    
       public boolean registrar_transacion (TRANSACCION tr){
        PreparedStatement ps= null;
        Connection con=getConexion();
    
        String R_TR = "insert into transaccion (ID_TRANSACCION, MOVIMIENTO,MONTO,FECHA,DESCRIPCION) VALUES(?,?,?,sysdate(),?)";
        try {
            ps=con.prepareStatement(R_TR);
            ps.setInt(1,tr.getId());
            ps.setString(2,tr.getMov());
            ps.setString(3,tr.getMonto());
            ps.setString(4,tr.getDesc());
            ps.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(SQL_USUARIOS.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }   
    } 
    
       
    
      public int existeUsuario (String trans){
    
        PreparedStatement ps= null;
        ResultSet rs=null;
        Connection con=getConexion();
        
        String sql = "SELECT count(ID_TRANSACCION) FROM transaccion WHERE ID_TRANSACCION=?";
        try {
            ps=con.prepareStatement(sql);
            ps.setString(1,trans);
            rs=ps.executeQuery();
          if(rs.next()){
          return rs.getInt(1);
          }  
          return 1;
        } catch (SQLException ex) {
            Logger.getLogger(TRANSACCION.class.getName()).log(Level.SEVERE, null, ex);
            return 1;
        }   
    }
      
 public boolean cargo (String saldo, String cuenta){
    CONEXION con = new CONEXION();
    java.sql.Connection cn;
    PreparedStatement ps;
    Statement st;
    ResultSet rs;
     
   try {

            cn = con.getConexion();
            ps = cn.prepareStatement("update cuenta set saldo =(saldo-?) where id_cuenta =?");
            ps.setString(1,saldo);
            ps.setString(2,cuenta);
            int res = ps.executeUpdate();

            if (res > 0) {
                JOptionPane.showMessageDialog(null, "Saldo de la cuenta actualizado");
            } 
            cn.close();
        return true;
        } catch (HeadlessException | SQLException e) {
            System.err.println(e);
            return false;
        } 
 }     
      public boolean abono (String saldo, String cuenta){
    CONEXION con = new CONEXION();
    java.sql.Connection cn;
    PreparedStatement ps;
    Statement st;
    ResultSet rs;
     
   try {

            cn = con.getConexion();
            ps = cn.prepareStatement("update cuenta set saldo =(saldo+?) where id_cuenta =?");
            ps.setString(1,saldo);
            ps.setString(2,cuenta);
            int res = ps.executeUpdate();

            if (res > 0) {
                JOptionPane.showMessageDialog(null, "Saldo de la cuenta actualizado");
            } 
            cn.close();
        return true;
        } catch (HeadlessException | SQLException e) {
            System.err.println(e);
            return false;
        } 
 }  
}
