/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.role.logistics;

import business.EcoSystem;
import business.enterprise.Enterprise;
import business.network.Network;
import business.organization.Organization;
import business.role.Role;
import business.userAccount.UserAccount;
import javax.swing.JPanel;
import userInterface.logistics.admin.LogisticsAdminWorkAreaJPanel;


/**
 *
 * @author Arpit
 */
public class LogisticsAdminRole extends Role {

    public LogisticsAdminRole() {
        super(RoleType.LogisticsAdmin);
    }


    @Override
    public JPanel createWorkArea(JPanel mainPanel, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, Network network) {
        return new LogisticsAdminWorkAreaJPanel(mainPanel, enterprise);
    }

}