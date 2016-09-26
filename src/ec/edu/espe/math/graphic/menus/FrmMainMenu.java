/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.math.graphic.menus;

/**
 *
 * @author Jonathan
 */
public class FrmMainMenu extends javax.swing.JFrame {

    /**
     * Creates new form FrmMainMenu
     */
    public FrmMainMenu() {
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

        btnSolids = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnShapes = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(565, 375));
        getContentPane().setLayout(null);

        btnSolids.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/math/graphic/pictures/solidsShapes.png"))); // NOI18N
        btnSolids.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSolidsActionPerformed(evt);
            }
        });
        getContentPane().add(btnSolids);
        btnSolids.setBounds(290, 120, 240, 190);

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 32)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 102, 0));
        jLabel2.setText("GEOMETRY SOFTWARE");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(80, 20, 400, 40);

        btnShapes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/math/graphic/pictures/geometricShapes.png"))); // NOI18N
        btnShapes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShapesActionPerformed(evt);
            }
        });
        getContentPane().add(btnShapes);
        btnShapes.setBounds(20, 120, 240, 190);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel1.setText("Figuras Geométricas");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(60, 80, 180, 21);

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel3.setText("Sólidos");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(380, 80, 70, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSolidsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSolidsActionPerformed
//        FrmSolidsMenu solidsMenu = new FrmSolidsMenu();
//        solidsMenu.setVisible(true);
    }//GEN-LAST:event_btnSolidsActionPerformed

    private void btnShapesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShapesActionPerformed
        FrmShapesMenu shapesMenu = new FrmShapesMenu();
        shapesMenu.setVisible(true);
    }//GEN-LAST:event_btnShapesActionPerformed

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
            java.util.logging.Logger.getLogger(FrmMainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnShapes;
    private javax.swing.JButton btnSolids;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
