/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.OrganDonationMatchingWorkArea;

/**
 *
 * @author Amey
 */
public class ManageOrganMatchInitialRoute extends javax.swing.JPanel {

    /**
     * Creates new form ManageOrganMatchInitialRoute
     */
    public ManageOrganMatchInitialRoute() {
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

        matchOrganByApplicantButton = new javax.swing.JButton();
        matchOrganByRecipientButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();

        matchOrganByApplicantButton.setBackground(new java.awt.Color(255, 204, 204));
        matchOrganByApplicantButton.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        matchOrganByApplicantButton.setText("Match Organ by Applicant availability");
        matchOrganByApplicantButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        matchOrganByApplicantButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                matchOrganByApplicantButtonActionPerformed(evt);
            }
        });

        matchOrganByRecipientButton.setBackground(new java.awt.Color(255, 204, 204));
        matchOrganByRecipientButton.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        matchOrganByRecipientButton.setText("Match Organ by Recipient severity");
        matchOrganByRecipientButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        matchOrganByRecipientButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                matchOrganByRecipientButtonActionPerformed(evt);
            }
        });

        backButton.setBackground(new java.awt.Color(153, 204, 255));
        backButton.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(221, 221, 221)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(matchOrganByRecipientButton, javax.swing.GroupLayout.PREFERRED_SIZE, 558, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(matchOrganByApplicantButton, javax.swing.GroupLayout.PREFERRED_SIZE, 556, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(337, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(115, 115, 115)
                .addComponent(matchOrganByApplicantButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(matchOrganByRecipientButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(366, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void matchOrganByApplicantButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_matchOrganByApplicantButtonActionPerformed

    }//GEN-LAST:event_matchOrganByApplicantButtonActionPerformed

    private void matchOrganByRecipientButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_matchOrganByRecipientButtonActionPerformed
    }//GEN-LAST:event_matchOrganByRecipientButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_backButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JButton matchOrganByApplicantButton;
    private javax.swing.JButton matchOrganByRecipientButton;
    // End of variables declaration//GEN-END:variables
}