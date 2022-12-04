/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.role.consumer;

import business.role.Role;
import business.role.Role.RoleType;


/**
 *
 * @author swarag
 */
public class ConsumerManagerRole extends Role {

    public ConsumerManagerRole() {
        super(RoleType.ConsumerManager);
    }

//    @Override
//    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, Network network) {
//        return new NGOManagerWorkAreaJPanel(userProcessContainer, account, organization, enterprise, network);
//    }

}
