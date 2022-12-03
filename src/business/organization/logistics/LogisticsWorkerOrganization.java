/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.organization.logistics;

import business.organization.Organization;
import business.role.Role;
import business.role.logistics.LogisticsWorkerRole;
import java.util.ArrayList;


/**
 *
 * @author Arpit
 */
public class LogisticsWorkerOrganization extends Organization {

    public LogisticsWorkerOrganization() {
        super(Type.LogisticsWorker.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new LogisticsWorkerRole());
        return roles;
    }
    
}