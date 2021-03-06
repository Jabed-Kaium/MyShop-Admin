
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author User
 */
public class homepage extends javax.swing.JFrame {

    /**
     * Creates new form homepage
     */
    public homepage() {
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
        buttonAddProduct = new javax.swing.JButton();
        buttonUpdateProduct = new javax.swing.JButton();
        buttonDeleteProduct = new javax.swing.JButton();
        buttonShowProduct = new javax.swing.JButton();
        buttonAddPerson = new javax.swing.JButton();
        buttonUpdatePerson = new javax.swing.JButton();
        buttonDeletePerson = new javax.swing.JButton();
        buttonShowPerson = new javax.swing.JButton();
        buttonShowRecord = new javax.swing.JButton();
        buttonChangePass = new javax.swing.JButton();
        buttonLogout = new javax.swing.JButton();
        buttonClose = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        buttonChangeMyshopUserPass = new javax.swing.JButton();
        buttonClose1 = new javax.swing.JButton();
        buttonMinimize = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 50, -1, -1));

        buttonAddProduct.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonAddProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add.png"))); // NOI18N
        buttonAddProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddProductActionPerformed(evt);
            }
        });
        getContentPane().add(buttonAddProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, -1, -1));

        buttonUpdateProduct.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonUpdateProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/update.png"))); // NOI18N
        buttonUpdateProduct.setAutoscrolls(true);
        buttonUpdateProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonUpdateProductActionPerformed(evt);
            }
        });
        getContentPane().add(buttonUpdateProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 200, -1, -1));

        buttonDeleteProduct.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonDeleteProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/delete.png"))); // NOI18N
        buttonDeleteProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDeleteProductActionPerformed(evt);
            }
        });
        getContentPane().add(buttonDeleteProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 200, -1, -1));

        buttonShowProduct.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonShowProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/show.png"))); // NOI18N
        buttonShowProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonShowProductActionPerformed(evt);
            }
        });
        getContentPane().add(buttonShowProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 200, -1, -1));

        buttonAddPerson.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonAddPerson.setIcon(new javax.swing.ImageIcon(getClass().getResource("/addPerson.png"))); // NOI18N
        buttonAddPerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddPersonActionPerformed(evt);
            }
        });
        getContentPane().add(buttonAddPerson, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 360, -1, -1));

        buttonUpdatePerson.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonUpdatePerson.setIcon(new javax.swing.ImageIcon(getClass().getResource("/updatePerson.png"))); // NOI18N
        buttonUpdatePerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonUpdatePersonActionPerformed(evt);
            }
        });
        getContentPane().add(buttonUpdatePerson, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 360, -1, -1));

        buttonDeletePerson.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonDeletePerson.setIcon(new javax.swing.ImageIcon(getClass().getResource("/deletePerson.png"))); // NOI18N
        buttonDeletePerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDeletePersonActionPerformed(evt);
            }
        });
        getContentPane().add(buttonDeletePerson, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 360, -1, -1));

        buttonShowPerson.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonShowPerson.setIcon(new javax.swing.ImageIcon(getClass().getResource("/showPerson.png"))); // NOI18N
        buttonShowPerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonShowPersonActionPerformed(evt);
            }
        });
        getContentPane().add(buttonShowPerson, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 360, -1, -1));

        buttonShowRecord.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonShowRecord.setIcon(new javax.swing.ImageIcon(getClass().getResource("/showRecord.png"))); // NOI18N
        buttonShowRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonShowRecordActionPerformed(evt);
            }
        });
        getContentPane().add(buttonShowRecord, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 500, -1, -1));

        buttonChangePass.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonChangePass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/changePassword.png"))); // NOI18N
        buttonChangePass.setText("Change Password");
        buttonChangePass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonChangePassActionPerformed(evt);
            }
        });
        getContentPane().add(buttonChangePass, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 37, -1, -1));

        buttonLogout.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logout.png"))); // NOI18N
        buttonLogout.setText("Logout");
        buttonLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLogoutActionPerformed(evt);
            }
        });
        getContentPane().add(buttonLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 50, -1, -1));

        buttonClose.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/closeMedium.png"))); // NOI18N
        buttonClose.setText("Close Application");
        buttonClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCloseActionPerformed(evt);
            }
        });
        getContentPane().add(buttonClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 640, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Add Product");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 290, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Update Product");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 290, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Delete Product");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 290, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Show Product");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 290, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Add Salesperson");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 450, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Update Salesperson");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 450, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Delete Salesperson");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 450, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Show Salesperson");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 450, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("Show Sell Record");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 590, -1, -1));

        buttonChangeMyshopUserPass.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonChangeMyshopUserPass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/changePassword.png"))); // NOI18N
        buttonChangeMyshopUserPass.setText("Change MyshopUser Password");
        buttonChangeMyshopUserPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonChangeMyshopUserPassActionPerformed(evt);
            }
        });
        getContentPane().add(buttonChangeMyshopUserPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        buttonClose1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/closeSmall.png"))); // NOI18N
        buttonClose1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonClose1ActionPerformed(evt);
            }
        });
        getContentPane().add(buttonClose1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 10, -1, -1));

        buttonMinimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/minimize.png"))); // NOI18N
        buttonMinimize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMinimizeActionPerformed(evt);
            }
        });
        getContentPane().add(buttonMinimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 10, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background_medium.jpg"))); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonAddProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddProductActionPerformed
        setVisible(false);
        new addProduct().setVisible(true);
    }//GEN-LAST:event_buttonAddProductActionPerformed

    private void buttonShowPersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonShowPersonActionPerformed
        setVisible(false);
        new showPerson().setVisible(true);
    }//GEN-LAST:event_buttonShowPersonActionPerformed

    private void buttonLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLogoutActionPerformed
        int check = JOptionPane.showConfirmDialog(null,"Confirm logout?", "Select", JOptionPane.YES_NO_OPTION);
        if(check == 0){
            setVisible(false);
            new login().setVisible(true);
        }
    }//GEN-LAST:event_buttonLogoutActionPerformed

    private void buttonChangePassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonChangePassActionPerformed
        setVisible(false);
        new changePassword().setVisible(true);
    }//GEN-LAST:event_buttonChangePassActionPerformed

    private void buttonCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCloseActionPerformed
        int check = JOptionPane.showConfirmDialog(null,"Do you really want to close application?", "Select", JOptionPane.YES_NO_OPTION);
        if(check == 0){
            System.exit(0);
        }
    }//GEN-LAST:event_buttonCloseActionPerformed

    private void buttonUpdateProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonUpdateProductActionPerformed
        new updateProduct().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_buttonUpdateProductActionPerformed

    private void buttonDeleteProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDeleteProductActionPerformed
        new deleteProduct().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_buttonDeleteProductActionPerformed

    private void buttonShowProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonShowProductActionPerformed
        new showProduct().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_buttonShowProductActionPerformed

    private void buttonAddPersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddPersonActionPerformed
        new addPerson().setVisible(true);
    }//GEN-LAST:event_buttonAddPersonActionPerformed

    private void buttonUpdatePersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonUpdatePersonActionPerformed
        setVisible(false);
        new updatePerson().setVisible(true);
    }//GEN-LAST:event_buttonUpdatePersonActionPerformed

    private void buttonDeletePersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDeletePersonActionPerformed
        setVisible(false);
        new deletePerson().setVisible(true);
    }//GEN-LAST:event_buttonDeletePersonActionPerformed

    private void buttonShowRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonShowRecordActionPerformed
        setVisible(false);
        new showRecord().setVisible(true);
    }//GEN-LAST:event_buttonShowRecordActionPerformed

    private void buttonChangeMyshopUserPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonChangeMyshopUserPassActionPerformed
        setVisible(false);
        new changeMyshopUserPassword().setVisible(true);
    }//GEN-LAST:event_buttonChangeMyshopUserPassActionPerformed

    private void buttonClose1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonClose1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_buttonClose1ActionPerformed

    private void buttonMinimizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMinimizeActionPerformed
        this.setExtendedState(homepage.ICONIFIED);
    }//GEN-LAST:event_buttonMinimizeActionPerformed

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
            java.util.logging.Logger.getLogger(homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new homepage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAddPerson;
    private javax.swing.JButton buttonAddProduct;
    private javax.swing.JButton buttonChangeMyshopUserPass;
    private javax.swing.JButton buttonChangePass;
    private javax.swing.JButton buttonClose;
    private javax.swing.JButton buttonClose1;
    private javax.swing.JButton buttonDeletePerson;
    private javax.swing.JButton buttonDeleteProduct;
    private javax.swing.JButton buttonLogout;
    private javax.swing.JButton buttonMinimize;
    private javax.swing.JButton buttonShowPerson;
    private javax.swing.JButton buttonShowProduct;
    private javax.swing.JButton buttonShowRecord;
    private javax.swing.JButton buttonUpdatePerson;
    private javax.swing.JButton buttonUpdateProduct;
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
    // End of variables declaration//GEN-END:variables
}
