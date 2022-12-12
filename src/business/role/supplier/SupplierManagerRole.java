/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.role.supplier;

import business.EcoSystem;
import business.enterprise.Enterprise;
import business.network.Network;
import business.organization.Organization;
import business.role.Role;
import business.userAccount.UserAccount;
import javax.swing.JPanel;
import userInterface.supplier.manager.SupplierManagerWorkAreaJPanel;

/**
 *
 * @author rebeccabiju
 */
public class SupplierManagerRole extends Role {

    public SupplierManagerRole() {
        super(Role.RoleType.SupplierManager);
    }

    @Override
    public JPanel createWorkArea(JPanel mainPanel, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, Network network) {
        return new SupplierManagerWorkAreaJPanel(mainPanel, account, enterprise);
    }

}
