/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business;

/**
 *
 * @author rebeccabiju
 */
public class ConfigureEcoSystem {
    public static EcoSystem configure() {
        EcoSystem ecoSystem = EcoSystem.getInstance();

        Employee employee = ecoSystem.getEmployeeDirectory().addEmployee("System Admin");
        UserAccount ua = new UserAccount();
        String password = ua.encodePassword("sysadmin");
        ua = ecoSystem.getUserAccountDirectory().addUserAccount("sysadmin", password, employee, new SystemAdminRole());

        return ecoSystem;

    }
}
