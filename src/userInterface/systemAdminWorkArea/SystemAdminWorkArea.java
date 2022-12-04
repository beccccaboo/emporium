/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userInterface.systemAdminWorkArea;

import business.EcoSystem;
import business.employee.Employee;
import business.enterprise.Enterprise;
import business.enterprise.Enterprise.EnterpriseType;
import business.network.Network;
import business.role.Role;
import business.role.consumer.ConsumerAdminRole;
import business.role.logistics.LogisticsAdminRole;
import business.role.supplier.SupplierAdminRole;
import business.userAccount.UserAccount;
import business.util.validation.Validation;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Arpit
 */
public class SystemAdminWorkArea extends javax.swing.JPanel {

    /**
     * Creates new form SystemAdminWorkArea
     */
    private JPanel mainPanel;
    private EcoSystem business;
    public SystemAdminWorkArea(JPanel mainPanel, EcoSystem business) {
        initComponents();
        this.mainPanel = mainPanel;
        this.business = business;
        populateNetworkTable();
        populateEnterpriseTable();
        populateComboBox();
        populateNetworkComboBox();
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
        btnAddNetwork = new javax.swing.JButton();
        separator = new javax.swing.JSeparator();
        lblHeader = new javax.swing.JLabel();
        lblCreateNetwork = new javax.swing.JLabel();
        lblNetworkList = new javax.swing.JLabel();
        jScrollPane = new javax.swing.JScrollPane();
        tblNetwork = new javax.swing.JTable();
        lblName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        lblCreateNetwork1 = new javax.swing.JLabel();
        lblNetwork = new javax.swing.JLabel();
        cmbNetwork = new javax.swing.JComboBox();
        lblEnterpriseType = new javax.swing.JLabel();
        cmbEnterprise = new javax.swing.JComboBox();
        lblEnterpriseName = new javax.swing.JLabel();
        txtEnterpriseName = new javax.swing.JTextField();
        btnAddEnterprise = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEnterprise = new javax.swing.JTable();
        lblHeader1 = new javax.swing.JLabel();
        lblNetworkList1 = new javax.swing.JLabel();
        jSeparator = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        lblHeader2 = new javax.swing.JLabel();
        lblEnterprise = new javax.swing.JLabel();
        lblNetworkList2 = new javax.swing.JLabel();
        cmbEnterprise1 = new javax.swing.JComboBox();
        lblCreateNetwork2 = new javax.swing.JLabel();
        lblUserName = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        lblPassword = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblEnterprise1 = new javax.swing.JTable();
        lblName1 = new javax.swing.JLabel();
        txtName1 = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        lblNetwork1 = new javax.swing.JLabel();
        btnAddEnterprise1 = new javax.swing.JButton();
        cmbNetwork1 = new javax.swing.JComboBox();

        setMinimumSize(new java.awt.Dimension(1000, 1000));

        btnAddNetwork.setText("Create");
        btnAddNetwork.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddNetworkActionPerformed(evt);
            }
        });

        lblHeader.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblHeader.setText("System Admin Work Area - Create Network");

        lblCreateNetwork.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblCreateNetwork.setText("Create New Network:");

        lblNetworkList.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblNetworkList.setText("Network list:");

        tblNetwork.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane.setViewportView(tblNetwork);

        lblName.setText("Name");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(142, 142, 142)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(separator)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(91, 91, 91)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(4, 4, 4)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblCreateNetwork, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(lblName)
                                                .addGap(18, 18, 18)
                                                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(btnAddNetwork, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(lblNetworkList, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addComponent(lblHeader)))
                        .addGap(87, 87, 87)))
                .addGap(159, 159, 159))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(lblHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(lblNetworkList)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(separator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCreateNetwork)
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAddNetwork)
                .addContainerGap(508, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Manage Network", jPanel1);

        lblCreateNetwork1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblCreateNetwork1.setText("Create New Enterprise:");

        lblNetwork.setText("Network");

        cmbNetwork.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbNetworkActionPerformed(evt);
            }
        });

        lblEnterpriseType.setText("Enterprise Type");

        lblEnterpriseName.setText("Name");

        btnAddEnterprise.setText("Submit");
        btnAddEnterprise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddEnterpriseActionPerformed(evt);
            }
        });

        tblEnterprise.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Enterprise Name", "Network", "Type"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblEnterprise);

        lblHeader1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblHeader1.setText("System Admin Work Area - Create Enterprise");

        lblNetworkList1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblNetworkList1.setText("Enterprise list:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(81, 81, 81)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(459, 459, 459)
                                        .addComponent(btnAddEnterprise))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblNetworkList1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblCreateNetwork1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(168, 168, 168)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNetwork)
                                    .addComponent(lblEnterpriseType)
                                    .addComponent(lblEnterpriseName))
                                .addGap(52, 52, 52)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmbEnterprise, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbNetwork, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEnterpriseName, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(84, 84, 84)
                                .addComponent(lblHeader1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)))
                .addGap(164, 164, 164))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(lblHeader1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(lblNetworkList1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblCreateNetwork1)
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNetwork)
                    .addComponent(cmbNetwork, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEnterpriseType)
                    .addComponent(cmbEnterprise, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEnterpriseName)
                    .addComponent(txtEnterpriseName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(btnAddEnterprise)
                .addContainerGap(409, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Manage Enterprise", jPanel2);

        lblHeader2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblHeader2.setText("System Admin Work Area - Create Enterprise Admin");

        lblEnterprise.setText("Enterprise");

        lblNetworkList2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblNetworkList2.setText("Enterprise admin list:");

        cmbEnterprise1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbEnterprise1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbEnterprise1ActionPerformed(evt);
            }
        });

        lblCreateNetwork2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblCreateNetwork2.setText("Create New Enterprise:");

        lblUserName.setText("Username");

        lblPassword.setText("Password");

        tblEnterprise1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Enterprise Name", "Network", "Username"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblEnterprise1);

        lblName1.setText("Name");

        lblNetwork1.setText("Network");

        btnAddEnterprise1.setText("ADD");
        btnAddEnterprise1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddEnterprise1ActionPerformed(evt);
            }
        });

        cmbNetwork1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbNetwork1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbNetwork1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(73, 73, 73)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblCreateNetwork2, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(4, 4, 4)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblNetworkList2, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 586, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(519, 519, 519)
                                        .addComponent(btnAddEnterprise1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(206, 206, 206)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblNetwork1)
                                            .addComponent(lblEnterprise))
                                        .addGap(52, 52, 52)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(cmbNetwork1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(cmbEnterprise1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                            .addComponent(lblUserName)
                                            .addGap(52, 52, 52)
                                            .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(lblPassword)
                                                .addComponent(lblName1))
                                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel3Layout.createSequentialGroup()
                                                    .addGap(52, 52, 52)
                                                    .addComponent(txtName1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                                    .addGap(54, 54, 54)
                                                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(lblHeader2)))
                        .addGap(10, 10, 10)))
                .addGap(169, 169, 169))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lblHeader2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(lblNetworkList2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblCreateNetwork2)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNetwork1)
                    .addComponent(cmbNetwork1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEnterprise)
                    .addComponent(cmbEnterprise1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUserName)
                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPassword)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName1)
                    .addComponent(txtName1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addComponent(btnAddEnterprise1)
                .addContainerGap(323, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Manage Enterprise Admin", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 139, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddNetworkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddNetworkActionPerformed

        String name = null;
        if (Validation.validateStringInput(txtName)) {
            name = txtName.getText();
        } else {
            return;
        }

        boolean ifExists = business.checkIfNetworkExisits(name);
        if (ifExists) {
            JOptionPane.showMessageDialog(null, "Network name already exists");
            return;
        }

        Network network = business.createAndAddNetwork();
        network.setName(name);
        JOptionPane.showMessageDialog(null, "Network added successfully", "Information", JOptionPane.INFORMATION_MESSAGE);
        txtName.setText("");
        populateNetworkTable();
    }//GEN-LAST:event_btnAddNetworkActionPerformed

    private void btnAddEnterpriseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddEnterpriseActionPerformed

        Network network = (Network) cmbNetwork.getSelectedItem();
        EnterpriseType type = (Enterprise.EnterpriseType) cmbEnterprise.getSelectedItem();

        if (network == null || type == null) {
            JOptionPane.showMessageDialog(null, "Invalid Input!");
            return;
        }

        String name = null;
        if (Validation.validateStringInput(txtEnterpriseName)) {
            name = txtEnterpriseName.getText();
        } else {
            return;
        }

        boolean ifExists = network.getEnterpriseDirectory().checkIfEnterpriseExists(name, type);

        if (ifExists) {
            JOptionPane.showMessageDialog(null, "Enterprise name already exists");
            return;
        }

        network.getEnterpriseDirectory().addEnterprise(name, type);
        JOptionPane.showMessageDialog(null, "Enterprise added successfully", "Information", JOptionPane.INFORMATION_MESSAGE);
        txtEnterpriseName.setText("");
        populateEnterpriseTable();
    }//GEN-LAST:event_btnAddEnterpriseActionPerformed

    private void btnAddEnterprise1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddEnterprise1ActionPerformed

        Enterprise enterprise = (Enterprise) cmbEnterprise.getSelectedItem();

        if (enterprise == null) {
            JOptionPane.showMessageDialog(null, "Invalid input!");
        }

        String userName = null;
        if (Validation.validateStringInput(txtUserName)) {
            userName = txtUserName.getText();
        } else {
            return;
        }

        String name = null;
        if (Validation.validateStringInput(txtName)) {
            userName = txtUserName.getText();
        } else {
            return;
        }

        char[] passChar = txtPassword.getPassword();
        if (passChar == null || passChar.length == 0) {
            JOptionPane.showMessageDialog(null,
                "Password cannot be blank",
                "Warning",
                JOptionPane.WARNING_MESSAGE);
            txtPassword.setBackground(Color.RED);
            return;
        }

        if (business.checkIfUserNameIsUnique(userName)) {
            JOptionPane.showMessageDialog(null, "User name already exists. Please select a different one.");
            return;
        }

        Employee employee = enterprise.getEmployeeDirectory().addEmployee(name);
        UserAccount account = new UserAccount();

        String password = account.encodePassword(String.valueOf(passChar));

        if (null != enterprise.getEnterpriseType()) {
            switch (enterprise.getEnterpriseType()) {
                case Logistics:
                account = enterprise.getUserAccountDirectory().addUserAccount(userName, password, employee, (Role) new LogisticsAdminRole());
                break;
                case Consumer:
                account = enterprise.getUserAccountDirectory().addUserAccount(userName, password, employee, (Role) new ConsumerAdminRole());
                break;
                case Supplier:
                account = enterprise.getUserAccountDirectory().addUserAccount(userName, password, employee, (Role) new SupplierAdminRole());
                break;
                case Supervision:
                account = enterprise.getUserAccountDirectory().addUserAccount(userName, password, employee, (Role) new SupervisionAdminRole());
                break;
                default:
                break;
            }
        }

        JOptionPane.showMessageDialog(null, "Enterprise admin added successfully", "Information", JOptionPane.INFORMATION_MESSAGE);

        txtUserName.setText("");
        txtName.setText("");
        txtPassword.setText("");

        populateEnterpriseAdminTable();
    }//GEN-LAST:event_btnAddEnterprise1ActionPerformed

    private void cmbNetwork1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbNetwork1ActionPerformed

        Network network = (Network) cmbNetwork1.getSelectedItem();
        if (network != null) {
            populateEnterpriseComboBox(network);
        }
    }//GEN-LAST:event_cmbNetwork1ActionPerformed

    private void cmbNetworkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbNetworkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbNetworkActionPerformed

    private void cmbEnterprise1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbEnterprise1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbEnterprise1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddEnterprise;
    private javax.swing.JButton btnAddEnterprise1;
    private javax.swing.JButton btnAddNetwork;
    private javax.swing.JComboBox cmbEnterprise;
    private javax.swing.JComboBox cmbEnterprise1;
    private javax.swing.JComboBox cmbNetwork;
    private javax.swing.JComboBox cmbNetwork1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblCreateNetwork;
    private javax.swing.JLabel lblCreateNetwork1;
    private javax.swing.JLabel lblCreateNetwork2;
    private javax.swing.JLabel lblEnterprise;
    private javax.swing.JLabel lblEnterpriseName;
    private javax.swing.JLabel lblEnterpriseType;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JLabel lblHeader1;
    private javax.swing.JLabel lblHeader2;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblName1;
    private javax.swing.JLabel lblNetwork;
    private javax.swing.JLabel lblNetwork1;
    private javax.swing.JLabel lblNetworkList;
    private javax.swing.JLabel lblNetworkList1;
    private javax.swing.JLabel lblNetworkList2;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JSeparator separator;
    private javax.swing.JTable tblEnterprise;
    private javax.swing.JTable tblEnterprise1;
    private javax.swing.JTable tblNetwork;
    private javax.swing.JTextField txtEnterpriseName;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtName1;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables

    public void populateNetworkTable() {
        DefaultTableModel dtm = (DefaultTableModel) tblNetwork.getModel();
        dtm.setRowCount(0);
        for (Network n : business.getNetworkList()) {
            Object row[] = new Object[1];
            row[0] = n;
            dtm.addRow(row);
        }
    }
    
    public void populateEnterpriseTable() {
        DefaultTableModel dtm = (DefaultTableModel) tblEnterprise.getModel();
        dtm.setRowCount(0);
        for (Network n : business.getNetworkList()) {
            for (Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()) {
                Object row[] = new Object[3];
                row[0] = e;
                row[1] = n;
                row[2] = e.getEnterpriseType();
                dtm.addRow(row);
            }
        }
    }
    
    private void populateEnterpriseAdminTable() {
        DefaultTableModel dtm = (DefaultTableModel) tblEnterprise1.getModel();
        dtm.setRowCount(0);
        for (Network network : business.getNetworkList()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                for (UserAccount userAccount : enterprise.getUserAccountDirectory().getUserAccountList()) {
                    Object[] row = new Object[3];
                    row[0] = enterprise.getName();
                    row[1] = network.getName();
                    row[2] = userAccount.getUsername();

                    dtm.addRow(row);
                }
            }
        }
    }

    private void populateNetworkComboBox() {
        cmbNetwork1.removeAllItems();

        for (Network network : business.getNetworkList()) {
            cmbNetwork1.addItem(network);
        }
    }

    private void populateEnterpriseComboBox(Network network) {
        cmbEnterprise1.removeAllItems();

        for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
            cmbEnterprise1.addItem(enterprise);
        }

    }
    
    private void populateComboBox() {
        cmbNetwork.removeAllItems();
        cmbEnterprise.removeAllItems();

        for (Network network : business.getNetworkList()) {
            cmbNetwork.addItem(network);
        }

        for (Enterprise.EnterpriseType type : Enterprise.EnterpriseType.values()) {
            cmbEnterprise.addItem(type);
        }

    }
}
