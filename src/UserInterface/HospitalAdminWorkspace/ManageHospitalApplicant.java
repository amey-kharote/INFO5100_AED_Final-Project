/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.HospitalAdminWorkspace;

import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
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

    public ManageHospitalApplicant(JPanel rightJPanel, Organization org) {
        initComponents();
        this.rightJPanel = rightJPanel;
        this.org = org;
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
        backButton = new javax.swing.JButton();

        setBackground(java.awt.SystemColor.activeCaption);

        donorButton.setBackground(java.awt.SystemColor.controlLtHighlight);
        donorButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        donorButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/Images/icons8-donor-32.png"))); // NOI18N
        donorButton.setText("Donor");
        donorButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        donorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                donorButtonActionPerformed(evt);
            }
        });

        recipientButton.setBackground(java.awt.SystemColor.controlLtHighlight);
        recipientButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        recipientButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/Images/icons8-welfare-32.png"))); // NOI18N
        recipientButton.setText("Recipient");
        recipientButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        recipientButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recipientButtonActionPerformed(evt);
            }
        });

        backButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/Images/left-arrow-in-circular-button-black-symbol-2.png"))); // NOI18N
        backButton.setText("<< Back");
        backButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(donorButton, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 219, Short.MAX_VALUE)
                        .addComponent(recipientButton, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(114, 114, 114))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(backButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 123, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(donorButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(recipientButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(406, 406, 406))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void donorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_donorButtonActionPerformed
        ShowingInterestUI interestObj = new ShowingInterestUI(rightJPanel, org);
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

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        rightJPanel.remove(this);
        CardLayout layout = (CardLayout) rightJPanel.getLayout();
        layout.previous(rightJPanel);
    }//GEN-LAST:event_backButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JButton donorButton;
    private javax.swing.JButton recipientButton;
    // End of variables declaration//GEN-END:variables
}
