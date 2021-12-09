/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.HospitalApplicant;

import Business.EcoSystem;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Utils.Utils;
import java.awt.CardLayout;
import java.util.Properties;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Amey
 */
public class NewApplicantSignUpForm extends javax.swing.JPanel {

    /**
     * Creates new form NewApplicant
     */
    JPanel rightJPanel;
    EcoSystem business;
    Organization org;

    public void populateCityDropDown(EcoSystem business) {
        for (Network n : business.getNetworks()) {
            cityDropdown.addItem(n.getName());
        }
    }

    public NewApplicantSignUpForm() {
        initComponents();
        this.org = org;
        this.rightJPanel = rightJPanel;
        this.business = business;
        populateCityDropDown(business);
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
                        .addGap(217, 217, 217)
                        .addComponent(newApplicantSignUpForm))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(217, 217, 217)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(emailTextFieldLabel)
                                    .addComponent(passwordTextFieldLabel)
                                    .addComponent(cityDropdownLabel))
                                .addGap(57, 57, 57))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(organDonationInterestRadioButtonLabel)
                                .addGap(48, 48, 48)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(yesBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(noBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cityDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passwordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(272, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(newApplicantSignUpForm)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailTextFieldLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordTextFieldLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cityDropdownLabel)
                    .addComponent(cityDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(yesBtn)
                        .addComponent(organDonationInterestRadioButtonLabel))
                    .addComponent(noBtn))
                .addGap(90, 90, 90)
                .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(187, 187, 187))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void yesBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yesBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yesBtnActionPerformed

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        if (emailTextField.getText().equals("") || passwordTextField.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter all fields!");
        } else {
            Utils util = new Utils();
            if (util.isEmaildIdvalid(emailTextField.getText()) && util.isPasswordValid(passwordTextField.getText())) {
                if (yesBtn.isSelected()) {
                    DonorRegistrationForm donorScreen = new DonorRegistrationForm(rightJPanel, org, emailTextField.getText());
                    CardLayout layout = (CardLayout) donorScreen.getLayout();
                    rightJPanel.add("DonorRegistrationForm", donorScreen);
                    layout.next(rightJPanel);
                } else if (noBtn.isSelected()) {
//                    final String to = emailTextField.getText();
//                    boolean sessionDebug = false;
//                    String from = "siddhiprabhu95@gmail.com";
//                    String host = "smtp.gmail.com";
//                    String user = "siddhiprabhu95@gmail.com";
//                    String pass = "";//we have to type the real password here for it to work
//                    //if it is gmail we have to enable less secure apps
//                    Properties properties = System.getProperties();
//                    properties.setProperty("mail.smtp.host", host);
//                    properties.put("mail.smtp.starttls.required", "true");
//                    properties.put("mail.smtp.starttls.enable", "true");
//                    properties.put("mail.smtp.host", host);
//                    properties.put("mail.smtp.port", "587");
//                    properties.put("mail.smtp.auth", "true");
//                    java.security.Security.addProvider(new com.sun.net.ssl.internal.ssl.Provider());
//                    Session session;
//                    session = Session.getDefaultInstance(properties, null);
//                    session.setDebug(sessionDebug);
//                    try {
//                        MimeMessage message = new MimeMessage(session);
//                        message.setFrom(new InternetAddress(from));
//                        message.setRecipient(Message.RecipientType.TO, new InternetAddress(to));
//                        InternetAddress address;
//                        address = new InternetAddress(to);
//                        message.setSubject("Awareness Camp");
//                        message.setText("Please visit awareness camp in " + citycb.getSelectedItem());
//                        //message.setFileName(from);
//                        Transport transport = session.getTransport("smtp");
//                        transport.connect(host, user, pass);
//                        transport.sendMessage(message, message.getAllRecipients());
//                        transport.close();
//                        JOptionPane.showMessageDialog(null, "Please check your email for further details!");
//                    } catch (Exception e) {
//                        System.out.println(e);
//                        JOptionPane.showMessageDialog(null, "Error!");
//                    }
                }
            } else {
                if (!util.isEmaildIdvalid(emailTextField.getText())) {
                    JOptionPane.showMessageDialog(null, "Please enter a valid email id.");
                }
                if (!util.isPasswordValid(passwordTextField.getText())) {
                    JOptionPane.showMessageDialog(null, "Please enter a valid password.");
                }
            }
        }
        emailTextField.setText("");
        passwordTextField.setText("");
    }//GEN-LAST:event_submitButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cityDropdown;
    private javax.swing.JLabel cityDropdownLabel;
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
