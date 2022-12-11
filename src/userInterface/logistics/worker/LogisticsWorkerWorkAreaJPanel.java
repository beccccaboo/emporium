/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.logistics.worker;

import business.enterprise.Enterprise;
import business.network.Network;
import business.userAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author mites
 */
public class LogisticsWorkerWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form LogisticsWorkerJPanel
     */
    private JPanel mainPanel;
    private UserAccount account;
    private Enterprise enterprise;
    private Network network;

    public LogisticsWorkerWorkAreaJPanel(JPanel mainPanel, UserAccount account, Enterprise enterprise, Network network) {
        initComponents();
        this.mainPanel = mainPanel;
        this.account = account;
        this.enterprise = enterprise;
        this.network = network;
        lblName.setText(account.getEmployee().getName());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblHeader = new javax.swing.JLabel();
        lblSalutation = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        btnPickup = new javax.swing.JButton();
        btnDelivery = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 204));

        lblHeader.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblHeader.setText("Logistics Worker - Work Area");

        lblSalutation.setText("Welcome:");

        btnPickup.setText("Pickup Requests");
        btnPickup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPickupActionPerformed(evt);
            }
        });

        btnDelivery.setText("Delivery Requests");
        btnDelivery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeliveryActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(271, 271, 271)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnDelivery, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPickup, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(194, 194, 194)
                        .addComponent(lblSalutation)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblHeader, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(169, 169, 169))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(lblHeader)
                .addGap(77, 77, 77)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSalutation)
                    .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(btnPickup)
                .addGap(18, 18, 18)
                .addComponent(btnDelivery)
                .addGap(168, 168, 168))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeliveryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeliveryActionPerformed
        LogisticsWorkerDeliveryJPanel logsiticsWorkerDeliveryJPanel = new LogisticsWorkerDeliveryJPanel(mainPanel, account, enterprise, network);
        mainPanel.add("LogsiticsWorkerDeliveryJPanel", logsiticsWorkerDeliveryJPanel);
        CardLayout layout = (CardLayout) mainPanel.getLayout();
        layout.next(mainPanel);
    }//GEN-LAST:event_btnDeliveryActionPerformed

    private void btnPickupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPickupActionPerformed

        LogisticsWorkerPickUpJPanel logisticsWorkerPickUpJPanel = new LogisticsWorkerPickUpJPanel(mainPanel, account);
        mainPanel.add("LogisticsWorkerPickUpJPanel", logisticsWorkerPickUpJPanel);
        CardLayout layout = (CardLayout) mainPanel.getLayout();
        layout.next(mainPanel);

    }//GEN-LAST:event_btnPickupActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelivery;
    private javax.swing.JButton btnPickup;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblSalutation;
    // End of variables declaration//GEN-END:variables
}
