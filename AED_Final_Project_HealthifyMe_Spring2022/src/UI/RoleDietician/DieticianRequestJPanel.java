/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.RoleDietician;

/**
 *
 * @author anky
 */
public class DieticianRequestJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DieticianRequestJPanel
     */
    public DieticianRequestJPanel() {
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
        enterprise = new javax.swing.JLabel();
        value = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        message = new javax.swing.JTextField();
        RequestTaskButton = new javax.swing.JButton();
        back = new javax.swing.JButton();
        image = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        enterprise.setFont(new java.awt.Font("Sitka Display", 1, 24)); // NOI18N
        enterprise.setText("Enterprise :");
        jPanel1.add(enterprise, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, -1, -1));
        jPanel1.add(value, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 50, 90, 30));

        jLabel1.setFont(new java.awt.Font("Sitka Heading", 1, 18)); // NOI18N
        jLabel1.setText("Message  ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, -1, -1));
        jPanel1.add(message, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, 180, -1));

        RequestTaskButton.setBackground(new java.awt.Color(255, 255, 255));
        RequestTaskButton.setFont(new java.awt.Font("Sitka Heading", 1, 24)); // NOI18N
        RequestTaskButton.setText("Request Task");
        RequestTaskButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 204, 204), 5, true));
        jPanel1.add(RequestTaskButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, 160, 30));

        back.setBackground(new java.awt.Color(255, 255, 255));
        back.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        back.setText("Back");
        back.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel1.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 50, 30));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 570, 320));

        image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/RoleDietician/dietician (2).jpg"))); // NOI18N
        add(image, new org.netbeans.lib.awtextra.AbsoluteConstraints(-3, 6, 1190, 530));
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_backActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton RequestTaskButton;
    private javax.swing.JButton back;
    private javax.swing.JLabel enterprise;
    private javax.swing.JLabel image;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField message;
    private javax.swing.JLabel value;
    // End of variables declaration//GEN-END:variables
}
