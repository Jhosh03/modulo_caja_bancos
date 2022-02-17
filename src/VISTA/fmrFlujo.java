/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VISTA;

import MODELO.CONEXION;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.HeadlessException;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import static java.awt.print.Printable.NO_SUCH_PAGE;
import static java.awt.print.Printable.PAGE_EXISTS;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Josh Bor
 */
public class fmrFlujo extends javax.swing.JFrame implements Printable {
  FondoPanel fondo =new FondoPanel();
    CONEXION con = new CONEXION();
    Connection cn;
    PreparedStatement ps;
    Statement st;
    ResultSet rs; 
    DefaultTableModel md;
  
    /**
     * Creates new form fmrFlujo
     */
        public fmrFlujo() {
        this.setContentPane(fondo);
        initComponents();
        this.setLocationRelativeTo(null);
        lbdSaldo_cuenta.setVisible(false);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        pnlFlujo = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lblSaldo = new javax.swing.JLabel();
        lbdSaldo_cuenta = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtNumCuenta = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        TbIngresos = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblEgresos = new javax.swing.JTable();
        tbnVolver = new javax.swing.JButton();
        btnImprimir = new javax.swing.JButton();
        btnNueva_consulta = new javax.swing.JButton();
        btnMostrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setText("FLUJO DE EFECTIVO ");

        pnlFlujo.setBackground(new java.awt.Color(255, 255, 255));
        pnlFlujo.setBorder(javax.swing.BorderFactory.createTitledBorder("FLUJO DE EFECTIVO"));

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setText("SALDO DE LA CUENTA");

        lbdSaldo_cuenta.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbdSaldo_cuenta.setText("saldo");

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel4.setText("NUMERO DE CUENTA");

        jScrollPane1.setViewportView(txtNumCuenta);

        TbIngresos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NUMERO DE TRANSACCION", "NUMERO DE CUENTA", "MOVIMIENTO", "MONTO", "DESCRIPCION", "FECHA"
            }
        ));
        jScrollPane2.setViewportView(TbIngresos);

        tblEgresos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NUMERO DE TRANSACCION", "NUMERO DE CUENTA", "MOVIMIENTO", "MONTO", "DESCRIPCION", "FECHA"
            }
        ));
        jScrollPane3.setViewportView(tblEgresos);

        javax.swing.GroupLayout pnlFlujoLayout = new javax.swing.GroupLayout(pnlFlujo);
        pnlFlujo.setLayout(pnlFlujoLayout);
        pnlFlujoLayout.setHorizontalGroup(
            pnlFlujoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
            .addComponent(jScrollPane3)
            .addGroup(pnlFlujoLayout.createSequentialGroup()
                .addGroup(pnlFlujoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlFlujoLayout.createSequentialGroup()
                        .addGap(302, 302, 302)
                        .addComponent(lblSaldo))
                    .addGroup(pnlFlujoLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlFlujoLayout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lbdSaldo_cuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlFlujoLayout.setVerticalGroup(
            pnlFlujoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFlujoLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(pnlFlujoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlFlujoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lbdSaldo_cuenta))
                .addGap(26, 26, 26)
                .addComponent(lblSaldo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tbnVolver.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tbnVolver.setText("VOLVER");
        tbnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbnVolverActionPerformed(evt);
            }
        });

        btnImprimir.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnImprimir.setText("IMPRIMIR");
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });

        btnNueva_consulta.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnNueva_consulta.setText("NUEVA CONSULTA");
        btnNueva_consulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNueva_consultaActionPerformed(evt);
            }
        });

        btnMostrar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnMostrar.setText("MOSTRAR");
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(pnlFlujo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 280, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(335, 335, 335))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(btnMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnNueva_consulta, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnImprimir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tbnVolver)
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(pnlFlujo, javax.swing.GroupLayout.PREFERRED_SIZE, 541, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tbnVolver)
                    .addComponent(btnImprimir)
                    .addComponent(btnNueva_consulta)
                    .addComponent(btnMostrar))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed

        if(!txtNumCuenta.getText().equals("")){
                           
        listar_ingresos(txtNumCuenta.getText());
        listar_egresos(txtNumCuenta.getText());
        saldo(txtNumCuenta.getText());
               
        }else{
        JOptionPane.showMessageDialog(null,"Debe proporcionar un número de cuenta");
        }
         
        
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMostrarActionPerformed

    private void btnNueva_consultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNueva_consultaActionPerformed
 
    fmrFlujo mostrar = new fmrFlujo();
    mostrar.setVisible(true);
    this.setVisible(false);
   
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNueva_consultaActionPerformed

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
 try{
          PrinterJob imp =PrinterJob.getPrinterJob();
          imp.setPrintable(this);
          boolean tp=imp.printDialog();
          if(tp){
         
              imp.print();
          }
          }catch(PrinterException pex){
 JOptionPane.showMessageDialog(null, "ERROR DE PROGRAMA","ERROR\n"+pex,JOptionPane.INFORMATION_MESSAGE);
}
        // TODO add your handling code here:
    }//GEN-LAST:event_btnImprimirActionPerformed

    private void tbnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbnVolverActionPerformed
         vista_colaborador mostrar= new vista_colaborador();
         mostrar.setVisible(true);
         this.setVisible(false);

        // TODO add your handling code here:
    }//GEN-LAST:event_tbnVolverActionPerformed

    void listar_ingresos(String id_cuenta) {
        String sql = "select ID_TRANSACCION,ID_CUENTA,MOVIMIENTO,MONTO,DESCRIPCION,FECHA \n"
                + "from cuenta_transaccion CT inner join transaccion T \n"
                + "on CT.TRANSACCION_ID_TRANSACCION=T.ID_TRANSACCION inner join cuenta C \n"
                + "on CT.CUENTA_ID_CUENTA=C.ID_CUENTA where C.ID_CUENTA=? AND MOVIMIENTO='ABONO';";
        try {
            cn = con.getConexion();
            ps = cn.prepareStatement(sql);
            ps.setString(1, id_cuenta);
            rs = ps.executeQuery();
            Object[] ROL = new Object[6];
            md = (DefaultTableModel) TbIngresos.getModel();
            while (rs.next()) {
                ROL[0] = rs.getInt("ID_TRANSACCION");
                ROL[1] = rs.getString("ID_CUENTA");
                ROL[2] = rs.getString("MOVIMIENTO");
                ROL[3] = rs.getInt("MONTO");
                ROL[4] = rs.getString("DESCRIPCION");
                ROL[5] = rs.getString("FECHA");
                md.addRow(ROL);
            }
            TbIngresos.setModel(md);
            cn.close();
        } catch (SQLException e) {
            System.err.println(e);
            JOptionPane.showMessageDialog(null," cuenta no encontrada");
        }
    }
    
      void listar_egresos(String id_cuenta) {
        String sql = "select ID_TRANSACCION,ID_CUENTA,MOVIMIENTO,MONTO,DESCRIPCION,FECHA \n" +
"from cuenta_transaccion CT inner join transaccion T \n" +
"on CT.TRANSACCION_ID_TRANSACCION=T.ID_TRANSACCION inner join cuenta C \n" +
"on CT.CUENTA_ID_CUENTA=C.ID_CUENTA where C.ID_CUENTA=? AND MOVIMIENTO='CARGO'";
        try {
            cn = con.getConexion();
            ps = cn.prepareStatement(sql);
            ps.setString(1, id_cuenta);
            rs = ps.executeQuery();
            Object[] ROL = new Object[6];
            md = (DefaultTableModel) tblEgresos.getModel();
            while (rs.next()) {
                ROL[0] = rs.getInt("ID_TRANSACCION");
                ROL[1] = rs.getString("ID_CUENTA");
                ROL[2] = rs.getString("MOVIMIENTO");
                ROL[3] = rs.getInt("MONTO");
                ROL[4] = rs.getString("DESCRIPCION");
                ROL[5] = rs.getString("FECHA");
                md.addRow(ROL);
            }
            tblEgresos.setModel(md);
            cn.close();
        } catch (SQLException e) {
            System.err.println(e);
            JOptionPane.showMessageDialog(null," cuenta no encontrada");
        }
        
    }
      
      void saldo(String id_cuenta){
        
          String sql="select saldo from cuenta where ID_CUENTA= ?";
          try {
            cn = con.getConexion();
            ps = cn.prepareStatement(sql);
            ps.setString(1, id_cuenta);
            rs = ps.executeQuery();

            if (rs.next()) {
                lbdSaldo_cuenta.setVisible(true);
                lbdSaldo_cuenta.setText(rs.getString("saldo"));
            } else {
                JOptionPane.showMessageDialog(null, "Cuenta no encontrada");
            }
         cn.close();
        } catch (HeadlessException | SQLException e) {
            System.err.println(e);
        }    
       
      }
         
      
      
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(fmrFlujo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fmrFlujo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fmrFlujo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fmrFlujo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fmrFlujo().setVisible(true);
            }
        });
    }
 @Override
    public int print(Graphics graf, PageFormat pagform, int index) throws PrinterException {
       
            if(index>0){
    return NO_SUCH_PAGE;
    
    }  
    Graphics2D hub= (Graphics2D) graf;
    hub.translate(pagform.getImageableX()+50,pagform.getImageableY()+50);
    hub.scale(0.5,0.5);
    
    pnlFlujo.printAll(graf);
    return PAGE_EXISTS;
         
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TbIngresos;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnMostrar;
    private javax.swing.JButton btnNueva_consulta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lbdSaldo_cuenta;
    private javax.swing.JLabel lblSaldo;
    private javax.swing.JPanel pnlFlujo;
    private javax.swing.JTable tblEgresos;
    private javax.swing.JButton tbnVolver;
    private javax.swing.JTextPane txtNumCuenta;
    // End of variables declaration//GEN-END:variables
}

