package business.role.consumer;

import business.EcoSystem;
import business.enterprise.Enterprise;
import business.network.Network;
import business.organization.Organization;
import business.role.Role;
import business.userAccount.UserAccount;
import javax.swing.JPanel;
import userInterface.ngo.ngoAdmin.NGOAdminWorkAreaJPanel;

/**
 *
 * @author indap.n
 */
public class ConsumerAdminRole extends Role {

    public ConsumerAdminRole() {
        super(RoleType.NGOMAdmin);
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, Network network) {
        return new NGOAdminWorkAreaJPanel(userProcessContainer, enterprise, business);
    }

}
