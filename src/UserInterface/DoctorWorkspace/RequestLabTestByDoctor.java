/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.DoctorWorkspace;

import Business.Enterprise.Enterprise;
import Business.Enterprise.LabEnterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.LabTestWorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JPanel;

/**
 *
 * @author ninos
 */
public class RequestLabTestByDoctor extends javax.swing.JPanel {

    /**
     * Creates new form RequestLabTestByDoctor
     */
    private JPanel rightJPanel;
    private Enterprise enterpriseObj;
    private UserAccount account;
    
    public RequestLabTestByDoctor() {
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

        jPanel1 = new javax.swing.JPanel();
        enterpriseFieldLabel = new javax.swing.JLabel();
        enterpriseValueLabel = new javax.swing.JLabel();
        messageFieldLabel = new javax.swing.JLabel();
        messageValueTextField = new javax.swing.JTextField();
        backButton = new javax.swing.JButton();
        requestForTestButton = new javax.swing.JButton();
        variableToDisplayImg = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(java.awt.SystemColor.activeCaption);

        enterpriseFieldLabel.setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N
        enterpriseFieldLabel.setText("Enterprise :");

        enterpriseValueLabel.setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N
        enterpriseValueLabel.setText("<value>");

        messageFieldLabel.setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N
        messageFieldLabel.setText("Message:");

        messageValueTextField.setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N

        backButton.setBackground(java.awt.SystemColor.controlLtHighlight);
        backButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/Images/left-arrow-in-circular-button-black-symbol-2.png"))); // NOI18N
        backButton.setText("Back");
        backButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        requestForTestButton.setBackground(java.awt.SystemColor.controlLtHighlight);
        requestForTestButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/Images/request.png"))); // NOI18N
        requestForTestButton.setText("Request Test");
        requestForTestButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        requestForTestButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestForTestButtonActionPerformed(evt);
            }
        });

        variableToDisplayImg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        variableToDisplayImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/Images/organ-donation1.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(84, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(enterpriseFieldLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(messageFieldLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(messageValueTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(enterpriseValueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(requestForTestButton, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(279, 279, 279))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(variableToDisplayImg)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enterpriseFieldLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(enterpriseValueLabel))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(messageValueTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(messageFieldLabel))
                .addGap(60, 60, 60)
                .addComponent(requestForTestButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(variableToDisplayImg)
                .addContainerGap(101, Short.MAX_VALUE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        rightJPanel.remove(this);
        Component[] componentArrayObj = rightJPanel.getComponents();
        Component component = componentArrayObj[componentArrayObj.length - 1];
        ActivityAreaForDoctorPanel doctorActivityArea = (ActivityAreaForDoctorPanel) component;
        doctorActivityArea.populateWorkRequestTable();
        CardLayout layout = (CardLayout) rightJPanel.getLayout();
        layout.previous(rightJPanel);
    }//GEN-LAST:event_backButtonActionPerformed

    private void requestForTestButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestForTestButtonActionPerformed
        String messageTxt = messageValueTextField.getText();
        LabTestWorkRequest request = new LabTestWorkRequest();
        request.setMessage(messageTxt);
        request.setSender(account);
        request.setStatus("Request Sent");
        Organization org = null;
        for (Organization organization : enterpriseObj.getOrganizationDirectory().getOrganizationList()) {
            if (organization instanceof LabEnterprise) {
                org = organization;
                break;
            }
        }
        if (org != null) {
            org.getWorkQueue().getWorkRequestList().add(request);
            account.getWorkQueue().getWorkRequestList().add(request);
        }
    }//GEN-LAST:event_requestForTestButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JLabel enterpriseFieldLabel;
    private javax.swing.JLabel enterpriseValueLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel messageFieldLabel;
    private javax.swing.JTextField messageValueTextField;
    private javax.swing.JButton requestForTestButton;
    private javax.swing.JLabel variableToDisplayImg;
    // End of variables declaration//GEN-END:variables
}
