/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.CommonUI;

import Business.Enterprise.CampaignEnterprise;
import Business.Enterprise.Enterprise;
import Business.Enterprise.FundingEnterprise;
import Business.Enterprise.HospitalEnterprise;
import Business.Enterprise.LabEnterprise;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import java.awt.CardLayout;
import java.util.HashSet;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Amey
 */
public class ManageOrganizationReusablePanel extends javax.swing.JPanel {

    JPanel rightJPanel;
    Enterprise enterpriseObj;

    /**
     * Creates new form ManageOrganizationReusablePanel
     */
    public ManageOrganizationReusablePanel(JPanel rightJPanel, Enterprise enterpriseObj) {
        initComponents();
        this.rightJPanel = rightJPanel;
        this.enterpriseObj = enterpriseObj;
        populateDropDown();
        populateOrganizationTable();
        populateOrgCombo();
        System.out.println("Creating organization in enterprise of type :" + enterpriseObj.getEnterpriseType().getValue());
    }

    private void populateDropDown() {
        if (enterpriseObj instanceof HospitalEnterprise) {
            if (enterpriseObj.getOrganizationDirectory().getOrganizationList().size() == 3) {
                orgTypeDropdown.removeAll();
                orgTypeDropdown.setEnabled(false);
                addOrgButton.setEnabled(false);
            }
        } else if (enterpriseObj instanceof LabEnterprise) {
            if (enterpriseObj.getOrganizationDirectory().getOrganizationList().size() == 2) {
                orgTypeDropdown.removeAll();
                orgTypeDropdown.setEnabled(false);
                addOrgButton.setEnabled(false);
            }
        } else if (enterpriseObj instanceof CampaignEnterprise) {
            if (enterpriseObj.getOrganizationDirectory().getOrganizationList().size() == 1) {
                orgTypeDropdown.removeAll();
                orgTypeDropdown.setEnabled(false);
                addOrgButton.setEnabled(false);
            }
        } else if (enterpriseObj instanceof FundingEnterprise) {
            if (enterpriseObj.getOrganizationDirectory().getOrganizationList().size() == 2) {
                orgTypeDropdown.removeAll();
                orgTypeDropdown.setEnabled(false);
                addOrgButton.setEnabled(false);
            }
        }
    }

    private void removeItemsFromList() {
        orgTypeDropdown.removeAll();
        orgTypeDropdown.setEnabled(false);
        JOptionPane.showMessageDialog(null, "The same organization cannot be added twice.");
    }

    private void addItemsInOrgDirectory() {
        Organization.OrganizationType orgType = (Organization.OrganizationType) orgTypeDropdown.getSelectedItem();
        Organization org = enterpriseObj.getOrganizationDirectory().createOrganization(orgType);
        org.setOrganizationID(enterpriseObj.getOrganizationDirectory().getOrganizationList().size());
        populateOrganizationTable();
        populateDropDown();
        orgTypeDropdown.removeItem(orgTypeDropdown.getSelectedItem());
        JOptionPane.showMessageDialog(null, "Sucessfully addded organization.");
    }

    private void populateOrganizationTable() {
        DefaultTableModel model = (DefaultTableModel) displayOrgTable.getModel();
        model.setRowCount(0);
        for (Organization org : enterpriseObj.getOrganizationDirectory().getOrganizationList()) {
            Object[] row = new Object[2];
            row[0] = org.getOrganizationID();
            row[1] = org.getName();
            model.addRow(row);
        }
    }

    private void populateOrgCombo() {
        orgTypeDropdown.removeAllItems();
        for (Organization.OrganizationType orgType : Organization.OrganizationType.values()) {
            if (enterpriseObj.getEnterpriseType().getValue().equals(Enterprise.EnterpriseType.Hospital.getValue())) {
                if (orgType.getValue().equals(Organization.OrganizationType.Doctor.getValue())
                        || orgType.getValue().equals(Organization.OrganizationType.Applicant.getValue())
                        || orgType.getValue().equals(Organization.OrganizationType.InternalLab.getValue())) {
                    orgTypeDropdown.addItem(orgType);
                }
            }
            if (enterpriseObj.getEnterpriseType().getValue().equals(Enterprise.EnterpriseType.Lab.getValue())) {
                if (orgType.getValue().equals(Organization.OrganizationType.Pathology.getValue())
                        || orgType.getValue().equals(Organization.OrganizationType.Radiology.getValue())) {
                    orgTypeDropdown.addItem(orgType);
                }
            }
            if (enterpriseObj.getEnterpriseType().getValue().equals(Enterprise.EnterpriseType.Funding.getValue())) {
                if (orgType.getValue().equals(Organization.OrganizationType.CorporateFund.getValue())
                        || orgType.getValue().equals(Organization.OrganizationType.TrustFund.getValue())) {
                    orgTypeDropdown.addItem(orgType);
                }
            }
            if (enterpriseObj.getEnterpriseType().getValue().equals(Enterprise.EnterpriseType.Campaign.getValue())) {
                if (orgType.getValue().equals(Organization.OrganizationType.RedCrossAwarenessOrg.getValue())) {
                    orgTypeDropdown.addItem(orgType);
                }
            }
        }
        for(Organization org: enterpriseObj.getOrganizationDirectory().getOrganizationList()){
            for(int i =0 ; i < orgTypeDropdown.getItemCount(); i++){
                Organization.OrganizationType type = (Organization.OrganizationType)orgTypeDropdown.getItemAt(i);
                String val = type.getValue();
                if(val.equalsIgnoreCase(org.getName())){
                    orgTypeDropdown.removeItemAt(i);
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
        displayOrgTable = new javax.swing.JTable();
        orgTypeDropdown = new javax.swing.JComboBox();
        orgTypeDropdownLabel = new javax.swing.JLabel();
        addOrgButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();

        displayOrgTable.setBackground(new java.awt.Color(255, 204, 204));
        displayOrgTable.setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N
        displayOrgTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID", "Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(displayOrgTable);

        orgTypeDropdown.setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N
        orgTypeDropdown.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        orgTypeDropdown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orgTypeDropdownActionPerformed(evt);
            }
        });

        orgTypeDropdownLabel.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        orgTypeDropdownLabel.setText("Organization Type");

        addOrgButton.setBackground(new java.awt.Color(255, 204, 204));
        addOrgButton.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        addOrgButton.setText("Add Organization");
        addOrgButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        addOrgButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addOrgButtonActionPerformed(evt);
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 105, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 927, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(addOrgButton, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(348, 348, 348))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(orgTypeDropdownLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67)
                        .addComponent(orgTypeDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(backButton)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(orgTypeDropdownLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(205, 205, 205)
                        .addComponent(orgTypeDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(84, 84, 84)
                .addComponent(addOrgButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(279, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void orgTypeDropdownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orgTypeDropdownActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_orgTypeDropdownActionPerformed

    private void addOrgButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addOrgButtonActionPerformed

        HashSet<String> s = new HashSet<>();
        for (Organization org : enterpriseObj.getOrganizationDirectory().getOrganizationList()) {
            s.add(org.getName());
        }        
        Organization.OrganizationType orgTypeSelected = (Organization.OrganizationType) orgTypeDropdown.getSelectedItem();
        boolean addOrg = s.add(orgTypeSelected.getValue());
        if (addOrg) {
            addItemsInOrgDirectory();
        } else {
            JOptionPane.showMessageDialog(null, "The same organization cannot be added twice.");
        }
    }//GEN-LAST:event_addOrgButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        rightJPanel.remove(this);
        CardLayout layout = (CardLayout) rightJPanel.getLayout();
        layout.previous(rightJPanel);
    }//GEN-LAST:event_backButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addOrgButton;
    private javax.swing.JButton backButton;
    private javax.swing.JTable displayOrgTable;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox orgTypeDropdown;
    private javax.swing.JLabel orgTypeDropdownLabel;
    // End of variables declaration//GEN-END:variables
}
