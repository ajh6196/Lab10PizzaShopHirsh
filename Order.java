package edu.psu.ist;

import java.awt.*;
import java.util.ArrayList;
enum MenuItem {Plain, Meat, Extra, Veggie}
public class Order {
    //Class Level Variables - Protect the data
    private int orderId;
    private String itemsInOrder;
    private double orderTotal;
    private MenuItem menuItem;
    private String customerName;

    //Constructor Method
    public Order(int orderId){

        this.orderId = orderId;
        this.itemsInOrder = itemsInOrder;
        this.orderTotal = orderTotal;
        this.menuItem = menuItem;
        this.customerName = customerName;
    }


    //Setters and Getters
    public int getorderId() {

        return orderId;
    }
    public void setorderId(int orderId) {

        this.orderId = orderId;
    }
    public String getItemsInOrder(){
        return itemsInOrder;
    }
    public void setItemsInOrder(String itemsInOrder){
        this.itemsInOrder = itemsInOrder;
    }

    public double getOrderTotal() {
        return orderTotal;
    }
    public void setOrderTotal(double orderTotal){
        this.orderTotal = orderTotal;
    }

    public MenuItem getmenuItem() {
        return menuItem;
    }
    public void setMenuItem(MenuItem menuItem){
        this.menuItem = menuItem;
    }
    public String getCustomerName(){
        return customerName;
    }
    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }

    public static void printOrders(ArrayList<Order> oList) {
        for (Order order: oList){
            System.out.println("Order ID: " + order.getorderId());
            System.out.println("Menu Item: " + order.getmenuItem());
            System.out.println("Customer Name: " + order.getCustomerName());
        }

    }

    public void setOrderId(String nextLine) {
        this.orderId = orderId;

    }

    public void setOrderTotal(String nextLine) {
        this.orderTotal = orderTotal;
    }
}
    

