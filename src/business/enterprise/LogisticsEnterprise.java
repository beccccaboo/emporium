/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.enterprise;

import business.role.Role;
import java.util.ArrayList;

/**
 *
 * @author rebeccabiju
 */
public class LogisticsEnterprise extends Enterprise{

    public LogisticsEnterprise(String name) {
        super(name, EnterpriseType.Logistics);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
}
