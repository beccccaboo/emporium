/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.logistics.worker;

import business.enterprise.Enterprise;
import business.network.Network;
import business.organization.Organization;
import business.organization.consumer.ConsumerWorkerOrganization;
import business.userAccount.UserAccount;
import business.util.request.RequestItem;
import business.util.request.RequestStatus;
import business.util.validation.Validation;
import business.workQueue.CollectionWorkRequest;
import java.awt.CardLayout;
import java.awt.Image;
import java.io.File;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import userInterface.snapshot.Snapshot;

/**
 *
 * @author rebeccabiju
 */
public class LogisticsWorkerDeliveryDetailsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form LogisticsWorkerDeliverJPanel
     */
    private JPanel mainPanel;
    private UserAccount account;
    private Enterprise enterprise;
    private Date date;
    private CollectionWorkRequest request;
    private Network network;
    Snapshot snapshot;
    String selectedImagePath = File.separator+"Users"+File.separator+"rebeccabiju"+File.separator+"Downloads"+File.separator+"noImg.jpeg";
    
    public LogisticsWorkerDeliveryDetailsJPanel(JPanel mainPanel, UserAccount account, Enterprise enterprise, CollectionWorkRequest request, Network network) {
        initComponents();
        snapshot=new Snapshot(mainPanel);
        this.mainPanel = mainPanel;
        this.account = account;
        this.request = request;
        this.enterprise = enterprise;
        this.network = network;
        date = new Date();
        populateDetails();
    }

    public void populateDetails() {
        lblRequestedByValue.setText(request.getRaisedBy().getEmployee().getName() + " - " + request.getRaisedBySupplier());
        lblDeliveredValue.setText(request.getDeliverTo().getEmployee().getName());
        populateTable();
        lblWeightValue.setText(request.getTotalQuantity() + " pounds");
        lblDateValue.setText(date + "");
    }

    private void populateTable() {
        DefaultTableModel dtm = (DefaultTableModel) tblDetails.getModel();
        dtm.setRowCount(0);

        for (RequestItem ri : request.getRequestItems()) {
            Object row[] = new Object[3];
            row[0] = ri;
            row[1] = ri.getQuantity();
            row[2] = ri.getDaysBeforeDisposal();

            dtm.addRow(row);
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

        lblHeader = new javax.swing.JLabel();
        lblCost = new javax.swing.JLabel();
        txtCost = new javax.swing.JTextField();
        btnConfirm = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        pnlDeliveryDetails = new javax.swing.JPanel();
        lblRequestedBy = new javax.swing.JLabel();
        lblRequestedByValue = new javax.swing.JLabel();
        lblDeliveredTo = new javax.swing.JLabel();
        lblDeliveredValue = new javax.swing.JLabel();
        lblPackage = new javax.swing.JLabel();
        jScrollPane = new javax.swing.JScrollPane();
        tblDetails = new javax.swing.JTable();
        lblWeight = new javax.swing.JLabel();
        lblWeightValue = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        lblDateValue = new javax.swing.JLabel();
        btnSnapshot = new javax.swing.JButton();
        lblImage = new javax.swing.JLabel();
        lblDate1 = new javax.swing.JLabel();
        btnShow = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 255));
        setMinimumSize(new java.awt.Dimension(1400, 1000));

        lblHeader.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblHeader.setText("Logistics Worker - Confirm Delivery");

        lblCost.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblCost.setText("Delivery Cost:");

        txtCost.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtCost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCostActionPerformed(evt);
            }
        });

        btnConfirm.setBackground(new java.awt.Color(0, 0, 51));
        btnConfirm.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnConfirm.setForeground(new java.awt.Color(204, 204, 204));
        btnConfirm.setText("Confirm");
        btnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(0, 0, 51));
        btnBack.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(204, 204, 204));
        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        pnlDeliveryDetails.setBackground(new java.awt.Color(204, 204, 255));
        pnlDeliveryDetails.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Delivery Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        lblRequestedBy.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblRequestedBy.setText("Requested By:");

        lblRequestedByValue.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblRequestedByValue.setText("<requested_by>");

        lblDeliveredTo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblDeliveredTo.setText("Delivered To:");

        lblDeliveredValue.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblDeliveredValue.setText("<delivered_to>");

        lblPackage.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblPackage.setText("Package Details:");

        tblDetails.setBackground(new java.awt.Color(204, 153, 255));
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
        if (tblDetails.getColumnModel().getColumnCount() > 0) {
            tblDetails.getColumnModel().getColumn(0).setResizable(false);
            tblDetails.getColumnModel().getColumn(1).setResizable(false);
            tblDetails.getColumnModel().getColumn(2).setResizable(false);
        }

        lblWeight.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblWeight.setText("Package Weight: ");

        lblWeightValue.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblWeightValue.setText("<package_weight>");

        lblDate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblDate.setText("Delivery Date:");

        lblDateValue.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblDateValue.setText("<delivery_date>");

        btnSnapshot.setBackground(new java.awt.Color(0, 0, 51));
        btnSnapshot.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSnapshot.setForeground(new java.awt.Color(204, 204, 204));
        btnSnapshot.setText("Snapshot");
        btnSnapshot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSnapshotActionPerformed(evt);
            }
        });

        lblImage.setBorder(new javax.swing.border.MatteBorder(null));

        lblDate1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblDate1.setText("Delivery Image:");

        btnShow.setBackground(new java.awt.Color(0, 0, 51));
        btnShow.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnShow.setForeground(new java.awt.Color(204, 204, 204));
        btnShow.setText("Show");
        btnShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlDeliveryDetailsLayout = new javax.swing.GroupLayout(pnlDeliveryDetails);
        pnlDeliveryDetails.setLayout(pnlDeliveryDetailsLayout);
        pnlDeliveryDetailsLayout.setHorizontalGroup(
            pnlDeliveryDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDeliveryDetailsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDeliveryDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDeliveryDetailsLayout.createSequentialGroup()
                        .addGroup(pnlDeliveryDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pnlDeliveryDetailsLayout.createSequentialGroup()
                                .addComponent(lblRequestedBy)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblRequestedByValue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(pnlDeliveryDetailsLayout.createSequentialGroup()
                                .addComponent(lblDeliveredTo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblDeliveredValue, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblPackage)
                            .addGroup(pnlDeliveryDetailsLayout.createSequentialGroup()
                                .addComponent(lblWeight)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblWeightValue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(pnlDeliveryDetailsLayout.createSequentialGroup()
                                .addGroup(pnlDeliveryDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblDate)
                                    .addComponent(lblDate1))
                                .addGap(23, 23, 23)
                                .addGroup(pnlDeliveryDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblDateValue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(pnlDeliveryDetailsLayout.createSequentialGroup()
                                        .addGroup(pnlDeliveryDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(pnlDeliveryDetailsLayout.createSequentialGroup()
                                                .addComponent(btnSnapshot)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(btnShow))
                                            .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 99, Short.MAX_VALUE)))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 905, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlDeliveryDetailsLayout.setVerticalGroup(
            pnlDeliveryDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDeliveryDetailsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDeliveryDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblRequestedByValue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblRequestedBy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDeliveryDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDeliveredTo)
                    .addComponent(lblDeliveredValue))
                .addGap(29, 29, 29)
                .addComponent(lblPackage)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlDeliveryDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblWeight)
                    .addComponent(lblWeightValue))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDeliveryDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDate)
                    .addComponent(lblDateValue))
                .addGap(18, 18, 18)
                .addGroup(pnlDeliveryDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDate1)
                    .addGroup(pnlDeliveryDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnSnapshot)
                        .addComponent(btnShow)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(213, 213, 213)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBack)
                        .addGap(110, 110, 110)
                        .addComponent(lblCost)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCost, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnConfirm))
                    .addComponent(pnlDeliveryDetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addComponent(lblHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(260, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(lblHeader)
                .addGap(18, 18, 18)
                .addComponent(pnlDeliveryDetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBack, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnConfirm)
                            .addComponent(lblCost))
                        .addGap(8, 8, 8)))
                .addContainerGap(241, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtCostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCostActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCostActionPerformed

    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmActionPerformed

        Double cost = 0d;
        if (Validation.validateNumericalInput(txtCost, 2)) {
            cost = Double.parseDouble(txtCost.getText());
        } else {
            return;
        }

        if (cost <= 0) {
            JOptionPane.showMessageDialog(null,
                    "Enter a valid cost",
                    "Warning",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        if(snapshot.getPath()!=null)
            selectedImagePath = snapshot.getPath();

        request.setStatus(RequestStatus.getPickupStatusMessage(5));
        request.setDeliveredBy(account);
        request.setDeliveryCost(cost);
        request.setDeliveredByLogistics(enterprise.getName());
        request.setPaid(false);
        request.setResolveDate(new Date());
        request.setImgPath(selectedImagePath);

        // Assign to Consumer Worker's queue who was assigned for pickup
        for (Enterprise e : network.getEnterpriseDirectory().getEnterpriseList()) {
            for (Organization o : e.getOrganizationDirectory().getOrganizationList()) {
                if (o instanceof ConsumerWorkerOrganization) {
                    for (UserAccount ua : o.getUserAccountDirectory().getUserAccountList()) {
                        if (request.getDeliverTo() == ua) {
                            ua.getWorkQueue().getWorkRequestList().add(request);
                            break;
                        }
                    }
                }
            }
        }
        JOptionPane.showMessageDialog(null, "Delivery done", "Information", JOptionPane.INFORMATION_MESSAGE);
        populateTable();
        btnConfirm.setEnabled(false);
    }//GEN-LAST:event_btnConfirmActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        mainPanel.remove(this);
        CardLayout layout = (CardLayout) mainPanel.getLayout();
        layout.previous(mainPanel);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSnapshotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSnapshotActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout) mainPanel.getLayout();
        mainPanel.add("snapshot", snapshot);
        layout.next(mainPanel);
        //        selectedImagePath = snapshot.getPath();
        System.out.println("Selected Image: "+ selectedImagePath);
    }//GEN-LAST:event_btnSnapshotActionPerformed

    private void btnShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowActionPerformed
        // TODO add your handling code here:
        ImageIcon imgIcon = new ImageIcon(selectedImagePath);
        System.out.println(selectedImagePath);
        Image img =imgIcon.getImage().getScaledInstance(lblImage.getWidth(), lblImage.getHeight(), Image.SCALE_SMOOTH);
        
    }//GEN-LAST:event_btnShowActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnConfirm;
    private javax.swing.JButton btnShow;
    private javax.swing.JButton btnSnapshot;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JLabel lblCost;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblDate1;
    private javax.swing.JLabel lblDateValue;
    private javax.swing.JLabel lblDeliveredTo;
    private javax.swing.JLabel lblDeliveredValue;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JLabel lblImage;
    private javax.swing.JLabel lblPackage;
    private javax.swing.JLabel lblRequestedBy;
    private javax.swing.JLabel lblRequestedByValue;
    private javax.swing.JLabel lblWeight;
    private javax.swing.JLabel lblWeightValue;
    private javax.swing.JPanel pnlDeliveryDetails;
    private javax.swing.JTable tblDetails;
    private javax.swing.JTextField txtCost;
    // End of variables declaration//GEN-END:variables
}
