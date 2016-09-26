/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.math.graphic.main;

import ec.edu.espe.math.graphic.util.GeneralException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author Jonathan
 */
public class FrmLogin extends javax.swing.JFrame {

    /**
     * Creates new form FrmLogin
     */
    public FrmLogin() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        txtPassword = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(440, 330));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Footlight MT Light", 1, 32)); // NOI18N
        jLabel1.setText("Bienvenido");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(120, 70, 170, 40);

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 28)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 102, 0));
        jLabel2.setText("GEOMETRY SOFTWARE");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(40, 10, 340, 40);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Usuario:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(110, 130, 50, 20);

        txtUser.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(txtUser);
        txtUser.setBounds(180, 130, 100, 23);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Contraseña:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(110, 180, 80, 14);

        btnLogin.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        btnLogin.setText("Ingresar");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogin);
        btnLogin.setBounds(150, 240, 100, 40);

        txtPassword.setMinimumSize(new java.awt.Dimension(16, 20));
        getContentPane().add(txtPassword);
        txtPassword.setBounds(200, 180, 120, 20);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        String password = new String (txtPassword.getPassword());
        if(!((txtUser.getText().equals(""))||(password.equals("")))){
            try{
                checkUser(txtUser.getText());
                checkPassword(password);
                
            }
            catch(GeneralException e){
                JOptionPane.showMessageDialog(rootPane, e.getMessage());
                txtUser.setText("");
                txtPassword.setText("");
            }
        }
        else{
            JOptionPane.showMessageDialog(rootPane, "Campos incompletos");
            txtUser.setText("");
            txtPassword.setText("");
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private static void checkUser(String userName)throws GeneralException{
        boolean val;
        val=userName.equals("Alejandro");
        if(!val){
            throw new GeneralException("Nombre de Usuario incorrecto ...");
        }
    }
    
    private static void checkPassword(String password)throws GeneralException{
        boolean val;
        val=password.equals("12345");
        if(!val){
            throw new GeneralException("Contraseña incorrecta ...");
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
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
