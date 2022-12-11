/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.logistics.manager;

import business.enterprise.Enterprise;
import business.network.Network;
import business.organization.Organization;
import business.userAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author rebeccabiju
 */
public class LogisticsManagerWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form LogisticsManagerWorkAreaJPanel
     */
    private JPanel mainPanel;
    private UserAccount account;
    private Organization organization;
    private Enterprise enterprise;
    private Network network;

    public LogisticsManagerWorkAreaJPanel(JPanel mainPanel, UserAccount account, Organization organization, Enterprise enterprise, Network network) {
        initComponents();
        this.mainPanel = mainPanel;
        this.account = account;
        this.organization = organization;
        this.enterprise = enterprise;
        this.network = network;
        lblNameVal.setText(account.getEmployee().getName());
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
        lblName = new javax.swing.JLabel();
        lblNameVal = new javax.swing.JLabel();
        btnRestaurantRequest = new javax.swing.JButton();
        btnInvoices = new javax.swing.JButton();
        btnWorkLog = new javax.swing.JButton();
        btnPayementInfo = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 204));

        lblHeader.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblHeader.setText("Logistics Manager Work Area");

        lblName.setText("Welcome: ");

        lblNameVal.setText("<<View Name>>");

        btnRestaurantRequest.setText("View Work Requests");
        btnRestaurantRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestaurantRequestActionPerformed(evt);
            }
        });

        btnInvoices.setText("Generate Invoices");
        btnInvoices.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInvoicesActionPerformed(evt);
            }
        });

        btnWorkLog.setText("View Work Log");
        btnWorkLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWorkLogActionPerformed(evt);
            }
        });

        btnPayementInfo.setText("View Payment Info");
        btnPayementInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPayementInfoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblName)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblNameVal))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(88, 88, 88)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnInvoices, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnRestaurantRequest, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnWorkLog, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnPayementInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(lblHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(147, 147, 147))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(lblHeader)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(lblNameVal))
                .addGap(40, 40, 40)
                .addComponent(btnRestaurantRequest)
                .addGap(25, 25, 25)
                .addComponent(btnWorkLog)
                .addGap(25, 25, 25)
                .addComponent(btnInvoices)
                .addGap(26, 26, 26)
                .addComponent(btnPayementInfo)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnRestaurantRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestaurantRequestActionPerformed
        // TODO add your handling code here:
        LogisticsManagerViewRequestsJPanel logisticsManagerViewRequestsJPanel = new LogisticsManagerViewRequestsJPanel(mainPanel, account, organization, enterprise);
        mainPanel.add("LogisticsManagerViewRequestsJPanel", logisticsManagerViewRequestsJPanel);
        CardLayout layout = (CardLayout) mainPanel.getLayout();
        layout.next(mainPanel);
    }//GEN-LAST:event_btnRestaurantRequestActionPerformed

    private void btnInvoicesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInvoicesActionPerformed
        LogisticsManagerGenerateInvoicesJPanel logisticsManagerGenerateInvoicesJPanel = new LogisticsManagerGenerateInvoicesJPanel(mainPanel, account, network);
        mainPanel.add("LogisticsManagerGenerateInvoicesJPanel", logisticsManagerGenerateInvoicesJPanel);
        CardLayout layout = (CardLayout) mainPanel.getLayout();
        layout.next(mainPanel);
    }//GEN-LAST:event_btnInvoicesActionPerformed

    private void btnWorkLogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWorkLogActionPerformed
        // TODO add your handling code here:
        LogisticsManagerViewWorkLogJPanel logisticsManagerViewWorkLogJPanel = new LogisticsManagerViewWorkLogJPanel(mainPanel, enterprise);
        mainPanel.add("LogisticsManagerViewWorkLogJPanel", logisticsManagerViewWorkLogJPanel);
        CardLayout layout = (CardLayout) mainPanel.getLayout();
        layout.next(mainPanel);
    }//GEN-LAST:event_btnWorkLogActionPerformed

    private void btnPayementInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPayementInfoActionPerformed
        // TODO add your handling code here:
        LogisticsManagerViewChartJPanel logisticsManagerViewChartJPanel = new LogisticsManagerViewChartJPanel(mainPanel, account);
        mainPanel.add("LogisticsManagerViewChartJPanel", logisticsManagerViewChartJPanel);
        CardLayout layout = (CardLayout) mainPanel.getLayout();
        layout.next(mainPanel);
    }//GEN-LAST:event_btnPayementInfoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInvoices;
    private javax.swing.JButton btnPayementInfo;
    private javax.swing.JButton btnRestaurantRequest;
    private javax.swing.JButton btnWorkLog;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblNameVal;
    // End of variables declaration//GEN-END:variables
}
