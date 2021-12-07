/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.CommonUI;

/**
 *
 * @author Amey
 */
public class OrganizationAdminReusableWorkArea extends javax.swing.JPanel {

    /**
     * Creates new form HospitalAdminWorkArea
     */
    public OrganizationAdminReusableWorkArea() {
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

        manageUserButton = new javax.swing.JButton();
        managePeopleButton = new javax.swing.JButton();
        manageOrgButton = new javax.swing.JButton();
        hospitalAdminLabel = new javax.swing.JLabel();
        hospitalAdminValue = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        manageUserButton.setBackground(new java.awt.Color(255, 204, 204));
        manageUserButton.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        manageUserButton.setText("Manage User");
        manageUserButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        manageUserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageUserButtonActionPerformed(evt);
            }
        });
        add(manageUserButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, 570, 40));

        managePeopleButton.setBackground(new java.awt.Color(255, 204, 204));
        managePeopleButton.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        managePeopleButton.setText("Manage People");
        managePeopleButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        managePeopleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                managePeopleButtonActionPerformed(evt);
            }
        });
        add(managePeopleButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, 570, 40));

        manageOrgButton.setBackground(new java.awt.Color(255, 204, 204));
        manageOrgButton.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        manageOrgButton.setText("Manage Organization");
        manageOrgButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        manageOrgButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageOrgButtonActionPerformed(evt);
            }
        });
        add(manageOrgButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 570, 40));

        hospitalAdminLabel.setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N
        hospitalAdminLabel.setText("Admin :");
        add(hospitalAdminLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, -1, -1));

        hospitalAdminValue.setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N
        hospitalAdminValue.setText("<value>");
        add(hospitalAdminValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, 160, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void manageUserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageUserButtonActionPerformed

    }//GEN-LAST:event_manageUserButtonActionPerformed

    private void managePeopleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_managePeopleButtonActionPerformed

    }//GEN-LAST:event_managePeopleButtonActionPerformed

    private void manageOrgButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageOrgButtonActionPerformed

    }//GEN-LAST:event_manageOrgButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel hospitalAdminLabel;
    private javax.swing.JLabel hospitalAdminValue;
    private javax.swing.JButton manageOrgButton;
    private javax.swing.JButton managePeopleButton;
    private javax.swing.JButton manageUserButton;
    // End of variables declaration//GEN-END:variables
}
