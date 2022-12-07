/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
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
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rebeccabiju
 */
public class ConfirmDelivery extends javax.swing.JPanel {

    /**
     * Creates new form ConfirmDelivery
     */
    private JPanel mainPanel;
    private UserAccount account;
    private Enterprise enterprise;
    private Date date;
    private CollectionWorkRequest request;
    private Network network;
    
    public ConfirmDelivery(JPanel mainPanel, UserAccount account, Enterprise enterprise, CollectionWorkRequest request, Network network) {
        initComponents();
        this.mainPanel = mainPanel;
        this.account = account;
        this.request = request;
        this.enterprise = enterprise;
        this.network = network;
        date = new Date();
        populateDetails();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        btnBack = new javax.swing.JButton();
        btnConfirm = new javax.swing.JButton();
        txtCost = new javax.swing.JTextField();
        lblCost = new javax.swing.JLabel();
        lblHeader = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(800, 800));

        pnlDeliveryDetails.setBackground(new java.awt.Color(255, 255, 204));
        pnlDeliveryDetails.setBorder(javax.swing.BorderFactory.createTitledBorder("Delivery Details"));

        lblRequestedBy.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblRequestedBy.setText("Requested By:");

        lblRequestedByValue.setText("<requested_by>");

        lblDeliveredTo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblDeliveredTo.setText("Delivered To:");

        lblDeliveredValue.setText("<delivered_to>");

        lblPackage.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblPackage.setText("Package Details:");

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

        lblWeight.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblWeight.setText("Package Weight: ");

        lblWeightValue.setText("<package_weight>");

        lblDate.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblDate.setText("Delivery Date:");

        lblDateValue.setText("<delivery_date>");

        javax.swing.GroupLayout pnlDeliveryDetailsLayout = new javax.swing.GroupLayout(pnlDeliveryDetails);
        pnlDeliveryDetails.setLayout(pnlDeliveryDetailsLayout);
        pnlDeliveryDetailsLayout.setHorizontalGroup(
            pnlDeliveryDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDeliveryDetailsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDeliveryDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlDeliveryDetailsLayout.createSequentialGroup()
                        .addComponent(lblRequestedBy)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblRequestedByValue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnlDeliveryDetailsLayout.createSequentialGroup()
                        .addComponent(lblDeliveredTo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblDeliveredValue, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPackage)
                    .addGroup(pnlDeliveryDetailsLayout.createSequentialGroup()
                        .addComponent(lblDate)
                        .addGap(23, 23, 23)
                        .addComponent(lblDateValue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnlDeliveryDetailsLayout.createSequentialGroup()
                        .addComponent(lblWeight)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblWeightValue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(86, 86, 86))
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
                .addContainerGap())
        );

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnConfirm.setText("Confirm");
        btnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmActionPerformed(evt);
            }
        });

        txtCost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCostActionPerformed(evt);
            }
        });

        lblCost.setText("Delivery Cost:");

        lblHeader.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblHeader.setText("Logistics Worker - Confirm Delivery");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblCost)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtCost, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnConfirm))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBack)
                            .addComponent(pnlDeliveryDetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(lblHeader)
                .addGap(50, 50, 50)
                .addComponent(pnlDeliveryDetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConfirm)
                    .addComponent(txtCost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCost))
                .addGap(38, 38, 38)
                .addComponent(btnBack)
                .addGap(43, 43, 43))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        mainPanel.remove(this);
        CardLayout layout = (CardLayout) mainPanel.getLayout();
        layout.previous(mainPanel);
    }//GEN-LAST:event_btnBackActionPerformed

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

        request.setStatus(RequestStatus.getPickupStatusMessage(5));
        request.setDeliveredBy(account);
        request.setDeliveryCost(cost);
        request.setDeliveredByLogistics(enterprise.getName());
        request.setPaid(false);
        request.setResolveDate(new Date());

        // Assign to NGO Worker's queue who was assigned for pickup
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

    private void txtCostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCostActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCostActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnConfirm;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JLabel lblCost;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblDateValue;
    private javax.swing.JLabel lblDeliveredTo;
    private javax.swing.JLabel lblDeliveredValue;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JLabel lblPackage;
    private javax.swing.JLabel lblRequestedBy;
    private javax.swing.JLabel lblRequestedByValue;
    private javax.swing.JLabel lblWeight;
    private javax.swing.JLabel lblWeightValue;
    private javax.swing.JPanel pnlDeliveryDetails;
    private javax.swing.JTable tblDetails;
    private javax.swing.JTextField txtCost;
    // End of variables declaration//GEN-END:variables

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
            row[2] = ri.getDaysBeforeDonation();

            dtm.addRow(row);
        }
    }
}
