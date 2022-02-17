/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODELO;

import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Josh Bor
 */
public class cuenta extends CONEXION {
    private String id;
    private String nombre_cuenta;
    private String persona;
    private String saldo;
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public String getNom_cuenta() {
        return nombre_cuenta;
    }

    public void setNom_cuenta(String nom) {
        this.nombre_cuenta = nom;
    }
    
    public String getPersona(){
    return persona;
    }
    
    public void setPersona( String per){
    this.persona= per;
    }
    
    public String getSaldo(){
    return saldo;
    }
    public void setSaldo( String sal){
    
    this.saldo=sal;
    }
   public boolean registrar_cuenta (cuenta usr){
        PreparedStatement ps= null;
        Connection con=getConexion();
    
        String d_usr = "insert into cuenta (ID_CUENTA, NOMBRE_CUENTA,PERSONA_ID_PERSONA,SALDO) VALUES(?,?,?,?)";
        try {
            ps=con.prepareStatement(d_usr);
            ps.setString(1,usr.getId());
            ps.setString(2,usr.getNom_cuenta());
            ps.setString(3,usr.getPersona());
            ps.setString(4,usr.getSaldo());
            ps.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(SQL_USUARIOS.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }   
    } 
   
    public boolean esEmail(String correo) {
		
        // Patrón para validar el email
        Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
		
        Matcher mather = pattern.matcher(correo);
		
        return mather.find();
    
}
    
}
