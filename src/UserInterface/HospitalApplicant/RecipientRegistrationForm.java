/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.HospitalApplicant;

import Business.Organization.Organization;
import Business.Utils.Utils;
import java.awt.CardLayout;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


/**
 *
 * @author Amey
 */
public class RecipientRegistrationForm extends javax.swing.JPanel {
    
    Organization organization;
    JPanel panel;
    Utils utils;
    /**
     * Creates new form RecipientRegistrationForm
     */
    public RecipientRegistrationForm(Organization organization, JPanel panel ) {
        initComponents();
        this.organization = organization;
        this.panel = panel;
        populateRadio1();
        populateRadio2();
    }
    
    private void populateRadio1() {
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(maleRadioBtn);
        buttonGroup.add(femaleRadioBtn);
    }
    
    private void populateRadio2() {
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(lungRdBtn);
        buttonGroup.add(kidneyRdBtn);
        buttonGroup.add(pancreasRdBtn);
        buttonGroup.add(corneasRdBtn);
        buttonGroup.add(liverRdBtn);
        buttonGroup.add(heartRdBtn);
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
        recipientRegFormHeader = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        nameTextFieldLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        maleRadioBtn = new javax.swing.JRadioButton();
        femaleRadioBtn = new javax.swing.JRadioButton();
        ageTextField = new javax.swing.JTextField();
        bloodGroupDropdown = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        emailTextField = new javax.swing.JTextField();
        contactNumTextField = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        addressTextArea = new javax.swing.JTextArea();
        jLabel14 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        signatureTextField = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        liverRdBtn = new javax.swing.JRadioButton();
        corneasRdBtn = new javax.swing.JRadioButton();
        pancreasRdBtn = new javax.swing.JRadioButton();
        lungRdBtn = new javax.swing.JRadioButton();
        kidneyRdBtn = new javax.swing.JRadioButton();
        heartRdBtn = new javax.swing.JRadioButton();
        jLabel12 = new javax.swing.JLabel();

        backButton.setBackground(new java.awt.Color(153, 204, 255));
        backButton.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        backButton.setText("<< Back");
        backButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        recipientRegFormHeader.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        recipientRegFormHeader.setText("Organ Recipient Form");

        nameTextField.setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N

        nameTextFieldLabel.setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N
        nameTextFieldLabel.setText("Name");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N
        jLabel3.setText("Age");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N
        jLabel10.setText("Sex");

        maleRadioBtn.setBackground(new java.awt.Color(255, 255, 255));
        maleRadioBtn.setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N
        maleRadioBtn.setText("Male");

        femaleRadioBtn.setBackground(new java.awt.Color(255, 255, 255));
        femaleRadioBtn.setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N
        femaleRadioBtn.setText("Female");

        ageTextField.setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N

        bloodGroupDropdown.setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N
        bloodGroupDropdown.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "O-positive", "O-negative ", "A-positive", "A-negative", "B-positive", "B-negative", "AB-positive", "AB-negative" }));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N
        jLabel4.setText("Blood Group");

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N
        jLabel11.setText("Contact Number");

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N
        jLabel13.setText("Email Id");

        emailTextField.setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N

        contactNumTextField.setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N

        addressTextArea.setColumns(20);
        addressTextArea.setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N
        addressTextArea.setRows(5);
        jScrollPane3.setViewportView(addressTextArea);

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N
        jLabel14.setText("Address");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel9.setText("Signature");

        signatureTextField.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N

        jButton3.setBackground(new java.awt.Color(153, 204, 255));
        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton3.setText("Submit");
        jButton3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        liverRdBtn.setBackground(new java.awt.Color(255, 255, 255));
        liverRdBtn.setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N
        liverRdBtn.setText("Liver");

        corneasRdBtn.setBackground(new java.awt.Color(255, 255, 255));
        corneasRdBtn.setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N
        corneasRdBtn.setText("Corneas");

        pancreasRdBtn.setBackground(new java.awt.Color(255, 255, 255));
        pancreasRdBtn.setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N
        pancreasRdBtn.setText("Pancreas");

        lungRdBtn.setBackground(new java.awt.Color(255, 255, 255));
        lungRdBtn.setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N
        lungRdBtn.setText("Lung");

        kidneyRdBtn.setBackground(new java.awt.Color(255, 255, 255));
        kidneyRdBtn.setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N
        kidneyRdBtn.setText("Kidney");

        heartRdBtn.setBackground(new java.awt.Color(255, 255, 255));
        heartRdBtn.setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N
        heartRdBtn.setText("Heart");

        jLabel12.setFont(new java.awt.Font("Times New Roman", 3, 23)); // NOI18N
        jLabel12.setText("Which part needs to transplant");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(211, 211, 211)
                                .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(214, 214, 214)
                                .addComponent(ageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(167, 167, 167)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(corneasRdBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(liverRdBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(pancreasRdBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lungRdBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(kidneyRdBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(heartRdBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel4)
                                .addComponent(jLabel11)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel13))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel9)
                                    .addGap(3, 3, 3))
                                .addComponent(jLabel10)
                                .addComponent(jLabel3)
                                .addComponent(nameTextFieldLabel))
                            .addGap(40, 40, 40)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(contactNumTextField)
                                    .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(maleRadioBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(14, 14, 14)
                                        .addComponent(femaleRadioBtn))
                                    .addComponent(bloodGroupDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(214, 214, 214)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(signatureTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(141, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(recipientRegFormHeader)
                .addGap(390, 390, 390))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(381, 381, 381))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(recipientRegFormHeader)
                    .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameTextFieldLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(femaleRadioBtn)
                        .addComponent(pancreasRdBtn)
                        .addComponent(lungRdBtn))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(maleRadioBtn)
                        .addComponent(jLabel10)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(bloodGroupDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel4)))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(contactNumTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(corneasRdBtn)
                            .addComponent(kidneyRdBtn))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(liverRdBtn)
                            .addComponent(heartRdBtn))))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(signatureTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(54, 54, 54)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed

        panel.remove(this);
        CardLayout layout = (CardLayout) panel.getLayout();
        layout.previous(panel);                          
    }//GEN-LAST:event_backButtonActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        String gender = "";
        int age;
        
        if(maleRadioBtn.isSelected()){
            gender = maleRadioBtn.getText();
        }else{
            gender = femaleRadioBtn.getText();
        }  

            
        String nameOnForm = nameTextField.getText();
        String phone = contactNumTextField.getText();
        String emailID = emailTextField.getText();
        String signature = signatureTextField.getText(); 
        
       if(nameOnForm.equals("") || 
               gender.equals("") || 
               signature.equals("") || 
               emailID.equals("") || 
               phone.equals("")){
            JOptionPane.showMessageDialog(null, "Please fill all the details.");
            return;
        }
        
        
        
        try{
            age =  Integer.parseInt(ageTextField.getText());          
            if(age > 80 || age < 18){
                JOptionPane.showMessageDialog(null , "Please enter correct age.");
                ageTextField.setText("");
                 return;
            }
           }
           catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null , "Please add correct age"); 
            ageTextField.setText("");
               return;
           }
           
         //Check Name validity
        if(!utils.isValidName(nameOnForm) || !utils.isValidSign(signature)){
            JOptionPane.showMessageDialog(null, "Please enter valid name.");
            return;
        }
        
        //check Phone number validity
        if(utils.isValidPhoneNo(phone)){
            JOptionPane.showMessageDialog(null, " Invalid Phone No." + 
                "Should be 10 digit number between 0-9");
            return;
        }
        //check email ID validity
        if(!utils.isEmaildIdvalid(emailID)){
            JOptionPane.showMessageDialog(null, " Invalid Email ID." + 
                "Username should be an email-ID");
            return;
        }
        
   
        if(!(corneasRdBtn.isSelected() || 
                kidneyRdBtn.isSelected() ||
                liverRdBtn.isSelected() ||
                heartRdBtn.isSelected() ||
                lungRdBtn.isSelected() ||                 
                pancreasRdBtn.isSelected())){
            JOptionPane.showMessageDialog(null, "Kindly select an organ for transplantation");
            return;
        }
            
        Object bloodGroup = bloodGroupDropdown.getSelectedItem();

            String addr = addressTextArea.getText();

            String organType;
            
            if(corneasRdBtn.isSelected())
                organType = pancreasRdBtn.getText();               
            else if(kidneyRdBtn.isSelected())
                organType = kidneyRdBtn.getText();
            else if(heartRdBtn.isSelected())
                organType = liverRdBtn.getText();               
            else if(lungRdBtn.isSelected())
                organType = lungRdBtn.getText();
            else if(liverRdBtn.isSelected())
                organType = heartRdBtn.getText();
            else 
                organType = corneasRdBtn.getText();
            
            if(organization != null && organization.getRecipientDirectory() != null){
                organization.getRecipientDirectory().createRecipient(nameOnForm, age, addr, 
                        phone,emailID, (String) bloodGroup, gender,
                        signature, organType);
                JOptionPane.showMessageDialog(null, "You have been registered successfully.");
                
                signatureTextField.setText("");
                nameTextField.setText("");
                addressTextArea.setText("");
                ageTextField.setText("");
                emailTextField.setText("");
                contactNumTextField.setText("");
                
                panel.remove(this);
                CardLayout layout = (CardLayout) panel.getLayout();
                layout.previous(panel);
            }

    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea addressTextArea;
    private javax.swing.JTextField ageTextField;
    private javax.swing.JButton backButton;
    private javax.swing.JComboBox bloodGroupDropdown;
    private javax.swing.JTextField contactNumTextField;
    private javax.swing.JRadioButton corneasRdBtn;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JRadioButton femaleRadioBtn;
    private javax.swing.JRadioButton heartRdBtn;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JRadioButton kidneyRdBtn;
    private javax.swing.JRadioButton liverRdBtn;
    private javax.swing.JRadioButton lungRdBtn;
    private javax.swing.JRadioButton maleRadioBtn;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JLabel nameTextFieldLabel;
    private javax.swing.JRadioButton pancreasRdBtn;
    private javax.swing.JLabel recipientRegFormHeader;
    private javax.swing.JTextField signatureTextField;
    // End of variables declaration//GEN-END:variables
}
