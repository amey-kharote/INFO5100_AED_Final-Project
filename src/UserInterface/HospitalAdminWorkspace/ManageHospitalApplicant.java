/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.HospitalAdminWorkspace;

import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.CommonUI.ViewDonorValidationDashboard;
import UserInterface.HospitalApplicant.RecipientRegistrationForm;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Amey
 */
public class ManageHospitalApplicant extends javax.swing.JPanel {

    /**
     * Creates new form ManageHospitalVisitors
     */
    JPanel rightJPanel;
    Organization org;
    Enterprise enterpriseObj;
    UserAccount account;

    public ManageHospitalApplicant(JPanel rightJPanel, Organization org, Enterprise enterpriseObj, UserAccount account) {
        initComponents();
        this.rightJPanel = rightJPanel;
        this.org = org;
        this.enterpriseObj = enterpriseObj;
        this.account = account;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        donorButton = new javax.swing.JButton();
        recipientButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        viewDonorValidationRequests = new javax.swing.JButton();

        setBackground(java.awt.SystemColor.activeCaption);

        donorButton.setBackground(java.awt.SystemColor.controlLtHighlight);
        donorButton.setFont(new java.awt.Font("Tahoma", 1, 21)); // NOI18N
        donorButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/Images/icons8-donor-32.png"))); // NOI18N
        donorButton.setText("Donor");
        donorButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        donorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                donorButtonActionPerformed(evt);
            }
        });

        recipientButton.setBackground(java.awt.SystemColor.controlLtHighlight);
        recipientButton.setFont(new java.awt.Font("Tahoma", 1, 21)); // NOI18N
        recipientButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/Images/icons8-welfare-32.png"))); // NOI18N
        recipientButton.setText("Recipient");
        recipientButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        recipientButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recipientButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Manage Hospital Applicants");

        viewDonorValidationRequests.setBackground(java.awt.SystemColor.controlLtHighlight);
        viewDonorValidationRequests.setFont(new java.awt.Font("Tahoma", 1, 21)); // NOI18N
        viewDonorValidationRequests.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/Images/team-management.png"))); // NOI18N
        viewDonorValidationRequests.setText(" Donor Validation Requests");
        viewDonorValidationRequests.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        viewDonorValidationRequests.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewDonorValidationRequestsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(viewDonorValidationRequests, javax.swing.GroupLayout.PREFERRED_SIZE, 506, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(donorButton, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(recipientButton, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(83, 83, 83)
                                .addComponent(jLabel1)))
                        .addContainerGap(118, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jLabel1)
                .addGap(160, 160, 160)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(donorButton, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(recipientButton, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addComponent(viewDonorValidationRequests, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(196, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void donorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_donorButtonActionPerformed
        ShowingInterestUI interestObj = new ShowingInterestUI(rightJPanel, org, enterpriseObj,account);
        rightJPanel.add("manageInterest", interestObj);
        CardLayout layout = (CardLayout) rightJPanel.getLayout();
        layout.next(rightJPanel);
    }//GEN-LAST:event_donorButtonActionPerformed

    private void recipientButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recipientButtonActionPerformed
        // TODO add your handling code here:
        RecipientRegistrationForm reciptObj = new RecipientRegistrationForm(org, rightJPanel);
        rightJPanel.add("recipientRegistrationForm", reciptObj);
        CardLayout layout = (CardLayout) rightJPanel.getLayout();
        layout.next(rightJPanel);
    }//GEN-LAST:event_recipientButtonActionPerformed

    private void viewDonorValidationRequestsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewDonorValidationRequestsActionPerformed
        // TODO add your handling code here:
        ViewDonorValidationDashboard viewDonorDashboard = new ViewDonorValidationDashboard(rightJPanel, enterpriseObj);
        rightJPanel.add("viewDonorDashboard",viewDonorDashboard);
        CardLayout layout = (CardLayout) rightJPanel.getLayout();
        layout.next(rightJPanel);
    }//GEN-LAST:event_viewDonorValidationRequestsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton donorButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton recipientButton;
    private javax.swing.JButton viewDonorValidationRequests;
    // End of variables declaration//GEN-END:variables
}
