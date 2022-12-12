/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.logistics.manager;

import business.util.request.RequestItem;
import business.workQueue.CollectionWorkRequest;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rebeccabiju
 */
public class LogisticsManagerViewRequestDetailsJPanel extends javax.swing.JPanel {

    private JPanel mainPanel;
    private CollectionWorkRequest cwr;

    /**
     * Creates new form ConsumerRequestViewJPanel
     */
    LogisticsManagerViewRequestDetailsJPanel(JPanel mainPanel, CollectionWorkRequest cwr) {
        initComponents();
        this.mainPanel = mainPanel;
        this.cwr = cwr;
        populateTable();
        populateData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    private void populateTable() {
        DefaultTableModel dtm = (DefaultTableModel) tblDetails.getModel();
        dtm.setRowCount(0);

        for (RequestItem ri : cwr.getRequestItems()) {
            Object row[] = new Object[2];
            row[0] = ri;
            row[1] = ri.getQuantity();

            dtm.addRow(row);
        }
    }
    
    private void populateData() {

        String status = cwr.getStatus();

        lblRequestStatusVal.setText(status);
        lblRequestFromVal.setText(cwr.getRaisedBySupplier());
        lblRequestDateVal.setText(cwr.getRequestDate() + "");
        lblQuantityVal.setText(cwr.getTotalQuantity() + " pounds");

        String emp = cwr.getDeliveredBy() == null ? "Undelivered" : cwr.getDeliveredBy().getEmployee().getName();
        lblPickedUpByVal.setText(emp);
        
        String cost = cwr.getDeliveryCost() == 0 ? "Undelivered" : "$"+cwr.getDeliveryCost();
        lblCostVal.setText(cost);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblHeader = new javax.swing.JLabel();
        jScrollPane = new javax.swing.JScrollPane();
        tblDetails = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        lblCost = new javax.swing.JLabel();
        lblQuantityVal = new javax.swing.JLabel();
        lblCostVal = new javax.swing.JLabel();
        lblRequestStatusVal = new javax.swing.JLabel();
        lblRequestDateVal = new javax.swing.JLabel();
        lblRequestFromVal = new javax.swing.JLabel();
        lblRequestDate = new javax.swing.JLabel();
        lblQuantity = new javax.swing.JLabel();
        lblRequestStatus = new javax.swing.JLabel();
        lblRequestFrom = new javax.swing.JLabel();
        lblPickedUpBy = new javax.swing.JLabel();
        lblPickedUpByVal = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 255));
        setMinimumSize(new java.awt.Dimension(1400, 1000));

        lblHeader.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblHeader.setText("Logistics Manager Work Area - Request Details");

        tblDetails.setBackground(new java.awt.Color(255, 204, 255));
        tblDetails.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tblDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Type", "Quantity"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane.setViewportView(tblDetails);
        if (tblDetails.getColumnModel().getColumnCount() > 0) {
            tblDetails.getColumnModel().getColumn(0).setResizable(false);
            tblDetails.getColumnModel().getColumn(1).setResizable(false);
        }

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblCost.setBackground(new java.awt.Color(0, 0, 0));
        lblCost.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblCost.setText("Pickup Cost:");

        lblQuantityVal.setBackground(new java.awt.Color(0, 0, 0));
        lblQuantityVal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblQuantityVal.setText("<quantity>");

        lblCostVal.setBackground(new java.awt.Color(0, 0, 0));
        lblCostVal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblCostVal.setText("<cost>");

        lblRequestStatusVal.setBackground(new java.awt.Color(0, 0, 0));
        lblRequestStatusVal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblRequestStatusVal.setText("<request_status>");

        lblRequestDateVal.setBackground(new java.awt.Color(0, 0, 0));
        lblRequestDateVal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblRequestDateVal.setText("<request_date>");

        lblRequestFromVal.setBackground(new java.awt.Color(0, 0, 0));
        lblRequestFromVal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblRequestFromVal.setText("<request_from>");

        lblRequestDate.setBackground(new java.awt.Color(0, 0, 0));
        lblRequestDate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblRequestDate.setText("Request Date:");

        lblQuantity.setBackground(new java.awt.Color(0, 0, 0));
        lblQuantity.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblQuantity.setText("Item Quantity:");

        lblRequestStatus.setBackground(new java.awt.Color(0, 0, 0));
        lblRequestStatus.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblRequestStatus.setText("Request status:");

        lblRequestFrom.setBackground(new java.awt.Color(0, 0, 0));
        lblRequestFrom.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblRequestFrom.setText("Request from:");

        lblPickedUpBy.setBackground(new java.awt.Color(0, 0, 0));
        lblPickedUpBy.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblPickedUpBy.setText("Pickup done by:");

        lblPickedUpByVal.setBackground(new java.awt.Color(0, 0, 0));
        lblPickedUpByVal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblPickedUpByVal.setText("<emp_name>");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(430, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblRequestFrom)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(lblRequestStatus)
                                    .addGap(26, 26, 26))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblRequestDate)
                                    .addGap(35, 35, 35)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblQuantity)
                                .addGap(33, 33, 33)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblQuantityVal)
                            .addComponent(lblRequestDateVal)
                            .addComponent(lblRequestStatusVal)
                            .addComponent(lblRequestFromVal)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCost)
                            .addComponent(lblPickedUpBy))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPickedUpByVal)
                            .addComponent(lblCostVal)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(btnBack))
                    .addComponent(jScrollPane)
                    .addComponent(lblHeader, javax.swing.GroupLayout.DEFAULT_SIZE, 604, Short.MAX_VALUE))
                .addGap(366, 366, 366))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(lblHeader)
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRequestFrom)
                    .addComponent(lblRequestFromVal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRequestDate)
                    .addComponent(lblRequestDateVal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRequestStatus)
                    .addComponent(lblRequestStatusVal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblQuantity)
                    .addComponent(lblQuantityVal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPickedUpBy)
                    .addComponent(lblPickedUpByVal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCost)
                    .addComponent(lblCostVal))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnBack)
                .addContainerGap(407, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        mainPanel.remove(this);
        CardLayout layout = (CardLayout) mainPanel.getLayout();
        layout.previous(mainPanel);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JLabel lblCost;
    private javax.swing.JLabel lblCostVal;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JLabel lblPickedUpBy;
    private javax.swing.JLabel lblPickedUpByVal;
    private javax.swing.JLabel lblQuantity;
    private javax.swing.JLabel lblQuantityVal;
    private javax.swing.JLabel lblRequestDate;
    private javax.swing.JLabel lblRequestDateVal;
    private javax.swing.JLabel lblRequestFrom;
    private javax.swing.JLabel lblRequestFromVal;
    private javax.swing.JLabel lblRequestStatus;
    private javax.swing.JLabel lblRequestStatusVal;
    private javax.swing.JTable tblDetails;
    // End of variables declaration//GEN-END:variables
}
