/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.workQueue;

import business.userAccount.UserAccount;
import business.util.request.RequestItem;
import java.util.ArrayList;

/**
 *
 * @author rebeccabiju
 */
public class CollectionWorkRequest extends WorkRequest {

    private UserAccount raisedBy;
    private UserAccount deliverTo;
    private UserAccount deliveredBy;
    private String raisedBySupplier;
    private String deliverToConsumer;
    private String deliveredByLogistics;
    private ArrayList<RequestItem> requestItems;
    private double totalQuantity;
    private double deliveryCost;
    private boolean paid;
    private boolean invoiceGenerated;
    private String imgPath;

    public CollectionWorkRequest() {
        requestItems = new ArrayList();
    }

    public String getRaisedBySupplier() {
        return raisedBySupplier;
    }

    public void setRaisedBySupplier(String raisedBySupplier) {
        this.raisedBySupplier = raisedBySupplier;
    }

    public String getDeliverToConsumer() {
        return deliverToConsumer;
    }

    public void setDeliverToConsumer(String deliverToConsumer) {
        this.deliverToConsumer = deliverToConsumer;
    }

    public ArrayList<RequestItem> getRequestItems() {
        return requestItems;
    }

    public void setRequestItems(ArrayList<RequestItem> requestItems) {
        this.requestItems = requestItems;
    }

    public double getTotalQuantity() {
        return totalQuantity;
    }

    public void setTotalQuantity(double totalQuantity) {
        this.totalQuantity = totalQuantity;
    }

    public UserAccount getRaisedBy() {
        return raisedBy;
    }

    public void setRaisedBy(UserAccount raisedBy) {
        this.raisedBy = raisedBy;
    }

    public UserAccount getDeliveredBy() {
        return deliveredBy;
    }

    public void setDeliveredBy(UserAccount deliveredBy) {
        this.deliveredBy = deliveredBy;
    }

    public UserAccount getDeliverTo() {
        return deliverTo;
    }

    public void setDeliverTo(UserAccount deliverTo) {
        this.deliverTo = deliverTo;
    }

    public String getDeliveredByLogistics() {
        return deliveredByLogistics;
    }

    public void setDeliveredByLogistics(String deliveredByLogistics) {
        this.deliveredByLogistics = deliveredByLogistics;
    }

    public double getDeliveryCost() {
        return deliveryCost;
    }

    public void setDeliveryCost(double deliveryCost) {
        this.deliveryCost = deliveryCost;
    }

    public boolean getPaid() {
        return paid;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
    }

    public boolean getInvoiceGenerated() {
        return invoiceGenerated;
    }

    public void setInvoiceGenerated(boolean invoiceGenerated) {
        this.invoiceGenerated = invoiceGenerated;
    }

    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }
    
    

    public void addRequestItem(String food, int quantity, int daysBeforeDisposal) {
        RequestItem ri = new RequestItem(food, quantity, daysBeforeDisposal);
        requestItems.add(ri);
    }

    public void updateDisposal() {
        for (RequestItem ri : requestItems) {
            if (ri.getDaysBeforeDisposal()> 0 && ri.getQuantity() > 0) {
                ri.setDaysBeforeDisposal(ri.getDaysBeforeDisposal()- 0.25);
                System.out.println(ri.getItemName() + " " + ri.getDaysBeforeDisposal());
            }
        }
    }
}
