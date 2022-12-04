/*

 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.organization.consumer;
import business.organization.Organization;
import business.role.Role;
import business.role.consumer.ConsumerManagerRole;
import java.util.ArrayList;
/**
 *
 * @author swarag
 */
public class ConsumerManagerOrganization extends Organization {

    public ConsumerManagerOrganization() {

        super(Organization.Type.ConsumerManager.getValue());

    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new ConsumerManagerRole());
        return roles;
    }

}
