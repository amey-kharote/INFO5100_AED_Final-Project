/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.LabAssistant;

import Business.Role.InternalLabAssistantRole;

import Business.Role.LabAssistantRole;

import Business.UserAccount.UserAccount;

import Business.WorkQueue.LabTestWorkRequest;

import java.awt.CardLayout;

import java.awt.Component;

import java.io.File;

import java.util.Properties;

import javax.mail.Message;

import javax.mail.Session;

import javax.mail.Transport;

import javax.mail.internet.InternetAddress;

import javax.mail.internet.MimeMessage;

import javax.swing.JFileChooser;

import javax.swing.JOptionPane;

import javax.swing.JPanel;

/**
 *
 * @author Amey
 */
public class TestResultUploadPanel extends javax.swing.JPanel {

    /**
     * Creates new form TestResultUploadPanel
     */
    JPanel rightPanel;

    LabTestWorkRequest labTestWorkRequest;

    UserAccount userAccount;

    public TestResultUploadPanel(JPanel rightPanel, LabTestWorkRequest labTestWorkRequest, UserAccount userAccount) {

        initComponents();

        this.rightPanel = rightPanel;

        this.labTestWorkRequest = labTestWorkRequest;

        this.userAccount = userAccount;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        resultTextFieldLabel = new javax.swing.JLabel();
        resultFileDisplayTextField = new javax.swing.JTextField();
        uploadButton = new javax.swing.JButton();
        uploadResultButtonLabel = new javax.swing.JLabel();
        submitResultButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        fileUploadPathDisplayerLabel = new javax.swing.JLabel();

        setBackground(java.awt.SystemColor.activeCaption);

        resultTextFieldLabel.setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N
        resultTextFieldLabel.setText("Result:");

        resultFileDisplayTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultFileDisplayTextFieldActionPerformed(evt);
            }
        });

        uploadButton.setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N
        uploadButton.setText("Upload");
        uploadButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        uploadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadButtonActionPerformed(evt);
            }
        });

        uploadResultButtonLabel.setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N
        uploadResultButtonLabel.setText("Upload Result:");

        submitResultButton.setBackground(java.awt.SystemColor.controlLtHighlight);
        submitResultButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        submitResultButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/Images/icons8-submit-resume-24.png"))); // NOI18N
        submitResultButton.setText("Submit Result");
        submitResultButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        submitResultButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitResultButtonActionPerformed(evt);
            }
        });

        backButton.setBackground(java.awt.SystemColor.controlLtHighlight);
        backButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/Images/left-arrow-in-circular-button-black-symbol-2.png"))); // NOI18N
        backButton.setText("Back");
        backButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(216, 216, 216)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(resultFileDisplayTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(uploadButton, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(submitResultButton, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(resultTextFieldLabel)
                                .addComponent(uploadResultButtonLabel)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(fileUploadPathDisplayerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(118, 118, 118)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resultTextFieldLabel)
                    .addComponent(resultFileDisplayTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fileUploadPathDisplayerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(uploadButton)
                    .addComponent(uploadResultButtonLabel))
                .addGap(76, 76, 76)
                .addComponent(submitResultButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(311, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void uploadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadButtonActionPerformed
        JFileChooser jFileChooserObject = new JFileChooser();

        jFileChooserObject.showOpenDialog(null);

        File f = jFileChooserObject.getSelectedFile();

        String fileToUpload = f.getAbsolutePath();

        fileUploadPathDisplayerLabel.setText(fileToUpload);

        labTestWorkRequest.setTestUploaded(fileToUpload);
    }//GEN-LAST:event_uploadButtonActionPerformed

    private void submitResultButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitResultButtonActionPerformed
        if (resultFileDisplayTextField.getText().equals("")) {

            JOptionPane.showMessageDialog(null, "Please enter a comment!");

            return;

        } else {

            labTestWorkRequest.setTestResult(resultFileDisplayTextField.getText());

            //Sending Email to the Patient of his Report
            boolean variableForSession = false;

            final String toPerson = labTestWorkRequest.getPatientName().trim(); //This needs to be an email address

            String from = "organdonationaed@gmail.com";

            String host = "smtp.gmail.com";

            String username = "organdonationaed@gmail.com";

            String password = "Pass@1234";//we have to type the real password here for it to work
            //if it is gmail we have to enable less secure apps

            Properties propertiesOfEmailServer = System.getProperties();

            propertiesOfEmailServer.setProperty("mail.smtp.host", host);

            propertiesOfEmailServer.put("mail.smtp.starttls.required", "true");

            propertiesOfEmailServer.put("mail.smtp.starttls.enable", "true");

            propertiesOfEmailServer.put("mail.smtp.host", host);

            propertiesOfEmailServer.put("mail.smtp.port", "587");

            propertiesOfEmailServer.put("mail.smtp.auth", "true");

            java.security.Security.addProvider(new com.sun.net.ssl.internal.ssl.Provider());

            Session session;

            session = Session.getDefaultInstance(propertiesOfEmailServer, null);

            session.setDebug(variableForSession);

            try {
                MimeMessage messageToSendEmail = new MimeMessage(session);

                messageToSendEmail.setFrom(new InternetAddress(from));

                messageToSendEmail.setRecipient(Message.RecipientType.TO, new InternetAddress(toPerson));

                InternetAddress addressToPerson;

                addressToPerson = new InternetAddress(toPerson);

                messageToSendEmail.setSubject("Your Test Report is ready!");

                messageToSendEmail.setText("Hello! You can find the report in Attachment.");

                messageToSendEmail.setFileName(labTestWorkRequest.getTestUploaded());

                Transport transport = session.getTransport("smtp");

                transport.connect(host, username, password);

                transport.sendMessage(messageToSendEmail, messageToSendEmail.getAllRecipients());

                transport.close();

            } catch (Exception e) {

                System.out.println(e);

                JOptionPane.showMessageDialog(null, "Please attach test report!");

            }

            labTestWorkRequest.setStatus("Completed");

            JOptionPane.showMessageDialog(null, "Processed");
        }
    }//GEN-LAST:event_submitResultButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        rightPanel.remove(this);

        Component[] arrayOfComponents = rightPanel.getComponents();

        Component componentObject = arrayOfComponents[arrayOfComponents.length - 1];

        LabAssistantWorkAreaPanel labAssistantWorkAreaPanelObject = (LabAssistantWorkAreaPanel) componentObject;

        if (userAccount.getRole() instanceof InternalLabAssistantRole) {

            labAssistantWorkAreaPanelObject.methodToPopulateTableData();

        } else if (userAccount.getRole() instanceof LabAssistantRole) {

            labAssistantWorkAreaPanelObject.methodToPopulateTableEnterprise();

        }

        CardLayout layout = (CardLayout) rightPanel.getLayout();

        layout.previous(rightPanel);

    }//GEN-LAST:event_backButtonActionPerformed

    private void resultFileDisplayTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultFileDisplayTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_resultFileDisplayTextFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JLabel fileUploadPathDisplayerLabel;
    private javax.swing.JTextField resultFileDisplayTextField;
    private javax.swing.JLabel resultTextFieldLabel;
    private javax.swing.JButton submitResultButton;
    private javax.swing.JButton uploadButton;
    private javax.swing.JLabel uploadResultButtonLabel;
    // End of variables declaration//GEN-END:variables
}
