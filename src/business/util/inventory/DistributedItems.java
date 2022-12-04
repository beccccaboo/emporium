/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.util.inventory;

import business.util.request.RequestItem;

/**
 *
 * @author rebeccabiju
 */
public class DistributedItems {
    private RequestItem distributedRequestItem;
    private int quantityDistributed;

    public RequestItem getDistributedRequestItem() {
        return distributedRequestItem;
    }

    public void setDistributedRequestItem(RequestItem distributedRequestItem) {
        this.distributedRequestItem = distributedRequestItem;
    }

    public int getQuantityDistributed() {
        return quantityDistributed;
    }

    public void setQuantityDistributed(int quantityDistributed) {
        this.quantityDistributed = quantityDistributed;
    }
}
