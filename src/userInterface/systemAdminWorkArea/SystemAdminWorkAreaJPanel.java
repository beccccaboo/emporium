/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.systemAdminWorkArea;

import business.EcoSystem;
import business.enterprise.Enterprise;
import business.network.Network;
import business.organization.Organization;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author rebeccabiju
 */
public class SystemAdminWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem business;

    /**
     * Creates new form SystemAdminAreaJPanel
     */
    public SystemAdminWorkAreaJPanel(JPanel userProcessContainer, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.business = business;
//        populateTree();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        workAreaPanel = new javax.swing.JPanel();
        lblNode = new javax.swing.JLabel();
        lblNodeValue = new javax.swing.JLabel();
        btnManageEnterpriseAdmin = new javax.swing.JButton();
        btnManageEnterprise = new javax.swing.JButton();
        btnManageNetwork = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        workAreaPanel.setBackground(new java.awt.Color(153, 153, 255));

        lblNode.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblNode.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNode.setText("Select");

        btnManageEnterpriseAdmin.setText("Manage Enterprise Admin");
        btnManageEnterpriseAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageEnterpriseAdminActionPerformed(evt);
            }
        });

        btnManageEnterprise.setText("Manage Enterprise");
        btnManageEnterprise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageEnterpriseActionPerformed(evt);
            }
        });

        btnManageNetwork.setText("Manage Network");
        btnManageNetwork.setOpaque(true);
        btnManageNetwork.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageNetworkActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout workAreaPanelLayout = new javax.swing.GroupLayout(workAreaPanel);
        workAreaPanel.setLayout(workAreaPanelLayout);
        workAreaPanelLayout.setHorizontalGroup(
            workAreaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(workAreaPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnManageNetwork, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(workAreaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(workAreaPanelLayout.createSequentialGroup()
                        .addComponent(lblNode, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(lblNodeValue))
                    .addGroup(workAreaPanelLayout.createSequentialGroup()
                        .addComponent(btnManageEnterprise, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(32, 32, 32)
                        .addComponent(btnManageEnterpriseAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        workAreaPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnManageEnterprise, btnManageEnterpriseAdmin, btnManageNetwork, lblNode});

        workAreaPanelLayout.setVerticalGroup(
            workAreaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(workAreaPanelLayout.createSequentialGroup()
                .addGroup(workAreaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(workAreaPanelLayout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(lblNodeValue))
                    .addGroup(workAreaPanelLayout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(lblNode, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(115, 115, 115)
                .addGroup(workAreaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnManageNetwork)
                    .addComponent(btnManageEnterprise)
                    .addComponent(btnManageEnterpriseAdmin))
                .addGap(673, 673, 673))
        );

        workAreaPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnManageEnterprise, btnManageEnterpriseAdmin, btnManageNetwork, lblNode});

        add(workAreaPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 230, 700, 430));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userInterface/systemAdminWorkArea/shubham-dhage-mjl0yIdSi18-unsplash (1).jpg"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1450, 1010));
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageEnterpriseAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageEnterpriseAdminActionPerformed
        // TODO add your handling code here:
        ManageEnterpriseAdminJPanel manageEnterpriseAdminJPanel = new ManageEnterpriseAdminJPanel(userProcessContainer, business);
        userProcessContainer.add("ManageEnterpriseAdminJPanel", manageEnterpriseAdminJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageEnterpriseAdminActionPerformed

    private void btnManageEnterpriseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageEnterpriseActionPerformed
        // TODO add your handling code here:
        ManageEnterpriseJPanel manageEnterpriseJPanel = new ManageEnterpriseJPanel(userProcessContainer, business);
        userProcessContainer.add("ManageEnterpriseJPanel", manageEnterpriseJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageEnterpriseActionPerformed

    private void btnManageNetworkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageNetworkActionPerformed
        // TODO add your handling code here:
        ManageNetworkJPanel manageNetworkJPanel = new ManageNetworkJPanel(userProcessContainer, business);
        userProcessContainer.add("ManageNetworkJPanel", manageNetworkJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageNetworkActionPerformed

//    public void populateTree() {
//        DefaultTreeModel dtm = (DefaultTreeModel) treeNetwork.getModel();
//
//        ArrayList<Network> networkList = business.getNetworkList();
//        ArrayList<Enterprise> enterpriseList;
//        ArrayList<Organization> organizationList;
//
//        Network network;
//        Enterprise enterprise;
//        Organization organization;
//
//        DefaultMutableTreeNode root = (DefaultMutableTreeNode) dtm.getRoot();
//        root.removeAllChildren();
//
//        DefaultMutableTreeNode networks = new DefaultMutableTreeNode("Networks");
//        root.insert(networks, 0);
//
//        DefaultMutableTreeNode networkNode;
//        DefaultMutableTreeNode enterpriseNode;
//        DefaultMutableTreeNode organizationNode;
//
//        for (int i = 0; i < networkList.size(); i++) {
//            network = networkList.get(i);
//            networkNode = new DefaultMutableTreeNode(network.getName());
//            networks.insert(networkNode, i);
//
//            enterpriseList = network.getEnterpriseDirectory().getEnterpriseList();
//
//            for (int j = 0; j < enterpriseList.size(); j++) {
//                enterprise = enterpriseList.get(j);
//                enterpriseNode = new DefaultMutableTreeNode(enterprise.getName());
//                networkNode.insert(enterpriseNode, j);
//
//                organizationList = enterprise.getOrganizationDirectory().getOrganizationList();
//
//                for (int k = 0; k < organizationList.size(); k++) {
//                    organization = organizationList.get(k);
//                    organizationNode = new DefaultMutableTreeNode(organization.getName());
//                    enterpriseNode.insert(organizationNode, k);
//                }
//            }
//
//        }
//        dtm.reload();
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnManageEnterprise;
    private javax.swing.JButton btnManageEnterpriseAdmin;
    private javax.swing.JButton btnManageNetwork;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblNode;
    private javax.swing.JLabel lblNodeValue;
    private javax.swing.JPanel workAreaPanel;
    // End of variables declaration//GEN-END:variables
}
