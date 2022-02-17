/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VISTA;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
import MODELO.CONEXION;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import static java.awt.print.Printable.NO_SUCH_PAGE;
import static java.awt.print.Printable.PAGE_EXISTS;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import javax.swing.JOptionPane;

/**
 *
 * @author Josh Bor
 */
public class FrmValidar_T extends javax.swing.JFrame implements Printable{
    
    FondoPanel fondo = new FondoPanel();
    CONEXION con = new CONEXION();
    Connection cn;
    PreparedStatement ps;
    Statement st;
    ResultSet rs;
    DefaultTableModel md;
    /**
     * Creates new form FrmValidar_T
     */
    public FrmValidar_T() {
        this.setContentPane(fondo);
        initComponents();
        this.setLocationRelativeTo(null);
        listar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        pnlDatos = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTransacciones = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtNumC = new javax.swing.JTextPane();
        btnValidar = new javax.swing.JButton();
        btnImprimir = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("VALIDAR TRANSACCIONES");

        pnlDatos.setBackground(new java.awt.Color(255, 255, 255));
        pnlDatos.setBorder(javax.swing.BorderFactory.createTitledBorder("TRANSACCIONES"));

        tblTransacciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No. TRANSACCION", "No. CUENTA", "MOVIMIENTO", "MONTO", "FECHA", "ESTADO"
            }
        ));
        jScrollPane1.setViewportView(tblTransacciones);

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setText("NUMERO DE TRANSACCION");

        jScrollPane2.setViewportView(txtNumC);

        javax.swing.GroupLayout pnlDatosLayout = new javax.swing.GroupLayout(pnlDatos);
        pnlDatos.setLayout(pnlDatosLayout);
        pnlDatosLayout.setHorizontalGroup(
            pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 796, Short.MAX_VALUE)
                    .addGroup(pnlDatosLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlDatosLayout.setVerticalGroup(
            pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        btnValidar.setText("VALIDAR");
        btnValidar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnValidarActionPerformed(evt);
            }
        });

        btnImprimir.setText("IMPRIMIR");
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });

        btnVolver.setText("VOLVER");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(275, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(259, 259, 259))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(btnValidar)
                .addGap(35, 35, 35)
                .addComponent(btnImprimir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnVolver)
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(12, 12, 12)
                .addComponent(pnlDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnValidar)
                            .addComponent(btnImprimir))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnVolver)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnValidarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnValidarActionPerformed
 if(!txtNumC.getText().equals("")){
                           
       validar(txtNumC.getText());
               
        }else{
        JOptionPane.showMessageDialog(null,"Debe proporcionar un número de transacción");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btnValidarActionPerformed

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

        // TODO add your handling code here:
    }//GEN-LAST:event_btnImprimirActionPerformed
    }
    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
         ADMINISTRADOR mostrar= new ADMINISTRADOR();
         mostrar.setVisible(true);
         this.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVolverActionPerformed
    
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
            java.util.logging.Logger.getLogger(FrmValidar_T.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmValidar_T.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmValidar_T.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmValidar_T.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmValidar_T().setVisible(true);
            }
        });
    }
    
    void listar() {

        String sql = "select ID_TRANSACCION,CUENTA_ID_CUENTA,MOVIMIENTO,MONTO,FECHA, ESTADO from cuenta_transaccion CT inner join\n" +
" transaccion T on CT.TRANSACCION_ID_TRANSACCION =T.ID_TRANSACCION";

        try {
            cn = con.getConexion();
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            Object[] tickets = new Object[7];
            md = (DefaultTableModel) tblTransacciones.getModel();
            while (rs.next()) {
                tickets[0] = rs.getInt("ID_TRANSACCION");
                tickets[1] = rs.getString("CUENTA_ID_CUENTA");
                tickets[2] = rs.getString("MOVIMIENTO");
                tickets[3] = rs.getString("MONTO");
                tickets[4] = rs.getString("FECHA");
                tickets[5] = rs.getString("ESTADO");
                md.addRow(tickets);
            }
            tblTransacciones.setModel(md);
        } catch (SQLException e) {
            System.err.println(e);
        }
    
    }
public void validar (String id_cuenta) {
        String sql = "update transaccion set estado = 'VALIDADA' where id_transaccion = ? ";
        try {
            cn = con.getConexion();
            ps = cn.prepareStatement(sql);
            ps.setString(1, id_cuenta);
            ps.execute();
            actualizar();
            JOptionPane.showMessageDialog(null," transaccion validada");
        } catch (SQLException e) {
            System.err.println(e);
            JOptionPane.showMessageDialog(null," transaccion no validada");
        }
    }
private void actualizar() {

    FrmValidar_T mostrar = new FrmValidar_T();
    mostrar.setVisible(true);
    this.setVisible(false);

}

@Override
    public int print(Graphics graf, PageFormat pagform, int index) throws PrinterException {
       
            if(index>0){
    return NO_SUCH_PAGE;
    
    }  
    Graphics2D hub= (Graphics2D) graf;
    hub.translate(pagform.getImageableX()+50,pagform.getImageableY()+50);
    hub.scale(0.5,0.5);
    
    pnlDatos.printAll(graf);
    return PAGE_EXISTS;
         
    }
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnValidar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel pnlDatos;
    private javax.swing.JTable tblTransacciones;
    public javax.swing.JTextPane txtNumC;
    // End of variables declaration//GEN-END:variables
}
