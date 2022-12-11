/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.consumer.worker;

import business.util.request.RequestItem;
import business.workQueue.CollectionWorkRequest;
import java.awt.CardLayout;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Arpit
 */
public class ConsumerWorkerViewRequestJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ConsumerWorkerViewRequestJPanel
     */
    private JPanel mainPanel;
    private CollectionWorkRequest request;

    ConsumerWorkerViewRequestJPanel(JPanel mainPanel, CollectionWorkRequest request) {
        initComponents();
        this.mainPanel = mainPanel;
        this.request = request;
        populateTable();
        populateData();
        populateImage();
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
        tblDetails = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
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
        lblImg = new javax.swing.JLabel();
        lblImage = new javax.swing.JLabel();

        setBackground(new java.awt.Color(6, 36, 50));
        setMinimumSize(new java.awt.Dimension(1400, 1000));

        tblDetails.setBackground(new java.awt.Color(87, 92, 123));
        tblDetails.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tblDetails.setForeground(new java.awt.Color(255, 255, 255));
        tblDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Type", "Quantity", "Hours to perish"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane.setViewportView(tblDetails);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Consumer Worker - View Request Details");

        btnBack.setBackground(new java.awt.Color(191, 149, 155));
        btnBack.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblCost.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lblCost.setForeground(new java.awt.Color(204, 204, 204));
        lblCost.setText("Pickup Cost:");

        lblQuantityVal.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lblQuantityVal.setForeground(new java.awt.Color(204, 204, 204));
        lblQuantityVal.setText("<quantity>");

        lblCostVal.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lblCostVal.setForeground(new java.awt.Color(204, 204, 204));
        lblCostVal.setText("<cost>");

        lblRequestStatusVal.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lblRequestStatusVal.setForeground(new java.awt.Color(204, 204, 204));
        lblRequestStatusVal.setText("<request_status>");

        lblRequestDateVal.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lblRequestDateVal.setForeground(new java.awt.Color(204, 204, 204));
        lblRequestDateVal.setText("<request_date>");

        lblRequestFromVal.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lblRequestFromVal.setForeground(new java.awt.Color(204, 204, 204));
        lblRequestFromVal.setText("<request_from>");

        lblRequestDate.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lblRequestDate.setForeground(new java.awt.Color(204, 204, 204));
        lblRequestDate.setText("Request Date:");

        lblQuantity.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lblQuantity.setForeground(new java.awt.Color(204, 204, 204));
        lblQuantity.setText("Food Quantity:");

        lblRequestStatus.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lblRequestStatus.setForeground(new java.awt.Color(204, 204, 204));
        lblRequestStatus.setText("Request status:");

        lblRequestFrom.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lblRequestFrom.setForeground(new java.awt.Color(204, 204, 204));
        lblRequestFrom.setText("Request from:");

        lblImg.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lblImg.setForeground(new java.awt.Color(204, 204, 204));
        lblImg.setText("Delivery Image:");

        lblImage.setBorder(new javax.swing.border.MatteBorder(null));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(439, 439, 439)
                .addComponent(jLabel1)
                .addContainerGap(471, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBack)
                    .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 756, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(333, 333, 333)
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
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCost)
                            .addComponent(lblImg))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblCostVal))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(jLabel1)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRequestFrom)
                    .addComponent(lblRequestFromVal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRequestDate)
                    .addComponent(lblRequestDateVal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRequestStatus)
                    .addComponent(lblRequestStatusVal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblQuantity)
                    .addComponent(lblQuantityVal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCost)
                    .addComponent(lblCostVal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblImg)
                    .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85)
                .addComponent(btnBack)
                .addContainerGap(234, Short.MAX_VALUE))
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JLabel lblCost;
    private javax.swing.JLabel lblCostVal;
    private javax.swing.JLabel lblImage;
    private javax.swing.JLabel lblImg;
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

    private void populateTable() {
        DefaultTableModel dtm = (DefaultTableModel) tblDetails.getModel();
        dtm.setRowCount(0);

        for (RequestItem ri : request.getRequestItems()) {

            Object row[] = new Object[3];
            row[0] = ri;
            row[1] = ri.getQuantity() == 0 ? "Sold Out" : ri.getQuantity();
            row[2] = ri.getDaysBeforeDisposal();

            dtm.addRow(row);
        }
    }

    private void populateData() {

        String status = request.getStatus();

        lblRequestStatusVal.setText(status);
        lblRequestFromVal.setText(request.getRaisedBySupplier());
        lblRequestDateVal.setText(request.getRequestDate() + "");
        lblQuantityVal.setText(request.getTotalQuantity() + " pounds");

        String cost = request.getDeliveryCost() == 0 ? "Undelivered" : "$" + request.getDeliveryCost();
        lblCostVal.setText(cost);
    }
    
    private void populateImage(){
        ImageIcon imgIcon = new ImageIcon(request.getImgPath());
        System.out.println(request.getImgPath());
        Image img =imgIcon.getImage().getScaledInstance(lblImage.getWidth(), lblImage.getHeight(), Image.SCALE_SMOOTH);
        
    }
}
