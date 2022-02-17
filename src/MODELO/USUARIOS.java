
package MODELO;

/**
 *
 * @author Josh Bor
 */
public class USUARIOS {
    private String id; 
    private int rol_usuario;
    private String id_persona;
    private String nombre_USR;
    
   public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
  
    public int getRol_usr() {
        return rol_usuario;
    }

    public void setRol_usr(int rol_usr) {
        this.rol_usuario = rol_usr;
    }

    public String getId_persona() {
        return id_persona;
    }

    public void setId_persona(String id_persona) {
        this.id_persona = id_persona;
    }
     public String getNombre_usr() {
        return nombre_USR;
    }

    public void setNombre_usr(String nombre) {
        this.nombre_USR = nombre;
    }

}
