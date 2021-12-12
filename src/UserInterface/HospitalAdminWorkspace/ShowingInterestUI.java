/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.HospitalAdminWorkspace;

import Business.Entity.Applicant;
import Business.Entity.ApplicantDirectory;
import Business.Organization.Organization;
import Business.Utils.Utils;
import UserInterface.HospitalApplicant.DonorRegistrationForm;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Amey
 */
public class ShowingInterestUI extends javax.swing.JPanel {

    /**
     * Creates new form ManageShowingInterest
     */
    JPanel rightJPanel;
    Organization org;
    ApplicantDirectory appDir = new ApplicantDirectory();
    
    public ShowingInterestUI(JPanel rightJPanel, Organization org) {
        initComponents();
        this.rightJPanel = rightJPanel;
        this.org = org;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        showingInterestHeader = new javax.swing.JLabel();
        enterEmailTextFieldLabel = new javax.swing.JLabel();
        enterEmailTextField = new javax.swing.JTextField();
        yesRadioButton = new javax.swing.JRadioButton();
        noRadioButton = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        infoTextArea = new javax.swing.JTextArea();
        submitButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();

        setBackground(java.awt.SystemColor.activeCaption);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        showingInterestHeader.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        showingInterestHeader.setText("Showing Awareness Of OTM importance");
        add(showingInterestHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 40, -1, 42));

        enterEmailTextFieldLabel.setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N
        enterEmailTextFieldLabel.setText("Enter email ID");
        add(enterEmailTextFieldLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, -1, -1));

        enterEmailTextField.setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N
        add(enterEmailTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 270, -1));

        yesRadioButton.setBackground(java.awt.SystemColor.controlLtHighlight);
        yesRadioButton.setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N
        yesRadioButton.setText("YES");
        yesRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yesRadioButtonActionPerformed(evt);
            }
        });
        add(yesRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, -1, -1));

        noRadioButton.setBackground(java.awt.SystemColor.controlLtHighlight);
        noRadioButton.setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N
        noRadioButton.setText("NO");
        add(noRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 350, -1, -1));

        infoTextArea.setEditable(false);
        infoTextArea.setBackground(java.awt.SystemColor.inactiveCaption);
        infoTextArea.setColumns(20);
        infoTextArea.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        infoTextArea.setLineWrap(true);
        infoTextArea.setRows(5);
        infoTextArea.setText("1. People of all ages should consider themselves potential donors. \n\n2. When a person dies, they are evaluated for donor suitability based on their medical history and age. \n\n3. The organ procurement organization determines medical suitability for donation.\n\n4. A living donation, such as the donation of one healthy kidney or a segment of a healthy liver from a living human being to another, is arranged though the individual transplant centers according to criteria they have in place. \n\n5. An independent donor advocate, along with a dedicated living donor multi-disciplinary team, will represent the interests and well-being of the potential living donor.");
        infoTextArea.setWrapStyleWord(true);
        infoTextArea.setBorder(null);
        infoTextArea.setCaretColor(new java.awt.Color(255, 51, 51));
        infoTextArea.setFocusable(false);
        jScrollPane1.setViewportView(infoTextArea);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 110, 580, 450));

        submitButton.setBackground(java.awt.SystemColor.controlLtHighlight);
        submitButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        submitButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/Images/icons8-submit-resume-24.png"))); // NOI18N
        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });
        add(submitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 450, 200, 40));

        backButton.setBackground(java.awt.SystemColor.controlLtHighlight);
        backButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/Images/left-arrow-in-circular-button-black-symbol-2.png"))); // NOI18N
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 130, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void yesRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yesRadioButtonActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_yesRadioButtonActionPerformed

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        // TODO add your handling code here:
        
        if( yesRadioButton.isSelected()&& noRadioButton.isSelected()){
            JOptionPane.showMessageDialog(null, "Please select either yes or no.");
            return;
        }
        if(enterEmailTextField.getText().equals("")&& yesRadioButton.isSelected()== false && noRadioButton.isSelected() == false){
            JOptionPane.showMessageDialog(null, "Please enter email and choose a valid option.");
            return;
        }
        if(!enterEmailTextField.getText().equals("")){
            for(Applicant applicant : appDir.getApplicantRecords()){
                if(applicant.getApplicantEmailId().equals(enterEmailTextField.getText())){
                   JOptionPane.showMessageDialog(null, "Email already exists. Please register with a new email id!");
                    return; 
                }
        }
            
        Utils util = new Utils();
        if( util.isEmaildIdvalid(enterEmailTextField.getText())){
            if (yesRadioButton.isSelected()){
                appDir.createApplicant(true, enterEmailTextField.getText());
                DonorRegistrationForm donorReg= new DonorRegistrationForm(rightJPanel, org, enterEmailTextField.getText());
                rightJPanel.add("donorRegistration", donorReg);
                CardLayout layout = (CardLayout) rightJPanel.getLayout();
                layout.next(rightJPanel);
            }
            else if(noRadioButton.isSelected()) {
                appDir.createApplicant(false, enterEmailTextField.getText());
                JOptionPane.showMessageDialog(null, "Thanks for showing interest!");
                return;
            }
        }        
        else{
            JOptionPane.showMessageDialog(null, "Please enter a valid email!");
        }  
     }
    }//GEN-LAST:event_submitButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        rightJPanel.remove(this);
        CardLayout layout = (CardLayout) rightJPanel.getLayout();
        layout.previous(rightJPanel);

    }//GEN-LAST:event_backButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JTextField enterEmailTextField;
    private javax.swing.JLabel enterEmailTextFieldLabel;
    private javax.swing.JTextArea infoTextArea;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton noRadioButton;
    private javax.swing.JLabel showingInterestHeader;
    private javax.swing.JButton submitButton;
    private javax.swing.JRadioButton yesRadioButton;
    // End of variables declaration//GEN-END:variables
}
