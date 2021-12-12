/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.DoctorWorkspace;

import Business.Enterprise.Enterprise;
import Business.Entity.Donor;
import Business.Entity.Recipient;
import Business.Organization.ApplicantOrg;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.DonorValidationWorkRequest;
import Business.WorkQueue.LabTestWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.Font;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Amey
 */
public class ActivityAreaForDoctorPanel extends javax.swing.JPanel {

    private UserAccount account;
    private JPanel rightJPanel;
    private Enterprise enterprise;
    String patientUserName;
    String patientType;
    List<String> tests;

    /**
     * Creates new form ActivityAreaForDoctorPanel
     */
    public ActivityAreaForDoctorPanel(JPanel rightJPanel, UserAccount account, Enterprise enterprise, String patientUserName, List<String> tests, String patientType) {
        initComponents();
        this.rightJPanel = rightJPanel;
        this.patientUserName = patientUserName;
        displayEnterpriseValueTextField.setText(enterprise.getName());
        this.tests = tests;
        this.enterprise = enterprise;
        this.account = account;
        this.patientType = patientType;
        patientTypeLabel.setText(patientType);
        pateintIdLabel.setText(patientUserName);
        if(patientType.equalsIgnoreCase("Donor")){
            priorityOptionsDropdown.setVisible(false);
            setPriorityButton.setVisible(false);
        }else {
            markDonorFit.setVisible(false);
            markDonorUnfit.setVisible(false);
        }
        populateWorkRequestTable();
        populateValidateTable();
    }

    public void populateValidateTable(){
        DefaultTableModel model = (DefaultTableModel) validateWr.getModel();
        model.setRowCount(0);
        DonorValidationWorkRequest finalObj = null;
        for (WorkRequest w : account.getWorkQueue().getWorkRequestList()) {
                if (w instanceof DonorValidationWorkRequest) {
                    DonorValidationWorkRequest a = (DonorValidationWorkRequest) w;
                    if (patientUserName.equalsIgnoreCase(a.getPatientId())) {
                        finalObj = a;
                        break;
                    }
                }
       }
       if(finalObj != null){
                Object[] row = new Object[5];
                row[0] = finalObj.getPatientId();
                row[1] = finalObj.getSender();
                row[2] = finalObj.isReceiverName();
                row[3] = finalObj.getStatus();
                model.addRow(row);
          
        }
    }
    public void populateWorkRequestTable() {
        DefaultTableModel model = (DefaultTableModel) displayValidationWorkRequestTable.getModel();
        model.setRowCount(0);
        for (WorkRequest request : account.getWorkQueue().getWorkRequestList()) {
            Object[] row = new Object[5];
            if(request instanceof LabTestWorkRequest)
            if(((LabTestWorkRequest) request).getPatientId()!= null)
            if (((LabTestWorkRequest) request).getPatientId().equals(patientUserName)) {
                row[0] = ((LabTestWorkRequest) request).getPatientId();
                row[1] = ((LabTestWorkRequest) request).getSender();
                row[2] = ((LabTestWorkRequest) request).getReceiver();
                row[3] = ((LabTestWorkRequest) request).getStatus();
                String result = ((LabTestWorkRequest) request).getTestResult();
                row[4] = result == null ? "Pending Results" : result;
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

        backButton = new javax.swing.JButton();
        refreshTableButton = new javax.swing.JButton();
        markDonorUnfit = new javax.swing.JButton();
        markDonorFit = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        validateWr = new javax.swing.JTable();
        displayEnterpriseLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        displayValidationWorkRequestTable = new javax.swing.JTable();
        displayEnterpriseLabel2 = new javax.swing.JLabel();
        priorityOptionsDropdown = new javax.swing.JComboBox();
        setPriorityButton = new javax.swing.JButton();
        displayEnterpriseLabel1 = new javax.swing.JLabel();
        displayEnterpriseValueTextField = new javax.swing.JLabel();
        patientTypeLabel = new javax.swing.JLabel();
        pateintIdLabel = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backButton.setBackground(java.awt.SystemColor.controlLtHighlight);
        backButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/Images/left-arrow-in-circular-button-black-symbol-2.png"))); // NOI18N
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, -1, -1));

        refreshTableButton.setBackground(java.awt.SystemColor.controlLtHighlight);
        refreshTableButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/Images/Refresh.jpg"))); // NOI18N
        refreshTableButton.setText("Refresh");
        refreshTableButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        refreshTableButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshTableButtonActionPerformed(evt);
            }
        });
        add(refreshTableButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 90, -1, -1));

        markDonorUnfit.setText("Mark Donor Unfit");
        markDonorUnfit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                markDonorUnfitActionPerformed(evt);
            }
        });
        add(markDonorUnfit, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 760, -1, -1));

        markDonorFit.setText("Mark Donor Fit");
        markDonorFit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                markDonorFitActionPerformed(evt);
            }
        });
        add(markDonorFit, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 760, -1, -1));

        validateWr.setBackground(java.awt.SystemColor.info);
        validateWr.setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N
        validateWr.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Patient Name", "Sender", "Receiver", "Status"
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
        jScrollPane3.setViewportView(validateWr);

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 560, 1050, 160));

        displayEnterpriseLabel3.setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N
        displayEnterpriseLabel3.setText("Donor Validation Requests:");
        add(displayEnterpriseLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 500, -1, -1));

        displayValidationWorkRequestTable.setBackground(java.awt.SystemColor.info);
        displayValidationWorkRequestTable.setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N
        displayValidationWorkRequestTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Patient Name", "Sender", "Receiver", "Status", "Results"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(displayValidationWorkRequestTable);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 340, 1060, 120));

        displayEnterpriseLabel2.setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N
        displayEnterpriseLabel2.setText("Lab Tests Requests:");
        add(displayEnterpriseLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, -1, -1));

        priorityOptionsDropdown.setBackground(new java.awt.Color(204, 204, 204));
        priorityOptionsDropdown.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        priorityOptionsDropdown.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1- High", "2- Medium", "3- Low" }));
        priorityOptionsDropdown.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        add(priorityOptionsDropdown, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 280, -1, -1));

        setPriorityButton.setBackground(new java.awt.Color(204, 204, 204));
        setPriorityButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        setPriorityButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/Images/priority.png"))); // NOI18N
        setPriorityButton.setText("Set Priority");
        setPriorityButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        setPriorityButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setPriorityButtonActionPerformed(evt);
            }
        });
        add(setPriorityButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 280, -1, -1));

        displayEnterpriseLabel1.setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N
        displayEnterpriseLabel1.setText("Enterprise :");
        add(displayEnterpriseLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, -1, 70));

        displayEnterpriseValueTextField.setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N
        displayEnterpriseValueTextField.setText("<value>");
        add(displayEnterpriseValueTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, -1, 50));

        patientTypeLabel.setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N
        add(patientTypeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, -1, -1));

        pateintIdLabel.setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N
        add(pateintIdLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        rightJPanel.remove(this);
        Component[] componentArray = rightJPanel.getComponents();
        Component component = componentArray[componentArray.length - 1];
        DoctorRequestPatientTestPanel reqPatientLabTestObj = (DoctorRequestPatientTestPanel) component;
        CardLayout cardLayout = (CardLayout)rightJPanel.getLayout();
        cardLayout.previous(rightJPanel);
    }//GEN-LAST:event_backButtonActionPerformed

    private void refreshTableButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshTableButtonActionPerformed
        populateWorkRequestTable();
        populateValidateTable();
    }//GEN-LAST:event_refreshTableButtonActionPerformed

    private void markDonorUnfitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_markDonorUnfitActionPerformed
        // TODO add your handling code here:
        System.out.println("Marking donor as unfit for transplant" +patientUserName);
        WorkRequest finalObj = null;
        for (WorkRequest w : account.getWorkQueue().getWorkRequestList()) {
            if (w instanceof DonorValidationWorkRequest) {
                DonorValidationWorkRequest a = (DonorValidationWorkRequest) w;
                if (patientUserName.equalsIgnoreCase(a.getPatientId())) {
                    finalObj = a;
                    break;
                }
            }
        }
        for(Donor d:enterprise.getDonorDirectory().getDonorRecords()){
            if(patientUserName.equalsIgnoreCase(d.getPersonEmailId())){
                d.setIsDonorFitForTransplant(false);
            }

        }
        finalObj.setStatus("Marked Donor Unfit");
        populateValidateTable();
    }//GEN-LAST:event_markDonorUnfitActionPerformed

    private void markDonorFitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_markDonorFitActionPerformed
        // TODO add your handling code here:
        System.out.println("Marking donor as fit for transplant" +patientUserName);
        WorkRequest finalObj = null;
        for (WorkRequest w : account.getWorkQueue().getWorkRequestList()) {
            if (w instanceof DonorValidationWorkRequest) {
                DonorValidationWorkRequest a = (DonorValidationWorkRequest) w;
                if (patientUserName.equalsIgnoreCase(a.getPatientId())) {
                    finalObj = a;
                    break;
                }
            }
        }
        for(Donor d:enterprise.getDonorDirectory().getDonorRecords()){
            if(patientUserName.equalsIgnoreCase(d.getPersonEmailId())){
                d.setIsDonorFitForTransplant(true);
            }

        }
        finalObj.setStatus("Marked Donor Fit");
        populateValidateTable();
    }//GEN-LAST:event_markDonorFitActionPerformed

    private void setPriorityButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setPriorityButtonActionPerformed
        int selectedRow = displayValidationWorkRequestTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row to set priority!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (patientType.equals("Patient")) {
            for (Organization org : enterprise.getOrganizationDirectory().getOrganizationList()) {
                for (Recipient rObj : org.getRecipientDirectory().getRecipientRecords()) {
                    if (rObj.getPersonEmailId().equals(patientUserName)) {
                        if ((displayValidationWorkRequestTable.getValueAt(selectedRow, 3).equals("Completed"))) {
                            if (priorityOptionsDropdown.getSelectedIndex() == 0) {
                                rObj.setPriorityNo(1);
                                JOptionPane.showMessageDialog(null, "Priority set to HIGH!");
                            } else if (priorityOptionsDropdown.getSelectedIndex() == 1) {
                                rObj.setPriorityNo(2);
                                JOptionPane.showMessageDialog(null, "Priority set to MEDIUM!");
                            } else if (priorityOptionsDropdown.getSelectedIndex() == 2) {
                                rObj.setPriorityNo(3);
                                JOptionPane.showMessageDialog(null, "Priority set to LOW!");
                            }

                        }else {
                            JOptionPane.showMessageDialog(null, "Sorry, You cannot set priority for patients with pending tests!");
                            return;
                        }
                    }
                }
            }

        } else {
            JOptionPane.showMessageDialog(null, "Sorry, You cannot set priority for a donor!");
        }
    }//GEN-LAST:event_setPriorityButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JLabel displayEnterpriseLabel1;
    private javax.swing.JLabel displayEnterpriseLabel2;
    private javax.swing.JLabel displayEnterpriseLabel3;
    private javax.swing.JLabel displayEnterpriseValueTextField;
    private javax.swing.JTable displayValidationWorkRequestTable;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton markDonorFit;
    private javax.swing.JButton markDonorUnfit;
    private javax.swing.JLabel pateintIdLabel;
    private javax.swing.JLabel patientTypeLabel;
    private javax.swing.JComboBox priorityOptionsDropdown;
    private javax.swing.JButton refreshTableButton;
    private javax.swing.JButton setPriorityButton;
    private javax.swing.JTable validateWr;
    // End of variables declaration//GEN-END:variables
}
