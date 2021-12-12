/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.CommonUI;

import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Utils.Utils;
import UserInterface.HospitalAdminWorkspace.ManageHospitalApplicant;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Amey
 */
public class ManageEmployeeReusablePanel extends javax.swing.JPanel {

    JPanel rightJPanel;
    private Enterprise enterpriseObj;

    /**
     * Creates new form ManageEmployeeReusablePanel
     */
    public ManageEmployeeReusablePanel(JPanel rightJPanel, Enterprise enterpriseObj) {
        initComponents();
        this.rightJPanel = rightJPanel;
        this.enterpriseObj = enterpriseObj;
        populateOrgDropDown();
        populateOrganizationEmpComboBox();
    }

    private void populateOrgDropDown() {
        orgJComboBox.removeAllItems();
        for (Organization organization : enterpriseObj.getOrganizationDirectory().getOrganizationList()) {
            orgJComboBox.addItem(organization);
        }
    }

    private void populateOrganizationEmpComboBox() {;
        orgEmpDropdown.removeAllItems();
        for (Organization organization : enterpriseObj.getOrganizationDirectory().getOrganizationList()) {
            orgEmpDropdown.addItem(organization);
        }
    }

    private void populateEmployeeTable(Organization org) {
        DefaultTableModel tableModel = (DefaultTableModel) displayEmployeeDetailsTable.getModel();
        tableModel.setRowCount(0);
        for (Employee employeeObj : org.getEmployeeDirectory().getEmpList()) {
            Object[] row = new Object[3];
            row[1] = employeeObj.getEmpID();
            row[2] = employeeObj.getEmpName();
            row[0] = org.getName();
            tableModel.addRow(row);
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
        displayEmployeeDetailsTable = new javax.swing.JTable();
        orgEmpDropdown = new javax.swing.JComboBox();
        nameTextField = new javax.swing.JTextField();
        nameTextFieldLabel = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        addButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        orgJComboBox = new javax.swing.JComboBox();
        organizationDropdownLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(java.awt.SystemColor.activeCaption);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        displayEmployeeDetailsTable.setBackground(java.awt.SystemColor.info);
        displayEmployeeDetailsTable.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        displayEmployeeDetailsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Organization", "Employee Id", "Employee Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class
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
        jScrollPane1.setViewportView(displayEmployeeDetailsTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 960, 170));

        orgEmpDropdown.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        orgEmpDropdown.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        orgEmpDropdown.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                orgEmpDropdownMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                orgEmpDropdownMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                orgEmpDropdownMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                orgEmpDropdownMouseReleased(evt);
            }
        });
        orgEmpDropdown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orgEmpDropdownActionPerformed(evt);
            }
        });
        add(orgEmpDropdown, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 430, 270, 40));

        nameTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        add(nameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 430, 360, 40));

        nameTextFieldLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        nameTextFieldLabel.setText("Name:");
        add(nameTextFieldLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 400, -1, -1));

        backButton.setBackground(java.awt.SystemColor.controlLtHighlight);
        backButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        backButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/Images/left-arrow-in-circular-button-black-symbol-2.png"))); // NOI18N
        backButton.setText("Back");
        backButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 160, 40));

        addButton.setBackground(java.awt.SystemColor.controlLtHighlight);
        addButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        addButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/Images/icons8-plus-+-24.png"))); // NOI18N
        addButton.setText("Add ");
        addButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });
        add(addButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 430, 160, 40));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Manage Employees");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 40, -1, 30));

        orgJComboBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        orgJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        orgJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orgJComboBoxActionPerformed(evt);
            }
        });
        add(orgJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 90, 160, -1));

        organizationDropdownLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        organizationDropdownLabel1.setText("Organization:");
        add(organizationDropdownLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 400, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("View By Filter:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 90, -1, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void orgEmpDropdownMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_orgEmpDropdownMouseClicked

    }//GEN-LAST:event_orgEmpDropdownMouseClicked

    private void orgEmpDropdownMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_orgEmpDropdownMouseEntered

    }//GEN-LAST:event_orgEmpDropdownMouseEntered

    private void orgEmpDropdownMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_orgEmpDropdownMousePressed

    }//GEN-LAST:event_orgEmpDropdownMousePressed

    private void orgEmpDropdownMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_orgEmpDropdownMouseReleased

    }//GEN-LAST:event_orgEmpDropdownMouseReleased

    private void orgEmpDropdownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orgEmpDropdownActionPerformed

        nameTextField.setEnabled(true);
        nameTextField.setEditable(true);

    }//GEN-LAST:event_orgEmpDropdownActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        rightJPanel.remove(this);
        CardLayout layout = (CardLayout) rightJPanel.getLayout();
        layout.previous(rightJPanel);

    }//GEN-LAST:event_backButtonActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        Utils util = new Utils();
        Organization org = (Organization) orgEmpDropdown.getSelectedItem();
        if ((!util.notNullOrEmpty(nameTextField.getText()) || !util.isValidName(nameTextField.getText()))) {
            JOptionPane.showMessageDialog(null, "Please enter valid name.");
            return;
        }
//       if (org.getName().equals("Applicant Org")) {
//            ManageHospitalApplicant hospitalApplicantScreen = new ManageHospitalApplicant(rightJPanel, org, enterpriseObj);
//            rightJPanel.add("hospitalApplicantScreen", hospitalApplicantScreen);
//            CardLayout layout = (CardLayout) rightJPanel.getLayout();
//            layout.next(rightJPanel);
//        } else {
        Employee e = org.getEmployeeDirectory().createEmployee(nameTextField.getText());
        JOptionPane.showMessageDialog(null, "Employee added successfully!");
//        }
        populateEmployeeTable(org);
        orgJComboBox.setSelectedItem(org);
        nameTextField.setText("");
    }//GEN-LAST:event_addButtonActionPerformed

    private void orgJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orgJComboBoxActionPerformed
        Organization org = (Organization) orgJComboBox.getSelectedItem();
        if (org != null) {
            populateEmployeeTable(org);
        }
    }//GEN-LAST:event_orgJComboBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton backButton;
    private javax.swing.JTable displayEmployeeDetailsTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JLabel nameTextFieldLabel;
    private javax.swing.JComboBox orgEmpDropdown;
    private javax.swing.JComboBox orgJComboBox;
    private javax.swing.JLabel organizationDropdownLabel1;
    // End of variables declaration//GEN-END:variables
}
