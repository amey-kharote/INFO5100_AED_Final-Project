/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.LabAssistant;
import Business.Role.InternalLabAssistantRole;
import Business.Role.RadiologistRole;
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
import javax.swing.JPanel;
import java.util.Properties;
import javax.swing.JOptionPane;
import javax.mail.Session;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.InternetAddress;
import javax.mail.Message;
import javax.mail.Transport;


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
        patient.setText(labTestWorkRequest.getPatientName());
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
        resultTextFieldLabel1 = new javax.swing.JLabel();
        patient = new javax.swing.JLabel();

        setBackground(java.awt.SystemColor.activeCaption);

        resultTextFieldLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        resultTextFieldLabel.setText("Patient:");

        resultFileDisplayTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        resultFileDisplayTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultFileDisplayTextFieldActionPerformed(evt);
            }
        });

        uploadButton.setBackground(java.awt.SystemColor.controlLtHighlight);
        uploadButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        uploadButton.setText("Upload");
        uploadButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        uploadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadButtonActionPerformed(evt);
            }
        });

        uploadResultButtonLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        uploadResultButtonLabel.setText("Upload Result:");

        submitResultButton.setBackground(java.awt.SystemColor.controlLtHighlight);
        submitResultButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
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

        resultTextFieldLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        resultTextFieldLabel1.setText("Result:");

        patient.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        patient.setText("<Patient>");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(303, 303, 303)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fileUploadPathDisplayerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(uploadResultButtonLabel)
                                    .addComponent(resultTextFieldLabel1)
                                    .addComponent(resultTextFieldLabel))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(resultFileDisplayTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(uploadButton, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(patient)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(346, 346, 346)
                        .addComponent(submitResultButton, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(190, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(patient)
                    .addComponent(resultTextFieldLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(resultTextFieldLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(resultFileDisplayTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(uploadResultButtonLabel)
                    .addComponent(uploadButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fileUploadPathDisplayerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(submitResultButton, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(162, Short.MAX_VALUE))
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
            boolean variableForSession = false;
            final String toPerson = labTestWorkRequest.getPatientId().trim(); 
            String from = "organdonationaed@gmail.com";
            String host = "smtp.gmail.com";
            String username = "organdonationaed@gmail.com";
            String password = "Pass@1234";
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
                messageToSendEmail.setRecipient(Message.RecipientType.CC, new InternetAddress(labTestWorkRequest.getSender().getUsername()));
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
            }
            labTestWorkRequest.setStatus("Completed");
            JOptionPane.showMessageDialog(null, "Reports Uploaded. Request processing completed.");
            resultFileDisplayTextField.setText("");
            submitResultButton.setEnabled(false);
            uploadButton.setEnabled(false);
        }
    }//GEN-LAST:event_submitResultButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        rightPanel.remove(this);
        Component[] arrayOfComponents = rightPanel.getComponents();
        Component componentObject = arrayOfComponents[arrayOfComponents.length - 1];
        LabAssistantWorkAreaPanel labAssistantWorkAreaPanelObject = (LabAssistantWorkAreaPanel) componentObject;
        labAssistantWorkAreaPanelObject.methodToPopulateTableData();
//        if (userAccount.getRole() instanceof InternalLabAssistantRole) {
//            labAssistantWorkAreaPanelObject.methodToPopulateTableData();
//        } else if (userAccount.getRole() instanceof RadiologistRole) {
//            labAssistantWorkAreaPanelObject.methodToPopulateTableEnterprise();
//        }
        CardLayout layout = (CardLayout) rightPanel.getLayout();
        layout.previous(rightPanel);

    }//GEN-LAST:event_backButtonActionPerformed

    private void resultFileDisplayTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultFileDisplayTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_resultFileDisplayTextFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JLabel fileUploadPathDisplayerLabel;
    private javax.swing.JLabel patient;
    private javax.swing.JTextField resultFileDisplayTextField;
    private javax.swing.JLabel resultTextFieldLabel;
    private javax.swing.JLabel resultTextFieldLabel1;
    private javax.swing.JButton submitResultButton;
    private javax.swing.JButton uploadButton;
    private javax.swing.JLabel uploadResultButtonLabel;
    // End of variables declaration//GEN-END:variables
}
