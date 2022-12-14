/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.supervision.admin;

import business.organization.Organization;
import business.organization.Organization.Type;
import business.organization.OrganizationDirectory;
import business.organization.supervision.SupervisionAdminOrganization;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author swarag
 */
public class SupervisionManageOrganizationJPanel extends javax.swing.JPanel {

    private OrganizationDirectory directory;
    private JPanel mainPanel;

    /**
     * Creates new form ManageOrganizationJPanel
     */
    public SupervisionManageOrganizationJPanel(JPanel mainPanel, OrganizationDirectory directory) {
        initComponents();
        this.mainPanel = mainPanel;
        this.directory = directory;
        populateTable();
        populateCombo();
    }

    private void populateCombo() {
        cmbOrganization.removeAllItems();
        for (Type type : Organization.Type.values()) {
            if ((!type.getValue().equals(Type.SupervisionAdmin.getValue())) && (type.getValue().indexOf("Supervision") >= 0)) {
                cmbOrganization.addItem(type);
            }
        }
    }

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblOrganization.getModel();

        model.setRowCount(0);

        for (Organization organization : directory.getOrganizationList()) {
            Object[] row = new Object[2];
            row[0] = organization.getOrganizationID();
            row[1] = organization.getName();

            model.addRow(row);
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
        jScrollPane = new javax.swing.JScrollPane();
        tblOrganization = new javax.swing.JTable();
        jSeparator = new javax.swing.JSeparator();
        lblOrg = new javax.swing.JLabel();
        cmbOrganization = new javax.swing.JComboBox();
        btnBack = new javax.swing.JButton();
        btnAddOrganization = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 51, 51));
        setMinimumSize(new java.awt.Dimension(1400, 1000));

        lblHeader.setFont(new java.awt.Font("Tahoma", 1, 32)); // NOI18N
        lblHeader.setText("Supervision Adminstrative Work Area - Manage Organization");

        tblOrganization.setBackground(new java.awt.Color(255, 153, 153));
        tblOrganization.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tblOrganization.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane.setViewportView(tblOrganization);
        if (tblOrganization.getColumnModel().getColumnCount() > 0) {
            tblOrganization.getColumnModel().getColumn(0).setResizable(false);
            tblOrganization.getColumnModel().getColumn(1).setResizable(false);
        }

        lblOrg.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblOrg.setText("Organization Type ");

        cmbOrganization.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        btnBack.setBackground(new java.awt.Color(102, 102, 102));
        btnBack.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnAddOrganization.setBackground(new java.awt.Color(102, 102, 102));
        btnAddOrganization.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnAddOrganization.setForeground(new java.awt.Color(255, 255, 255));
        btnAddOrganization.setText("Add Organization");
        btnAddOrganization.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddOrganizationActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(561, 561, 561)
                                .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(649, 649, 649)
                                .addComponent(lblOrg)
                                .addGap(18, 18, 18)
                                .addComponent(cmbOrganization, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(531, 531, 531)
                                .addComponent(btnBack)
                                .addGap(306, 306, 306)
                                .addComponent(btnAddOrganization)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jSeparator, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1394, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 1026, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(198, 198, 198))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(246, 246, 246)
                .addComponent(lblHeader)
                .addGap(52, 52, 52)
                .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbOrganization, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblOrg))
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(btnAddOrganization))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddOrganizationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddOrganizationActionPerformed

        int selectedItem = cmbOrganization.getSelectedIndex();
        if (selectedItem == -1) {
            JOptionPane.showMessageDialog(null, "Please select the organization to create", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        Type type = (Type) cmbOrganization.getSelectedItem();

        for (Organization o : directory.getOrganizationList()) {
            {
                if (o instanceof SupervisionAdminOrganization) {
                    JOptionPane.showMessageDialog(null, "Supervision organization already exists for the network", "Warning", JOptionPane.WARNING_MESSAGE);
                    return;
                }
            }
        }

        directory.addOrganization(type);
        JOptionPane.showMessageDialog(null, "Organization added successfully", "Information", JOptionPane.INFORMATION_MESSAGE);
        populateTable();

    }//GEN-LAST:event_btnAddOrganizationActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed

        mainPanel.remove(this);
        CardLayout layout = (CardLayout) mainPanel.getLayout();
        layout.previous(mainPanel);
    }//GEN-LAST:event_btnBackActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddOrganization;
    private javax.swing.JButton btnBack;
    private javax.swing.JComboBox cmbOrganization;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JSeparator jSeparator;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JLabel lblOrg;
    private javax.swing.JTable tblOrganization;
    // End of variables declaration//GEN-END:variables
}
