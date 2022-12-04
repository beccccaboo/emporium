/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userInterface.logistics.worker;

/**
 *
 * @author Arpit
 */
public class LogisticsWorker extends javax.swing.JPanel {

    /**
     * Creates new form LogisticsWorker
     */
    public LogisticsWorker() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane = new javax.swing.JScrollPane();
        tblLogisticsWorker = new javax.swing.JTable();
        btnPickup = new javax.swing.JButton();
        lblHeader = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblHeader1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblLogisticsWorker1 = new javax.swing.JTable();
        btnDelivery = new javax.swing.JButton();

        setMinimumSize(new java.awt.Dimension(1000, 1000));

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

        btnPickup.setText("Pickup");
        btnPickup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPickupActionPerformed(evt);
            }
        });

        lblHeader.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblHeader.setText("Logistics Worker - Pick up list");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(763, 763, 763)
                        .addComponent(btnPickup))
                    .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 825, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 825, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(153, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(lblHeader)
                .addGap(48, 48, 48)
                .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(btnPickup)
                .addContainerGap(401, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Pickup Requests", jPanel1);

        lblHeader1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblHeader1.setText("Logistics Worker - Delivery Queue");

        tblLogisticsWorker1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblLogisticsWorker1);

        btnDelivery.setText("Confirm Delivery");
        btnDelivery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeliveryActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(706, 706, 706)
                        .addComponent(btnDelivery))
                    .addComponent(jScrollPane1)
                    .addComponent(lblHeader1, javax.swing.GroupLayout.PREFERRED_SIZE, 825, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(140, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lblHeader1)
                .addGap(50, 50, 50)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnDelivery)
                .addContainerGap(390, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Delivery Requests", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 139, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 861, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>                        

    private void btnPickupActionPerformed(java.awt.event.ActionEvent evt) {                                          

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

                LogisticsWorkerPickUpDetailsJPanel logisticsWorkerPickUpDetailsJPanel = new LogisticsWorkerPickUpDetailsJPanel(userProcessContainer, account, request);
                userProcessContainer.add("LogisticsWorkerPickUpDetailsJPanel", logisticsWorkerPickUpDetailsJPanel);
                CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                layout.next(userProcessContainer);

            } else {
                JOptionPane.showMessageDialog(null,
                    "Pick-up already completed",
                    "Warning",
                    JOptionPane.WARNING_MESSAGE);
                return;
            }
        }
    }                                         

    private void btnDeliveryActionPerformed(java.awt.event.ActionEvent evt) {                                            
        int selectedRow = tblLogisticsWorker.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null,
                "Please select a request item to deliver",
                "Warning",
                JOptionPane.WARNING_MESSAGE);
            return;
        } else {
            CollectionWorkRequest request = (CollectionWorkRequest) tblLogisticsWorker.getValueAt(selectedRow, 5);
            if (request.getStatus().equals(RequestStatus.getPickupStatusMessage(4))) {

                LogisticsWorkerDeliveryDetailsJPanel logisticsWorkerDeliveryDetailsJPanel = new LogisticsWorkerDeliveryDetailsJPanel(userProcessContainer, account, enterprise, request, network);
                userProcessContainer.add("LogisticsWorkerDeliveryDetailsJPanel", logisticsWorkerDeliveryDetailsJPanel);
                CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                layout.next(userProcessContainer);

            } else {
                JOptionPane.showMessageDialog(null,
                    "Request not in the proper state for delivery",
                    "Warning",
                    JOptionPane.WARNING_MESSAGE);
                return;
            }
        }
    }                                           


    // Variables declaration - do not modify                     
    private javax.swing.JButton btnDelivery;
    private javax.swing.JButton btnPickup;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JLabel lblHeader1;
    private javax.swing.JTable tblLogisticsWorker;
    private javax.swing.JTable tblLogisticsWorker1;
    // End of variables declaration                   
}
