/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.HospitalAdminWorkspace;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.HospitalEnterprise;
import Business.Network.Network;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.AwarenessWorkRequest;
import Business.WorkQueue.WorkRequest;
import UserInterface.SystemAdminWorkspace.SystemAdminDashboard;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author admin
 */
public class ViewCampDetails extends javax.swing.JPanel {

    JPanel panel;
    EcoSystem system;
    UserAccount userAccount;
    Enterprise ent;

    /**
     * Creates new form ViewCampDetails
     */
    public ViewCampDetails(EcoSystem system, JPanel panel, UserAccount userAccount, Enterprise ent) {
        initComponents();
        this.system = system;
        this.panel = panel;
        this.userAccount = userAccount;
        this.ent = ent;
        populateStatusTable();
    }

    public void populateStatusTable() {
        DefaultTableModel dtm = (DefaultTableModel) jStatusTable.getModel();
        dtm.setRowCount(0);

        for (Network network1 : system.getNetworks()) {
            for (Enterprise enterprise : network1.getEnterpriseDirectory().getEnterpriseList()) {
                if (enterprise instanceof HospitalEnterprise) {
                    for (WorkRequest request : ent.getWorkQueue().getWorkRequestList()) {
                        if (request instanceof AwarenessWorkRequest) {

                            Object[] row = new Object[4];
                            row[0] = ((AwarenessWorkRequest) request).getMessage();
                            row[1] = ((AwarenessWorkRequest) request).getOrgans();
                            row[2] = ((AwarenessWorkRequest) request).getStatus();
                            row[3] = ((AwarenessWorkRequest) request).getSender();
                            dtm.addRow(row);
                        }

                    }
                }
            }
        }

    }
    //FundingWorkRequest req = new FundingWorkRequest();

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jStatusTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();

        setBackground(java.awt.SystemColor.activeCaption);

        jStatusTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Message", "Organs", "Status", "Sender"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jStatusTable);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel1.setText("Request details");

        backBtn.setBackground(java.awt.SystemColor.controlLtHighlight);
        backBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/Images/left-arrow-in-circular-button-black-symbol-2.png"))); // NOI18N
        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 687, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                .addGap(193, 193, 193))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed

        panel.remove(this);
        Component[] componentArray = panel.getComponents();
        Component componentObj = componentArray[componentArray.length - 1];
        CheckDonorRecipientRatio sysAdminScreen = (CheckDonorRecipientRatio) componentObj;
        CardLayout prevLayout = (CardLayout) panel.getLayout();
        // populate tree on admin screen
        //sysAdminScreen.populateTree();
        prevLayout.previous(panel);
    }//GEN-LAST:event_backBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jStatusTable;
    // End of variables declaration//GEN-END:variables
}
