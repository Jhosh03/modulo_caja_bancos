/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROLADOR;
import MODELO.TRANSACCION;
import MODELO.CUENTA_TRANSACCION;
import javax.swing.JOptionPane;

/**
 *
 * @author Josh Bor
 */
public class C_TRANSACCION {
    
public int R_transaccion (TRANSACCION tr){

    TRANSACCION mod_tran = new TRANSACCION();
    
    if (mod_tran.registrar_transacion(tr)){
    return 1;
    }else{
    JOptionPane.showMessageDialog(null, "error al registrar");
    }
return 0;
}  

public int R_CUENTA_TRAN (CUENTA_TRANSACCION tr){

    CUENTA_TRANSACCION mod_CUENTA_TRAN = new CUENTA_TRANSACCION();
    
    if (mod_CUENTA_TRAN.cuenta_transaccion(tr)){
    return 1;
    }else{
    JOptionPane.showMessageDialog(null, "error al registrar");
    }
return 0;
}    
    
}
