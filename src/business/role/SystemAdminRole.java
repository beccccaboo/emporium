/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.role;

import business.EcoSystem;
import business.enterprise.Enterprise;
import business.network.Network;
import business.organization.Organization;
import business.userAccount.UserAccount;
import javax.swing.JPanel;
import userInterface.systemAdminWorkArea.SystemAdminWorkAreaJPanel;

/**
 *
 * @author rebeccabiju
 */
public class SystemAdminRole extends Role{

    public SystemAdminRole() {
        super(null);
    }

    @Override
    public JPanel createWorkArea(JPanel mainPanel, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, Network network) {
          return new SystemAdminWorkAreaJPanel(mainPanel, business);
    }
    
}
