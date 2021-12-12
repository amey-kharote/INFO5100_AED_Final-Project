/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.HospitalApplicant;

import Business.Enterprise.Enterprise;
import Business.Entity.Donor;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.Utils.Utils;
import Business.WorkQueue.DonorValidationWorkRequest;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Amey
 */
public class DonorRegistrationForm extends javax.swing.JPanel {

    /**
     * Creates new form DonorRegistrationForm
     */
    Organization org;
    String emailStr;
    JPanel rightJPanel;
    Enterprise enterpriseObj;
    UserAccount account;
    
    public DonorRegistrationForm(JPanel rightJPanel, Organization org, String emailStr, Enterprise enterpriseObj, UserAccount account) {
        initComponents();
        this.rightJPanel = rightJPanel;
        this.org = org;
        this.emailStr = emailStr;
        emailTextField.setText(emailStr);
        this.enterpriseObj = enterpriseObj;
        this.account = account;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backButton = new javax.swing.JButton();
        donorRegFormHeader = new javax.swing.JLabel();
        nameTextFieldLabel = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        ageTextField = new javax.swing.JTextField();
        ageTextFieldLabel = new javax.swing.JLabel();
        sexCheckboxLabel = new javax.swing.JLabel();
        maleRadioBtn = new javax.swing.JRadioButton();
        femaleRadioBtn = new javax.swing.JRadioButton();
        bloodGroupDropdown = new javax.swing.JComboBox();
        bloodGroupDropdownLabel = new javax.swing.JLabel();
        contactNumberLabel = new javax.swing.JLabel();
        emailTextField = new javax.swing.JTextField();
        emailTextFieldLabel = new javax.swing.JLabel();
        addressTextAreaLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        addressTextArea = new javax.swing.JTextArea();
        organCheckboxHeader = new javax.swing.JLabel();
        corneasCheckBox = new javax.swing.JCheckBox();
        heartCheckBox = new javax.swing.JCheckBox();
        liverCheckBox = new javax.swing.JCheckBox();
        pancreasCheckBox = new javax.swing.JCheckBox();
        lungsCheckBox = new javax.swing.JCheckBox();
        kidneysCheckBox = new javax.swing.JCheckBox();
        organNotAvailRadioButton = new javax.swing.JRadioButton();
        organAvailRadioButton = new javax.swing.JRadioButton();
        organAvailabilityHeader = new javax.swing.JLabel();
        emergencyContactHeader = new javax.swing.JLabel();
        emergencyContactNameTextField = new javax.swing.JTextField();
        emergencyContactNumTextField = new javax.swing.JTextField();
        emergencyContactTextFieldLabel = new javax.swing.JLabel();
        emergencyNameTextFieldName = new javax.swing.JLabel();
        registerButton = new javax.swing.JButton();
        signatureTextField = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        contactNumTextField = new javax.swing.JTextPane();

        setBackground(java.awt.SystemColor.activeCaption);

        backButton.setBackground(java.awt.SystemColor.controlLtHighlight);
        backButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/Images/left-arrow-in-circular-button-black-symbol-2.png"))); // NOI18N
        backButton.setText("Back");
        backButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        donorRegFormHeader.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        donorRegFormHeader.setText("Donor Registration Form");

        nameTextFieldLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        nameTextFieldLabel.setText("Name:");

        nameTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        ageTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        ageTextFieldLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ageTextFieldLabel.setText("Age:");

        sexCheckboxLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        sexCheckboxLabel.setText("Sex:");

        maleRadioBtn.setBackground(new java.awt.Color(255, 255, 255));
        maleRadioBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        maleRadioBtn.setText("Male");

        femaleRadioBtn.setBackground(new java.awt.Color(255, 255, 255));
        femaleRadioBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        femaleRadioBtn.setText("Female");

        bloodGroupDropdown.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bloodGroupDropdown.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "O-positive", "O-negative ", "A-positive", "A-negative", "B-positive", "B-negative", "AB-positive", "AB-negative" }));

        bloodGroupDropdownLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bloodGroupDropdownLabel.setText("Blood Group:");

        contactNumberLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        contactNumberLabel.setText("Contact Number:");

        emailTextField.setEditable(false);
        emailTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        emailTextField.setEnabled(false);
        emailTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailTextFieldActionPerformed(evt);
            }
        });

        emailTextFieldLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        emailTextFieldLabel.setText("Email Id:");

        addressTextAreaLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        addressTextAreaLabel.setText("Address:");

        addressTextArea.setColumns(20);
        addressTextArea.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        addressTextArea.setRows(5);
        jScrollPane1.setViewportView(addressTextArea);

        organCheckboxHeader.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        organCheckboxHeader.setText("After My Death I would like to donate:");

        corneasCheckBox.setBackground(new java.awt.Color(255, 255, 255));
        corneasCheckBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        corneasCheckBox.setText("Corneas");

        heartCheckBox.setBackground(new java.awt.Color(255, 255, 255));
        heartCheckBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        heartCheckBox.setText("Heart");

        liverCheckBox.setBackground(new java.awt.Color(255, 255, 255));
        liverCheckBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        liverCheckBox.setText("Liver");

        pancreasCheckBox.setBackground(new java.awt.Color(255, 255, 255));
        pancreasCheckBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        pancreasCheckBox.setText("Pancreas");

        lungsCheckBox.setBackground(new java.awt.Color(255, 255, 255));
        lungsCheckBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lungsCheckBox.setText("Lungs");

        kidneysCheckBox.setBackground(new java.awt.Color(255, 255, 255));
        kidneysCheckBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        kidneysCheckBox.setText("Kidney");

        organNotAvailRadioButton.setBackground(new java.awt.Color(255, 255, 255));
        organNotAvailRadioButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        organNotAvailRadioButton.setText("NO");

        organAvailRadioButton.setBackground(new java.awt.Color(255, 255, 255));
        organAvailRadioButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        organAvailRadioButton.setText("Yes");

        organAvailabilityHeader.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        organAvailabilityHeader.setText("Organ Available Now?");

        emergencyContactHeader.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        emergencyContactHeader.setText("In Emergency, Person of Contact");

        emergencyContactNameTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        emergencyContactNumTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        emergencyContactNumTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emergencyContactNumTextFieldActionPerformed(evt);
            }
        });

        emergencyContactTextFieldLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        emergencyContactTextFieldLabel.setText("Contact Number:");

        emergencyNameTextFieldName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        emergencyNameTextFieldName.setText("Name:");

        registerButton.setBackground(java.awt.SystemColor.controlLtHighlight);
        registerButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        registerButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/Images/icons8-register-32.png"))); // NOI18N
        registerButton.setText("Register");
        registerButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });

        signatureTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setText("Digital Signature:");

        contactNumTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jScrollPane2.setViewportView(contactNumTextField);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameTextFieldLabel)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(sexCheckboxLabel)
                                .addComponent(ageTextFieldLabel)))
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(contactNumberLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(emailTextFieldLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(bloodGroupDropdownLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(ageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(maleRadioBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(femaleRadioBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(bloodGroupDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(organAvailabilityHeader)
                                .addGap(165, 165, 165))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(emergencyContactTextFieldLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(emergencyContactNumTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(heartCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(lungsCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(corneasCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(kidneysCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(organCheckboxHeader)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(organAvailRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(organNotAvailRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(emergencyContactHeader)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(emergencyNameTextFieldName)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(emergencyContactNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(liverCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(pancreasCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(105, 105, 105))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(199, 199, 199)
                        .addComponent(donorRegFormHeader)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(128, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(addressTextAreaLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(649, 649, 649))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(registerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(364, 364, 364))))
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(signatureTextField)
                .addGap(649, 649, 649))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(donorRegFormHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameTextFieldLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ageTextFieldLabel)
                            .addComponent(ageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(maleRadioBtn)
                                .addComponent(femaleRadioBtn))
                            .addComponent(sexCheckboxLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bloodGroupDropdownLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(bloodGroupDropdown, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(contactNumberLabel))
                        .addGap(23, 23, 23))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(organCheckboxHeader)
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(corneasCheckBox)
                            .addComponent(kidneysCheckBox))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lungsCheckBox)
                            .addComponent(heartCheckBox))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(liverCheckBox)
                            .addComponent(pancreasCheckBox))
                        .addGap(27, 27, 27)
                        .addComponent(organAvailabilityHeader)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(organAvailRadioButton)
                            .addComponent(organNotAvailRadioButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(emailTextFieldLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(emergencyContactHeader)
                        .addGap(4, 4, 4)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(emergencyContactNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(emergencyNameTextFieldName)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(emergencyContactNumTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(emergencyContactTextFieldLabel)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addressTextAreaLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(signatureTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))
                        .addGap(94, 94, 94)
                        .addComponent(registerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(95, 95, 95))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        rightJPanel.remove(this);
        CardLayout layout = (CardLayout) rightJPanel.getLayout();
        layout.previous(rightJPanel);

    }//GEN-LAST:event_backButtonActionPerformed

    private void emailTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailTextFieldActionPerformed

    private void emergencyContactNumTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emergencyContactNumTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emergencyContactNumTextFieldActionPerformed

    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonActionPerformed
        String nameAdded = nameTextField.getText();
        String sexSelected = "";
        if (maleRadioBtn.isSelected() && femaleRadioBtn.isSelected()) {
            JOptionPane.showMessageDialog(null, "Please only one gender.");
            return;
        }
         if (organAvailRadioButton.isSelected() && organNotAvailRadioButton.isSelected()) {
             JOptionPane.showMessageDialog(null, "Please only one status of organ availability.");
            return;
        }
        
        if (maleRadioBtn.isSelected()) {
            sexSelected = maleRadioBtn.getText();
        }
        if (femaleRadioBtn.isSelected()) {
            sexSelected = femaleRadioBtn.getText();
        }
        Object bloodGroup = bloodGroupDropdown.getSelectedItem();
        String addressAdded = addressTextArea.getText();
        String contactNo = contactNumTextField.getText();
        String emergencyName = emergencyContactNameTextField.getText();
        String emergencyNum = emergencyContactNumTextField.getText();
        boolean availableNow = false;
        String sign = signatureTextField.getText();
        if (organAvailRadioButton.isSelected()) {
            availableNow = true;
        } else if (organNotAvailRadioButton.isSelected()) {
            availableNow = false;
        }
        List<String> organs = new ArrayList<String>();
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
        if (!(organAvailRadioButton.isSelected() || organNotAvailRadioButton.isSelected())) {
            JOptionPane.showMessageDialog(null, "Please select whether Organ currently available.");
            return;
        }
        if (nameTextField.equals("") || sexSelected.equals("") || sign.equals("") || emergencyName.equals("")) {
            JOptionPane.showMessageDialog(null, "Please fill all the fields listed below.");
            return;
        }
        if (!(corneasCheckBox.isSelected() || heartCheckBox.isSelected() || kidneysCheckBox.isSelected()
                || lungsCheckBox.isSelected() || liverCheckBox.isSelected() || pancreasCheckBox.isSelected())) {
            JOptionPane.showMessageDialog(null, "Please select the prgan up for donation.");
            return;
        }
        int age = 0;
        try {
            age = Integer.parseInt(ageTextField.getText());
            if (age > 120 || age < 18) {
                JOptionPane.showMessageDialog(null, "Please enter correct age.");
                ageTextField.setText("");
                return;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Please enter age as a numeric.");
            ageTextField.setText("");
            return;
        }
        Utils util = new Utils();
        if (!util.isValidName(nameAdded) || !util.isValidName(emergencyName) || !util.isValidName(sign)) {
            JOptionPane.showMessageDialog(null, "Please enter valid name.");
            return;
        }
        if (!util.isEmaildIdvalid(emailStr)) {
            JOptionPane.showMessageDialog(null, "Please enter a valid email.");
            return;
        }
        if (!util.isValidPhoneNum(contactNo) || !util.isValidPhoneNum(emergencyNum)) {
            JOptionPane.showMessageDialog(null, " Please enter a 10 digit valid phone number");
            return;
        }
        if (org != null && org.getDonorDirectory() != null) {
            Donor donor = org.getDonorDirectory().createDonor(nameAdded, age,addressAdded , (String) bloodGroup, contactNo,
                    sexSelected, sign, emailStr, emergencyName, emergencyNum, availableNow, organs);
            
            DonorValidationWorkRequest requestObj = new DonorValidationWorkRequest();
            requestObj.setSender(account);
            requestObj.setMessage("Please Validate Donor");
            requestObj.setPatientId(emailStr);
            requestObj.setStatus("Request Raised");
            requestObj.setDonorObj(donor);
            enterpriseObj.getWorkQueue().getWorkRequestList().add(requestObj);
            JOptionPane.showMessageDialog(null, "Thankyou for registering as a donor.");
            rightJPanel.remove(this);
            CardLayout layout = (CardLayout) rightJPanel.getLayout();
            layout.previous(rightJPanel);
            
            // raise a work request to doctor org to validate donor
        }
    }//GEN-LAST:event_registerButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea addressTextArea;
    private javax.swing.JLabel addressTextAreaLabel;
    private javax.swing.JTextField ageTextField;
    private javax.swing.JLabel ageTextFieldLabel;
    private javax.swing.JButton backButton;
    private javax.swing.JComboBox bloodGroupDropdown;
    private javax.swing.JLabel bloodGroupDropdownLabel;
    private javax.swing.JTextPane contactNumTextField;
    private javax.swing.JLabel contactNumberLabel;
    private javax.swing.JCheckBox corneasCheckBox;
    private javax.swing.JLabel donorRegFormHeader;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JLabel emailTextFieldLabel;
    private javax.swing.JLabel emergencyContactHeader;
    private javax.swing.JTextField emergencyContactNameTextField;
    private javax.swing.JTextField emergencyContactNumTextField;
    private javax.swing.JLabel emergencyContactTextFieldLabel;
    private javax.swing.JLabel emergencyNameTextFieldName;
    private javax.swing.JRadioButton femaleRadioBtn;
    private javax.swing.JCheckBox heartCheckBox;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JCheckBox kidneysCheckBox;
    private javax.swing.JCheckBox liverCheckBox;
    private javax.swing.JCheckBox lungsCheckBox;
    private javax.swing.JRadioButton maleRadioBtn;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JLabel nameTextFieldLabel;
    private javax.swing.JRadioButton organAvailRadioButton;
    private javax.swing.JLabel organAvailabilityHeader;
    private javax.swing.JLabel organCheckboxHeader;
    private javax.swing.JRadioButton organNotAvailRadioButton;
    private javax.swing.JCheckBox pancreasCheckBox;
    private javax.swing.JButton registerButton;
    private javax.swing.JLabel sexCheckboxLabel;
    private javax.swing.JTextField signatureTextField;
    // End of variables declaration//GEN-END:variables
}
