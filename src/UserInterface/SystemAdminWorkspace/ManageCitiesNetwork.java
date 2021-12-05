/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.SystemAdminWorkspace;

import Business.EcoSystem;
import Business.Network.Network;
import Business.Utils.Utils;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Amey
 */
public class ManageCitiesNetwork extends javax.swing.JPanel {

    EcoSystem ecoSystem;
    JPanel rightJPanel;
    /**
     * Creates new form ManageCitiesNetwork
     */
    public ManageCitiesNetwork(JPanel rightJPanel, EcoSystem ecoSystemObj) {
        initComponents();
        this.ecoSystem = ecoSystemObj;
        this.rightJPanel = rightJPanel;
        populateNetworkTable();
    }
    
    private void populateNetworkTable() {
        DefaultTableModel networkTable = (DefaultTableModel) citiesNetworkTable.getModel();
        networkTable.setRowCount(0);
        for (Network network : ecoSystem.getNetworks()) {
            Object[] tableRow = new Object[1];
            tableRow[0] = network.getName();
            networkTable.addRow(tableRow);
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

        jScrollPane2 = new javax.swing.JScrollPane();
        citiesNetworkTable = new javax.swing.JTable();
        cityNameTextField = new javax.swing.JTextField();
        cityNameLabel = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        submitBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 255));

        citiesNetworkTable.setBackground(new java.awt.Color(0, 153, 255));
        citiesNetworkTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "City Network Name"
            }
        ));
        jScrollPane2.setViewportView(citiesNetworkTable);

        cityNameLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cityNameLabel.setText("City Name:");

        backBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        backBtn.setText("<<BACK");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        submitBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        submitBtn.setText("Submit");
        submitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backBtn)
                        .addGap(32, 32, 32)
                        .addComponent(submitBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cityNameLabel)
                        .addGap(54, 54, 54)
                        .addComponent(cityNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 870, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(583, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cityNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cityNameLabel))
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backBtn)
                    .addComponent(submitBtn))
                .addContainerGap(362, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        rightJPanel.remove(this);
        Component[] componentArray = rightJPanel.getComponents();
        Component componentObj = componentArray[componentArray.length - 1];
        SystemAdminDashboard sysAdminScreen = (SystemAdminDashboard) componentObj;
        CardLayout prevLayout = (CardLayout) rightJPanel.getLayout();
        // populate tree on admin screen
        sysAdminScreen.populateTree();
        prevLayout.previous(rightJPanel);
    }//GEN-LAST:event_backBtnActionPerformed

    private void submitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtnActionPerformed
        // TODO add your handling code here:
        Utils util = new Utils();
        String networkName = cityNameTextField.getText();

        if (util.notNullOrEmpty(networkName)) {
            if (util.isAlphaNumericFieldValid(networkName)) {
                for (Network network: ecoSystem.getNetworks()) {
                    if (network.getName().equalsIgnoreCase(networkName)) {
                        JOptionPane.showMessageDialog(null, "City aLready exists. Please enter a new city!");
                        cityNameTextField.setText("");
                        return;
                    }
                }
                Network newNetwork = ecoSystem.createAddNetwork();
                newNetwork.setName(networkName);
                populateNetworkTable(); 
                cityNameTextField.setText("");
                JOptionPane.showMessageDialog(null, "Sucessfully created a city.");
                return;
            }
             JOptionPane.showMessageDialog(null, "Please enter a valid city.");
             return;
        }
        JOptionPane.showMessageDialog(null, "Please do not leave city name as empty!");              
    }//GEN-LAST:event_submitBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JTable citiesNetworkTable;
    private javax.swing.JLabel cityNameLabel;
    private javax.swing.JTextField cityNameTextField;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton submitBtn;
    // End of variables declaration//GEN-END:variables
}
