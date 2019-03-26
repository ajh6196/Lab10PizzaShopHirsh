package edu.psu.ist;

import java.util.ArrayList;

public class Customer {
    //Class Level Variables - Protect the data
    private int customerId;
    private String customerName;
    private String customerPhoneNumber;

    //Constructor Method
    public Customer(int customerId){
        this.customerId = customerId;
    }

    public static void printCustomer(ArrayList<Customer> cList) {
    }


    //Setters and Getters
    public int getcustomerId() {
        return customerId;
    }
    public void setcustomerId(int customerId) {
        this.customerId = customerId;
    }
    public String getCustomerName() {
        return customerName;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public static void addCustomer(ArrayList<Customer> cList) {
        for (Customer customer: cList){
            System.out.println("Customer ID:" + customer.getcustomerId());
            System.out.println("Customer Name:" + customer.getCustomerName());
            System.out.println("Customer Phone Number:" + customer.getCustomerPhoneNumber());
        }
    }
}
