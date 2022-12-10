/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.userAccount;

import business.employee.Employee;
import business.organization.Organization;
import business.role.Role;
import java.util.ArrayList;

/**
 *
 * @author rebeccabiju
 */
public class UserAccountDirectory {
    private ArrayList<UserAccount> userAccountList;

    public UserAccountDirectory() {
        userAccountList = new ArrayList();
    }

    public ArrayList<UserAccount> getUserAccountList() {
        return userAccountList;
    }

    public UserAccount addUserAccount(String username, String password, Employee employee, Role role, String email, long mobileNo, String imgPath) {
        UserAccount userAccount = new UserAccount();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setEmployee(employee);
        userAccount.setRole(role);
        userAccount.setEmail(email);
        userAccount.setMobileNo(mobileNo);
        userAccount.setImgPath(imgPath);
        userAccountList.add(userAccount);
        return userAccount;
    }

    public void removeUserAccount(UserAccount ua) {
        userAccountList.remove(ua);
    }

    public UserAccount searchUser(String userName, String password) {
        for (UserAccount ua : userAccountList) {
            if (ua.getUsername().equals(userName)) {
                if (ua.matchPassword(password, ua.getPassword())) {
                    return ua;
                }
            }
        }
        return null;
    }

    public UserAccount searchUser(Employee employee) {
        for (UserAccount ua : userAccountList) {
            if (ua.getEmployee().equals(employee)) {
                return ua;
            }
        }
        return null;
    }

    public boolean checkIfUserNameExists(String userName) {
        for (UserAccount ua : userAccountList) {
            if (ua.getUsername().equals(userName)) {
                return true;
            }
        }
        return false;
    }
    
//    public Organization searchOrg(String userName){
//        for (OrganizationDirectory od : userAccountList) {
//            if (ua.getUsername().equals(userName)) {
//                if (ua.matchPassword(password, ua.getPassword())) {
//                    return ua;
//                }
//            }
//        }
//        return null;
//    }
   
}
