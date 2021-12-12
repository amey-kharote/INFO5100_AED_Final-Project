/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.HospitalAdminWorkspace;

import Business.EcoSystem;
import Business.Enterprise.CampaignEnterprise;
import Business.Enterprise.Enterprise;
import Business.Enterprise.FundingEnterprise;
import Business.Enterprise.HospitalEnterprise;
import Business.Entity.Donor;
import javax.swing.JPanel;
import Business.Entity.DonorDirectory;
import Business.Entity.Recipient;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.AwarenessWorkRequest;
import UserInterface.CommonUI.OrganizationAdminReusableWorkArea;
import UserInterface.SystemAdminWorkspace.SystemAdminDashboard;
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

    EcoSystem system;
    JPanel panel;
    Enterprise ent;
    private UserAccount userAccount;
    
    /**
     * Creates new form CheckDonorRecipientRatio
     */
    public CheckDonorRecipientRatio(EcoSystem system, JPanel panel, UserAccount userAccount, Enterprise ent) {
        initComponents();
        this.system = system;
        this.panel = panel;
        this.userAccount = userAccount;
        this.ent = ent;
        populateValues();
        checkAllcount();
    }
    
    
    private void populateValues(){
        int totalRecipeint = 0;
        int totalDonors = 0;
        
        for (Network n : system.getNetworks()) {
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
            
            if(totalRecipeint <= totalDonors){
                jButton1.setEnabled(true);
            }else{
                jButton1.setEnabled(false);
            }         
        }
        } 
        jTextField1.setText(String.valueOf(totalDonors));
        jTextField2.setText(String.valueOf(totalRecipeint));

    }
    
    private void checkAllcount(){
        int dCorneas = 0, dheart = 0, dkidkey = 0, dlungs = 0, dliver = 0, dpanceras = 0;
        int rCorneas = 0, rheart = 0, rkidkey = 0, rlungs = 0, rliver = 0, rpanceras = 0;
        for (Network n : system.getNetworks()){
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
                                        dkidkey++;
                                    }else if(str.equalsIgnoreCase("Heart")){
                                        dheart++;
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
        kidneysCheckBox = new javax.swing.JCheckBox();
        lungsCheckBox = new javax.swing.JCheckBox();
        pancreasCheckBox = new javax.swing.JCheckBox();
        liverCheckBox = new javax.swing.JCheckBox();
        heartCheckBox = new javax.swing.JCheckBox();
        corneasCheckBox = new javax.swing.JCheckBox();
        jButton2 = new javax.swing.JButton();

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

        jButton1.setText("Raise Request for Awarness Camp");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setText("Select the organs to initiate awareness camps");

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

        kidneysCheckBox.setBackground(new java.awt.Color(255, 255, 255));
        kidneysCheckBox.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        kidneysCheckBox.setText("Kidney");

        lungsCheckBox.setBackground(new java.awt.Color(255, 255, 255));
        lungsCheckBox.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lungsCheckBox.setText("Lungs");

        pancreasCheckBox.setBackground(new java.awt.Color(255, 255, 255));
        pancreasCheckBox.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        pancreasCheckBox.setText("Pancreas");

        liverCheckBox.setBackground(new java.awt.Color(255, 255, 255));
        liverCheckBox.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        liverCheckBox.setText("Liver");

        heartCheckBox.setBackground(new java.awt.Color(255, 255, 255));
        heartCheckBox.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        heartCheckBox.setText("Heart");

        corneasCheckBox.setBackground(new java.awt.Color(255, 255, 255));
        corneasCheckBox.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        corneasCheckBox.setText("Corneas");

        jButton2.setText("View Camp details");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(15, 15, 15)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 53, 53)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(heartCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lungsCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(corneasCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(59, 59, 59)
                                .addComponent(kidneysCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(liverCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(pancreasCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(201, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(kidneysCheckBox)
                    .addComponent(corneasCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lungsCheckBox)
                    .addComponent(heartCheckBox))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(liverCheckBox)
                    .addComponent(pancreasCheckBox))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addContainerGap(28, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed

        panel.remove(this);
        Component[] componentArray = panel.getComponents();
        Component componentObj = componentArray[componentArray.length - 1];
        OrganizationAdminReusableWorkArea sysAdminScreen = (OrganizationAdminReusableWorkArea) componentObj;
        CardLayout prevLayout = (CardLayout) panel.getLayout();
        // populate tree on admin screen
        //sysAdminScreen.populateTree();
        prevLayout.previous(panel);
    }//GEN-LAST:event_backBtnActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        List<String> organs = new ArrayList<String>();
        if(!corneasCheckBox.isSelected() && !heartCheckBox.isSelected() && !kidneysCheckBox.isSelected()
                && !lungsCheckBox.isSelected() && !liverCheckBox.isSelected() && !pancreasCheckBox.isSelected()){
            JOptionPane.showMessageDialog(null, "Please select one or more organs to send the request!");
            return;
        }
        if (corneasCheckBox.isSelected()) {
            organs.add(corneasCheckBox.getText());
        }
        if (heartCheckBox.isSelected()) {
            organs.add(heartCheckBox.getText());
        }
        if (kidneysCheckBox.isSelected()) {
            organs.add(kidneysCheckBox.getText());
        }
        if (lungsCheckBox.isSelected()) {
            organs.add(lungsCheckBox.getText());
        }
        if (liverCheckBox.isSelected()) {
            organs.add(liverCheckBox.getText());
        }
        if (pancreasCheckBox.isSelected()) {
            organs.add(pancreasCheckBox.getText());
        }
        
        AwarenessWorkRequest req = new AwarenessWorkRequest();
        req.setMessage("Awarness Campaign Request!");
        req.setSender(userAccount);
        req.setStatus("Sent");
        req.setOrgans(organs);
        
        //req.setSender(enterpriseObj.getUserAccountDirectory().getUserAccountList().get(0));
        //requestObj.setMessage("Awarness Campaign Request!");
        //requestObj.setStatus("Request Sent");

        ent.getWorkQueue().getWorkRequestList().add(req);
        JOptionPane.showMessageDialog(null, "Request for awareness camp has been sent!");          
      
        /*
        // TODO add your handling code here:
        int column = 0;
        int row = jTable1.getSelectedRow();
        if(row < 1){
            JOptionPane.showMessageDialog(null, "Please select a row.");
             return;
        }
        String value = jTable1.getModel().getValueAt(row, column).toString();
        
        AwarenessWorkRequest req = new AwarenessWorkRequest();
        req.setMessage("Awarness Camp Required");
        req.setFrom("Admin");
        req.setStatus("Sent");
        req.setOrganType(value);
        
       Organization org1 = null;
         for(Network network : system.getNetworks()){          
            for(Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()){
                if(enterprise instanceof CampaignEnterprise){                   
                    for(Organization org :  enterprise.getOrganizationDirectory().getOrganizationList()){  
                       if(org instanceof RedCrossAwarenessOrg){
                           org1 = org; 
                       }
                   }
                }
            }
        }
         if(org1 != null){
            org1.getWorkQueue().getWorkRequestList().add(req);
        }
         */
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        ViewCampDetails campPanel = new ViewCampDetails(system, panel, userAccount, ent);
        panel.add("FundRequestStatusJPanel", campPanel);
        CardLayout layout = (CardLayout) panel.getLayout();
        layout.next(panel);
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JCheckBox corneasCheckBox;
    private javax.swing.JCheckBox heartCheckBox;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JCheckBox kidneysCheckBox;
    private javax.swing.JCheckBox liverCheckBox;
    private javax.swing.JCheckBox lungsCheckBox;
    private javax.swing.JCheckBox pancreasCheckBox;
    // End of variables declaration//GEN-END:variables
}
