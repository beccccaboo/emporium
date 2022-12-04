/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userInterface.logistics.admin;

/**
 *
 * @author Arpit
 */
public class LogisticsAdmin extends javax.swing.JPanel {

    /**
     * Creates new form LogisticsAdmin
     */
    public LogisticsAdmin() {
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
        manageEmployee = new javax.swing.JPanel();
        lblName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblHeader = new javax.swing.JLabel();
        lblOrg = new javax.swing.JLabel();
        btnCreateEmployee = new javax.swing.JButton();
        cmbOrg = new javax.swing.JComboBox();
        jScrollPane = new javax.swing.JScrollPane();
        tblOrganization = new javax.swing.JTable();
        jSeparator = new javax.swing.JSeparator();
        lblOrgCreate = new javax.swing.JLabel();
        cmbOrgCreate = new javax.swing.JComboBox();
        manageOrganization = new javax.swing.JPanel();
        btnAddOrganization = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblOrganization1 = new javax.swing.JTable();
        lblHeader1 = new javax.swing.JLabel();
        lblOrg1 = new javax.swing.JLabel();
        cmbOrganization = new javax.swing.JComboBox();
        manageUserAccount = new javax.swing.JPanel();
        lblPassword = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        cmbEmployee = new javax.swing.JComboBox();
        lblOrganization = new javax.swing.JLabel();
        lblRole = new javax.swing.JLabel();
        btnCreate = new javax.swing.JButton();
        cmbRole = new javax.swing.JComboBox();
        cmbOrganiztion = new javax.swing.JComboBox();
        lblUserName = new javax.swing.JLabel();
        lblEmployee = new javax.swing.JLabel();
        lblHeader2 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        txtUserName = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblUsers = new javax.swing.JTable();

        setMinimumSize(new java.awt.Dimension(1000, 1000));
        setName(""); // NOI18N

        lblName.setText("Name");

        lblHeader.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblHeader.setText("Logistics Adminstrative Work Area - Manage Employee");

        lblOrg.setText("Organization");

        btnCreateEmployee.setText("Create Employee");
        btnCreateEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateEmployeeActionPerformed(evt);
            }
        });

        cmbOrg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbOrgActionPerformed(evt);
            }
        });

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

        lblOrgCreate.setText("Organization");

        javax.swing.GroupLayout manageEmployeeLayout = new javax.swing.GroupLayout(manageEmployee);
        manageEmployee.setLayout(manageEmployeeLayout);
        manageEmployeeLayout.setHorizontalGroup(
            manageEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageEmployeeLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(manageEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator)
                    .addGroup(manageEmployeeLayout.createSequentialGroup()
                        .addGroup(manageEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(manageEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(manageEmployeeLayout.createSequentialGroup()
                                    .addGap(117, 117, 117)
                                    .addGroup(manageEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(manageEmployeeLayout.createSequentialGroup()
                                            .addComponent(lblOrg)
                                            .addGap(48, 48, 48)
                                            .addComponent(cmbOrg, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 667, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(manageEmployeeLayout.createSequentialGroup()
                                    .addGap(221, 221, 221)
                                    .addGroup(manageEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblOrgCreate)
                                        .addComponent(lblName))
                                    .addGap(18, 18, 18)
                                    .addGroup(manageEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(cmbOrgCreate, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(manageEmployeeLayout.createSequentialGroup()
                                .addGap(481, 481, 481)
                                .addComponent(btnCreateEmployee)
                                .addGap(2, 2, 2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 180, Short.MAX_VALUE)))
                .addContainerGap())
        );
        manageEmployeeLayout.setVerticalGroup(
            manageEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageEmployeeLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(lblHeader)
                .addGap(49, 49, 49)
                .addGroup(manageEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbOrg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblOrg))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(manageEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOrgCreate)
                    .addComponent(cmbOrgCreate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(manageEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(89, 89, 89)
                .addComponent(btnCreateEmployee)
                .addContainerGap(352, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Manage Employee", manageEmployee);

        btnAddOrganization.setText("Add Organization");
        btnAddOrganization.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddOrganizationActionPerformed(evt);
            }
        });

        tblOrganization1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblOrganization1);

        lblHeader1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblHeader1.setText("Logistics Adminstrative Work Area - Manage Organization");

        lblOrg1.setText("Organization Type ");

        javax.swing.GroupLayout manageOrganizationLayout = new javax.swing.GroupLayout(manageOrganization);
        manageOrganization.setLayout(manageOrganizationLayout);
        manageOrganizationLayout.setHorizontalGroup(
            manageOrganizationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageOrganizationLayout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addGroup(manageOrganizationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(manageOrganizationLayout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addGroup(manageOrganizationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(manageOrganizationLayout.createSequentialGroup()
                                .addGap(74, 74, 74)
                                .addGroup(manageOrganizationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(manageOrganizationLayout.createSequentialGroup()
                                        .addGap(15, 15, 15)
                                        .addComponent(lblOrg1)
                                        .addGap(18, 18, 18)
                                        .addComponent(cmbOrganization, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(btnAddOrganization, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblHeader1, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(182, Short.MAX_VALUE))
        );
        manageOrganizationLayout.setVerticalGroup(
            manageOrganizationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageOrganizationLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(lblHeader1)
                .addGap(48, 48, 48)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(manageOrganizationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbOrganization, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblOrg1))
                .addGap(110, 110, 110)
                .addComponent(btnAddOrganization)
                .addContainerGap(432, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Manage Organization", manageOrganization);

        lblPassword.setText("Password");

        lblOrganization.setText("Organization");

        lblRole.setText("Role");

        btnCreate.setText("Create");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        cmbOrganiztion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbOrganiztionActionPerformed(evt);
            }
        });

        lblUserName.setText("User Name");

        lblEmployee.setText("Employee");

        lblHeader2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblHeader2.setText("Logistics Adminstrative Work Area - Manage Users");

        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });

        tblUsers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "User Name", "Role"
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
        jScrollPane2.setViewportView(tblUsers);

        javax.swing.GroupLayout manageUserAccountLayout = new javax.swing.GroupLayout(manageUserAccount);
        manageUserAccount.setLayout(manageUserAccountLayout);
        manageUserAccountLayout.setHorizontalGroup(
            manageUserAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageUserAccountLayout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addGroup(manageUserAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(manageUserAccountLayout.createSequentialGroup()
                        .addGroup(manageUserAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(manageUserAccountLayout.createSequentialGroup()
                                .addGap(149, 149, 149)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(manageUserAccountLayout.createSequentialGroup()
                                .addGap(455, 455, 455)
                                .addComponent(btnCreate))
                            .addGroup(manageUserAccountLayout.createSequentialGroup()
                                .addGap(210, 210, 210)
                                .addGroup(manageUserAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(manageUserAccountLayout.createSequentialGroup()
                                        .addGroup(manageUserAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblUserName)
                                            .addComponent(lblPassword))
                                        .addGap(19, 19, 19)
                                        .addGroup(manageUserAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtUserName)
                                            .addComponent(txtPassword)))
                                    .addGroup(manageUserAccountLayout.createSequentialGroup()
                                        .addGroup(manageUserAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblOrganization)
                                            .addComponent(lblEmployee)
                                            .addComponent(lblRole))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(manageUserAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(cmbRole, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(cmbEmployee, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(cmbOrganiztion, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(manageUserAccountLayout.createSequentialGroup()
                                .addGap(67, 67, 67)
                                .addComponent(lblHeader2)))
                        .addGap(0, 83, Short.MAX_VALUE)))
                .addGap(136, 136, 136))
        );
        manageUserAccountLayout.setVerticalGroup(
            manageUserAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageUserAccountLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(lblHeader2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(manageUserAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOrganization)
                    .addComponent(cmbOrganiztion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(manageUserAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmployee)
                    .addComponent(cmbEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(manageUserAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRole)
                    .addComponent(cmbRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(manageUserAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUserName)
                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(manageUserAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPassword)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addComponent(btnCreate)
                .addContainerGap(292, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Manage User Account", manageUserAccount);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 100, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateEmployeeActionPerformed

        Organization organization = (Organization) cmbOrgCreate.getSelectedItem();

        if (organization == null) {
            JOptionPane.showMessageDialog(null, "Invalid input");
            return;
        }

        String name = txtName.getText();;
        if (Validation.validateStringInput(txtName)) {
            name = txtName.getText();
        } else {
            return;
        }

        organization.getEmployeeDirectory().addEmployee(name);
        populateTable((Organization) cmbOrg.getSelectedItem());

        JOptionPane.showMessageDialog(null, "Employee created successfully!");

        txtName.setText("");
    }//GEN-LAST:event_btnCreateEmployeeActionPerformed

    private void cmbOrgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbOrgActionPerformed
        Organization organization = (Organization) cmbOrg.getSelectedItem();
        if (organization != null) {
            populateTable(organization);
        }
    }//GEN-LAST:event_cmbOrgActionPerformed

    private void btnAddOrganizationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddOrganizationActionPerformed

        Type type = (Type) cmbOrganization.getSelectedItem();

        if (type == null) {
            JOptionPane.showMessageDialog(null, "Invalid input!");
            return;
        }

        organizationDirectory.addOrganization(type);

        JOptionPane.showMessageDialog(null, "Organziation created successfully!");
        populateTable();
    }//GEN-LAST:event_btnAddOrganizationActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed

        String userName = null;
        if (Validation.validateStringInput(txtUserName)) {
            userName = txtUserName.getText();
        } else {
            return;
        }

        char[] passChar = txtPassword.getPassword();
        if (passChar == null || passChar.length == 0) {
            JOptionPane.showMessageDialog(null,
                "Input cannot be blank",
                "Warning",
                JOptionPane.WARNING_MESSAGE);
            txtPassword.setBackground(Color.RED);
            return;
        }
        else{
            txtPassword.setBackground(Color.WHITE);
        }

        UserAccount ua = new UserAccount();
        String password = ua.encodePassword(String.valueOf(passChar));

        Organization organization = (Organization) cmbOrganiztion.getSelectedItem();

        if (organization.getUserAccountDirectory().checkIfUserNameExists(userName)) {
            JOptionPane.showMessageDialog(null, "User name already exists. Please select a different one.");
            return;
        }

        Employee employee = (Employee) cmbEmployee.getSelectedItem();
        Role role = (Role) cmbRole.getSelectedItem();

        if (organization == null || employee == null || role == null) {
            JOptionPane.showMessageDialog(null, "Invalid input!");
            return;
        }

        organization.getUserAccountDirectory().addUserAccount(userName, password, employee, role);
        JOptionPane.showMessageDialog(null, "User account created successfully", "Information", JOptionPane.INFORMATION_MESSAGE);
        populateEmployeeComboBox(organization);
        populateData();
        txtUserName.setText("");
        txtPassword.setText("");
    }//GEN-LAST:event_btnCreateActionPerformed

    private void cmbOrganiztionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbOrganiztionActionPerformed
        Organization organization = (Organization) cmbOrganiztion.getSelectedItem();
        if (organization != null) {
            populateEmployeeComboBox(organization);
            populateRoleComboBox(organization);
        }
    }//GEN-LAST:event_cmbOrganiztionActionPerformed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddOrganization;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnCreateEmployee;
    private javax.swing.JComboBox cmbEmployee;
    private javax.swing.JComboBox cmbOrg;
    private javax.swing.JComboBox cmbOrgCreate;
    private javax.swing.JComboBox cmbOrganization;
    private javax.swing.JComboBox cmbOrganiztion;
    private javax.swing.JComboBox cmbRole;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblEmployee;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JLabel lblHeader1;
    private javax.swing.JLabel lblHeader2;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblOrg;
    private javax.swing.JLabel lblOrg1;
    private javax.swing.JLabel lblOrgCreate;
    private javax.swing.JLabel lblOrganization;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblRole;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JPanel manageEmployee;
    private javax.swing.JPanel manageOrganization;
    private javax.swing.JPanel manageUserAccount;
    private javax.swing.JTable tblOrganization;
    private javax.swing.JTable tblOrganization1;
    private javax.swing.JTable tblUsers;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
