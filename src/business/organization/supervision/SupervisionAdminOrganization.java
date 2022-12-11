/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.organization.supervision;

import business.organization.Organization;
import business.role.Role;
import business.role.supervision.SupervisionAdminRole;

import java.util.ArrayList;

/**
 *
 * @author Arpit
 */
public class SupervisionAdminOrganization extends Organization{

    public SupervisionAdminOrganization() {
        super(Organization.Type.SupervisionAdmin.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new SupervisionAdminRole());
        return roles;
    }
    
    
}
