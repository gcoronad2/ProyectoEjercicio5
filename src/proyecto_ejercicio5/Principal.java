/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_ejercicio5;

import javax.swing.JOptionPane;

/**
 *
 * @author GABRIEL
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtDescLey = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtSueldo = new javax.swing.JTextField();
        txtDescSegS = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtDescSegF = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtDescCaja = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cmdBorrar = new javax.swing.JButton();
        cmdCalcular = new javax.swing.JButton();
        txtMontoT = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("EMPRESA - DESCUENTOS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel2.setText("Digite el sueldo base del trabajador:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        txtDescLey.setEditable(false);
        jPanel1.add(txtDescLey, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 220, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel3.setText("Por ley de política pública:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel4.setText("MONTOS DE DESCUENTOS:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        txtSueldo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSueldoKeyTyped(evt);
            }
        });
        jPanel1.add(txtSueldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 220, 30));

        txtDescSegS.setEditable(false);
        jPanel1.add(txtDescSegS, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 220, 220, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel5.setText("Por seguro social:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, -1, -1));

        txtDescSegF.setEditable(false);
        jPanel1.add(txtDescSegF, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 220, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel6.setText("Por seguro forzoso:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));

        txtDescCaja.setEditable(false);
        jPanel1.add(txtDescCaja, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 280, 220, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel7.setText("Por caja de ahorro:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, -1, -1));

        cmdBorrar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cmdBorrar.setText("Borrar");
        cmdBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdBorrarActionPerformed(evt);
            }
        });
        jPanel1.add(cmdBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 148, 80, 30));

        cmdCalcular.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cmdCalcular.setText("Calcular");
        cmdCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCalcularActionPerformed(evt);
            }
        });
        jPanel1.add(cmdCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 98, 80, 30));

        txtMontoT.setEditable(false);
        jPanel1.add(txtMontoT, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 220, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel9.setText("MONTO TOTAL:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 510, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 425, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdBorrarActionPerformed
        // TODO add your handling code here:
        txtSueldo.setText("");
        txtMontoT.setText("");
        txtDescSegS.setText("");
        txtDescSegF.setText("");
        txtDescLey.setText("");
        txtDescCaja.setText("");
    }//GEN-LAST:event_cmdBorrarActionPerformed

    private void cmdCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCalcularActionPerformed
        // TODO add your handling code here:
        if (txtSueldo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Digite el sueldo", "ERROR", JOptionPane.ERROR_MESSAGE);
            txtSueldo.requestFocusInWindow();
        }
        else if (txtSueldo.getText().equals(".")) {
            JOptionPane.showMessageDialog(this, "No puede operar puntos", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        else {
            double sueldo, descSegS, descSegF, descLey, descCaja, montoT;
            sueldo = Double.parseDouble(txtSueldo.getText());
            descLey = sueldo * 0.01;
            descSegS = sueldo * 0.04;
            descSegF = sueldo * 0.005;
            descCaja = sueldo * 0.05;
            montoT = sueldo - (descLey + descSegS+ descSegF + descCaja);
            txtDescLey.setText(""+descLey);
            txtDescSegS.setText(""+descSegS);
            txtDescSegF.setText(""+descSegF);
            txtDescCaja.setText(""+descCaja);
            txtMontoT.setText(""+montoT);
        }
    }//GEN-LAST:event_cmdCalcularActionPerformed

    private void txtSueldoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSueldoKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar(); 
        if(!Character.isDigit(c) && c != '.') { 
              getToolkit().beep(); 
              evt.consume(); 
        }
        if (c == '.' && txtSueldo.getText().contains(".")) {
            evt.consume(); 
        }
    }//GEN-LAST:event_txtSueldoKeyTyped

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdBorrar;
    private javax.swing.JButton cmdCalcular;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtDescCaja;
    private javax.swing.JTextField txtDescLey;
    private javax.swing.JTextField txtDescSegF;
    private javax.swing.JTextField txtDescSegS;
    private javax.swing.JTextField txtMontoT;
    private javax.swing.JTextField txtSueldo;
    // End of variables declaration//GEN-END:variables
}
