/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userInterface.supplier.worker;

/**
 *
 * @author Arpit
 */
public class SupplierWorker extends javax.swing.JPanel {

    /**
     * Creates new form SupplierWorker
     */
    public SupplierWorker() {
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

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        lbMessage = new javax.swing.JLabel();
        lblFoodType = new javax.swing.JLabel();
        txtMessage = new javax.swing.JTextField();
        lblQuantity = new javax.swing.JLabel();
        cmbFood = new javax.swing.JComboBox<>();
        spnQuantity = new javax.swing.JSpinner();
        lblWarning = new javax.swing.JLabel();
        lblPerishTime = new javax.swing.JLabel();
        btnRemove = new javax.swing.JButton();
        spnPerishTime = new javax.swing.JSpinner();
        btnAdd = new javax.swing.JButton();
        jScrollPane = new javax.swing.JScrollPane();
        tblFoodItems = new javax.swing.JTable();
        lblHeader = new javax.swing.JLabel();
        btnRaiseRequest = new javax.swing.JButton();
        lblSubHeader = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblHeader1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblLog = new javax.swing.JTable();
        btnViewRequestItem = new javax.swing.JButton();

        setMinimumSize(new java.awt.Dimension(1000, 1000));

        lbMessage.setText("Message:");

        lblFoodType.setText("Food Type:");

        lblQuantity.setText("Quantity:");

        spnQuantity.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        lblWarning.setForeground(new java.awt.Color(255, 0, 0));
        lblWarning.setText("<HTML>* Considering the logsitics, we only accept food which would last for atleast 4 hours.</HTML>");

        lblPerishTime.setText("Hours to perish*:");

        btnRemove.setText("Remove");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        spnPerishTime.setModel(new javax.swing.SpinnerNumberModel(4, 4, null, 1));

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        tblFoodItems.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Food Type", "Quantity", "Hours to perish"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane.setViewportView(tblFoodItems);

        lblHeader.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblHeader.setText("Supplier Worker Work Area - Collection Request");

        btnRaiseRequest.setText("Raise Request");
        btnRaiseRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRaiseRequestActionPerformed(evt);
            }
        });

        lblSubHeader.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblSubHeader.setText("Add Food Items :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 585, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(19, 19, 19)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnRemove)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(lbMessage)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(486, 486, 486)
                                        .addComponent(btnRaiseRequest))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(44, 44, 44)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblSubHeader)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(lblQuantity)
                                                    .addComponent(lblPerishTime)
                                                    .addComponent(lblFoodType))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(spnQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(spnPerishTime, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(cmbFood, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(15, 15, 15)
                                                .addComponent(lblWarning, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
                    .addComponent(lblHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 629, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(253, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(lblHeader)
                .addGap(50, 50, 50)
                .addComponent(lblSubHeader)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFoodType)
                    .addComponent(cmbFood, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblQuantity)
                    .addComponent(spnQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPerishTime)
                    .addComponent(spnPerishTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblWarning, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addComponent(btnAdd)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRemove)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbMessage)
                    .addComponent(txtMessage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRaiseRequest)
                .addContainerGap(194, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Raise Collection Request", jPanel1);

        lblHeader1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblHeader1.setText("Supplier Worker Work Area - Request Log");

        tblLog.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Raised Date", "Status", "Quantity (in pounds)", "Collected By"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblLog);

        btnViewRequestItem.setText("View Request Item");
        btnViewRequestItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewRequestItemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(552, 552, 552)
                        .addComponent(btnViewRequestItem))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 675, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(lblHeader1, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(215, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(lblHeader1)
                .addGap(50, 50, 50)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addComponent(btnViewRequestItem)
                .addContainerGap(392, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("View Request Log", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 199, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 801, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        int selectedRow = tblFoodItems.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null,
                "Please select an item to be removed",
                "Warning",
                JOptionPane.WARNING_MESSAGE);
            return;
        }

        DefaultTableModel dtm = (DefaultTableModel) tblFoodItems.getModel();
        dtm.removeRow(selectedRow);

    }//GEN-LAST:event_btnRemoveActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        String food = cmbFood.getSelectedItem().toString();
        int quantity = (Integer) spnQuantity.getValue();
        int hours = (Integer) spnPerishTime.getValue();

        if (quantity < 1) {
            JOptionPane.showMessageDialog(null,
                "Quantity of food cannot be less than 1",
                "Warning",
                JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (hours < 4) {
            JOptionPane.showMessageDialog(null,
                "Food items perishable under 4 hours not accepted!",
                "Warning",
                JOptionPane.WARNING_MESSAGE);
            return;
        }

        Object row[] = new Object[3];
        row[0] = food;
        row[1] = quantity;
        row[2] = hours;

        DefaultTableModel dtm = (DefaultTableModel) tblFoodItems.getModel();
        dtm.addRow(row);

        //        JOptionPane.showMessageDialog(null, "Food Item Added");
        cmbFood.setSelectedIndex(0);
        spnQuantity.setValue(1);
        spnPerishTime.setValue(4);
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnRaiseRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRaiseRequestActionPerformed

        String message = txtMessage.getText();

        DefaultTableModel dtm = (DefaultTableModel) tblFoodItems.getModel();

        if (dtm.getRowCount() == 0) {
            JOptionPane.showMessageDialog(null, "No food items selected to be distributed");
            return;
        }

        ArrayList<RequestItem> requestList = new ArrayList();
        for (int i = 0; i < dtm.getRowCount(); i++) {
            String food = (String) dtm.getValueAt(i, 0);
            int quantity = (Integer) dtm.getValueAt(i, 1);
            int hours = (Integer) dtm.getValueAt(i, 2);

            RequestItem ri = new RequestItem(food, quantity, hours);
            requestList.add(ri);
        }

        CollectionWorkRequest request = new CollectionWorkRequest();
        request.setSender(account);
        request.setMessage(message);
        request.setRequestItems(requestList);
        request.setStatus(RequestStatus.getPickupStatusMessage(1));
        request.setTotalQuantity(FoodQuantity.calculateQuantity(request.getRequestItems()));
        request.setRaisedBy(account);
        request.setRaisedByRestaurant(enterpriseName);

        for (Enterprise e : network.getEnterpriseDirectory().getEnterpriseList()) {
            for (Organization o : e.getOrganizationDirectory().getOrganizationList()) {
                if (o instanceof NGOManagerOrganization) {
                    o.getWorkQueue().getWorkRequestList().add(request);
                }
            }
        }

        account.getWorkQueue().getWorkRequestList().add(request);
        JOptionPane.showMessageDialog(null, "Request raised with NGO for further processing", "Information", JOptionPane.INFORMATION_MESSAGE);
        dtm.setRowCount(0);

        txtMessage.setText("");
    }//GEN-LAST:event_btnRaiseRequestActionPerformed

    private void btnViewRequestItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewRequestItemActionPerformed

        int selectedRow = tblLog.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null,
                "Please select a request item to view details",
                "Information",
                JOptionPane.INFORMATION_MESSAGE);
        } else {
            CollectionWorkRequest cwr = (CollectionWorkRequest) tblLog.getValueAt(selectedRow, 1);

            RestaurantWorkerViewLogItemJPanel restaurantWorkerViewLogItemJPanel = new RestaurantWorkerViewLogItemJPanel(userProcessContainer, cwr);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            userProcessContainer.add("RestaurantWorkerViewLogItemJPanel", restaurantWorkerViewLogItemJPanel);
            layout.next(userProcessContainer);
        }
    }//GEN-LAST:event_btnViewRequestItemActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnRaiseRequest;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnViewRequestItem;
    private javax.swing.JComboBox<String> cmbFood;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lbMessage;
    private javax.swing.JLabel lblFoodType;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JLabel lblHeader1;
    private javax.swing.JLabel lblPerishTime;
    private javax.swing.JLabel lblQuantity;
    private javax.swing.JLabel lblSubHeader;
    private javax.swing.JLabel lblWarning;
    private javax.swing.JSpinner spnPerishTime;
    private javax.swing.JSpinner spnQuantity;
    private javax.swing.JTable tblFoodItems;
    private javax.swing.JTable tblLog;
    private javax.swing.JTextField txtMessage;
    // End of variables declaration//GEN-END:variables
}