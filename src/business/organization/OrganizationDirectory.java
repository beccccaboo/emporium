/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.organization;

import java.util.ArrayList;

/**
 *
 * @author rebeccabiju
 */
public class OrganizationDirectory {
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }

    public void setOrganizationList(ArrayList<Organization> organizationList) {
        this.organizationList = organizationList;
    }

    public Organization addOrganization(Organization.Type type) {
        Organization organization = null;
        if (type.getValue().equals(Organization.Type.ConsumerAdmin.getValue())) {
            organization = new ConsumerAdminOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Organization.Type.ConsumerManager.getValue())) {
            organization = new ConsumerManagerOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Organization.Type.ConsumerWorker.getValue())) {
            organization = new ConsumerWorkerOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Organization.Type.LogisticsAdmin.getValue())) {
            organization = new LogisticsAdminOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Organization.Type.LogisticsManager.getValue())) {
            organization = new LogisticsManagerOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Organization.Type.LogisticsWorker.getValue())) {
            organization = new LogisticsWorkerOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Organization.Type.SupplierAdmin.getValue())) {
            organization = new SupplierAdminOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Organization.Type.SupplierManager.getValue())) {
            organization = new SupplierManagerOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Organization.Type.SupplierWorker.getValue())) {
            organization = new SupplierWorkerOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Organization.Type.InventoryAdmin.getValue())) {
            organization = new InventoryAdminOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Organization.Type.InventoryManager.getValue())) {
            organization = new InventoryManagerOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Organization.Type.InventoryWorker.getValue())) {
            organization = new InventoryWorkerOrganization();
            organizationList.add(organization);
        }
        return organization;
    }
    
    public void removeOrganization(Organization o){
        organizationList.remove(o);
    }
}