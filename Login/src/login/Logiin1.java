/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import clases.Login;
import clases.usuario;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author KEVIN SANCHEZ
 */
public class Logiin1 extends javax.swing.JFrame {

    /**
     * Creates new form Logiin1
     */
    Login conexion = new Login();

    public Logiin1() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    public void iniciar() throws SQLException {
        String sql = "SELECT  usuario, contrasena FROM public.usuarios where usuario='" + usu.getText() + "' and contrasena='" + contra.getText() + "';";
        ResultSet contenedor = conexion.Consulta(sql);
        if (contenedor.next()) {
            JOptionPane.showMessageDialog(this, "INICIO DE SESION CORRECTO");
        } else {
            JOptionPane.showMessageDialog(this, "CONTRASEÑA O USUARIO INCORRECTO");
        }
    }
    public void restablecer() throws SQLException{
         String sql = "SELECT  usuario FROM public.usuarios where usuario='" + usu1.getText()+"'";
        ResultSet contenedor = conexion.Consulta(sql);
        if (contenedor.next()) {
            usuario nuevo1= new usuario();
            nuevo1.setUsuario(usu1.getText());
            nuevo1.setContra(contra1.getText().toString());
            nuevo1.Modificar();
        } else {
            JOptionPane.showMessageDialog(this, "USUARIO NO ENCONTRADO");
        }
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
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        usu1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        contra1 = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        usu = new javax.swing.JTextField();
        contra = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 255, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jPanel1.setForeground(new java.awt.Color(153, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setText("RESTABLECER CONTRASEÑA");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 152, 25));

        jLabel8.setText("Usuario:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, -1, -1));
        jPanel2.add(usu1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 89, 160, 20));

        jLabel10.setText("contraseña:");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, -1, -1));

        jLabel9.setText("Guardar");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, -1, -1));

        jLabel11.setText("Volver");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, -1, -1));

        contra1.setText("jPasswordField1");
        jPanel2.add(contra1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 129, 160, 20));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 580, 310));

        jLabel1.setFont(new java.awt.Font("Stencil", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Usuario:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 180, 90, -1));

        jLabel2.setFont(new java.awt.Font("Stencil", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Contraseña:");
        jLabel2.setDoubleBuffered(true);
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 260, -1, -1));

        usu.setBackground(new java.awt.Color(102, 255, 255));
        usu.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        usu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuActionPerformed(evt);
            }
        });
        jPanel1.add(usu, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 210, 190, 30));

        contra.setBackground(new java.awt.Color(102, 255, 255));
        contra.setText("jPasswordField1");
        contra.setBorder(null);
        contra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                contraMouseClicked(evt);
            }
        });
        jPanel1.add(contra, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 300, 190, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login/logo desenfocado4.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 0, 960, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 2, 10)); // NOI18N
        jLabel4.setText("REGISTRARSE");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 370, -1, 10));

        jLabel6.setBackground(new java.awt.Color(153, 255, 255));
        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("INICIAR SESIÓN");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 340, -1, -1));

        jLabel5.setText("Restablacer Contraseña");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 390, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 510, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usuActionPerformed

    private void contraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contraMouseClicked
        contra.setText("");
    }//GEN-LAST:event_contraMouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        try {
            restablecer();
        } catch (SQLException ex) {
            Logger.getLogger(Logiin1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel9MouseClicked

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
            java.util.logging.Logger.getLogger(Logiin1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Logiin1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Logiin1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Logiin1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Logiin1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField contra;
    private javax.swing.JPasswordField contra1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField usu;
    private javax.swing.JTextField usu1;
    // End of variables declaration//GEN-END:variables
}