/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.enterprise;

import business.role.Role;
import business.util.inventory.Distributed;
import business.util.inventory.Inventory;
import business.util.request.RequestItem;
import java.util.ArrayList;

/**
 *
 * @author rebeccabiju
 */
public class ConsumerEnterprise extends Enterprise {

    private Inventory inventory;
    private Inventory wasteInventory;
    private ArrayList<Distributed> distributedList;

    public ConsumerEnterprise(String name) {
        super(name, EnterpriseType.Consumer);
        inventory = new Inventory();
        wasteInventory = new Inventory();
        distributedList = new ArrayList();
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public Inventory getWasteInventory() {
        return wasteInventory;
    }

    public void setWasteInventory(Inventory wasteInventory) {
        this.wasteInventory = wasteInventory;
    }

    public ArrayList<Distributed> getDistributedList() {
        return distributedList;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }

    public void updateInventory() {

        // Traverse inventory
        System.out.println("\nInventory");
        for (RequestItem ri : inventory.getRequestItemList()) {
            System.out.println(ri.getItemName() + " " + ri.getQuantity() + " " + ri.getDaysBeforeDisposal());

            // If perished, add to wastage inventory
            if (ri.getDaysBeforeDisposal() <= 0 && wasteInventory != null) {
                wasteInventory.addRequestItem(ri);
            }
        }

        // Add to wastage inventory
        if (wasteInventory != null) {
            System.out.println("\nWastage");
            // Remove from inventory, items added to wastage inventory
            inventory.getRequestItemList().removeAll(wasteInventory.getRequestItemList());
            for (RequestItem wri : wasteInventory.getRequestItemList()) {
                System.out.println(wri.getItemName() + " " + wri.getQuantity() + " " + wri.getDaysBeforeDisposal());
            }
        }
    }

    public void addDistributedItem(Distributed distributed) {
        distributedList.add(distributed);
    }
}
