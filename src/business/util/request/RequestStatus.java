/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.util.request;

import java.util.HashMap;

/**
 *
 * @author rebeccabiju
 */
public class RequestStatus {
    public static HashMap pickupRequestStatusList;
    public static HashMap invoiceStatusList;
    public static HashMap shortageStatusList;

    public static void initalizePickupRequestStatusMap() {
        pickupRequestStatusList = new HashMap();
        pickupRequestStatusList.put(1, "Raised by Supplier - Pending with Consumer Manager");
        pickupRequestStatusList.put(2, "Approved by Consumer Manager - Pending with Logistics Manager");
        pickupRequestStatusList.put(3, "Assigned to Logistics worker - Pending for pick-up with Logistics worker");
        pickupRequestStatusList.put(4, "Pick up done - Delivery in progress");
        pickupRequestStatusList.put(5, "Delivery done - With Consumer worker");
        pickupRequestStatusList.put(6, "Inventory Updated - Request completed");
    }

    public static void initializeInvoiceStatusMap() {
        invoiceStatusList = new HashMap();
        invoiceStatusList.put(1, "Invoice Generated");
        invoiceStatusList.put(2, "Invoice paid");
    }

    public static void initializeShortageStatusListMap() {
        shortageStatusList = new HashMap();
        shortageStatusList.put(1, "Shortage Request Raised");
        shortageStatusList.put(2, "Shortage Request fulfilled");
    }

    public static String getPickupStatusMessage(int statusKey) {
        return (String) pickupRequestStatusList.get(statusKey);
    }

    public static String getInvoiceStatusMessage(int key) {
        return (String) invoiceStatusList.get(key);
    }

    public static String getShortageStatusMessage(int key) {
        return (String) shortageStatusList.get(key);
    }
}
