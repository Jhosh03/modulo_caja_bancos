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
public class ROL_USR {
    private String id; 
    private String descripcion;
    
     public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
  
    public String getNombre_rol() {
        return descripcion;
    }

    public void setNombre_rol(String desc) {
        this.descripcion = desc;
    }
}
