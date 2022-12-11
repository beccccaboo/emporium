/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.consumer.admin;

import business.EcoSystem;
import business.enterprise.Enterprise;
import business.organization.Organization;
import business.userAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Arpit
 */
public class ConsumerAdminWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ConsumerAdminWorkAreaJPanel
     */
    private JPanel userProcessContainer;
    private UserAccount account;
    private Organization organization;
    private Enterprise enterprise;
    private EcoSystem business;

    public ConsumerAdminWorkAreaJPanel(JPanel userProcessContainer, Enterprise enterprise, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.business = business;
        this.account = account;
        this.organization = organization;
        this.enterprise = enterprise;
        lblValue.setText(enterprise.getName());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblHeading = new javax.swing.JLabel();
        lblEnterprise = new javax.swing.JLabel();
        lblValue = new javax.swing.JLabel();
        btnManageOrganization = new javax.swing.JButton();
        btnManageEmployee = new javax.swing.JButton();
        btnManageUser = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 255, 204));

        lblHeading.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblHeading.setText("NGO Adminstrative Work Area");

        lblEnterprise.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblEnterprise.setText("NGO:");

        lblValue.setText("<value>");

        btnManageOrganization.setText("Manage Organization");
        btnManageOrganization.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageOrganizationActionPerformed(evt);
            }
        });

        btnManageEmployee.setText("Manage Employee");
        btnManageEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageEmployeeActionPerformed(evt);
            }
        });

        btnManageUser.setText("Manage User");
        btnManageUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageUserActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(450, 450, 450)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(lblHeading, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblEnterprise, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(lblValue, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnManageOrganization, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(btnManageEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(btnManageUser, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(456, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnManageEmployee, btnManageOrganization, btnManageUser, lblEnterprise, lblValue});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(lblHeading)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEnterprise, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblValue))
                .addGap(81, 81, 81)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnManageOrganization, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnManageEmployee)
                    .addComponent(btnManageUser))
                .addContainerGap(652, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnManageEmployee, btnManageOrganization, btnManageUser, lblEnterprise, lblValue});

    }// </editor-fold>//GEN-END:initComponents

    private void btnManageOrganizationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageOrganizationActionPerformed

        ConsumerManageOrganizationJPanel manageConsumerOrganizationJPanel = new ConsumerManageOrganizationJPanel(userProcessContainer, enterprise.getOrganizationDirectory());
        userProcessContainer.add("manageConsumerOrganizationJPanel", manageConsumerOrganizationJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageOrganizationActionPerformed

    private void btnManageEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageEmployeeActionPerformed

        ConsumerManageEmployeeJPanel manageConsumerEmployeeJPanel = new ConsumerManageEmployeeJPanel(userProcessContainer, enterprise.getOrganizationDirectory());
        userProcessContainer.add("manageEmployeeJPanel", manageConsumerEmployeeJPanel);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_btnManageEmployeeActionPerformed

    private void btnManageUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageUserActionPerformed
        // TODO add your handling code here:
        ConsumerManageUserAccountJPanel muajp = new ConsumerManageUserAccountJPanel(userProcessContainer, enterprise, business);
        userProcessContainer.add("ManageUserAccountJPanel", muajp);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageUserActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnManageEmployee;
    private javax.swing.JButton btnManageOrganization;
    private javax.swing.JButton btnManageUser;
    private javax.swing.JLabel lblEnterprise;
    private javax.swing.JLabel lblHeading;
    private javax.swing.JLabel lblValue;
    // End of variables declaration//GEN-END:variables
}
