/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.consumer.manager;

import business.organization.Organization;
import business.workQueue.ShortageWorkRequest;
import business.workQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Arpit
 */
public class ConsumerViewShortageRequestJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ConsumerViewShortageRequestJPanel
     */
    private JPanel mainPanel;
    private Organization organization;

    public ConsumerViewShortageRequestJPanel(JPanel mainPanel, Organization organization) {
        initComponents();
        this.mainPanel = mainPanel;
        this.organization = organization;
        populateShortageTable();
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
        btnBack = new javax.swing.JButton();
        jScrollPane = new javax.swing.JScrollPane();
        tblShortage = new javax.swing.JTable();

        setBackground(new java.awt.Color(6, 36, 50));
        setMinimumSize(new java.awt.Dimension(1400, 1000));

        lblHeader.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblHeader.setForeground(new java.awt.Color(204, 204, 204));
        lblHeader.setText("Consumer Worker - Shortage Requests");

        btnBack.setBackground(new java.awt.Color(191, 149, 155));
        btnBack.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("<<BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        tblShortage.setBackground(new java.awt.Color(204, 204, 204));
        tblShortage.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tblShortage.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Request Date", "NGO Name", "Raised By(Manager Name)", "Assign to Employee", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane.setViewportView(tblShortage);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(403, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(97, 97, 97))
                    .addComponent(jScrollPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 738, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(btnBack)
                        .addGap(503, 503, 503)))
                .addGap(259, 259, 259))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(166, 166, 166)
                .addComponent(lblHeader)
                .addGap(42, 42, 42)
                .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(btnBack)
                .addContainerGap(383, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void populateShortageTable() {
        DefaultTableModel dtm = (DefaultTableModel) tblShortage.getModel();
        dtm.setRowCount(0);

        for (WorkRequest wr : organization.getWorkQueue().getWorkRequestList()) {
            if (wr instanceof ShortageWorkRequest) {
                ShortageWorkRequest swr = (ShortageWorkRequest) wr;

                Object row[] = new Object[5];
                row[0] = swr.getRequestDate();
                row[1] = swr.getSender().getEmployee().getName();
                row[2] = swr.getConsumerName();
                row[3] = swr.getAssignToEmployee();
                row[4] = swr;

                dtm.addRow(row);
            }
        }
    }
    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        mainPanel.remove(this);
        CardLayout layout = (CardLayout) mainPanel.getLayout();
        layout.previous(mainPanel);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JTable tblShortage;
    // End of variables declaration//GEN-END:variables
}
