/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business;

import business.employee.Employee;
import business.enterprise.Enterprise;
import business.network.Network;
import business.role.Role;
import business.role.SystemAdminRole;
import business.role.consumer.ConsumerAdminRole;
import business.role.logistics.LogisticsAdminRole;
import business.role.supervision.SupervisionAdminRole;
import business.role.supplier.SupplierAdminRole;
import business.userAccount.UserAccount;
import java.io.File;


/**
 *
 * @author rebeccabiju
 */
public class ConfigureEcoSystem {
    public static EcoSystem configure() {
        EcoSystem ecoSystem = EcoSystem.getInstance();

        //Create Super Admin
        Employee employee = ecoSystem.getEmployeeDirectory().addEmployee("System Admin");
        UserAccount ua = new UserAccount();
        String password = ua.encodePassword("sysadmin");
        String imgPath = File.separator+"Users"+File.separator+"rebeccabiju"+File.separator+"Downloads"+File.separator+"noImg.jpeg";
                
        ua = ecoSystem.getUserAccountDirectory().addUserAccount("sysadmin", password, employee, new SystemAdminRole(), "sysadmin@gmail.com", 8573132155L, imgPath);

        //Create Network
        Network network = ecoSystem.createAndAddNetwork();
        network.setName("Boston");
        
        //Create Enterprise
        network.getEnterpriseDirectory().addEnterprise("NEU", Enterprise.EnterpriseType.Supplier);
        network.getEnterpriseDirectory().addEnterprise("HuskyNGO", Enterprise.EnterpriseType.Consumer);
        network.getEnterpriseDirectory().addEnterprise("FedEx", Enterprise.EnterpriseType.Logistics);
        network.getEnterpriseDirectory().addEnterprise("Boston Mayor", Enterprise.EnterpriseType.Supervision);
        

        //Create Enterprise Admins
        for(Enterprise e : network.getEnterpriseDirectory().getEnterpriseList()){
            Employee emp;
            if(e.getName().equals("NEU")){
                emp = e.getEmployeeDirectory().addEmployee("neu");
                String pwd = ua.encodePassword("neu");
                e.getUserAccountDirectory().addUserAccount("neu", pwd, emp, (Role) new SupplierAdminRole(), "neu@gmail.com", 8576665434L, "../res/neu.jpeg");
            }
            else if(e.getName().equals("HuskyNGO")){
                emp = e.getEmployeeDirectory().addEmployee("huskyngo");
                String pwd = ua.encodePassword("huskyngo");
                e.getUserAccountDirectory().addUserAccount("huskyngo", pwd, emp, (Role) new ConsumerAdminRole(), "huskyngo@gmail.com", 8576665434L, "../res/ngo.jpeg");
            } else if(e.getName().equals("FedEx")){
                emp = e.getEmployeeDirectory().addEmployee("fedex");
                String pwd = ua.encodePassword("fedex");
                e.getUserAccountDirectory().addUserAccount("fedex", pwd, emp, (Role) new LogisticsAdminRole(), "fedex@gmail.com", 8576665434L, "../res/fedex.jpeg");
            } else if(e.getName().equals("Boston Mayor")){
                emp = e.getEmployeeDirectory().addEmployee("bostonmayor");
                String pwd = ua.encodePassword("bostonmayor");
                e.getUserAccountDirectory().addUserAccount("bostonmayor", pwd, emp, (Role) new SupervisionAdminRole(), "bostonmayor@gmail.com", 8576665434L, "../res/supervision.jpeg");
            }
        }
        
        //Create Enterprise Managers
        
        
        return ecoSystem;
    }
}
