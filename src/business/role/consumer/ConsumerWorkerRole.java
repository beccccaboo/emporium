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
import userInterface.consumer.worker.ConsumerWorkerWorkAreaJPanel;


/**
 *
 * @author swarag
 */
public class ConsumerWorkerRole extends Role {

    public ConsumerWorkerRole() {
        super(RoleType.ConsumerWorker);
    }   

    @Override
    public JPanel createWorkArea(JPanel mainPanel, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, Network network) {
      return new ConsumerWorkerWorkAreaJPanel(mainPanel, account, organization, enterprise, business);
    }

}
