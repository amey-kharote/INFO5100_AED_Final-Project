/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.FundsRetrieval;

/**
 *
 * @author Amey
 */
public class CorporateFundingPanel extends javax.swing.JPanel {

    /**
     * Creates new form CorporateFundingPanel
     */
    public CorporateFundingPanel() {
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

        corpEventFundTableLabel = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        corpEventDetailTable = new javax.swing.JTable();
        assignToMeButton = new javax.swing.JButton();
        processButton = new javax.swing.JButton();

        corpEventFundTableLabel.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        corpEventFundTableLabel.setText("Corporate Event Fund Raising Details");

        corpEventDetailTable.setBackground(new java.awt.Color(0, 153, 255));
        corpEventDetailTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Message", "Sender", "Receiver", "Status"
            }
        ));
        jScrollPane3.setViewportView(corpEventDetailTable);

        assignToMeButton.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        assignToMeButton.setText("Assign To Me");

        processButton.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        processButton.setText("Process");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 914, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(corpEventFundTableLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 533, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(111, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(assignToMeButton)
                .addGap(223, 223, 223)
                .addComponent(processButton)
                .addGap(317, 317, 317))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(corpEventFundTableLabel)
                .addGap(33, 33, 33)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(93, 93, 93)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(assignToMeButton)
                    .addComponent(processButton))
                .addContainerGap(348, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignToMeButton;
    private javax.swing.JTable corpEventDetailTable;
    private javax.swing.JLabel corpEventFundTableLabel;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton processButton;
    // End of variables declaration//GEN-END:variables
}
