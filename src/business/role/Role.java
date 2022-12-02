/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.role;

import business.EcoSystem;
import business.organization.Organization;
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
        InventoryAdmin("Inventory Admin"),
        InventoryManager("Inventory Manager"),
        InventoryWorker("Inventory Worker");

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

//    public abstract JPanel createWorkArea(JPanel userProcessContainer,
//            UserAccount account,
//            Organization organization,
//            Enterprise enterprise,
//            EcoSystem business,
//            Network network);

    @Override
    public String toString() {
        return roleType.getValue();
    }
}