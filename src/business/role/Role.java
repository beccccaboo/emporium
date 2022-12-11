/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.role;

import business.EcoSystem;
import business.enterprise.Enterprise;
import business.network.Network;
import business.organization.Organization;
import business.userAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author rebeccabiju
 */
public abstract class Role {
    public RoleType roleType;

    public enum RoleType {
        ConsumerAdmin("Consumer Admin"),
        ConsumerManager("Consumer Manager"),
        ConsumerWorker("Consumer Worker"),
        LogisticsAdmin("Logistics Admin"),
        LogisticsManager("Logistics Manager"),
        LogisticsWorker("Logistics Worker"),
        SupplierAdmin("Supplier Admin"),
        SupplierManager("Supplier Manager"),
        SupplierWorker("Supplier Worker"),
        SupervisionAdmin("Supervision Admin"),
        SupervisionManager("Supervision Manager");

        private String value;

        private RoleType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    public Role(RoleType roleType) {
        this.roleType = roleType;
    }

    public RoleType getRoleType() {
        return roleType;
    }

    public abstract JPanel createWorkArea(JPanel mainPanel,
            UserAccount account,
            Organization organization,
            Enterprise enterprise,
            EcoSystem business,
            Network network);

    @Override
    public String toString() {
        return roleType.getValue();
    }
}
