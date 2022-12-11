/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.util.item;

import java.util.HashMap;

/**
 *
 * @author rebeccabiju
 */
public class Item {
      // Item Name and quantity
    public static HashMap itemMap;

    public static void initializeItem() {
        itemMap = new HashMap();
        itemMap.put("Chair", 1); 
        itemMap.put("Bedframe", 2);
        itemMap.put("Table Fan", 3);
        itemMap.put("Mattress", 5);
        itemMap.put("Microwave", 2);
        itemMap.put("Study Table", 4);
    }

    public static HashMap getItemMap() {
        return itemMap;
    }

    public static int getItemQuantity(String name) {
        return (int) itemMap.get(name);
    }
}
