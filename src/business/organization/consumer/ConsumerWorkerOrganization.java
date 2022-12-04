/*

 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template

 */
package business.organization.consumer;

import business.organization.Organization;
import business.role.Role;

import business.role.consumer.ConsumerWorkerRole;
import java.util.ArrayList;


/**
 *
 * @author swarag

 */
public class ConsumerWorkerOrganization extends Organization {

    public ConsumerWorkerOrganization() {

        super(Organization.Type.ConsumerWorker.getValue());

    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new ConsumerWorkerRole());
        return roles;
    }

}
