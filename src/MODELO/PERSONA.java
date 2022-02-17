/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODELO;

/**
 *
 * @author Josh Bor
 */
public class PERSONA {
      private String id; 
    private String password;
   private String nombre;
      private String apellido;
    private String correo;
    
   public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
  
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nom) {
        this.nombre = nom;
    }
    public String getApellido() {
        return apellido;
    }

    public void setApellido(String Ap) {
        this.apellido = Ap;
    }
     public String getCorreo() {
        return correo;
    }

    public void setCorreo(String Correo) {
        this.correo = Correo;
    }
}
