/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package registerform;

import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import loginform.login;

/**
 *
 * @author 63966
 */
public class register extends javax.swing.JFrame {

    /**
     * Creates new form register
     */
    public register() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1left = new javax.swing.JPanel();
        jPanel2right = new javax.swing.JPanel();
        jLabel1Close = new javax.swing.JLabel();
        jLabel2Min = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3HyperlinkSignin = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel11 = new javax.swing.JLabel();
        jPasswordField2 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1left.setBackground(new java.awt.Color(121, 6, 186));

        javax.swing.GroupLayout jPanel1leftLayout = new javax.swing.GroupLayout(jPanel1left);
        jPanel1left.setLayout(jPanel1leftLayout);
        jPanel1leftLayout.setHorizontalGroup(
            jPanel1leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );
        jPanel1leftLayout.setVerticalGroup(
            jPanel1leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 499, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1left, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel2right.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2right.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel2rightMouseClicked(evt);
            }
        });

        jLabel1Close.setFont(new java.awt.Font("Inter", 0, 18)); // NOI18N
        jLabel1Close.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1Close.setText("x");
        jLabel1Close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1CloseMouseClicked(evt);
            }
        });

        jLabel2Min.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        jLabel2Min.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2Min.setText("—");
        jLabel2Min.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MinMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Inter", 1, 24)); // NOI18N
        jLabel1.setText("Get Started.");

        jLabel2.setFont(new java.awt.Font("Inter", 0, 10)); // NOI18N
        jLabel2.setText("Already have an account?");

        jLabel3HyperlinkSignin.setFont(new java.awt.Font("Inter", 0, 10)); // NOI18N
        jLabel3HyperlinkSignin.setForeground(new java.awt.Color(121, 6, 186));
        jLabel3HyperlinkSignin.setText("Signin");
        jLabel3HyperlinkSignin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3HyperlinkSigninMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        jLabel4.setText("Firstname");

        jTextField1.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        jTextField1.setText("John");

        jTextField2.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        jTextField2.setText("Doe");

        jLabel5.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        jLabel5.setText("Lastname");

        jLabel6.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        jLabel6.setText("Birthdate");

        jTextField3.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        jTextField3.setText("Philippines");

        jLabel7.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        jLabel7.setText("Country");

        jLabel8.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        jLabel8.setText("Username");

        jTextField4.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        jTextField4.setText("johndoe3310");

        jLabel10.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        jLabel10.setText("Email");

        jTextField5.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        jTextField5.setText("johndoe3310@gmail.com");

        jLabel9.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        jLabel9.setText("Password");

        jPasswordField1.setText("jPasswordField1");

        jLabel11.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        jLabel11.setText("Confirm Password");

        jPasswordField2.setText("jPasswordField2");

        jButton1.setBackground(new java.awt.Color(121, 6, 186));
        jButton1.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Signup");
        jButton1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        javax.swing.GroupLayout jPanel2rightLayout = new javax.swing.GroupLayout(jPanel2right);
        jPanel2right.setLayout(jPanel2rightLayout);
        jPanel2rightLayout.setHorizontalGroup(
            jPanel2rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2rightLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2Min)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1Close)
                .addGap(21, 21, 21))
            .addGroup(jPanel2rightLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(jPanel2rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6)
                    .addGroup(jPanel2rightLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3HyperlinkSignin))
                    .addComponent(jLabel1)
                    .addGroup(jPanel2rightLayout.createSequentialGroup()
                        .addGroup(jPanel2rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jPasswordField1, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jTextField4, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jDateChooser1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel8)))
                            .addComponent(jLabel9))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel2rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel11)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addComponent(jTextField2)
                            .addComponent(jTextField3)
                            .addComponent(jLabel10)
                            .addComponent(jTextField5)
                            .addComponent(jPasswordField2, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        jPanel2rightLayout.setVerticalGroup(
            jPanel2rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2rightLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1Close)
                    .addComponent(jLabel2Min))
                .addGap(36, 36, 36)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3HyperlinkSignin))
                .addGap(18, 18, 18)
                .addGroup(jPanel2rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(8, 8, 8)
                .addGroup(jPanel2rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField3)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPasswordField2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(89, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2right, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 0, 500, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel2rightMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2rightMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel2rightMouseClicked

    private void jLabel2MinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MinMouseClicked
            // Check for a mouse click event (e.g., a left mouse button click)
        if (evt.getButton() == MouseEvent.BUTTON1) {
            // Minimize the JFrame
            setExtendedState(JFrame.ICONIFIED);
        }
    }//GEN-LAST:event_jLabel2MinMouseClicked

    private void jLabel1CloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1CloseMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel1CloseMouseClicked

    private void jLabel3HyperlinkSigninMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3HyperlinkSigninMouseClicked
        // Assuming you have a login form instance named "loginForm"
        login loginForm = new login();

        // Make the login form visible
        loginForm.setVisible(true);

        // Close or hide the current form if necessary
        this.dispose(); // Close the current form
    }//GEN-LAST:event_jLabel3HyperlinkSigninMouseClicked

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
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel1Close;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel2Min;
    private javax.swing.JLabel jLabel3HyperlinkSignin;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1left;
    private javax.swing.JPanel jPanel2right;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}