/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.HospitalApplicant;

/**
 *
 * @author Amey
 */
public class NewApplicantSignUpForm extends javax.swing.JPanel {

    /**
     * Creates new form NewApplicant
     */
    public NewApplicantSignUpForm() {
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

        emailTextFieldLabel = new javax.swing.JLabel();
        emailTextField = new javax.swing.JTextField();
        passwordTextField = new javax.swing.JPasswordField();
        passwordTextFieldLabel = new javax.swing.JLabel();
        confirmPasswordTextFieldLabel = new javax.swing.JLabel();
        confirmPasswordTextField = new javax.swing.JPasswordField();
        cityDropdown = new javax.swing.JComboBox();
        yesBtn = new javax.swing.JRadioButton();
        noBtn = new javax.swing.JRadioButton();
        submitButton = new javax.swing.JButton();
        organDonationInterestRadioButtonLabel = new javax.swing.JLabel();
        cityDropdownLabel = new javax.swing.JLabel();
        newApplicantSignUpForm = new javax.swing.JLabel();

        emailTextFieldLabel.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        emailTextFieldLabel.setText("Email");

        emailTextField.setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N

        passwordTextField.setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N

        passwordTextFieldLabel.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        passwordTextFieldLabel.setText("Password");

        confirmPasswordTextFieldLabel.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        confirmPasswordTextFieldLabel.setText("Confirm Password");

        confirmPasswordTextField.setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N
        confirmPasswordTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                confirmPasswordTextFieldKeyPressed(evt);
            }
        });

        yesBtn.setBackground(new java.awt.Color(255, 204, 204));
        yesBtn.setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N
        yesBtn.setText("Yes");
        yesBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yesBtnActionPerformed(evt);
            }
        });

        noBtn.setBackground(new java.awt.Color(255, 204, 204));
        noBtn.setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N
        noBtn.setText("No");

        submitButton.setBackground(new java.awt.Color(153, 204, 255));
        submitButton.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        submitButton.setText("Submit");
        submitButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        organDonationInterestRadioButtonLabel.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        organDonationInterestRadioButtonLabel.setText("Interested in Organ Donation?");

        cityDropdownLabel.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        cityDropdownLabel.setText("City");

        newApplicantSignUpForm.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        newApplicantSignUpForm.setText("Applicant Sign Up");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(221, 221, 221)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(emailTextFieldLabel)
                            .addComponent(passwordTextFieldLabel)
                            .addComponent(confirmPasswordTextFieldLabel)
                            .addComponent(cityDropdownLabel)
                            .addComponent(organDonationInterestRadioButtonLabel))
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(yesBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(noBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cityDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(confirmPasswordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passwordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(217, 217, 217)
                        .addComponent(newApplicantSignUpForm)))
                .addContainerGap(272, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(newApplicantSignUpForm)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailTextFieldLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordTextFieldLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirmPasswordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(confirmPasswordTextFieldLabel))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cityDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cityDropdownLabel))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(organDonationInterestRadioButtonLabel))
                    .addComponent(yesBtn)
                    .addComponent(noBtn))
                .addGap(53, 53, 53)
                .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(187, 187, 187))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void confirmPasswordTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_confirmPasswordTextFieldKeyPressed
        
    }//GEN-LAST:event_confirmPasswordTextFieldKeyPressed

    private void yesBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yesBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yesBtnActionPerformed

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        
    }//GEN-LAST:event_submitButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cityDropdown;
    private javax.swing.JLabel cityDropdownLabel;
    private javax.swing.JPasswordField confirmPasswordTextField;
    private javax.swing.JLabel confirmPasswordTextFieldLabel;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JLabel emailTextFieldLabel;
    private javax.swing.JLabel newApplicantSignUpForm;
    private javax.swing.JRadioButton noBtn;
    private javax.swing.JLabel organDonationInterestRadioButtonLabel;
    private javax.swing.JPasswordField passwordTextField;
    private javax.swing.JLabel passwordTextFieldLabel;
    private javax.swing.JButton submitButton;
    private javax.swing.JRadioButton yesBtn;
    // End of variables declaration//GEN-END:variables
}