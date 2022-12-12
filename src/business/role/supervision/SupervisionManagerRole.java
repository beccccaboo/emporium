/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.role.supervision;

import business.EcoSystem;
import business.enterprise.Enterprise;
import business.network.Network;
import business.organization.Organization;
import business.role.Role;
import business.userAccount.UserAccount;
import javax.swing.JPanel;
import userInterface.supervision.manager.SupervisionManagerWorkAreaJPanel;

/**
 *
 * @author Arpit
 */
public class SupervisionManagerRole extends Role{
    
     public SupervisionManagerRole() {
        super(RoleType.SupervisionManager);
    }

    @Override
    public JPanel createWorkArea(JPanel mainPanel, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, Network network) {
        return new SupervisionManagerWorkAreaJPanel(mainPanel, account, network);
    }
    
}
