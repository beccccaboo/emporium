/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.util.item;

import business.util.request.RequestItem;
import java.util.ArrayList;

/**
 *
 * @author rebeccabiju
 */
public class ItemQuantity {
    public static int calculateQuantity(ArrayList<RequestItem> items) {
        int quantity = 0;

        for (RequestItem ri : items) {
            String name = ri.getItemName();
            int initialQuantity = getQuantity(name);
            // double perServingQuantity = 1.5;
            int itemQuantity = ri.getQuantity();

            quantity += (initialQuantity * itemQuantity);
        }
        return quantity;
    }

    public static int calculateIndividualQuantity(RequestItem item) {
        int quantity = 0;
        int initialQuantity = getQuantity(item.getItemName());
        int itemQuantity = item.getQuantity();

        quantity = (initialQuantity * itemQuantity);
        return quantity;
    }

    public static int getQuantity(String name) {
        int quantity = 0;
        quantity = Item.getItemQuantity(name);
        return quantity;
    }
}
