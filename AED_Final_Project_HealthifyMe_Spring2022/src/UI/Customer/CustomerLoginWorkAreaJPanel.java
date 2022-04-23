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
import UI.RoleGymInstructor.RequestGymInstructorJPanel;
import UI.RoleYogaInstructor.RequestYogaInstructorJPanel;
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
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        personal = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 255));
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

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, 640, 130));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("SELECT NETWORK");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 100, -1, -1));

        networkComboBox.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        networkComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        networkComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                networkComboBoxActionPerformed(evt);
            }
        });
        add(networkComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 100, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setText("WELCOME TO HEALTHIFYME");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, -1, -1));

        jPanel1.setBackground(new java.awt.Color(199, 228, 171));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        personal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        personal.setText("PERSONAL CARE SERVICES");
        jPanel1.add(personal, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 210, 20));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setText("REQUEST SPA SERVICE");
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 200, 30));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("REQUEST  SALON SERVICE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 200, 30));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 320, 280, 150));

        jPanel2.setBackground(new java.awt.Color(255, 140, 154));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("MENTAL HEALTH SERVICES");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setText("REQUEST MEDITATION SERVICE");
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, 30));

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton4.setText("REQUEST THERAPIST SERVICE");
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 91, 230, 30));

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 320, 290, 150));

        jPanel3.setBackground(new java.awt.Color(242, 203, 100));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("HEALTH CARE SERVICES");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton5.setText("REQUEST DOCTOR APPOINTMENT");
        jPanel3.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 240, 30));

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton6.setText("REQUEST DIETICAN APPOINTMENT");
        jPanel3.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, 30));

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 530, 280, 150));

        jPanel4.setBackground(new java.awt.Color(242, 144, 88));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("PHYSICAL HEALTH SERVICES");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton7.setText("REQUEST GYM SERVICE");
        jPanel4.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, -1, 20));

        jButton8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton8.setText("REQUEST YOGA SERVICE");
        jPanel4.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, -1, 30));

        add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 530, 290, 150));
    }// </editor-fold>//GEN-END:initComponents

    private void networkComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_networkComboBoxActionPerformed
        if (sourceNetwork != null) {
            populateRequestTable(sourceNetwork);
        }
    }//GEN-LAST:event_networkComboBoxActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox networkComboBox;
    private javax.swing.JLabel personal;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
