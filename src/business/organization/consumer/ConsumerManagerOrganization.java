/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.organization.consumer;


import java.util.ArrayList;

/**
 *
 * @author indap.n
 */
public class ConsumerManagerOrganization extends Organization {

    public ConsumerManagerOrganization() {
        super(Type.ConsumerManager.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new ConsumerManagerRole());
        return roles;
    }

}
