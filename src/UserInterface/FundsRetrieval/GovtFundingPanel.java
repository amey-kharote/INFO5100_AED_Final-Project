/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.FundsRetrieval;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.TrustFundOrg;
import Business.Role.TrustManagerRole;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.FundingWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Amey
 */
public class GovtFundingPanel extends javax.swing.JPanel {

    EcoSystem ecoSystem;
    Enterprise enterprise;
    Organization organization;
    JPanel panel;
    private UserAccount useraccount;
    String patient = null;
    
    /**
     * Creates new form GovtFundingPanel
     */
    public GovtFundingPanel(EcoSystem ecoSystem, Enterprise enterprise, Organization org, JPanel panel, UserAccount useraccount) {
        initComponents();
        this.ecoSystem = ecoSystem;
        this.enterprise = enterprise;
        this.organization = org;
        this.panel = panel;
        this.useraccount = useraccount;
        
        populateTable();
    }
    
    public void populateTable(){
        
        DefaultTableModel dtm  = (DefaultTableModel)govtEventDetailTable.getModel();
        dtm.setRowCount(0);
        
        for(Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()){
            
            if(organization instanceof TrustFundOrg){
            
            for(WorkRequest req : organization.getWorkQueue().getWorkRequestList()){
            Object[] row = new Object[4];
            row[0] = req;
            row[1] = req.getSender().getEmployee();
            row[2] = req.getReceiver() == null ? null : req.getReceiver().getEmployee().getEmpName();
            row[3] = req.getStatus();
            dtm.addRow(row);
            }
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
        govtEventDetailTable = new javax.swing.JTable();
        govtEventFundTableLabel = new javax.swing.JLabel();
        assignToMeButton = new javax.swing.JButton();
        processButton = new javax.swing.JButton();

        setBackground(java.awt.SystemColor.activeCaption);

        govtEventDetailTable.setBackground(java.awt.SystemColor.info);
        govtEventDetailTable.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        govtEventDetailTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Message", "Sender", "Receiver", "Status"
            }
        ));
        jScrollPane1.setViewportView(govtEventDetailTable);

        govtEventFundTableLabel.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        govtEventFundTableLabel.setText("Trust Event Fund Raising Details");

        assignToMeButton.setBackground(java.awt.SystemColor.controlLtHighlight);
        assignToMeButton.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        assignToMeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/Images/icons8-audit-24.png"))); // NOI18N
        assignToMeButton.setText("Assign To Me");
        assignToMeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignToMeButtonActionPerformed(evt);
            }
        });

        processButton.setBackground(java.awt.SystemColor.controlLtHighlight);
        processButton.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        processButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/Images/process.png"))); // NOI18N
        processButton.setText("Process");
        processButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 45, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(assignToMeButton)
                        .addGap(640, 640, 640)
                        .addComponent(processButton))
                    .addComponent(govtEventFundTableLabel)
                    .addComponent(jScrollPane1))
                .addGap(83, 83, 83))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(govtEventFundTableLabel)
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(processButton)
                    .addComponent(assignToMeButton))
                .addContainerGap(391, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void assignToMeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignToMeButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = govtEventDetailTable.getSelectedRow();

        if(govtEventDetailTable.getRowCount() == 0){
            JOptionPane.showMessageDialog(null, "No rows available to select", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a row", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        WorkRequest request = (WorkRequest)govtEventDetailTable.getValueAt(selectedRow, 0);
        if(request.getStatus().equalsIgnoreCase("Pending")){
            JOptionPane.showMessageDialog(null, "Assigned Request cannot be assigned again!!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        request.setReceiver(useraccount);
        request.setStatus("Pending");
        if(useraccount.getRole() instanceof TrustManagerRole){
            populateTable();
        }
    }//GEN-LAST:event_assignToMeButtonActionPerformed

    private void processButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = govtEventDetailTable.getSelectedRow();

        if(govtEventDetailTable.getRowCount() == 0){
            JOptionPane.showMessageDialog(null, "No rows available to select", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a row", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        FundingWorkRequest request = (FundingWorkRequest)govtEventDetailTable.getValueAt(selectedRow, 0);
         if(request.getStatus().equalsIgnoreCase("Approved") || request.getStatus().equalsIgnoreCase("Declined")){
            JOptionPane.showMessageDialog(null, "The funds have alrady been Approved/Declined!!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        if(request.getStatus().equalsIgnoreCase("Pending")){
        
            request.setFundStatus("Processing");
        
        FundsApprovalPanel processWorkRequestJPanel = new FundsApprovalPanel(panel, request, useraccount);
        panel.add("processWorkRequestJPanel", processWorkRequestJPanel);
        CardLayout layout = (CardLayout) panel.getLayout();
        layout.next(panel);
        }else{
            JOptionPane.showMessageDialog(null, "Please assign the request first!!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
    }//GEN-LAST:event_processButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignToMeButton;
    private javax.swing.JTable govtEventDetailTable;
    private javax.swing.JLabel govtEventFundTableLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton processButton;
    // End of variables declaration//GEN-END:variables
}
