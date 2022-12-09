/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.organization.supervision;

import business.organization.Organization;
import business.role.Role;
import business.role.supervision.SupervisionManagerRole;

import java.util.ArrayList;

/**
 *
 * @author Arpit
 */
public class SupervisionManagerOrganization extends Organization{

    public SupervisionManagerOrganization() {
        super(Organization.Type.SupervisionManager.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new SupervisionManagerRole());
        return roles;
    }
    
}
