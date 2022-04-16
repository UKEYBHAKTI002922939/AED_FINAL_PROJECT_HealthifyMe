/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.RoleYogaInstructor;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Organization.YogaOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.YogaInstructorWorkRequest;
import Business.WorkQueue.WorkRequest;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Pushkar Dandekar
 */
public class VehicleRepairWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form VehicleRepairWorkAreaJPanel
     */
    
     private JPanel userProcessContainer;
    private YogaOrganization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private EcoSystem system;
    private Network sourceNetwork;
    private Network targetNetwork; 
   
    
    public VehicleRepairWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem system, Network sourceNetwork) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.organization = (YogaOrganization) organization;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.system = system;
        this.sourceNetwork = sourceNetwork;
        valueLabel.setText(organization.getName());
        
        populateRequestTable();
    }
    
    public void populateRequestTable(){
        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();
        
        model.setRowCount(0);
        for (WorkRequest request : organization.getWorkQueue().getWorkRequestList()){
            if(request instanceof YogaInstructorWorkRequest){
            Object[] row = new Object[4];
            row[0] = request;
            row[1] = request.getSender().getEmployee().getName();
            row[2] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getName();
            row[3] = request.getStatus();
            model.addRow(row);
            }
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
        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        declineJButton = new javax.swing.JButton();
        assignJButton = new javax.swing.JButton();
        valueLabel = new javax.swing.JLabel();
        organizationLabel = new javax.swing.JLabel();
        processJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(null);

        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Message", "Sender", "Receiver", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(workRequestJTable);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(130, 60, 680, 110);

        declineJButton.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        declineJButton.setText("Decline");
        declineJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                declineJButtonActionPerformed(evt);
            }
        });
        jPanel1.add(declineJButton);
        declineJButton.setBounds(620, 230, 180, 40);

        assignJButton.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        assignJButton.setText("Assign to me");
        assignJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignJButtonActionPerformed(evt);
            }
        });
        jPanel1.add(assignJButton);
        assignJButton.setBounds(140, 230, 180, 40);

        valueLabel.setText("<value>");
        jPanel1.add(valueLabel);
        valueLabel.setBounds(140, 20, 158, 26);

        organizationLabel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        organizationLabel.setText("Organization");
        jPanel1.add(organizationLabel);
        organizationLabel.setBounds(20, 20, 127, 30);

        processJButton.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        processJButton.setText("Process");
        processJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processJButtonActionPerformed(evt);
            }
        });
        jPanel1.add(processJButton);
        processJButton.setBounds(370, 230, 190, 35);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/vehicle_repair.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 0, 0);

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1800, 1800));
    }// </editor-fold>//GEN-END:initComponents

    private void declineJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_declineJButtonActionPerformed

        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0){
            JOptionPane.showMessageDialog(this, "Please select at least one row");
            return;
        }

        WorkRequest request = (WorkRequest)workRequestJTable.getValueAt(selectedRow, 0);
        request.setReceiver(userAccount);
        request.setStatus("Declined");

        populateRequestTable();
    }//GEN-LAST:event_declineJButtonActionPerformed

    private void assignJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignJButtonActionPerformed
        // TODO add your handling code here:

        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0){
            JOptionPane.showMessageDialog(this, "Please select at least one row");
            return;
        }

        WorkRequest request = (WorkRequest)workRequestJTable.getValueAt(selectedRow, 0);
        request.setReceiver(userAccount);
        request.setStatus("Confirmed");

        populateRequestTable();
    }//GEN-LAST:event_assignJButtonActionPerformed

    private void processJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processJButtonActionPerformed

        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0){
            JOptionPane.showMessageDialog(this, "Please select at least one row");
            return;
        }

        WorkRequest request = (WorkRequest)workRequestJTable.getValueAt(selectedRow,0);
        request.setReceiver(userAccount);
        request.setStatus("Processed");
        populateRequestTable();
    }//GEN-LAST:event_processJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignJButton;
    private javax.swing.JButton declineJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel organizationLabel;
    private javax.swing.JButton processJButton;
    private javax.swing.JLabel valueLabel;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
