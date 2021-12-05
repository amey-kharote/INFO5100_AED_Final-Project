/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.LabAssistant;

/**
 *
 * @author Amey
 */
public class TestResultUploadPanel extends javax.swing.JPanel {

    /**
     * Creates new form TestResultUploadPanel
     */
    public TestResultUploadPanel() {
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

        resultTextFieldLabel = new javax.swing.JLabel();
        resultFileDisplayTextField = new javax.swing.JTextField();
        uploadButton = new javax.swing.JButton();
        uploadResultButtonLabel = new javax.swing.JLabel();
        submitResultButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();

        resultTextFieldLabel.setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N
        resultTextFieldLabel.setText("Result");

        uploadButton.setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N
        uploadButton.setText("Upload");
        uploadButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        uploadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadButtonActionPerformed(evt);
            }
        });

        uploadResultButtonLabel.setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N
        uploadResultButtonLabel.setText("Upload result");

        submitResultButton.setBackground(new java.awt.Color(255, 153, 153));
        submitResultButton.setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N
        submitResultButton.setText("Submit Result");
        submitResultButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        submitResultButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitResultButtonActionPerformed(evt);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(310, 310, 310)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(uploadResultButtonLabel)
                            .addComponent(resultTextFieldLabel))
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(resultFileDisplayTextField)
                            .addComponent(uploadButton, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)))
                    .addComponent(submitResultButton, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(310, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(resultTextFieldLabel)
                    .addComponent(resultFileDisplayTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(uploadButton)
                    .addComponent(uploadResultButtonLabel))
                .addGap(57, 57, 57)
                .addComponent(submitResultButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(210, 210, 210)
                .addComponent(backButton)
                .addContainerGap(150, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void uploadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadButtonActionPerformed

    }//GEN-LAST:event_uploadButtonActionPerformed

    private void submitResultButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitResultButtonActionPerformed
       
    }//GEN-LAST:event_submitResultButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_backButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JTextField resultFileDisplayTextField;
    private javax.swing.JLabel resultTextFieldLabel;
    private javax.swing.JButton submitResultButton;
    private javax.swing.JButton uploadButton;
    private javax.swing.JLabel uploadResultButtonLabel;
    // End of variables declaration//GEN-END:variables
}