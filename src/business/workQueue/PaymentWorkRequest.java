/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.workQueue;

/**
 *
 * @author rebeccabiju
 */
public class PaymentWorkRequest extends WorkRequest{
    
    private CollectionWorkRequest collectionWorkRequest;

    public CollectionWorkRequest getCollectionWorkRequest() {
        return collectionWorkRequest;
    }

    public void setCollectionWorkRequest(CollectionWorkRequest collectionWorkRequest) {
        this.collectionWorkRequest = collectionWorkRequest;
    }
    
    @Override
    public String toString(){
        return collectionWorkRequest.getDeliveredByLogistics();
    }
    
}
