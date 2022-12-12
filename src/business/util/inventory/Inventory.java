/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.util.inventory;

import business.util.request.RequestItem;
import java.util.ArrayList;

/**
 *
 * @author rebeccabiju
 */
public class Inventory {
    private ArrayList<RequestItem> requestItemList;

    public void setRequestItemList(ArrayList<RequestItem> requestItemList) {
        this.requestItemList = requestItemList;
    }
    
    public ArrayList<RequestItem> getRequestItemList() {
        return requestItemList;
    }

    public Inventory() {
        requestItemList = new ArrayList<RequestItem>();
    }

    public void addRequestItem(RequestItem requestItem) {
        requestItemList.add(requestItem);
    }

    public void removeRequestItem(RequestItem requestItem) {
        requestItemList.remove(requestItem);
    }
}
