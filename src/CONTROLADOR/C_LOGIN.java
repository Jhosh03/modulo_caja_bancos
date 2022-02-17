
package CONTROLADOR;

import MODELO.CONEXION;
import MODELO.HASH;
import MODELO.SQL_USUARIOS;
import MODELO.USUARIOS;
import MODELO.PERSONA;
import MODELO.ROL_USR;



public class C_LOGIN extends CONEXION {
    
public int Ingresar (String usuario,String password){
    
 
    SQL_USUARIOS modSql = new SQL_USUARIOS();
        USUARIOS mod_usr = new USUARIOS();
        PERSONA mod_per = new PERSONA();
        ROL_USR mod_rol = new ROL_USR();
        
            String nuevoPass = HASH.sha1(password);
            mod_usr.setNombre_usr(usuario);
            mod_per.setPassword(nuevoPass);
            if (modSql.login(mod_usr,mod_per,mod_rol)) {
                if (mod_rol.getNombre_rol().equalsIgnoreCase("MASTER")) {
                    return 1;
                }
                if (mod_rol.getNombre_rol().equalsIgnoreCase("ADMINISTRADOR")) {
                    return 2;
                }      
                if (mod_rol.getNombre_rol().equalsIgnoreCase("COLABORADOR")) {
                    return 3;
                } 
            }
             return 0;         
}
}
