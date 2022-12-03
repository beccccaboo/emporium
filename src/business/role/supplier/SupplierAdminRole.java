/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.role.supplier;

import business.EcoSystem;
import business.organization.Organization;
import business.role.Role;
import javax.swing.JPanel;

/**
 *
 * @author rebeccabiju
 */
public class SupplierAdminRole extends Role {

    public SupplierAdminRole() {
        super(Role.RoleType.SupplierAdmin);
    }

//    @Override
//    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, Network network) {
//        return new RestaurantAdminWorkAreaJPanel(userProcessContainer, enterprise, business);
//    }

}