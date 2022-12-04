/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.enterprise;

import java.util.ArrayList;

/**
 *
 * @author rebeccabiju
 */
public class EnterpriseDirectory {
    private ArrayList<Enterprise> enterpriseList;

    public EnterpriseDirectory() {
        enterpriseList = new ArrayList();
    }

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }

    public Enterprise addEnterprise(String name, Enterprise.EnterpriseType type) {

        Enterprise enterprise = null;
        if (type == Enterprise.EnterpriseType.Supplier) {
            enterprise = new SupplierEnterprise(name);
        } else if (type == Enterprise.EnterpriseType.Logistics) {
            enterprise = new LogisticsEnterprise(name);
        } else if (type == Enterprise.EnterpriseType.Consumer) {
            enterprise = new ConsumerEnterprise(name);
        } else if (type == Enterprise.EnterpriseType.Supervision) {
            enterprise = new SupervisionEnterprise(name);
        }

        enterpriseList.add(enterprise);
        return enterprise;
    }

    public void removeEnterprise(Enterprise e) {
        enterpriseList.remove(e);
    }

    public boolean checkIfEnterpriseExists(String enterpriseName, Enterprise.EnterpriseType type) {
        for (Enterprise e : enterpriseList) {
            if ((e.getEnterpriseType() == type) && (e.getName().equals(enterpriseName))) {
                return true;
            }
        }
        return false;
    }
}
