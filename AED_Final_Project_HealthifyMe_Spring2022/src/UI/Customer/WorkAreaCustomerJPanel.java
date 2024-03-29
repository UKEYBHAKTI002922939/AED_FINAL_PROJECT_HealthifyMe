/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.Customer;


import Business.EcoSystem;
import Business.Network.Network;
import Business.Organization.CustomerOrganization;
import Business.UserAccount.UserAccount;
import Business.Utils.OTP;
import Business.Utils.SendEmail;
import Business.Utils.ValidationUtils;
import java.awt.CardLayout;
import static java.time.Clock.system;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Pushkar Dandekar
 */
public class WorkAreaCustomerJPanel extends javax.swing.JPanel {

    /**
     * Creates new form WorkAreaCustomerJPanel
     */
    
    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private EcoSystem system;
    private Network network;
    
    
    public WorkAreaCustomerJPanel(JPanel userProcessContainer, CustomerOrganization organization, EcoSystem system, Network network) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.network = network;
        jButton1.setEnabled(true);
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
        userNameTextField = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        emailText = new javax.swing.JTextField();
        passwordTextField = new javax.swing.JPasswordField();
        image = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(0, 153, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(1800, 1800));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Username");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 160, 100, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Password");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 220, 90, -1));

        userNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userNameTextFieldActionPerformed(evt);
            }
        });
        jPanel1.add(userNameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 160, 140, 20));

        jButton1.setBackground(new java.awt.Color(255, 255, 204));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("LOGIN");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 480, 140, -1));

        jButton2.setBackground(new java.awt.Color(255, 255, 204));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setText("REGISTER");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 480, 190, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("WELCOME");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 40, 210, -1));

        jButton3.setBackground(new java.awt.Color(255, 255, 204));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton3.setText("GENERATE OTP");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 380, 220, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Email");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 290, 70, -1));
        jPanel1.add(emailText, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 290, 140, -1));
        jPanel1.add(passwordTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 220, 140, -1));

        image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/customer.login.jpg"))); // NOI18N
        jPanel1.add(image, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1620, 1030));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1880, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void userNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userNameTextFieldActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        UserAccount userAccount = system.getUserAccountDirectory().authenticateUser(userNameTextField.getText(), passwordTextField.getText());
        if (userAccount == null) {
            JOptionPane.showMessageDialog(null, "Invalid credentials");
            return;
        } else {
            JOptionPane.showMessageDialog(null, "Login successful");
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            userProcessContainer.add("RequestLabTestJPanel", new CustomerLoginWorkAreaJPanel(userProcessContainer, system, userAccount, network));
            layout.next(userProcessContainer);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("RequestLabTestJPanel", new WorkAreaCustomerRegisterJPanel(userProcessContainer, system));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        if(emailText.getText().isEmpty() || !ValidationUtils.validateEmail(emailText.getText())) {

            JOptionPane.showMessageDialog(this, "Email not correct");
            return;
        }
        OTP otp = new OTP();
        String otpGenerated =  otp.getOTP(4);
        SendEmail.sendMail(otpGenerated, emailText.getText());
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("OtpJPanel", new OtpJPanel(userProcessContainer, otpGenerated));
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_jButton3ActionPerformed

    public void validateOtp(boolean f) {
        if(f) {
        jButton1.setEnabled(true);
        } else {
            jButton1.setEnabled(false);
        }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField emailText;
    private javax.swing.JLabel image;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField passwordTextField;
    private javax.swing.JTextField userNameTextField;
    // End of variables declaration//GEN-END:variables
}
