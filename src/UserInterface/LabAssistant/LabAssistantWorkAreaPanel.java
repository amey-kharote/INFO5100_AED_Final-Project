/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.LabAssistant;

import Business.EcoSystem;

import Business.Enterprise.Enterprise;

import Business.Organization.InternalLabOrg;

import Business.Organization.Organization;

import Business.Role.RadiologistRole;

import Business.Role.InternalLabAssistantRole;

import Business.UserAccount.UserAccount;

import Business.WorkQueue.LabTestWorkRequest;

import Business.WorkQueue.WorkRequest;

import java.awt.CardLayout;

import java.awt.Font;

import javax.swing.JOptionPane;

import javax.swing.JPanel;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Amey
 */
public class LabAssistantWorkAreaPanel extends javax.swing.JPanel {

    JPanel rightPanel;
    EcoSystem ecosystem;
    Enterprise enterprise;
    Organization organization;
    UserAccount userAccount;

    /**
     * Creates new form NewJPanel
     */
    public LabAssistantWorkAreaPanel(JPanel rightPanel, EcoSystem ecosystem, Enterprise enterprise, Organization organization, UserAccount userAccount) {
        initComponents();
        this.ecosystem = ecosystem;
        this.organization = organization;
        this.userAccount = userAccount;
        this.rightPanel = rightPanel;
        methodToPopulateTableData();
    }

    public LabAssistantWorkAreaPanel(JPanel rightPanel, EcoSystem ecosystem, Enterprise enterprise, UserAccount userAccount) {
        initComponents();
        this.ecosystem = ecosystem;
        this.enterprise = enterprise;
        this.userAccount = userAccount;
        this.rightPanel = rightPanel;
        methodToPopulateTableData();
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
        labAssitantWorkRequestTable = new javax.swing.JTable();
        assignToMeButton = new javax.swing.JButton();
        processButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(java.awt.SystemColor.activeCaption);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labAssitantWorkRequestTable.setBackground(java.awt.SystemColor.info);
        labAssitantWorkRequestTable.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labAssitantWorkRequestTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Message", "Sender", "Receiver", "Status", "Patient Id", "Test Results"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(labAssitantWorkRequestTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 1020, 180));

        assignToMeButton.setBackground(java.awt.SystemColor.controlLtHighlight);
        assignToMeButton.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        assignToMeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/Images/icons8-audit-24.png"))); // NOI18N
        assignToMeButton.setText("Assign to me");
        assignToMeButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        assignToMeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignToMeButtonActionPerformed(evt);
            }
        });
        add(assignToMeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, 240, 60));

        processButton.setBackground(java.awt.SystemColor.controlLtHighlight);
        processButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        processButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/Images/process.png"))); // NOI18N
        processButton.setText("Process");
        processButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        processButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processButtonActionPerformed(evt);
            }
        });
        add(processButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 370, 220, 60));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Lab Assistant Work Area");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 50, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    public void methodToPopulateTableData() {
        DefaultTableModel tableModel = (DefaultTableModel) labAssitantWorkRequestTable.getModel();
        tableModel.setRowCount(0);
        for (WorkRequest workRequestObject : organization.getWorkQueue().getWorkRequestList()) {
            LabTestWorkRequest workRequestObject1 = (LabTestWorkRequest)workRequestObject;
            Object[] labAssistantTableRow = new Object[6];
            labAssistantTableRow[0] = workRequestObject;
            labAssistantTableRow[1] = workRequestObject.getSender().getEmployee().getEmpName();
            labAssistantTableRow[2] = workRequestObject.getReceiver() == null ? null : workRequestObject.getReceiver().getEmployee().getEmpName();
            labAssistantTableRow[3] = workRequestObject.getStatus();
            labAssistantTableRow[4] = workRequestObject1.getPatientId();
            labAssistantTableRow[5] = workRequestObject1.getTestResult();
            tableModel.addRow(labAssistantTableRow);
        }
    }

    public void methodToPopulateTableEnterprise() {

        DefaultTableModel tableModel = (DefaultTableModel) labAssitantWorkRequestTable.getModel();
        tableModel.setRowCount(0);
        for (Organization organizationObject : enterprise.getOrganizationDirectory().getOrganizationList()) {
            for (WorkRequest requestOfWork : organizationObject.getWorkQueue().getWorkRequestList()) {
                LabTestWorkRequest workRequestObject1 = (LabTestWorkRequest)requestOfWork;
                    if(workRequestObject1.getReceiver() == null || workRequestObject1.getReceiver().equals(userAccount)){
                    Object[] labAssistantTableRow = new Object[6];
                    labAssistantTableRow[0] = requestOfWork;
                    labAssistantTableRow[1] = requestOfWork.getSender().getEmployee().getEmpName();
                    labAssistantTableRow[2] = requestOfWork.getReceiver() == null ? null : requestOfWork.getReceiver().getEmployee().getEmpName();
                    labAssistantTableRow[3] = requestOfWork.getStatus();
                    labAssistantTableRow[4] = workRequestObject1.getPatientId();
                    labAssistantTableRow[5] = workRequestObject1.getTestResult();
                    tableModel.addRow(labAssistantTableRow);
                }
            }
        }
    }

    private void assignToMeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignToMeButtonActionPerformed
        int selectedRowOfTable = labAssitantWorkRequestTable.getSelectedRow();
        if (labAssitantWorkRequestTable.getRowCount() == 0) {
            JOptionPane.showMessageDialog(null, "No rows present to select.", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (selectedRowOfTable < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row.", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        WorkRequest requestOfWork = (WorkRequest) labAssitantWorkRequestTable.getValueAt(selectedRowOfTable, 0);
        if(requestOfWork.getReceiver() !=null ){
            JOptionPane.showMessageDialog(null, "This test has already been assigned.", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if("Completed".equalsIgnoreCase(requestOfWork.getStatus())){
            JOptionPane.showMessageDialog(null, "This test has already been completed.", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        requestOfWork.setReceiver(userAccount);
        requestOfWork.setStatus("Pending");
        if (userAccount.getRole() instanceof RadiologistRole) {
            methodToPopulateTableData();
        } else if (userAccount.getRole() instanceof InternalLabAssistantRole) {
            methodToPopulateTableData();
        }
          methodToPopulateTableData();
    }//GEN-LAST:event_assignToMeButtonActionPerformed

    private void processButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processButtonActionPerformed
        int selectedRowOfTable = labAssitantWorkRequestTable.getSelectedRow();
        if (labAssitantWorkRequestTable.getRowCount() == 0) {
            JOptionPane.showMessageDialog(null, "There are no rows present in the Table to Select.", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (selectedRowOfTable < 0) {
            JOptionPane.showMessageDialog(null, "Please, Select a row from the table.", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        LabTestWorkRequest labTestWorkRequest = (LabTestWorkRequest) labAssitantWorkRequestTable.getValueAt(selectedRowOfTable, 0);
        if("Completed".equalsIgnoreCase(labTestWorkRequest.getStatus())){
             JOptionPane.showMessageDialog(null, "This request has already been completed.", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(labTestWorkRequest.getReceiver() == null ){
            JOptionPane.showMessageDialog(null, "Please, assign the request to yourself.", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        labTestWorkRequest.setStatus("Processing");
        TestResultUploadPanel processWorkRequestJPanel = new TestResultUploadPanel(rightPanel, labTestWorkRequest, userAccount);
        rightPanel.add("processWorkRequestJPanel", processWorkRequestJPanel);
        CardLayout cardLayout = (CardLayout) rightPanel.getLayout();
        cardLayout.next(rightPanel);
    }//GEN-LAST:event_processButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignToMeButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable labAssitantWorkRequestTable;
    private javax.swing.JButton processButton;
    // End of variables declaration//GEN-END:variables
}
