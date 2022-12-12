/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.role.consumer;

import business.EcoSystem;
import business.enterprise.Enterprise;
import business.network.Network;
import business.organization.Organization;
import business.role.Role;
import business.role.Role.RoleType;
import business.userAccount.UserAccount;
import javax.swing.JPanel;
import userInterface.consumer.manager.ConsumerManagerWorkAreaJPanel;


/**
 *
 * @author swarag
 */
public class ConsumerManagerRole extends Role {

    
    public ConsumerManagerRole() {
        super(RoleType.ConsumerManager);
    }

    @Override
    public JPanel createWorkArea(JPanel mainPanel, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, Network network) {
        return new ConsumerManagerWorkAreaJPanel(mainPanel, account, organization, enterprise, network);
    }

}
