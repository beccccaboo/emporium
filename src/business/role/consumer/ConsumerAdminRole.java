package business.role.consumer;

import business.EcoSystem;
import business.enterprise.Enterprise;
import business.network.Network;
import business.organization.Organization;
import business.role.Role;
import business.userAccount.UserAccount;
import javax.swing.JPanel;
import userInterface.consumer.admin.ConsumerAdminWorkAreaJPanel;



/**
 *
 * @author swarag
 */
public class ConsumerAdminRole extends Role {

    public ConsumerAdminRole() {
        super(RoleType.ConsumerAdmin);
    }

    @Override
    public JPanel createWorkArea(JPanel mainPanel, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, Network network) {
        return new ConsumerAdminWorkAreaJPanel(mainPanel, enterprise, business);
    }

}
