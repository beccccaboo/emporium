/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.role.supervision;

/**
 *
 * @author Arpit
 */
public class SupervisionManagerRole {
    
     public SupervisionManagerRole() {
        super(RoleType.GovernmentMayor);
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, Network network) {
        return new SupervisionMayorWorkAreaJPanel(userProcessContainer, account, network);
    }
    
}
