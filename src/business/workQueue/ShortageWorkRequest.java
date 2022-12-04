/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.workQueue;

import business.userAccount.UserAccount;

/**
 *
 * @author rebeccabiju
 */
public class ShortageWorkRequest extends WorkRequest {

    private CollectionWorkRequest linkedCollectionWorkRequest;
    private String consumerName;
    private UserAccount assignToEmployee;

    public CollectionWorkRequest getLinkedCollectionWorkRequest() {
        return linkedCollectionWorkRequest;
    }

    public void setLinkedCollectionWorkRequest(CollectionWorkRequest linkedCollectionWorkRequest) {
        this.linkedCollectionWorkRequest = linkedCollectionWorkRequest;
    }

    public String getConsumerName() {
        return consumerName;
    }

    public void setConsumerName(String consumerName) {
        this.consumerName = consumerName;
    }

    public UserAccount getAssignToEmployee() {
        return assignToEmployee;
    }

    public void setAssignToEmployee(UserAccount assignToEmployee) {
        this.assignToEmployee = assignToEmployee;
    }
    
}
