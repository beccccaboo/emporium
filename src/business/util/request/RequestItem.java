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
    private double daysBeforeDonation; //daysBeforeDonation

    public RequestItem(String itemName, int quantity, double daysBeforeDonation) {
        this.itemName = itemName;
        this.quantity = quantity;
        this.daysBeforeDonation = daysBeforeDonation;
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

    public double getDaysBeforeDonation() {
        return daysBeforeDonation;
    }

    public void setDaysBeforeDonation(double daysBeforeDonation) {
        this.daysBeforeDonation = daysBeforeDonation;
    }

  
    
   
    
    @Override
    public String toString(){
        return itemName;
    }
}
