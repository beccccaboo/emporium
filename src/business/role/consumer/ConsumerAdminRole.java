package business.role.consumer;

import business.role.Role;
import business.role.Role.RoleType;



/**
 *
 * @author swarag
 */
public class ConsumerAdminRole extends Role {

    public ConsumerAdminRole() {
        super(RoleType.ConsumerAdmin);
    }

//    @Override
//    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, Network network) {
//        return new NGOAdminWorkAreaJPanel(userProcessContainer, enterprise, business);
//    }
//
}
