/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.SystemAdminWorkspace;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.HospitalEnterprise;
import Business.Entity.Donor;
import javax.swing.JPanel;
import Business.Entity.DonorDirectory;
import Business.Entity.Recipient;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.AwarenessWorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author admin
 */
public class CheckDonorRecipientRatio extends javax.swing.JPanel {

    EcoSystem ecoSystem;
    JPanel panel;
    private UserAccount userAccount;
    
    /**
     * Creates new form CheckDonorRecipientRatio
     */
    public CheckDonorRecipientRatio(EcoSystem ecoSystem, JPanel panel, UserAccount userAccount) {
        initComponents();
        this.ecoSystem = ecoSystem;
        this.panel = panel;
        this.userAccount = userAccount;
        populateValues();
        checkAllcount();
    }
    

    
    private void populateValues(){
        int totalRecipeint = 0;
        int totalDonors = 0;
        
        
        for (Network n : ecoSystem.getNetworks()) {
            for (Enterprise enterprise : n.getEnterpriseDirectory().getEnterpriseList()) {
                if(enterprise instanceof HospitalEnterprise)
                {
                    for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                        if (organization.getName().equalsIgnoreCase("Applicant Org")) 
                        {
                            totalRecipeint = organization.getRecipientDirectory().getRecipientRecords().size();
                            totalDonors = organization.getDonorDirectory().getDonorRecords().size();
  
                        }
                         
                   }
                }
            }
            if(totalRecipeint <= totalDonors){
                jButton1.setEnabled(true);
            }else{
                jButton1.setEnabled(false);
            }
            
        }
        
        jTextField1.setText(String.valueOf(totalDonors));
        jTextField2.setText(String.valueOf(totalRecipeint));
    }
    
    private void checkAllcount(){
        int dCorneas = 0, dheart = 0, dkidkey = 0, dlungs = 0, dliver = 0, dpanceras = 0;
        int rCorneas = 0, rheart = 0, rkidkey = 0, rlungs = 0, rliver = 0, rpanceras = 0;
        for (Network n : ecoSystem.getNetworks()) {
            for (Enterprise enterprise : n.getEnterpriseDirectory().getEnterpriseList()) {
                if(enterprise instanceof HospitalEnterprise)
                {
                    for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                        if (organization.getName().equalsIgnoreCase("Applicant Org")) 
                        {
                            for (Recipient rec : organization.getRecipientDirectory().getRecipientRecords()) { 
                                    if(rec.getOrganType().equalsIgnoreCase("Corneas")){
                                        rCorneas++;
                                    }else if(rec.getOrganType().equalsIgnoreCase("Kidney")){
                                        rheart++;
                                    }else if(rec.getOrganType().equalsIgnoreCase("Heart")){
                                        rkidkey++;
                                    }else if(rec.getOrganType().equalsIgnoreCase("Lungs")){
                                        rlungs++;
                                    }else if (rec.getOrganType().equalsIgnoreCase("Liver")){
                                        rliver++;
                                    }else if (rec.getOrganType().equalsIgnoreCase("Panceras")){
                                        rpanceras++;
                                    }
                            }
                            for (Donor donor : organization.getDonorDirectory().getDonorRecords()) {
                                List<String> list = donor.getOrganList();
                                for(String str : list){
                                   if(str.equalsIgnoreCase("Corneas")){
                                        dCorneas++;
                                    }else if(str.equalsIgnoreCase("Kidney")){
                                        dheart++;
                                    }else if(str.equalsIgnoreCase("Heart")){
                                        dkidkey++;
                                    }else if(str.equalsIgnoreCase("Lungs")){
                                        dlungs++;
                                    }else if (str.equalsIgnoreCase("Liver")){
                                        dliver++;
                                    }else if (str.equalsIgnoreCase("Panceras")){
                                        dpanceras++;
                                    } 
                                }
                                    
                            }
                        }
                   }
                }
            }
        }
 
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        dtm.setRowCount(0);
        
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Corneas");
        arrayList.add("Kidney");
        arrayList.add("Heart");
        arrayList.add("Lungs");
        arrayList.add("Liver");
        arrayList.add("Panceras");
                
        
        Map<String, Integer> map1 = new HashMap<>();

        map1.put("Corneas", Integer.valueOf(dCorneas));
         map1.put("Kidney", Integer.valueOf(dkidkey));
          map1.put("Heart", Integer.valueOf(dheart));
           map1.put("Lungs", Integer.valueOf(dlungs));
            map1.put("Liver", Integer.valueOf(dliver));
             map1.put("Panceras", Integer.valueOf(dpanceras));
             
             Map<String, Integer> map2 = new HashMap<>();

        map2.put("Corneas", Integer.valueOf(rCorneas));
         map2.put("Kidney", Integer.valueOf(rkidkey));
          map2.put("Heart", Integer.valueOf(rheart));
           map2.put("Lungs", Integer.valueOf(rlungs));
            map2.put("Liver", Integer.valueOf(rliver));
             map2.put("Panceras", Integer.valueOf(rpanceras));

        
        for (String orggans : arrayList) {
            Object[] rows = new Object[3];
            rows[0] = orggans;
            rows[1] = map1.get(orggans);
            rows[2] = map2.get(orggans);           
            dtm.addRow(rows);
        
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

        backBtn = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        backBtn.setBackground(java.awt.SystemColor.controlLtHighlight);
        backBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/Images/left-arrow-in-circular-button-black-symbol-2.png"))); // NOI18N
        backBtn.setText("BACK");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        jTextField1.setText("jTextField1");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField2.setText("jTextField2");

        jLabel1.setText("Toal Donor Count");

        jLabel2.setText("Toal Recipeint Count");

        jButton1.setText("Request Awarness Camp for Donors");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setText("Request Awareness Camp to Redcross");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Organ", "Donor Count", "Recipient Count"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addComponent(jLabel3))))
                .addContainerGap(223, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backBtn)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(90, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        panel.remove(this);
        Component[] componentArray = panel.getComponents();
        Component componentObj = componentArray[componentArray.length - 1];
        SystemAdminDashboard sysAdminScreen = (SystemAdminDashboard) componentObj;
        CardLayout prevLayout = (CardLayout) panel.getLayout();
        // populate tree on admin screen
        sysAdminScreen.populateTree();
        prevLayout.previous(panel);
    }//GEN-LAST:event_backBtnActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int column = 0;
        int row = jTable1.getSelectedRow();
        if(row < 1){
            JOptionPane.showMessageDialog(null, "Pleaseselect a row.");
             return;
        }
        String value = jTable1.getModel().getValueAt(row, column).toString();
        
        AwarenessWorkRequest req = new AwarenessWorkRequest();
        
        req.
        
        
        
        req.setMessage("Awarness Camp Required");
        req.setSender(userAccount);
        req.setStatus("Sent");
        req.setCampaign(eventNameFromTextField.getText());
        req.setAmount(money1);
        req.setEventName(campaignName);
        req.setFundType("Trust");
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
