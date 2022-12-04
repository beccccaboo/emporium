/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.organization.consumer;

import business.organization.Organization;
import business.role.Role;

import java.util.ArrayList;

/**
 *
 * @author indap.n
 */
public class ConsumerWorkerOrganization extends Organization {

    public ConsumerWorkerOrganization() {
        super(Type.ConsumerWorker.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new ConsumerWorkerRole());
        return roles;
    }

}
