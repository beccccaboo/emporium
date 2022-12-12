/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.consumer.manager;

import business.enterprise.Enterprise;
import business.network.Network;
import business.organization.Organization;
import business.userAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Arpit
 */
public class ConsumerManagerWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form RegionManagerWorkArea
     */
    private JPanel mainPanel;
    private UserAccount account;
    private Organization organization;
    private Enterprise enterprise;
    private Network network;

    public ConsumerManagerWorkAreaJPanel(JPanel mainPanel, UserAccount account, Organization organization, Enterprise enterprise, Network network) {
        initComponents();
        this.mainPanel = mainPanel;
        this.account = account;
        this.organization = organization;
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        btnSupplierRequest = new javax.swing.JButton();
        btnInventory = new javax.swing.JButton();
        btnInvoices = new javax.swing.JButton();
        btnWastageInventory = new javax.swing.JButton();

        setBackground(new java.awt.Color(6, 36, 50));
        setMinimumSize(new java.awt.Dimension(1400, 1000));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Consumer Manager Work Area");

        jLabel2.setBackground(new java.awt.Color(204, 204, 204));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Manager Name: ");

        lblName.setBackground(new java.awt.Color(204, 204, 204));
        lblName.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblName.setForeground(new java.awt.Color(204, 204, 204));
        lblName.setText("<<View Name>>");

        btnSupplierRequest.setBackground(new java.awt.Color(191, 149, 155));
        btnSupplierRequest.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSupplierRequest.setForeground(new java.awt.Color(255, 255, 255));
        btnSupplierRequest.setLabel("Supplier Requests");
        btnSupplierRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSupplierRequestActionPerformed(evt);
            }
        });

        btnInventory.setBackground(new java.awt.Color(191, 149, 155));
        btnInventory.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnInventory.setForeground(new java.awt.Color(255, 255, 255));
        btnInventory.setText("View Inventory");
        btnInventory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInventoryActionPerformed(evt);
            }
        });

        btnInvoices.setBackground(new java.awt.Color(191, 149, 155));
        btnInvoices.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnInvoices.setForeground(new java.awt.Color(255, 255, 255));
        btnInvoices.setText("Pay Invoices");
        btnInvoices.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInvoicesActionPerformed(evt);
            }
        });

        btnWastageInventory.setBackground(new java.awt.Color(191, 149, 155));
        btnWastageInventory.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnWastageInventory.setForeground(new java.awt.Color(255, 255, 255));
        btnWastageInventory.setText("View Disposal Inventory");
        btnWastageInventory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWastageInventoryActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(454, 454, 454)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel2)
                        .addGap(82, 82, 82)
                        .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnWastageInventory, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                            .addComponent(btnSupplierRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnInventory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnInvoices, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(487, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnInventory, btnInvoices, btnSupplierRequest, btnWastageInventory});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblName))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(btnInventory)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnInvoices)
                            .addComponent(btnWastageInventory)))
                    .addComponent(btnSupplierRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(554, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnInventory, btnInvoices, btnSupplierRequest, btnWastageInventory});

    }// </editor-fold>//GEN-END:initComponents

    private void btnSupplierRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSupplierRequestActionPerformed
        // TODO add your handling code here:
        ConsumerSupplierRequestJPanel supplierRequestJPanel = new ConsumerSupplierRequestJPanel(mainPanel, account, organization, enterprise, network);
        mainPanel.add("SupplierRequestJPanel", supplierRequestJPanel);
        CardLayout layout = (CardLayout) mainPanel.getLayout();
        layout.next(mainPanel);
    }//GEN-LAST:event_btnSupplierRequestActionPerformed

    private void btnInventoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInventoryActionPerformed
        // TODO add your handling code here:
        ConsumerWorkerViewInventoryJPanel viewConsumerInventoryJPanel = new ConsumerWorkerViewInventoryJPanel(mainPanel, enterprise, account, network);
        mainPanel.add("ViewConsumerInventoryJPanel", viewConsumerInventoryJPanel);
        CardLayout layout = (CardLayout) mainPanel.getLayout();
        layout.next(mainPanel);
    }//GEN-LAST:event_btnInventoryActionPerformed

    private void btnWastageInventoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWastageInventoryActionPerformed
        ConsumerWorkerViewWastageInventoryJPanel consumerWorkerViewwastageInventoryJPanel = new ConsumerWorkerViewWastageInventoryJPanel(mainPanel, enterprise);
        mainPanel.add("ConsumerWorkerViewWastageInventoryJPanel", consumerWorkerViewwastageInventoryJPanel);
        CardLayout layout = (CardLayout) mainPanel.getLayout();
        layout.next(mainPanel);
    }//GEN-LAST:event_btnWastageInventoryActionPerformed

    private void btnInvoicesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInvoicesActionPerformed
        // TODO add your handling code here:
        ConsumerManagerPayInvoiceJPanel consumerManagerPayInvoiceJPanel = new ConsumerManagerPayInvoiceJPanel(mainPanel, account, organization);
        mainPanel.add("ConsumerManagerPayInvoiceJPanel", consumerManagerPayInvoiceJPanel);
        CardLayout layout = (CardLayout) mainPanel.getLayout();
        layout.next(mainPanel);
    }//GEN-LAST:event_btnInvoicesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInventory;
    private javax.swing.JButton btnInvoices;
    private javax.swing.JButton btnSupplierRequest;
    private javax.swing.JButton btnWastageInventory;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblName;
    // End of variables declaration//GEN-END:variables
}
