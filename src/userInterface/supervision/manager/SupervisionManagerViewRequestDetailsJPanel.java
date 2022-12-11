/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.supervision.manager;

import business.EcoSystem;
import business.network.Network;
import business.util.request.RequestItem;
import business.workQueue.CollectionWorkRequest;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author swarag
 */
public class SupervisionManagerViewRequestDetailsJPanel extends javax.swing.JPanel {

    private JPanel mainPanel;
    private CollectionWorkRequest cwr;

    /**
     * Creates new form ConsumerRequestViewJPanel
     */
    public SupervisionManagerViewRequestDetailsJPanel(JPanel mainPanel, CollectionWorkRequest cwr) {
        initComponents();
        this.mainPanel = mainPanel;
        this.cwr = cwr;
        populateTable();
        populateData();
    }

    SupervisionManagerViewRequestDetailsJPanel(JPanel mainPanel, EcoSystem business, Network network) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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

        lblHeader.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblHeader.setText("Mayor Work Area - Request Details");

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

        lblCost.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblCost.setText("Pickup Cost:");

        lblQuantityVal.setText("<quantity>");

        lblCostVal.setText("<cost>");

        lblRequestStatusVal.setText("<request_status>");

        lblRequestDateVal.setText("<request_date>");

        lblRequestFromVal.setText("<request_from>");

        lblRequestDate.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblRequestDate.setText("Request Date:");

        lblQuantity.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblQuantity.setText("Food Quantity:");

        lblRequestStatus.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblRequestStatus.setText("Request status:");

        lblRequestFrom.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblRequestFrom.setText("Request from:");

        lblPickedUpBy.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblPickedUpBy.setText("Pickup done by:");

        lblPickedUpByVal.setText("<emp_name>");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                            .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblCost)
                                    .addComponent(lblPickedUpBy))
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblPickedUpByVal)
                                    .addComponent(lblCostVal)))
                            .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(lblHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(145, 145, 145))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
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
                .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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
