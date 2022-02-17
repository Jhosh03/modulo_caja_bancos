
package CONTROLADOR;

import MODELO.PERSONA;
import MODELO.SQL_USUARIOS;
import MODELO.cuenta;
import javax.swing.JOptionPane;

/**
 *
 * @author Josh Bor
 */
public class C_cuenta {
      
    public int R_cuenta(PERSONA per,cuenta cu ){ 
        SQL_USUARIOS modSql = new SQL_USUARIOS();
        cuenta mod_cuenta =new cuenta();
      
    if(modSql.registrar_per(per)){
        if (mod_cuenta.registrar_cuenta(cu)){
        return 1;            
        } 
    }else{
    JOptionPane.showMessageDialog(null," no se ha podido registrar la cuenta ");  
    } 
 return 0;   
}
}