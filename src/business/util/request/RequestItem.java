/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.util.request;

import java.util.Date;

/**
 *
 * @author rebeccabiju
 */
public class RequestItem {
    private String itemName; //itemName
    private int quantity;
    private double daysBeforeDisposal; //daysBeforeDisposal

    public RequestItem(String itemName, int quantity, double daysBeforeDisposal) {
        this.itemName = itemName;
        this.quantity = quantity;
        this.daysBeforeDisposal = daysBeforeDisposal;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getDaysBeforeDisposal() {
        return daysBeforeDisposal;
    }

    public void setDaysBeforeDisposal(double daysBeforeDisposal) {
        this.daysBeforeDisposal = daysBeforeDisposal;
    }

  
    
   
    
    @Override
    public String toString(){
        return itemName;
    }
}
