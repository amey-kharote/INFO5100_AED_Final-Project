/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.SystemAdminWorkspace;

import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Role.EnterpriseManagerRole;
import Business.UserAccount.UserAccount;
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
public class ManageEnterpriseAdminDash extends javax.swing.JPanel {

    EcoSystem ecoSystem;
    JPanel rightJPanel;
    /**
     * Creates new form ManageEnterpriseAdminDash
     */
    public ManageEnterpriseAdminDash(JPanel rightJPanel, EcoSystem ecoSystemObj) {
        initComponents();
        this.ecoSystem = ecoSystemObj;
        this.rightJPanel = rightJPanel;
        populateEnterpriseTable();
        populateNetworkList();
    }
   
    private void populateNetworkList() {
        cityNetworkDropdown.removeAllItems();
        for (Network network : ecoSystem.getNetworks()) cityNetworkDropdown.addItem(network);
        
    }
    
    private void populateEnterpriseTable() {
        DefaultTableModel model = (DefaultTableModel) enterpriseAdminTable.getModel();
        model.setRowCount(0);
        for (Network network : ecoSystem.getNetworks()) {
            for (Enterprise enterpriseObj : network.getEnterpriseDirectory().getEnterpriseList()) {
                for (UserAccount userAccount : enterpriseObj.getUserAccountDirectory().getUserAccountList()) {
                    Object[] rowObj = new Object[3];
                    rowObj[0] = enterpriseObj.getName();
                    rowObj[1] = network.getName();
                    rowObj[2] = userAccount.getUsername();
                    model.addRow(rowObj);
                }
            }
        }
    }     

    private void populateEnterpriseList(Network networkObj) {
        enterpriseNetworkDropdown.removeAllItems();
        for (Enterprise enterprise : networkObj.getEnterpriseDirectory().getEnterpriseList()) enterpriseNetworkDropdown.addItem(enterprise);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        enterpriseAdminTable = new javax.swing.JTable();
        formCityLabel = new javax.swing.JLabel();
        cityNetworkDropdown = new javax.swing.JComboBox();
        formenterpriseLabel = new javax.swing.JLabel();
        enterpriseNetworkDropdown = new javax.swing.JComboBox();
        formUsernameLabel = new javax.swing.JLabel();
        formEmailTextField = new javax.swing.JTextField();
        formPasswordLabel = new javax.swing.JLabel();
        formPasswordField = new javax.swing.JPasswordField();
        backBtn = new javax.swing.JButton();
        SubmitBtn = new javax.swing.JButton();
        helperImageLabel = new javax.swing.JLabel();

        jPanel1.setBackground(java.awt.SystemColor.activeCaption);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        enterpriseAdminTable.setBackground(java.awt.SystemColor.info);
        enterpriseAdminTable.setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N
        enterpriseAdminTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Enterprise Name", "City", "Username"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(enterpriseAdminTable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 1040, 140));

        formCityLabel.setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N
        formCityLabel.setText("City");
        jPanel1.add(formCityLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, -1, -1));

        cityNetworkDropdown.setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N
        cityNetworkDropdown.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cityNetworkDropdown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cityNetworkDropdownActionPerformed(evt);
            }
        });
        jPanel1.add(cityNetworkDropdown, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, 270, -1));

        formenterpriseLabel.setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N
        formenterpriseLabel.setText("Enterprise");
        jPanel1.add(formenterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, -1, -1));

        enterpriseNetworkDropdown.setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N
        enterpriseNetworkDropdown.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        enterpriseNetworkDropdown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterpriseNetworkDropdownActionPerformed(evt);
            }
        });
        jPanel1.add(enterpriseNetworkDropdown, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 350, 270, -1));

        formUsernameLabel.setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N
        formUsernameLabel.setText("Email");
        jPanel1.add(formUsernameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 400, -1, -1));

        formEmailTextField.setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N
        jPanel1.add(formEmailTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 400, 270, -1));

        formPasswordLabel.setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N
        formPasswordLabel.setText("Password");
        jPanel1.add(formPasswordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 450, -1, -1));

        formPasswordField.setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N
        jPanel1.add(formPasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 450, 270, -1));

        backBtn.setBackground(new java.awt.Color(153, 204, 255));
        backBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/Images/left-arrow-in-circular-button-black-symbol-2.png"))); // NOI18N
        backBtn.setText("Back");
        backBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        jPanel1.add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 160, 40));

        SubmitBtn.setBackground(java.awt.SystemColor.controlLtHighlight);
        SubmitBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/Images/icons8-submit-resume-24.png"))); // NOI18N
        SubmitBtn.setText("Submit");
        SubmitBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        SubmitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitBtnActionPerformed(evt);
            }
        });
        jPanel1.add(SubmitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 540, 170, 40));

        helperImageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/Images/donation.jpg"))); // NOI18N
        jPanel1.add(helperImageLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 370, 600, 490));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1283, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1283, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 866, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 866, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void SubmitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitBtnActionPerformed
        // TODO add your handling code here:
        System.out.println("Validating Enterprise Admin Credentials");
        Utils util = new Utils();
        Enterprise enterpriseObj = (Enterprise) enterpriseNetworkDropdown.getSelectedItem();
        String emailId = formEmailTextField.getText();
        String password = String.valueOf(formPasswordField.getPassword());

        if (!(util.notNullOrEmpty(password) || util.notNullOrEmpty(emailId))) {
            JOptionPane.showMessageDialog(null, "Please enter emailId and password");
            return;
        }
        if (!util.isPasswordValid(password)) {
            JOptionPane.showMessageDialog(null, "Please enter a valid password. (Minimum eight characters, at least one uppercase letter, one lowercase letter and one number)");
            return;
        }
        if (!util.isEmaildIdvalid(emailId)) {
            JOptionPane.showMessageDialog(null, "Please enter a valid email id.");
            return;
        }      

        Employee employee = enterpriseObj.getEmployeeDirectory().createEmployee(emailId);
        UserAccount account = enterpriseObj.getUserAccountDirectory().createUserAccount(emailId, password, employee, new EnterpriseManagerRole());
       
        System.out.println("Successfully created enterprise admin useraccount for emailId :"+emailId);
        
        formEmailTextField.setText("");
        formPasswordField.setText("");
        
        populateEnterpriseTable();
    }//GEN-LAST:event_SubmitBtnActionPerformed

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

    private void enterpriseNetworkDropdownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterpriseNetworkDropdownActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enterpriseNetworkDropdownActionPerformed

    private void cityNetworkDropdownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cityNetworkDropdownActionPerformed
        Network networkObj = (Network) cityNetworkDropdown.getSelectedItem();
       if (networkObj != null)  populateEnterpriseList(networkObj);
    }//GEN-LAST:event_cityNetworkDropdownActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SubmitBtn;
    private javax.swing.JButton backBtn;
    private javax.swing.JComboBox cityNetworkDropdown;
    private javax.swing.JTable enterpriseAdminTable;
    private javax.swing.JComboBox enterpriseNetworkDropdown;
    private javax.swing.JLabel formCityLabel;
    private javax.swing.JTextField formEmailTextField;
    private javax.swing.JPasswordField formPasswordField;
    private javax.swing.JLabel formPasswordLabel;
    private javax.swing.JLabel formUsernameLabel;
    private javax.swing.JLabel formenterpriseLabel;
    private javax.swing.JLabel helperImageLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
