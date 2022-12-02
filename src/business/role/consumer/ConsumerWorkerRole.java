/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.role.consumer;
import business.EcoSystem;
import business.enterprise.Enterprise;
import business.network.Network;
import business.organization.Organization;
import business.role.Role;
import business.userAccount.UserAccount;
import javax.swing.JPanel;
import userInterface.ngo.ngoWorker.NGOWorkerWorkAreaJPanel;

/**
 *
 * @author swarag
 */
public class ConsumerWorkerRole extends Role {

    public ConsumerWorkerRole() {
        super(RoleType.NGOWorker);
    }   

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, Network network) {
      return new NGOWorkerWorkAreaJPanel(userProcessContainer, account, organization, enterprise, business);
    }

}
