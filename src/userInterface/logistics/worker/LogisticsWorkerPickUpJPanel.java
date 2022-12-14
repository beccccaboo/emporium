/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.logistics.worker;

import business.userAccount.UserAccount;
import business.util.request.RequestStatus;
import business.workQueue.CollectionWorkRequest;
import business.workQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rebeccabiju
 */
public class LogisticsWorkerPickUpJPanel extends javax.swing.JPanel {

    /**
     * Creates new form LogisticsWorkerPickUpJPanel
     */
    private JPanel mainPanel;
    private UserAccount account;

    public LogisticsWorkerPickUpJPanel(JPanel mainPanel, UserAccount account) {
        initComponents();
        this.mainPanel = mainPanel;
        this.account = account;
        populateTable();
    }

    private void populateTable() {

        DefaultTableModel dtm = (DefaultTableModel) tblLogisticsWorker.getModel();
        dtm.setRowCount(0);
        for (WorkRequest workRequest : account.getWorkQueue().getWorkRequestList()) {
            if (workRequest instanceof CollectionWorkRequest) {
                CollectionWorkRequest cwr = (CollectionWorkRequest) workRequest;

                Object row[] = new Object[6];

                row[0] = cwr.getRequestDate();
                row[1] = cwr.getRaisedBySupplier();
                row[2] = cwr.getRaisedBy().getUsername();
                row[3] = cwr.getTotalQuantity() + " pounds";
                row[4] = cwr.getDeliverToConsumer();
                row[5] = cwr;

                dtm.addRow(row);
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane = new javax.swing.JScrollPane();
        tblLogisticsWorker = new javax.swing.JTable();
        btnPickup = new javax.swing.JButton();
        lblHeader = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 255));
        setMinimumSize(new java.awt.Dimension(1400, 1000));

        tblLogisticsWorker.setBackground(new java.awt.Color(204, 153, 255));
        tblLogisticsWorker.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Pickup Location", "Pick up person", "Package Weight", "Drop Location", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane.setViewportView(tblLogisticsWorker);
        if (tblLogisticsWorker.getColumnModel().getColumnCount() > 0) {
            tblLogisticsWorker.getColumnModel().getColumn(0).setResizable(false);
            tblLogisticsWorker.getColumnModel().getColumn(1).setResizable(false);
            tblLogisticsWorker.getColumnModel().getColumn(2).setResizable(false);
            tblLogisticsWorker.getColumnModel().getColumn(3).setResizable(false);
            tblLogisticsWorker.getColumnModel().getColumn(4).setResizable(false);
            tblLogisticsWorker.getColumnModel().getColumn(5).setResizable(false);
        }

        btnPickup.setBackground(new java.awt.Color(0, 0, 51));
        btnPickup.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnPickup.setForeground(new java.awt.Color(204, 204, 204));
        btnPickup.setText("Pickup");
        btnPickup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPickupActionPerformed(evt);
            }
        });

        lblHeader.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblHeader.setText("Logistics Worker - Pick up list");

        btnBack.setBackground(new java.awt.Color(0, 0, 51));
        btnBack.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(204, 204, 204));
        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(916, 916, 916)
                .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(373, 373, 373))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(227, 227, 227)
                        .addComponent(lblHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnBack)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnPickup))
                        .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 825, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(225, 225, 225))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(lblHeader)
                .addGap(35, 35, 35)
                .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPickup)
                    .addComponent(btnBack))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnPickupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPickupActionPerformed

        int selectedRow = tblLogisticsWorker.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null,
                    "Please select a request item to pickup",
                    "Warning",
                    JOptionPane.WARNING_MESSAGE);
            return;
        } else {
            CollectionWorkRequest request = (CollectionWorkRequest) tblLogisticsWorker.getValueAt(selectedRow, 5);
            if (request.getStatus().equals(RequestStatus.getPickupStatusMessage(3))) {

                LogisticsWorkerPickUpDetailsJPanel logisticsWorkerPickUpDetailsJPanel = new LogisticsWorkerPickUpDetailsJPanel(mainPanel, account, request);
                mainPanel.add("LogisticsWorkerPickUpDetailsJPanel", logisticsWorkerPickUpDetailsJPanel);
                CardLayout layout = (CardLayout) mainPanel.getLayout();
                layout.next(mainPanel);

            } else {
                JOptionPane.showMessageDialog(null,
                        "Pick-up already completed",
                        "Warning",
                        JOptionPane.WARNING_MESSAGE);
                return;
            }
        }
    }//GEN-LAST:event_btnPickupActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        mainPanel.remove(this);
        CardLayout layout = (CardLayout) mainPanel.getLayout();
        layout.previous(mainPanel);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnPickup;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JLabel lblName;
    private javax.swing.JTable tblLogisticsWorker;
    // End of variables declaration//GEN-END:variables
}
