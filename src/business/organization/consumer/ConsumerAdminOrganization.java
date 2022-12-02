/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.organization.consumer;

import java.util.ArrayList;

/**
 *
 * @author swarag
 */
public class ConsumerAdminOrganization {
    public NGOAdminOrganization() {
        super(Type.NGOAdmin.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new NGOAdminRole());
        return roles;
    }
}
