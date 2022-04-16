/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.Customer;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.DoctorWorkRequest;
import Business.WorkQueue.MeditationInstructorWorkRequest;
import Business.WorkQueue.SalonWorkRequest;
import Business.WorkQueue.SpaWorkRequest;
import Business.WorkQueue.GymInstructorWorkRequest;
import Business.WorkQueue.DieticianWorkRequest;
import Business.WorkQueue.YogaInstructorWorkRequest;
import Business.WorkQueue.TherapistWorkRequest;
import Business.WorkQueue.TherapistWorkRequest;
import Business.WorkQueue.WorkRequest;
import UI.RoleDoctor.RequestDoctorJPanel;
import UI.RoleMeditationInstructor.RequestMeditationInstructorJPanel;
import UI.RoleSalon.RequestSalonJPanel;
import UI.RoleSpa.RequestSpaJPanel;
import UI.ApplianceRepairRole.RequestApplianceRepairJPanel;
import UI.VehicleRepairRole.RequestVehicleRepairJPanel;
import UI.RoleDietician.DieticianRequestJPanel;
import UI.RoleTherapist.RequestTherapistJPanel;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Simran 
 */
public class CustomerLoginWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CustomerLoginWorkAreaJPanel
     */
    
    private JPanel userProcessContainer;
    private EcoSystem system;
    private Enterprise enterprise;
    private Network sourceNetwork;
    private Network targetNetwork;
    private UserAccount userAccount;
    
    public CustomerLoginWorkAreaJPanel(JPanel userProcessContainer, EcoSystem system,UserAccount userAccount, Network sourceNetwork) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.userAccount = userAccount;
        this.sourceNetwork = sourceNetwork;
        populateNetworkComboBox();
        populateRequestTable(sourceNetwork);
    }
    
    private void populateNetworkComboBox() {
        networkComboBox.removeAllItems();
        for (Network network : system.getNetworkList()) {
            networkComboBox.addItem(network);
        }
    }
    
    public void populateRequestTable(Network sourceNetwork1){
        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();
        
        model.setRowCount(0);
        for (WorkRequest request : userAccount.getWorkQueue().getWorkRequestList()){
            if(request instanceof DoctorWorkRequest){
            Object[] row = new Object[3];
            row[0] = request.getMessage();
            row[1] = request.getReceiver();
            row[2] = request.getStatus();
            //String result = ((DoctorWorkRequest) request).getDoctorAppointment();
            //row[3] = result == null ? "Waiting" : result;
            model.addRow(row);
            }
            if(request instanceof SalonWorkRequest){
            Object[] row = new Object[3];
            row[0] = request.getMessage();
            row[1] = request.getReceiver();
            row[2] = request.getStatus();
            //String result = ((SalonWorkRequest) request).getSalonAppointment();
            //row[3] = result == null ? "Waiting" : result;
            model.addRow(row);
            }
            if(request instanceof SpaWorkRequest){
            Object[] row = new Object[3];
            row[0] = request.getMessage();
            row[1] = request.getReceiver();
            row[2] = request.getStatus();
            //String result = ((SpaWorkRequest) request).getSpaAppointment();
            //row[3] = result == null ? "Waiting" : result;
            model.addRow(row);
            }
            if(request instanceof MeditationInstructorWorkRequest){
            Object[] row = new Object[3];
            row[0] = request.getMessage();
            row[1] = request.getReceiver();
            row[2] = request.getStatus();
            //String result = ((MeditationInstructorWorkRequest) request).getHouseCleanAppointment();
            //row[3] = result == null ? "Waiting" : result;
            model.addRow(row);
            }
            if(request instanceof GymInstructorWorkRequest){
            Object[] row = new Object[3];
            row[0] = request.getMessage();
            row[1] = request.getReceiver();
            row[2] = request.getStatus();
            //String result = ((GymInstructorWorkRequest) request).getApplianceRepairAppointment();
            //row[3] = result == null ? "Waiting" : result;
            model.addRow(row);
            }
            if(request instanceof YogaInstructorWorkRequest){
            Object[] row = new Object[3];
            row[0] = request.getMessage();
            row[1] = request.getReceiver();
            row[2] = request.getStatus();
            //String result = ((YogaInstructorWorkRequest) request).getVehicleRepairAppointment();
            //row[3] = result == null ? "Waiting" : result;
            model.addRow(row);
            }
            if(request instanceof DieticianWorkRequest){
            Object[] row = new Object[3];
            row[0] = request.getMessage();
            row[1] = request.getReceiver();
            row[2] = request.getStatus();
            //String result = ((DieticianWorkRequest) request).getDieticianAppointment();
            //row[3] = result == null ? "Waiting" : result;
            model.addRow(row);
            }
            if(request instanceof TherapistWorkRequest){
            Object[] row = new Object[3];
            row[0] = request.getMessage();
            row[1] = request.getReceiver();
            row[2] = request.getStatus();
            //String result = ((TherapistWorkRequest) request).getVehicleCleaningAppointment();
            //row[3] = result == null ? "Waiting" : result;
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

        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        networkComboBox = new javax.swing.JComboBox();
        requestTestJButton = new javax.swing.JButton();
        requestSalonJButton = new javax.swing.JButton();
        requestHouseCleanJButton = new javax.swing.JButton();
        requestAppRepJButton = new javax.swing.JButton();
        requestDieticianJButton = new javax.swing.JButton();
        requestSpaJButton = new javax.swing.JButton();
        requestVehicleCleanJButton = new javax.swing.JButton();
        requestVehicleRepJButton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Message", "Receiver", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(workRequestJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 152, 616, 108));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Select Network");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(226, 101, -1, -1));

        networkComboBox.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        networkComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        networkComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                networkComboBoxActionPerformed(evt);
            }
        });
        add(networkComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(373, 98, -1, -1));

        requestTestJButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        requestTestJButton.setText("Request Doctor's Appointment");
        requestTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestTestJButtonActionPerformed(evt);
            }
        });
        add(requestTestJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 567, 280, -1));

        requestSalonJButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        requestSalonJButton.setText("Request Salon Servces");
        requestSalonJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestSalonJButtonActionPerformed(evt);
            }
        });
        add(requestSalonJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 365, 280, -1));

        requestHouseCleanJButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        requestHouseCleanJButton.setText("Request House Cleaning");
        requestHouseCleanJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestHouseCleanJButtonActionPerformed(evt);
            }
        });
        add(requestHouseCleanJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 464, 280, -1));

        requestAppRepJButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        requestAppRepJButton.setText("Request Appliance Repair Services");
        requestAppRepJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestAppRepJButtonActionPerformed(evt);
            }
        });
        add(requestAppRepJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 671, -1, -1));

        requestDieticianJButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        requestDieticianJButton.setText("Request Dietician Appointment");
        requestDieticianJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestDieticianJButtonActionPerformed(evt);
            }
        });
        add(requestDieticianJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(389, 567, 280, -1));

        requestSpaJButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        requestSpaJButton.setText("Request Spa Services");
        requestSpaJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestSpaJButtonActionPerformed(evt);
            }
        });
        add(requestSpaJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(389, 365, 280, -1));

        requestVehicleCleanJButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        requestVehicleCleanJButton.setText("Request Vehicle Cleaning");
        requestVehicleCleanJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestVehicleCleanJButtonActionPerformed(evt);
            }
        });
        add(requestVehicleCleanJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(389, 464, 280, -1));

        requestVehicleRepJButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        requestVehicleRepJButton.setText("Request Vehicle Repair Services");
        requestVehicleRepJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestVehicleRepJButtonActionPerformed(evt);
            }
        });
        add(requestVehicleRepJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(394, 671, 280, -1));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 1800, 10));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Personal Care Services");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 328, -1, -1));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 408, 1800, 10));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Cleaning Services");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 424, -1, -1));
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 507, 1800, 10));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Healthcare Services");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 523, -1, -1));
        add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 610, 1800, 10));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Repair Services");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 631, -1, -1));
        add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 714, 1800, 10));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setText("Welcome to Multiservice App");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(226, 11, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Multiservices.jpg"))); // NOI18N
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1800, 1800));
    }// </editor-fold>//GEN-END:initComponents

    private void requestTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestTestJButtonActionPerformed

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("RequestLabTestJPanel", new RequestDoctorJPanel(userProcessContainer, userAccount, enterprise, system, sourceNetwork, (Network)networkComboBox.getSelectedItem()));
        layout.next(userProcessContainer);

    }//GEN-LAST:event_requestTestJButtonActionPerformed

    private void requestSalonJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestSalonJButtonActionPerformed
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("RequestLabTestJPanel", new RequestSalonJPanel(userProcessContainer, userAccount, enterprise, system, sourceNetwork, (Network)networkComboBox.getSelectedItem()));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_requestSalonJButtonActionPerformed

    private void requestHouseCleanJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestHouseCleanJButtonActionPerformed
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("RequestLabTestJPanel", new RequestMeditationInstructorJPanel(userProcessContainer, userAccount, enterprise, system, sourceNetwork, (Network)networkComboBox.getSelectedItem()));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_requestHouseCleanJButtonActionPerformed

    private void requestAppRepJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestAppRepJButtonActionPerformed
       CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("RequestLabTestJPanel", new RequestApplianceRepairJPanel(userProcessContainer, userAccount, enterprise, system, sourceNetwork, (Network)networkComboBox.getSelectedItem()));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_requestAppRepJButtonActionPerformed

    private void requestDieticianJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestDieticianJButtonActionPerformed
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("RequestLabTestJPanel", new DieticianRequestJPanel(userProcessContainer, userAccount, enterprise, system, sourceNetwork, (Network)networkComboBox.getSelectedItem()));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_requestDieticianJButtonActionPerformed

    private void requestSpaJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestSpaJButtonActionPerformed
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("RequestLabTestJPanel", new RequestSpaJPanel(userProcessContainer, userAccount, enterprise, system, sourceNetwork, (Network)networkComboBox.getSelectedItem()));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_requestSpaJButtonActionPerformed

    private void requestVehicleCleanJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestVehicleCleanJButtonActionPerformed
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("RequestLabTestJPanel", new RequestTherapistJPanel(userProcessContainer, userAccount, enterprise, system, sourceNetwork, (Network)networkComboBox.getSelectedItem()));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_requestVehicleCleanJButtonActionPerformed

    private void requestVehicleRepJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestVehicleRepJButtonActionPerformed
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("RequestLabTestJPanel", new RequestVehicleRepairJPanel(userProcessContainer, userAccount, enterprise, system, sourceNetwork, (Network)networkComboBox.getSelectedItem()));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_requestVehicleRepJButtonActionPerformed

    private void networkComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_networkComboBoxActionPerformed
        if (sourceNetwork != null) {
            populateRequestTable(sourceNetwork);
        }
    }//GEN-LAST:event_networkComboBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JComboBox networkComboBox;
    private javax.swing.JButton requestAppRepJButton;
    private javax.swing.JButton requestDieticianJButton;
    private javax.swing.JButton requestHouseCleanJButton;
    private javax.swing.JButton requestSalonJButton;
    private javax.swing.JButton requestSpaJButton;
    private javax.swing.JButton requestTestJButton;
    private javax.swing.JButton requestVehicleCleanJButton;
    private javax.swing.JButton requestVehicleRepJButton;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
