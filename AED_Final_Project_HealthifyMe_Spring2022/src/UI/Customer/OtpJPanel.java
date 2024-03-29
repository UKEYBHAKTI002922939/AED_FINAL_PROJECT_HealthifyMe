/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.Customer;

import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Pushkar Dandekar
 */
public class OtpJPanel extends javax.swing.JPanel {

    /**
     * Creates new form OtpJPanel
     */
    JPanel userProcessContainer;
    String otp;
    
    public OtpJPanel(JPanel userProcessContainer, String otp) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.otp = otp;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        submitJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        otpTextField = new javax.swing.JTextField();
        image = new javax.swing.JLabel();

        setLayout(null);

        submitJButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        submitJButton.setText("VALIDATE OTP");
        submitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitJButtonActionPerformed(evt);
            }
        });
        add(submitJButton);
        submitJButton.setBounds(530, 230, 170, 25);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("OTP");
        add(jLabel1);
        jLabel1.setBounds(500, 160, 50, 22);
        add(otpTextField);
        otpTextField.setBounds(620, 160, 140, 19);

        image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/customer.login.jpg"))); // NOI18N
        add(image);
        image.setBounds(0, 0, 1600, 840);
    }// </editor-fold>//GEN-END:initComponents

    private void submitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJButtonActionPerformed
        if(validateOtp(otp)) {
            JOptionPane.showMessageDialog(this, "Correct OTP");
            userProcessContainer.remove(this);
            Component[] componentArray = userProcessContainer.getComponents();
            Component component = componentArray[componentArray.length - 1];
            WorkAreaCustomerJPanel dwjp = (WorkAreaCustomerJPanel) component;
            dwjp.validateOtp(true);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.previous(userProcessContainer);
        } else {
            JOptionPane.showMessageDialog(this, "Incorrect OTP");
            userProcessContainer.remove(this);
            Component[] componentArray = userProcessContainer.getComponents();
            Component component = componentArray[componentArray.length - 1];
            WorkAreaCustomerJPanel dwjp = (WorkAreaCustomerJPanel) component;
            dwjp.validateOtp(false);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.previous(userProcessContainer);
        }
    }//GEN-LAST:event_submitJButtonActionPerformed

    private boolean validateOtp(String otp) {
        if(otpTextField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Otp cannot be empty");
        }
        if(otpTextField.getText().equals(otp)) {
            return true;
        } else {
            return false;
        }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel image;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField otpTextField;
    private javax.swing.JButton submitJButton;
    // End of variables declaration//GEN-END:variables
}
