/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.CommonUI;

import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import Business.Utils.Utils;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Amey
 */
public class ManageUserAccountReusablePanel extends javax.swing.JPanel {
    
    JPanel rightJPanel;
    Enterprise enterpriseObj;
    /**
     * Creates new form ManageUserAccountReusablePanel
     */
    public ManageUserAccountReusablePanel(JPanel rightJPanel, Enterprise enterpriseObj) {
        initComponents();
        this.rightJPanel = rightJPanel;
        this.enterpriseObj = enterpriseObj;
        populateOrgCombo();
        populateTableData();
    }

    private void populateTableData() {
        DefaultTableModel model = (DefaultTableModel) displayUserDetailsTable.getModel();
        model.setRowCount(0);
        for (Organization organization : enterpriseObj.getOrganizationDirectory().getOrganizationList()) {
            for (UserAccount account : organization.getUserAccountDirectory().getUserAccountList()) {
                Object rowObj[] = new Object[2];
                rowObj[0] = account;
                rowObj[1] = account.getRole();
                model.addRow(rowObj);
            }
        }
    }
     public void populateEmployeeComboBox(Organization org){
        employeeDropdown.removeAllItems();        
        for (Employee employeeObj : org.getEmployeeDirectory().getEmpList()){
            employeeDropdown.addItem(employeeObj);
        }
    }
    
    private void populateRoleComboBox(Organization org){
        roleDropdown.removeAllItems();
        for (Role role : org.getSupportedRole()){
            roleDropdown.addItem(role);
        }
    }
    private void populateOrgCombo() {
        orgDropdown.removeAllItems();
        for (Organization organization : enterpriseObj.getOrganizationDirectory().getOrganizationList()) {
            orgDropdown.addItem(organization);
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
        displayUserDetailsTable = new javax.swing.JTable();
        orgDropdown = new javax.swing.JComboBox();
        orgDropdownLabel = new javax.swing.JLabel();
        employeeDropdownLabel = new javax.swing.JLabel();
        employeeDropdown = new javax.swing.JComboBox();
        roleDropdown = new javax.swing.JComboBox();
        roleDropdownLabel = new javax.swing.JLabel();
        userNameTextFieldLabel = new javax.swing.JLabel();
        usernameTextField = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        passwordFieldLabel = new javax.swing.JLabel();
        createUserButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        emailLabel = new javax.swing.JLabel();

        displayUserDetailsTable.setBackground(new java.awt.Color(255, 204, 204));
        displayUserDetailsTable.setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N
        displayUserDetailsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "User Name", "Role"
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
        jScrollPane2.setViewportView(displayUserDetailsTable);

        orgDropdown.setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N
        orgDropdown.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        orgDropdown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orgDropdownActionPerformed(evt);
            }
        });

        orgDropdownLabel.setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N
        orgDropdownLabel.setText("Organization");

        employeeDropdownLabel.setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N
        employeeDropdownLabel.setText("Employee");

        employeeDropdown.setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N
        employeeDropdown.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        employeeDropdown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeeDropdownActionPerformed(evt);
            }
        });

        roleDropdown.setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N
        roleDropdown.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        roleDropdown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roleDropdownActionPerformed(evt);
            }
        });

        roleDropdownLabel.setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N
        roleDropdownLabel.setText("Role");

        userNameTextFieldLabel.setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N
        userNameTextFieldLabel.setText("User Name");

        usernameTextField.setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N
        usernameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameTextFieldActionPerformed(evt);
            }
        });

        passwordField.setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N

        passwordFieldLabel.setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N
        passwordFieldLabel.setText("Password");

        createUserButton.setBackground(new java.awt.Color(255, 204, 204));
        createUserButton.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        createUserButton.setText("Create");
        createUserButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        createUserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createUserButtonActionPerformed(evt);
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

        emailLabel.setFont(new java.awt.Font("Times New Roman", 2, 23)); // NOI18N
        emailLabel.setText("Please give your Email Address");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(employeeDropdownLabel)
                    .addComponent(orgDropdownLabel)
                    .addComponent(roleDropdownLabel)
                    .addComponent(userNameTextFieldLabel)
                    .addComponent(passwordFieldLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(orgDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(employeeDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(roleDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(emailLabel)
                .addGap(281, 281, 281))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(createUserButton, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(353, 353, 353))
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 926, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(100, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backButton)
                .addGap(22, 22, 22)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(orgDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(orgDropdownLabel))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(employeeDropdownLabel)
                    .addComponent(employeeDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(roleDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(roleDropdownLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailLabel)
                    .addComponent(userNameTextFieldLabel))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordFieldLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62)
                .addComponent(createUserButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(85, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void orgDropdownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orgDropdownActionPerformed
        Organization org = (Organization) orgDropdown.getSelectedItem();
        if (org != null){
            populateEmployeeComboBox(org);
            populateRoleComboBox(org);
        }
        if(String.valueOf(orgDropdown.getItemAt(orgDropdown.getSelectedIndex())).equals("Applicant Org")){
            usernameTextField.setEnabled(false);
            passwordField.setEditable(false);
            usernameTextField.setEditable(false);
            passwordField.setEnabled(false);
            createUserButton.setEnabled(false);
        }
        else{
            usernameTextField.setEnabled(true);
            passwordField.setEnabled(true);
            usernameTextField.setEditable(true);
            passwordField.setEditable(true);
        }        

    }//GEN-LAST:event_orgDropdownActionPerformed

    private void roleDropdownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roleDropdownActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_roleDropdownActionPerformed

    private void usernameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameTextFieldActionPerformed

    private void createUserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createUserButtonActionPerformed
        String userEmail = usernameTextField.getText();
        String password = String.valueOf(passwordField.getPassword());
        Utils util = new Utils();  
        if( !util.notNullOrEmpty(userEmail) && !util.notNullOrEmpty(password)){
            JOptionPane.showMessageDialog(null, "Please enter a valid username and password!");
            return;
        }
        Organization org = (Organization) orgDropdown.getSelectedItem();
        Employee employeeObj = (Employee) employeeDropdown.getSelectedItem();
        Role role = (Role) roleDropdown.getSelectedItem();   
        if(!util.isEmaildIdvalid(userEmail)){
            JOptionPane.showMessageDialog(null, "Please enter a valid emailId.");
            return;
        }        
        if(!util.isPasswordValid(password)){
            JOptionPane.showMessageDialog(null, "Please enter a valid password.");
            return;
        }
        UserAccount account = org.getUserAccountDirectory().createUserAccount(userEmail, password, employeeObj, role);
        if(account == null){
            JOptionPane.showMessageDialog(null, "User already exists!. Please enter a different emailId.");
            usernameTextField.setText("");
            passwordField.setText("");
            return;
        }
        populateTableData();
        usernameTextField.setText("");
        passwordField.setText("");
        
    }//GEN-LAST:event_createUserButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        rightJPanel.remove(this);
        CardLayout layout = (CardLayout) rightJPanel.getLayout();
        layout.previous(rightJPanel);
        
    }//GEN-LAST:event_backButtonActionPerformed

    private void employeeDropdownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeeDropdownActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_employeeDropdownActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JButton createUserButton;
    private javax.swing.JTable displayUserDetailsTable;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JComboBox employeeDropdown;
    private javax.swing.JLabel employeeDropdownLabel;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox orgDropdown;
    private javax.swing.JLabel orgDropdownLabel;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordFieldLabel;
    private javax.swing.JComboBox roleDropdown;
    private javax.swing.JLabel roleDropdownLabel;
    private javax.swing.JLabel userNameTextFieldLabel;
    private javax.swing.JTextField usernameTextField;
    // End of variables declaration//GEN-END:variables
}
