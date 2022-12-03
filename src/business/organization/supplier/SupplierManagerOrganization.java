/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.organization.supplier;

import business.organization.Organization;
import business.role.Role;
import business.role.supplier.SupplierManagerRole;
import java.util.ArrayList;

/**
 *
 * @author rebeccabiju
 */
public class SupplierManagerOrganization extends Organization {

    public SupplierManagerOrganization() {
        super(Organization.Type.SupplierManager.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new SupplierManagerRole());
        return roles;
    }

}
