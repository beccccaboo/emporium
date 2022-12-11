/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.supervision.admin;

import business.employee.Employee;
import business.enterprise.Enterprise;
import business.organization.Organization;
import business.role.Role;
import business.userAccount.UserAccount;
import business.util.mail.Mail;
import business.util.validation.Validation;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import userInterface.snapshot.Snapshot;

/**
 *
 * @author swarag
 */
public class SupervisionManageUserAccountJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SupervisionManageUserAccountJPanel
     */
    private JPanel container;
    private Enterprise enterprise;
    Snapshot snapshot;
    String operation;
    UserAccount selectedPerson;
    String selectedImagePath = File.separator+"Users"+File.separator+"rebeccabiju"+File.separator+"Downloads"+File.separator+"noImg.jpeg";
    public SupervisionManageUserAccountJPanel(JPanel container, Enterprise enterprise) {
        initComponents();
        this.enterprise = enterprise;
        this.container = container;
        snapshot=new Snapshot(container);
        populateOrganizationComboBox();
        populateData();
        
        btnUpdate.setVisible(false);
//        btnDelete.setVisible(false);
        btnSave.setVisible(false);
        btnCancel.setVisible(false);
        
        toggleEditablePerson(false, Color.LIGHT_GRAY);
        clearDataPerson();
        btnCancel.setVisible(false);
        btnDelete.setVisible(false);
        
        toggleCombo(false);
        lblImage.setVisible(true);
        btnBrowse.setVisible(false);
        btnSnapshot.setVisible(false);
    }

    public void populateOrganizationComboBox() {
        cmbOrganiztion.removeAllItems();

        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
            cmbOrganiztion.addItem(organization);
        }
    }

    public void populateEmployeeComboBox(Organization organization) {
        cmbEmployee.removeAllItems();

        for (Employee employee : organization.getEmployeeDirectory().getEmployeeList()) {
            if (organization.getUserAccountDirectory().searchUser(employee) == null) {
                cmbEmployee.addItem(employee);
            }
        }
    }

    private void populateRoleComboBox(Organization organization) {
        cmbRole.removeAllItems();
        for (Role role : organization.getSupportedRole()) {
            cmbRole.addItem(role);
        }
    }

    public void populateData() {

        DefaultTableModel dtm = (DefaultTableModel) tblUsers.getModel();
        dtm.setRowCount(0);

        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
            for (UserAccount ua : organization.getUserAccountDirectory().getUserAccountList()) {
                Object row[] = new Object[2];
                row[0] = ua;
                row[1] = ua.getRole();
                dtm.addRow(row);
            }
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
        tblUsers = new javax.swing.JTable();
        jSeparator = new javax.swing.JSeparator();
        lblOrganization = new javax.swing.JLabel();
        cmbOrganiztion = new javax.swing.JComboBox();
        lblEmployee = new javax.swing.JLabel();
        cmbEmployee = new javax.swing.JComboBox();
        lblRole = new javax.swing.JLabel();
        cmbRole = new javax.swing.JComboBox();
        lblUserName = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        lblPassword = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        btnBack = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtMobileNo = new javax.swing.JTextField();
        lblMobileNo = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblPassword1 = new javax.swing.JLabel();
        btnBrowse = new javax.swing.JButton();
        lblImage = new javax.swing.JLabel();
        btnNew = new javax.swing.JButton();
        btnView = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        btnSnapshot = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 255));
        setMinimumSize(new java.awt.Dimension(800, 800));
        setPreferredSize(new java.awt.Dimension(800, 800));

        lblHeader.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblHeader.setText("Government Adminstrative Work Area - Manage Users");

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
        jScrollPane.setViewportView(tblUsers);
        if (tblUsers.getColumnModel().getColumnCount() > 0) {
            tblUsers.getColumnModel().getColumn(0).setResizable(false);
            tblUsers.getColumnModel().getColumn(1).setResizable(false);
        }

        jSeparator.setForeground(new java.awt.Color(51, 51, 255));

        lblOrganization.setText("Organization");

        cmbOrganiztion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbOrganiztionActionPerformed(evt);
            }
        });

        lblEmployee.setText("Employee");

        lblRole.setText("Role");

        lblUserName.setText("User Name");

        lblPassword.setText("Password");

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        lblEmail.setText("Email");

        lblMobileNo.setText("Phone Number");

        lblPassword1.setText("Profile Image:");

        btnBrowse.setText("Browse");
        btnBrowse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBrowseActionPerformed(evt);
            }
        });

        btnNew.setText("New");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });

        btnView.setText("View");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        btnSnapshot.setText("Snapshot");
        btnSnapshot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSnapshotActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(lblHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 661, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 786, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(285, 285, 285)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblEmployee)
                                    .addComponent(lblRole))
                                .addGap(19, 19, 19)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmbEmployee, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cmbRole, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblOrganization)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cmbOrganiztion, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(btnBack)
                        .addGap(64, 64, 64)
                        .addComponent(btnNew)
                        .addGap(24, 24, 24)
                        .addComponent(btnView)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnUpdate)
                        .addGap(18, 18, 18)
                        .addComponent(btnDelete)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancel)
                        .addGap(18, 18, 18)
                        .addComponent(btnSave))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblUserName)
                                    .addComponent(lblPassword))
                                .addGap(19, 19, 19)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtUserName)
                                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(42, 42, 42)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblEmail)
                                    .addComponent(lblMobileNo))
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtMobileNo, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblPassword1)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnBrowse)
                                    .addComponent(btnSnapshot))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(199, 199, 199)
                        .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 774, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(5, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOrganization)
                    .addComponent(cmbOrganiztion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmployee)
                    .addComponent(cmbEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRole)
                    .addComponent(cmbRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblUserName)
                            .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPassword)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEmail)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMobileNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMobileNo))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPassword1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBrowse)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSnapshot)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnView)
                        .addComponent(btnDelete)
                        .addComponent(btnUpdate)
                        .addComponent(btnCancel)
                        .addComponent(btnNew))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnBack)
                        .addComponent(btnSave)))
                .addGap(116, 116, 116))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        container.remove(this);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_btnBackActionPerformed

    private void cmbOrganiztionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbOrganiztionActionPerformed
        Organization organization = (Organization) cmbOrganiztion.getSelectedItem();
        if (organization != null) {
            populateEmployeeComboBox(organization);
            populateRoleComboBox(organization);
        }
    }//GEN-LAST:event_cmbOrganiztionActionPerformed

    private void btnBrowseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBrowseActionPerformed
        // TODO add your handling code here:
        JFileChooser browseImageFile = new JFileChooser();
        FileNameExtensionFilter fnef = new FileNameExtensionFilter("IMAGES", "png", "jpg", "jpeg");
        browseImageFile.addChoosableFileFilter(fnef);
        browseImageFile.setAcceptAllFileFilterUsed(false);
        int showOpenDialogue = browseImageFile.showOpenDialog(null);

        if (showOpenDialogue == JFileChooser.APPROVE_OPTION) {
            File selectedImageFile = browseImageFile.getSelectedFile();
            selectedImagePath = selectedImageFile.getAbsolutePath();
            JOptionPane.showMessageDialog(null, selectedImagePath);

        }
    }//GEN-LAST:event_btnBrowseActionPerformed

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        // TODO add your handling code here:
        operation="New";
        clearDataPerson();
        toggleCombo(true);
        btnNew.setVisible(false);
        btnView.setVisible(false);
        btnBrowse.setVisible(true);
        btnSnapshot.setVisible(true);
        btnSave.setVisible(true);
        btnCancel.setVisible(true);
        cmbRole.setEnabled(true);
        cmbOrganiztion.setEnabled(true);
        cmbEmployee.setEnabled(true);
        toggleEditablePerson(true, Color.WHITE);

        //        lblImage.setVisible(false);
    }//GEN-LAST:event_btnNewActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
        lblImage.setVisible(true);
        int selectedRowIndex = tblUsers.getSelectedRow();
        if(selectedRowIndex<0){
            JOptionPane.showMessageDialog(this, "Please select a row to display data");
            return;
        }
        //
        DefaultTableModel model = (DefaultTableModel)tblUsers.getModel();
        selectedPerson = (UserAccount) model.getValueAt(selectedRowIndex, 0);
        //

        txtUserName.setText(selectedPerson.getUsername());
        txtMobileNo.setText(Long.toString(selectedPerson.getMobileNo()));
        txtEmail.setText(selectedPerson.getEmail());

        cmbEmployee.addItem(selectedPerson.getEmployee().getName());
        cmbRole.addItem(selectedPerson.getRole().getRoleType());

        ImageIcon imgIcon = new ImageIcon(selectedPerson.getImgPath());
        System.out.println(selectedPerson.getImgPath()+""+lblImage.getWidth()+""+lblImage.getHeight());
        Image img =imgIcon.getImage().getScaledInstance(lblImage.getWidth(), lblImage.getHeight(), Image.SCALE_SMOOTH);

        lblImage.setIcon(new ImageIcon(img));
        btnBrowse.setVisible(false);
        btnSnapshot.setVisible(false);
        //        System.out.println(selectedPerson.getEmployee().getName());
        //        txtPassword.setText(selectedPerson.getPassword());
        //
        //Make Text fields uneditable
        toggleEditablePerson(false, Color.LIGHT_GRAY);
        btnUpdate.setVisible(true);
        toggleCombo(false);
        //        btnDelete.setVisible(true);
    }//GEN-LAST:event_btnViewActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        operation="Update";
        selectedImagePath = null;
        int selectedRowIndex = tblUsers.getSelectedRow();
        if(selectedRowIndex<0){
            JOptionPane.showMessageDialog(this, "Please select a person to update data");
            return;
        }

        DefaultTableModel model = (DefaultTableModel)tblUsers.getModel();
        selectedPerson = (UserAccount) model.getValueAt(selectedRowIndex, 0);

        cmbEmployee.addItem(selectedPerson.getEmployee().getName());
        cmbRole.addItem(selectedPerson.getRole().getRoleType());
        toggleEditablePerson(true, Color.WHITE);
        txtUserName.setEnabled(false);
        cmbRole.setEnabled(false);
        cmbOrganiztion.setEnabled(false);
        cmbEmployee.setEnabled(false);
        btnSave.setVisible(true);
        btnBrowse.setVisible(true);
        btnSnapshot.setVisible(true);
        btnCancel.setVisible(true);
        tblUsers.setEnabled(false);
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        //        int selectedRowIndex = tblPerson.getSelectedRow();
        //        if(selectedRowIndex<0){
            //            JOptionPane.showMessageDialog(this, "Please select a row to delete data");
            //            return;
            //        }
        //
        //        DefaultTableModel model = (DefaultTableModel)tblPerson.getModel();
        //        selectedPerson = (Person) model.getValueAt(selectedRowIndex, 0);
        //        String username = selectedPerson.getUsername();
        //        User user = userDir.getUserByUsername(username);
        //        if(user.getRole().equals("patient")){
            //            Patient patient = patientDir.getPatientByUsername(username);
            //            patientDir.deletePatient(patient);
            //        }
        //        if(user.getRole().equals("doctor")){
            //            Doctor doctor = doctorDir.getDoctorByUsername(username);
            //            doctorDir.deleteDoctor(doctor);
            //        }
        //
        //        personDir.deletePerson(selectedPerson);
        //        userDir.deleteUser(user);
        //
        //        JOptionPane.showMessageDialog(this, "Person data deleted");
        //        //
        //        populateTablePerson();
        //        clearDataPerson();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        btnNew.setVisible(true);
        btnBrowse.setVisible(false);
        btnSnapshot.setVisible(false);
        btnView.setVisible(true);
        btnSave.setVisible(false);
        btnUpdate.setVisible(false);
        btnDelete.setVisible(false);
        btnCancel.setVisible(false);
        txtUserName.setEnabled(true);
        tblUsers.setEnabled(true);
        cmbRole.setEnabled(true);
        cmbOrganiztion.setEnabled(true);
        cmbEmployee.setEnabled(true);
        clearDataPerson();
        toggleEditablePerson(false, Color.LIGHT_GRAY);
        toggleCombo(false);
        //        cmbRole.setSelectedIndex(0);
        //        cmbEmployee.setSelectedIndex(0);
        //        cmbOrganiztion.setSelectedIndex(0);
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed

        String userName = null;
        if (Validation.validateStringInput(txtUserName)) {
            userName = txtUserName.getText();
        } else {
            return;
        }

        String email = null;
        if(Validation.validateEmailInput(txtEmail)){
            email = txtEmail.getText();
        } else {
            return;
        }

        long mobileNo = 0;
        if (Validation.validateNumericalInput(txtMobileNo, 3) && Validation.validatePhoneNumber(txtMobileNo)) {
            mobileNo = Long.parseLong(txtMobileNo.getText());
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
        } else {
            txtPassword.setBackground(Color.WHITE);
        }

        Organization organization = (Organization) cmbOrganiztion.getSelectedItem();

        for (UserAccount ua : organization.getUserAccountDirectory().getUserAccountList()) {
            if (ua.getRole().getRoleType().getValue().equals(Role.RoleType.SupervisionAdmin.getValue())) {
                JOptionPane.showMessageDialog(null, "Admin already exists for the network", "Warning", JOptionPane.WARNING_MESSAGE);
                return;
            }
        }

        UserAccount ua = new UserAccount();
        String password = ua.encodePassword(String.valueOf(passChar));
        if(snapshot.getPath()!=null)
            selectedImagePath = snapshot.getPath();
        
        if(operation.equals("Update")){
            selectedPerson.setPassword(password);
            selectedPerson.setMobileNo(mobileNo);
            selectedPerson.setEmail(email);
            if(selectedImagePath!=null)
                selectedPerson.setImgPath(selectedImagePath);
            Mail.sendMail(email, "Details Updated!", "Your details have been updated on the portal!");
        }
        
        if(operation.equals("New")){
            if (organization.getUserAccountDirectory().checkIfUserNameExists(userName)) {
            JOptionPane.showMessageDialog(null, "User name already exists. Please select a different one.");
            return;
        }

            Employee employee = (Employee) cmbEmployee.getSelectedItem();
            Role role = (Role) cmbRole.getSelectedItem();

            if (organization == null || employee == null || role == null) {
                JOptionPane.showMessageDialog(null, "Invalid input!");
            }

            organization.getUserAccountDirectory().addUserAccount(userName, password, employee, role, email, mobileNo, selectedImagePath);
            Mail.sendMail(email, "Welcome to Emporium!", "You have sucessfully registered to Emporium. Now manage second hand goods effeciently!");
            JOptionPane.showMessageDialog(null, "User account created successfully", "Information", JOptionPane.INFORMATION_MESSAGE);

        }
        
        clearDataPerson();
//        populateEmployeeComboBox(organization);
        populateData();
        btnSave.setVisible(false);
        btnView.setVisible(true);
        btnNew.setVisible(true);
        btnCancel.setVisible(false);
        btnUpdate.setVisible(false);
        tblUsers.setEnabled(true);
        btnBrowse.setVisible(false);
        btnSnapshot.setVisible(false);
        cmbRole.setEnabled(true);
        cmbOrganiztion.setEnabled(true);
        cmbEmployee.setEnabled(true);
        toggleCombo(false);
        toggleEditablePerson(false, Color.LIGHT_GRAY);
        populateEmployeeComboBox(organization);
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnSnapshotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSnapshotActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout) container.getLayout();
        container.add("snapshot", snapshot);
        layout.next(container);
        //        selectedImagePath = snapshot.getPath();
        System.out.println("Selected Image: "+ selectedImagePath);
    }//GEN-LAST:event_btnSnapshotActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnBrowse;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSnapshot;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnView;
    private javax.swing.JComboBox cmbEmployee;
    private javax.swing.JComboBox cmbOrganiztion;
    private javax.swing.JComboBox cmbRole;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JSeparator jSeparator;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEmployee;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JLabel lblImage;
    private javax.swing.JLabel lblMobileNo;
    private javax.swing.JLabel lblOrganization;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblPassword1;
    private javax.swing.JLabel lblRole;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JTable tblUsers;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtMobileNo;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables

    //Clear User Data
    private void clearDataPerson() {
        //Clear past info
        txtUserName.setText("");
        txtPassword.setText("");
        txtMobileNo.setText("");
        txtEmail.setText("");
        if(lblImage.getWidth()!= 0 && lblImage.getHeight()!=0){
            ImageIcon imgIcon = new ImageIcon("");
            Image img =imgIcon.getImage().getScaledInstance(lblImage.getWidth(), lblImage.getHeight(), Image.SCALE_SMOOTH);
            lblImage.setIcon(new ImageIcon(img));
        }
        
//        txtStreetNo.setText("");
//        txtCommunityName.setText("");
//        txtCityName.setText("");
//        txtZipCode.setText("");
    }
    
    private void toggleEditablePerson(boolean b, Color bg) {
        txtUserName.setEditable(b);
        txtUserName.setBackground(bg);
        
        txtPassword.setEditable(b);
        txtPassword.setBackground(bg);
        
        txtMobileNo.setEditable(b);
        txtMobileNo.setBackground(bg);
        
        txtEmail.setEditable(b);
        txtEmail.setBackground(bg);
    }

    private void toggleCombo(boolean b) {
        lblOrganization.setVisible(b);
        lblRole.setVisible(b);
        lblEmployee.setVisible(b);
        cmbOrganiztion.setVisible(b);
        cmbRole.setVisible(b);
        cmbEmployee.setVisible(b);
        
    }

}
