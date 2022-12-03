/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.organization;

import business.employee.EmployeeDirectory;
import business.role.Role;
import business.userAccount.UserAccountDirectory;
import java.util.ArrayList;

/**
 *
 * @author rebeccabiju
 */
public abstract class Organization {
    private static int counter = 0;
    private String name;
    private WorkQueue workQueue;
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    private int organizationID;

    public enum Type {
        ConsumerAdmin("Consumer Admin Organization"),
        ConsumerManager("Consumer Manager Organization"),
        ConsumerWorker("Consumer Worker Organization"),
        LogisticsAdmin("Logistics Admin Organization"),
        LogisticsManager("Logistics Manager Organization"),
        LogisticsWorker("Logistics Worker Organization"),
        SupplierAdmin("Restaurant Admin Organization"),
        SupplierManager("Restaurant Manager Organization"),
        SupplierWorker("Restaurant Worker Organization"),
        InventoryAdmin("Inventory Admin Organization"),
        InventoryManager("Inventory Manager Organization"),
        InventoryWorker("Inventory Worker Organization");

        private String value;

        private Type(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
        
        @Override
        public String toString(){
            return this.value;
        }
        
    }

    public Organization(String name) {
        this.name = name;
        workQueue = new WorkQueue();
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
        organizationID = ++counter;
    }

    public abstract ArrayList<Role> getSupportedRole();

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }

    public String getName() {
        return name;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    @Override
    public String toString() {
        return name;
    }
}
