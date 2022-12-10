/*
 * SupervisionAdminWorkAreaJPanel.java
 *
 * Created on October 10, 2008, 8:50 AM
 */
package userInterface.supervision.manager;

import business.network.Network;
import business.userAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author swarag
 */
public class SupervisionManagerWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Network network;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    public SupervisionManagerWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Network network) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.network = network;
        lblValue.setText(lblValue.getText() + " " + account.getEmployee().getName());

    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblHeading = new javax.swing.JLabel();
        lblValue = new javax.swing.JLabel();
        btnWastageAvoided = new javax.swing.JButton();
        btnPeopleFed = new javax.swing.JButton();
        btnWastageAvoidedChart = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 255));

        lblHeading.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblHeading.setText("Mayor Work Area");

        lblValue.setText("Welcome, ");

        btnWastageAvoided.setText("View Wastage Avoided by Restaurants(Tabular)");
        btnWastageAvoided.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWastageAvoidedActionPerformed(evt);
            }
        });

        btnPeopleFed.setText("View People Fed by NGOs");
        btnPeopleFed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPeopleFedActionPerformed(evt);
            }
        });

        btnWastageAvoidedChart.setText("View Wastage Avoided by Restaurant(Chart)");
        btnWastageAvoidedChart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWastageAvoidedChartActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnPeopleFed, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(119, 119, 119)
                            .addComponent(lblValue, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(159, 159, 159)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnWastageAvoided, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE)
                                .addComponent(btnWastageAvoidedChart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addComponent(lblHeading, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(177, 177, 177))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(lblHeading)
                .addGap(50, 50, 50)
                .addComponent(lblValue)
                .addGap(49, 49, 49)
                .addComponent(btnWastageAvoided)
                .addGap(24, 24, 24)
                .addComponent(btnWastageAvoidedChart)
                .addGap(24, 24, 24)
                .addComponent(btnPeopleFed)
                .addGap(102, 102, 102))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnPeopleFedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPeopleFedActionPerformed

        SupervisionManagerViewConsumerDataJPanel supervisionManagerViewPeopleFedJPanel = new SupervisionManagerViewConsumerDataJPanel(userProcessContainer, network);
        userProcessContainer.add("SupervisionManagerViewPeopleFedJPanel", supervisionManagerViewPeopleFedJPanel);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_btnPeopleFedActionPerformed

    private void btnWastageAvoidedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWastageAvoidedActionPerformed

        SupervisionManagerViewWastageAvoidedBySupplierJPanel supervisionManagerViewWastageAvoidedBySupplier = new SupervisionManagerViewWastageAvoidedBySupplierJPanel(userProcessContainer, network);
        userProcessContainer.add("SupervisionManagerViewWastageAvoidedBySupplier", supervisionManagerViewWastageAvoidedBySupplier);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnWastageAvoidedActionPerformed

    private void btnWastageAvoidedChartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWastageAvoidedChartActionPerformed
        // TODO add your handling code here:
        SupervisionManagerViewChartJPanel supervisionManagerViewChart = new SupervisionManagerViewChartJPanel(userProcessContainer, network);
        userProcessContainer.add("SupervisionManagerViewChart", supervisionManagerViewChart);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnWastageAvoidedChartActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPeopleFed;
    private javax.swing.JButton btnWastageAvoided;
    private javax.swing.JButton btnWastageAvoidedChart;
    private javax.swing.JLabel lblHeading;
    private javax.swing.JLabel lblValue;
    // End of variables declaration//GEN-END:variables

}
